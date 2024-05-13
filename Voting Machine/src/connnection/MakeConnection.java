package connnection;

import java.sql.*;
public class MakeConnection {
	private static Connection cn;
	private static String dburl;
	private static String host;
	private static String pass;
	static{
		dburl="jdbc:mysql://localhost:3306/jdbcdata";
		host="root";
		pass="root";
	}
	
	public static Connection getConn() throws SQLException {
		cn = DriverManager.getConnection(dburl,host,pass);		
		if(cn==null) {
			System.out.println("Connection cannot be made........");
		}
		return cn;
	}
	public static void closeConn() throws SQLException {
		cn.close();
	}
}
