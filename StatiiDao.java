package ro.emanuel.statii.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.statii.helpers.DBHelper;
import ro.emanuel.statii.pojo.Statii;

public class StatiiDao {
	
	public static Statii getById(int id) throws SQLException,IOException  {
		Connection conn=DBHelper.getConnection();
		String query="select * from  statii where id=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Statii statii=new Statii(rs.getInt("id"),
					rs.getString("nume"),
					rs.getInt("urcare"),
					rs.getInt("coborare"),
					rs.getInt("unuN"),
					rs.getInt("unuR"),
					rs.getInt("unuS"),
					rs.getInt("doiN"),
					rs.getInt("doiR"),
					rs.getInt("treiN"),
					rs.getInt("treiR"),
					rs.getInt("patruN"),
					rs.getInt("patruR"));
			DBHelper.closeConnection();
			return statii;
		}
		DBHelper.closeConnection();
		return null;
	}

	
	public static ArrayList<Statii> getAllStatii() throws SQLException {
		
		Connection conn=DBHelper.getConnection();
		String query="select * from statii";
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		ArrayList<Statii>statiis=new ArrayList<>();
		while(rs.next()) {
			Statii statii=new Statii(rs.getInt("id"),rs.getString("nume"), rs.getInt("urcare"), rs.getInt("coborare"), rs.getInt("unuN"),
			rs.getInt("unuR"), rs.getInt("unuS"), rs.getInt("doiN"), rs.getInt("doiR"), rs.getInt("treiN"), rs.getInt("treiR"), 
			rs.getInt("patruN"), rs.getInt("patruR"));
			statiis.add(statii);}
		conn.close();
		return statiis;		
	}
	
	public static void create(Statii s) throws SQLException {
		StatiiDao.create(s.getNume(),s.getUrcare(),s.getCoborare(),s.getUnuN(),s.getUnuR(),s.getUnuS(), s.getDoiN(),s.getDoiR(), s.getTreiN(),s.getTreiR(), s.getPatruN(),s.getPatruR());
	}


	private static void create(String nume, int urcare, int coborare, int unuN, int unuR, int unuS,
			int doiN, int doiR, int treiN, int treiR, int patruN, int patruR) throws SQLException {
		// instructiunea sql
		String insert = "insert into statii (nume, urcare, coborare, unuN, unuR, unuS, doiN, doiR, treiN, treiR, patruN, patruR)" + "value(?,?,?,?,?,?,?,?,?,?,?,?)";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, nume);
		stmt.setInt(2, urcare);
		stmt.setInt(3, coborare);
		stmt.setInt(4, unuN);
		stmt.setInt(5, unuR);
		stmt.setInt(6, unuS);
		stmt.setInt(7, doiN);
		stmt.setInt(8, doiR);
		stmt.setInt(9, treiN);
		stmt.setInt(10, treiR);
		stmt.setInt(11, patruN);
		stmt.setInt(12, patruR);

		// executie stmt
		stmt.executeUpdate();
		DBHelper.closeConnection();		
	}
	
	public static void update(Statii s) throws SQLException {

		String update = "update statii set nume=?, urcare=?, coborare=?, unuN=?, unuR=?, unuS=?, doiN=?, doiR=?, treiN=?, treiR=?, patruN=?, patruR=? where id=?";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, s.getNume());
		stmt.setInt(2, s.getUrcare());
		stmt.setInt(3, s.getCoborare());
		stmt.setInt(4, s.getUnuN());
		stmt.setInt(5, s.getUnuR());
		stmt.setInt(6, s.getUnuS());
		stmt.setInt(7, s.getDoiN());
		stmt.setInt(8, s.getDoiR());
		stmt.setInt(9, s.getTreiN());
		stmt.setInt(10, s.getTreiR());
		stmt.setInt(11, s.getPatruN());
		stmt.setInt(12, s.getPatruR());
		stmt.setInt(13, s.getId());
	
		// executie stmt
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}
	
	public static void delete(Statii s) throws SQLException {
		StatiiDao.delete(s.getId());
	}

	public static void delete(int id) throws SQLException {
		String delete = "delete from statii where id=?";
		
		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);

		// executie stmt
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}
	
}
