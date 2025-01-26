package org.dnyanyog.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.common.SqlData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	SqlData data;
	
	@GetMapping("/hello")
	public String hello() {
		String text = "Shree Biradar";
		return "Hello "+text;
	}
	
	@GetMapping("/data")
	public String data() throws SQLException {
		String userUrl = "jdbc:mysql://127.0.0.1:3306/user_management";
			Connection connection = DriverManager.getConnection(SqlData.setUrl(userUrl),SqlData.getUsername(),SqlData.getPassword());
			Statement statement = connection.createStatement();
			
			String query = "Select * from user";
			
			ResultSet result = statement.executeQuery(query);
			
			String name = "";
			String email = "";
			String mobile = "";
			while(result.next()) {
				 name = result.getString(1);
				 email = result.getString(2);
				 mobile = result.getString(3);
			}
		return name + "\n" + email + "\n" + mobile;
		
	}
	
}
