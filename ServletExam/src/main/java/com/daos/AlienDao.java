package com.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pojos.Alien;

public class AlienDao {

	Connection con=null;
	public AlienDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		Class.forName("com.mysql.jdbc.Driver");
	    this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Dhanaramch@0817");
		
	}
	public Alien getAlien(int id) {
		
		Alien a1= new Alien();
		a1.setId(101);
		a1.setName("ABC");
		a1.setTech("Java");
		
		try {
			
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from alien where id="+id);
			if(rs.next()) {
			  a1.setId(rs.getInt("id"));
			  a1.setName(rs.getString("name"));
			  a1.setTech(rs.getString("tech"));
			  
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a1;
	}
	
	public boolean addAlien(Alien alien) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = con.prepareStatement("insert into alien values (?,?,?)");
		ps.setInt(1, alien.getId());
		ps.setString(2,alien.getName());
		ps.setString(3,alien.getTech());
		ps.execute();
		return true;
	}
}
