package DAO;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import vol.Reservation;

public class ImplReservation implements Ireservation{
		Connection con;

		@Override
		public void ajouter(Reservation R) {
			try {
				con=(Connection) Dataconnection.getCon();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				String query="INSERT INTO reservation VALUES(?,?,?)";
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
				ps.setString(1,R.getVol().getIdVol());
				ps.setInt(2,R.getPassager().getId());
				ps.setString(3,R.getDateReservation());
				ps.executeUpdate();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

		@Override
		public void supprimer(int idr) {
			Connection con=(Connection) Dataconnection.getCon();
			try {
				PreparedStatement ps=(PreparedStatement) con.prepareStatement("DELETE FROM reservation WHERE idr=?");
				ps.setInt(1, idr);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	
	
}
}
