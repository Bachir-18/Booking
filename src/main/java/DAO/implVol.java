package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import vol.*;

public class implVol implements Ivol{
	private Connection con;
	 private ImplAvion metier=new ImplAvion();
	@Override
	public void inserer_vol(Vol V) {
		con=(Connection) Dataconnection.getCon();
		try {
			String query="INSERT INTO vol VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
			ps.setString(1,V.getIdVol());
			ps.setInt(2,V.getIdAvion().getIdAvion());
			ps.setString(3,V.getHeurDepart());
			ps.setString(4,V.getHeurArrivee());
			ps.setInt(5,V.getDuree());
			ps.setString(6,V.getAeroportDepart());
			ps.setString(7,V.getAeroportArrivee());
			ps.setInt(8,V.getDistance());
			ps.setString(9,V.getVilleDepart());
			ps.setString(10,V.getVilleArrive());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	 @Override
	 public List<Vol> lister_vol() { 
		 List<Vol> listeVol=new ArrayList<Vol>();
		 con=(Connection) Dataconnection.getCon();
	try {
			 PreparedStatement ps=(PreparedStatement) con.prepareStatement("Select * FROM vol"); ResultSet rs=ps.executeQuery();
			 while(rs.next()) { 
				 Vol V=new Vol();
				 V.setIdVol(rs.getString(1)); 
				 V.setIdAvion(metier.getAvion(rs.getInt(2)));
				 V.setHeurDepart(rs.getString(3));
				 V.setHeurArrivee(rs.getString(4)); 
				 V.setDuree(Integer.parseInt(rs.getString(5)));
				 V.setAeroportDepart(rs.getString(6));
				 V.setAeroportArrivee(rs.getString(7));
				 V.setDistance(rs.getInt(8));
				 V.setVilleDepart(rs.getString(9));
				 V.setVilleArrive(rs.getString(10));
				 listeVol.add(V); 
				 } 
			} catch (SQLException e) {
				e.printStackTrace();
				} 
	return listeVol; 
	}
	 @Override
	 public Vol getVol(String id) { 
		 con=(Connection) Dataconnection.getCon();
		 PreparedStatement ps; Vol V=new Vol(); 
		 try { 
			 ps = (PreparedStatement) con.prepareStatement("SELECT * FROM vol WHERE idv=?");
			 ps.setString(1, id); 
			 ResultSet rs=ps.executeQuery(); 
			 while(rs.next()) {
				
				 V.setIdVol(rs.getString(1)); 
				 V.setIdAvion(metier.getAvion(rs.getInt(2)));
				 V.setHeurDepart(rs.getString(3));
				 V.setHeurArrivee(rs.getString(4));
				 V.setDuree(Integer.parseInt(rs.getString(5))); 
				 V.setAeroportDepart(rs.getString(6));
				 V.setAeroportArrivee(rs.getString(7)); 
				 V.setDistance(rs.getInt(8)); 
				 V.setVilleDepart(rs.getString(9));
				 V.setVilleArrive(rs.getString(10));
				 } 
			 } catch (SQLException e) 
		 { e.printStackTrace(); } 
		 return V; 
		 }
	 	@Override 
	 	public void modifier_vol(Vol V) { 
	 		con=(Connection)Dataconnection.getCon();
	 		try 
	 		{ 
	 			PreparedStatement ps=(PreparedStatement) con.prepareStatement("UPDATE FROM vol SET ida=?,heureDepart=?" +
	  ",heureARRIVE=?,duree=?,aeroportDepart=?,aeroportarrivee=?,distance=?,villeDepart=?,villeArrive=? WHERE idv=?");
	 ps.setString(1,V.getIdVol());
	 ps.setInt(2, V.getIdAvion().getIdAvion());
	 ps.setString(3,V.getHeurDepart());
	 ps.setString(4,V.getHeurArrivee());
	 ps.setInt(5,V.getDuree()); 
	 ps.setString(6,V.getAeroportDepart());
	 ps.setString(7,V.getAeroportArrivee()); 
	 ps.setInt(8,V.getDistance());
	 ps.setString(9,V.getVilleDepart());
	 ps.setString(10,V.getVilleArrive());
	 ps.executeQuery();
	 } catch (SQLException e) {
		 e.printStackTrace(); 
	} 
}

		@Override
		public void retirer_vol(String idv) {
			Connection con=(Connection) Dataconnection.getCon();
			try {
				PreparedStatement ps=(PreparedStatement) con.prepareStatement("DELETE FROM vol WHERE idv=?");
				ps.setString(1,idv);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}



}
