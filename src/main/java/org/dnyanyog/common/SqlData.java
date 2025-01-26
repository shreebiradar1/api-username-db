package org.dnyanyog.common;

public class SqlData {
	private static String Url;
	private static String username;
	private static String password;

	public static String setUrl(String temp) {
		Url = temp;
		return Url;
	}

	public static String getUrl() {
		return Url;
	}

	// Directly use getter because for everyone the username and password were same
	public static String getUsername() {
		username = "root";
		return username;
	}

	public static String getPassword() {
		password = "Shree@123";
		return password;
	}
}