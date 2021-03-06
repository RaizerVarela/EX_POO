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
			ps = conn.prepareStatement("UPDATE produtos "
					+ "SET valor = valor * ? "
					+ "WHERE "
					+ "(id_cat = ?)");
			
			ps.setDouble(1, 1.2);
			ps.setInt(2, 1);
			
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
