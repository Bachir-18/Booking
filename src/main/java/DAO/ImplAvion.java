package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import vol.Avion;

public class ImplAvion implements Iavion {
Connection con = null;
	@Override
	public void save(Avion A) {
	con=(Connection) Dataconnection.getCon();
	try {
		String query="INSERT INTO avion VALUES(null,?,?)";
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
		ps.setInt(1,A.getNb_place());
		ps.setString(2,A.getCompanie());
		ps.executeUpdate();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

	@Override
	public List<Avion> listerAvion() {
		List<Avion> liste_avion=new ArrayList<Avion>();
		con=(Connection) Dataconnection.getCon(); 
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("SELECT * FROM avion");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Avion av=new Avion();
				av.setIdAvion(rs.getInt(1));
				av.setNb_place(rs.getInt(2));
				av.setCompanie(rs.getString(3));
				liste_avion.add(av);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return liste_avion;
	}

	@Override
	public void retirerAvion(int ida) {
		Connection con=(Connection) Dataconnection.getCon();
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("DELETE FROM avion WHERE ida=?");
			ps.setInt(1, ida);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Avion getAvion(int id) {
		con=(Connection) Dataconnection.getCon(); 
		Avion av=new Avion();
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("SELECT * FROM avion WHERE ida=?");
			 ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				av.setIdAvion(rs.getInt(1));
				av.setNb_place(rs.getInt(2));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return av;
	}
}
