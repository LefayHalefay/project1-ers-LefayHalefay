package com.projectone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class ConnectionUtility {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		Logger log = Logger.getRootLogger();
		
//		String url = System.getenv("db_url");
//		String port = System.getenv("db_port");
//		String dbName = System.getenv("db_name");
//		String dbSchema = System.getenv("db_schema");
//		String username = System.getenv("db_username");
//		String password = System.getenv("db_password");
		String url = "uta-1810.ceminzycmgqc.us-east-2.rds.amazonaws.com";
		String port = "5432";
		String dbName = "postgres1810";
		String dbSchema = "paymentsystems";
		String username = "postgres1810";
		String password = "Utapg1810";
		
		String dataSource = "jdbc:postgresql://" + url + ":" + port + "/" + dbName + "?currentSchema=" + dbSchema;
		
		log.debug(dataSource);
		
		return DriverManager.getConnection(dataSource, username, password);
		
	}

}
