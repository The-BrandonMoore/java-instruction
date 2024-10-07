package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Actor;


public class ActorDB {
	private static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	
	public static List<Actor> getAll() {
		String sql = "SELECT * FROM Actor";
		List<Actor> actors = new ArrayList<>();
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthdate = rs.getDate(5);
				Actor a = new Actor(id, firstName, lastName, gender, birthdate);
				actors.add(a);
			}
			conn.close();
		} catch (SQLException e) {
			System.err.println(e);
			actors = null;
		}
		return actors;
	}
	
	public static boolean add(Actor a) {
		String sql = "INSERT INTO Actor (FirstName, LastName, Gender, Birthdate)" + "VALUES (?,?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setDate(4, a.getBirthdate());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}

	}
	
	public static Actor get(int id) {
		String sql = "SELECT * " + "FROM Actor " + "WHERE Id = ?";
		try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthdate = rs.getDate(5);
				Actor a = new Actor(id, firstName, lastName, gender, birthdate);
				return a;
			} else {
				rs.close();
				return null;
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}
	
	public static boolean update(Actor a) {
		String sql = "UPDATE Actor SET " + "  FirstName = ?, " + "  LastName = ?, " + "  Gender = ?, " + "  Birthdate = ? "
				+ "WHERE Id = ?";
		try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setDate(4, a.getBirthdate());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}
	
	public static boolean delete(int id) {
		String sql = "DELETE FROM Actor " + "WHERE Id = ?";
		try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}
	
	
	
	
}
