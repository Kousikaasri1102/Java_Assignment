package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
	static String userDB="root";
	static String passDB="";
	static String url="jdbc:mysql://localhost:3306/student_information";
	static String driver="com.mysql.jdbc.Driver";
	static Connection con;
	public static Connection dbConnect() {
    	try {
			Class.forName(driver);
//			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			
//			System.out.println("driver not loaded");
			e.printStackTrace();
		}
    	 try {
    		 con= DriverManager.getConnection(url,userDB,passDB);
//    		 System.out.println("connection establised");
    	 }catch(SQLException e){
//    		 System.out.println("connection failed");
    		 e.printStackTrace();
    	 }
		return con;
    }
    public static void dbClose() {
		 try {
	         con.close();
//       	 System.out.println("connection closed");
            }catch(SQLException e) {
//	         System.out.println("connection could not b closed");
         }
    }
    public static void main(String[] args) {
		
    	DBConnection.dbConnect();
    	DBConnection.dbClose();
	}
}
