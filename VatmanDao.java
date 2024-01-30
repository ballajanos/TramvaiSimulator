package ro.emanuel.vatman.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.emanuel.vatman.helpers.DBhelper;
import ro.emanuel.vatman.pojo.Vatman;

public class VatmanDao {

	public static Vatman getById(int id) throws SQLException,IOException  {
		Connection conn=DBhelper.getConnection();
		String query="select * from  vatman where id=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Vatman vatman=new Vatman(rs.getInt("id"),
					rs.getString("nume"),
					rs.getString("prenume"),
					rs.getString("gen"),
					rs.getInt("varsta"),
					rs.getInt("ani_experienta"),
					rs.getString("mers_tramvai"));
			DBhelper.closeConnection();
			return vatman;
		}
		DBhelper.closeConnection();
		return null;
			
	}
	
	public static ArrayList<Vatman> getAllVatman() throws SQLException {
		
		Connection conn=DBhelper.getConnection();
		String query="select * from vatman";
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		ArrayList<Vatman>vatmans=new ArrayList<>();
		while(rs.next()) {
			Vatman vatman=new Vatman(rs.getInt("id"),rs.getString("nume"),rs.getString("prenume"),rs.getString("gen"),rs.getInt("varsta"),
					rs.getInt("ani_experienta"), rs.getString("mers_tramvai"));
			vatmans.add(vatman);		}
		conn.close();
		return vatmans;		
	}
	
	public static void create(Vatman v) throws SQLException {
		VatmanDao.create(v.getNume(),v.getPrenume(),v.getGen(),v.getVarsta(),v.getAni_experienta(),v.getMers_tramvai());
	}
	
	
	private static void create(String nume, String prenume, String gen, int varsta, int ani_experienta,
			String mers_tramvai) throws SQLException {
		// instructiunea sql
				String insert = "insert into vatman (nume, prenume, gen, varsta, ani_experienta, mers_tramvai)" + "value(?,?,?,?,?,?)";
		
		// conexiune
		Connection con = DBhelper.getConnection();
		
		// prepared statement
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, nume);
		stmt.setString(2, prenume);
		stmt.setString(3, gen);
		stmt.setInt(4, varsta);
		stmt.setInt(5, ani_experienta);
		stmt.setString(6, mers_tramvai);
		
		// executie stmt
		stmt.executeUpdate();
		DBhelper.closeConnection();
	}


	public static void update(Vatman v) throws SQLException {

		String update = "update vatman set nume=?, prenume=?, gen=?, varsta=?, ani_experienta=?, mers_tramvai=? where id=?";

		// conexiune
		Connection con = DBhelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, v.getNume());
		stmt.setString(2, v.getPrenume());
		stmt.setString(3, v.getGen());
		stmt.setInt(4, v.getVarsta());
		stmt.setInt(5, v.getAni_experienta());
		stmt.setString(6, v.getMers_tramvai());
		stmt.setInt(7, v.getId());

		// executie stmt
		stmt.executeUpdate();
		DBhelper.closeConnection();
	}

	public static void delete(Vatman v) throws SQLException {
		VatmanDao.delete(v.getId());
	}

	public static void delete(int id) throws SQLException {
		String delete = "delete from vatman where id=?";
		
		// conexiune
		Connection con = DBhelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);

		// executie stmt
		stmt.executeUpdate();
		DBhelper.closeConnection();
	}
}
