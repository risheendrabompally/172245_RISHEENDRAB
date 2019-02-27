package com.IMDB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User_DAO {
	public boolean insert(String firstname,String lastname,String username, String email,String password,String mobile,String country) throws SQLException {
		
		String query="insert into Infouser values(?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement ps= conn.prepareStatement(query);
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ps.setString(3, username);
		ps.setString(4, email);
		ps.setString(5, password);
		ps.setString(6, mobile);
		ps.setString(7, country);
		ps.executeUpdate();
		return true;
	}
}