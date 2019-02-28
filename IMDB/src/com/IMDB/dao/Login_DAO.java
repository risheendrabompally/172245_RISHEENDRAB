package com.IMDB.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login_DAO {
	public static boolean validate(Infouser user) throws SQLException
	{
		
		 Connection con=ConnectionFactory.getConnection();
		  Statement s=con.createStatement();
		  String sql="select username, password from Infouser ";
		  ResultSet rs=s.executeQuery(sql);
		  String dname=user.getUsername();
		  String dpwd=user.getPassword();
		  while(rs.next())
		  {		  
			  if(user.getUsername().equals(dname) && user.getPassword().equals(dpwd))
			  {
				  return true;
			  }
		  }
		return false;	
	}
}