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
			ps = conn.prepareStatement("INSERT INTO produtos "
					+ "(nome_produto, valor, id_cat) "
					+ "VALUES "
					+ "(?, ?, ?)");
			
			ps.setString(1, "Martelo");
			ps.setDouble(2, 20);
			ps.setInt(3, 2);
			
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
