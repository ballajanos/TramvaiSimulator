package ro.emanuel.tramvai.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.statii.dao.StatiiDao;
import ro.emanuel.statii.pojo.Statii;
import ro.emanuel.tramvai.helpers.DBHelper;
import ro.emanuel.tramvai.pojo.Tramvai;

public class TramvaiDao {

	public static Tramvai getById(int id) throws SQLException,IOException  {
		Connection conn=DBHelper.getConnection();
		String query="select * from  tramvai where id=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Tramvai tramvai=new Tramvai(rs.getInt("id"),
					rs.getFloat("lungimea"),
					rs.getInt("nr_scaune"),
					rs.getInt("max_capacitate"),
					rs.getString("linia"),
					rs.getInt("timp_ciclu"),
					rs.getDate("pornit"));
			DBHelper.closeConnection();
			return tramvai;
		}
		DBHelper.closeConnection();
		return null;
	}

	public static ArrayList<Tramvai> getAllTramvai() throws SQLException {
		Connection conn=DBHelper.getConnection();
		String query="select * from tramvai";
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		ArrayList<Tramvai>tramvais=new ArrayList<>();
		while(rs.next()) {
			Tramvai tramvai=new Tramvai(rs.getInt("id"), rs.getFloat("lungimea"), rs.getInt("nr_scaune"), rs.getInt("max_capacitate"),
				rs.getString("linia"), rs.getInt("timp_ciclu"), rs.getDate("pornit"));
			tramvais.add(tramvai);}
		conn.close();
		return tramvais;		
	}
	
	public static void create(Tramvai t) throws SQLException {
		TramvaiDao.create(t.getLungimea(),t.getNr_scaune(), t.getMax_capacitate(), t.getLinia(), t.getTimp_ciclu(), t.getPornit());
	}
	
	private static void create(float lungimea, int nr_scaune, int max_capacitate, String linia, int timp_ciclu, Date pornit) throws SQLException {
		// instructiunea sql
		String insert = "insert into tramvai (lungimea, nr_scaune, max_capacitate, linia, timp_ciclu, pornit)" + "value(?,?,?,?,?,?)";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setFloat(1, lungimea);
		stmt.setInt(2, nr_scaune);
		stmt.setInt(3, max_capacitate);
		stmt.setString(4, linia);
		stmt.setInt(5, timp_ciclu);
		stmt.setDate(6, (Date) pornit);

		// executie stmt
		stmt.executeUpdate();
		DBHelper.closeConnection();		
	}
	
	public static void update(Tramvai t) throws SQLException {
		String update = "update tramvai set lungimea=?, nr_scaune=?, max_capacitate=?, linia=?, timp_ciclu=?, pornit=? where id=?";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setFloat(1, t.getLungimea());
		stmt.setInt(2, t.getNr_scaune());
		stmt.setInt(3, t.getMax_capacitate());
		stmt.setString(4, t.getLinia());
		stmt.setInt(5, t.getTimp_ciclu());
		stmt.setDate(6, (Date) t.getPornit());
		stmt.setInt(7, t.getId());
	
		// executie stmt
		stmt.executeUpdate();
		DBHelper.closeConnection();
	}
	
	public static void delete(Tramvai t) throws SQLException {
		TramvaiDao.delete(t.getId());
	}
	
	public static void delete(int id) throws SQLException {
		String delete = "delete from tramvai where id=?";
		
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
