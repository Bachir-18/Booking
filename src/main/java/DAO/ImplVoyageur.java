package DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import user.Voyageur;

public class ImplVoyageur implements Ivoyageur{
		Connection con;
	@Override
	public void save(Voyageur V) {
			con=(Connection) Dataconnection.getCon();
			try {
				String query="INSERT INTO voyageur() VALUES(null,?,?,?,?)";
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
				ps.setString(1,V.getNom());
				ps.setString(2,V.getPrenom());
				ps.setString(3,V.getAdresse());
				ps.setString(4,V.getPasseport());
				ps.executeUpdate();

			}catch(Exception e)
			{
				e.printStackTrace();
			}

	}
}
