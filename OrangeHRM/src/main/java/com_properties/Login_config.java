package com_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Login_config {
	public static Properties prop = new Properties();	

	public Login_config() {
		try {
			File newF = new File("src\\main\\java\\com_properties\\login.properties");
			InputStream fis = new FileInputStream(newF);
			prop.load(fis);
			
		} catch (FileNotFoundException fileExp) {
			fileExp.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	public static void main(String[] args) {
		
	}
}
