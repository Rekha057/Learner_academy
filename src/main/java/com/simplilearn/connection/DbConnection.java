package com.simplilearn.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
public static Connection dbcon() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/companyjdbc", "root", "rekha777");
	System.out.println(con);
	return con;
}
	
}
