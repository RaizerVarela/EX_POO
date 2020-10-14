package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement("DELETE FROM produtos "
					+ "WHERE "
					+ "(id_prod = ?)");
			
			ps.setInt(1, 10);
			
			int rowsAffected = ps.executeUpdate();
			System.out.println("Linhas afetadas: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatment(ps);
			DB.closeConnection();
		}	
	}
}
