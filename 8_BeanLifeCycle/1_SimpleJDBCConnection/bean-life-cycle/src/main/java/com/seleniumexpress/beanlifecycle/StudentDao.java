package com.seleniumexpress.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void selectRows() throws ClassNotFoundException, SQLException {
		
		//load driver
		Class.forName(driver);
		
		//get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//Execute query
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM acetdb.hostel");
		
		//rs contains all the rows that we want so let's iterate through it
		while(rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			String fees = rs.getString(3);
			String type = rs.getString(4);   
			
			System.out.println(studentId+" "+studentName+" "+fees+" "+type);
		}
		
		con.close();
	}
	
	public void deleteStudentRecord(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("DELETE FROM acetdb.hostel where studentId = "+id);
		
		System.out.println("Student whose id = "+id+" deleted successfully");
		
		con.close();
		
	}
	

}
