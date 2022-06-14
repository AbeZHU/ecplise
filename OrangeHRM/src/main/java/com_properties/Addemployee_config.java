package com_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Addemployee_config {
	
	public static Properties prop = new Properties();	

	public Addemployee_config() {
		try {
			File newF = new File("src\\main\\java\\com_properties\\addEmployee.properties");
			InputStream fis = new FileInputStream(newF);
			prop.load(fis);
			
		} catch (FileNotFoundException fileExp) {
			fileExp.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getFullname() {
		return prop.getProperty("fullname");
	}
	public String getMiddlename() {
		return prop.getProperty("middlename");
	}
	public String getLastname() {
		return prop.getProperty("lastname");
	}
	public String getPhotopath() {
		return prop.getProperty("photopath");
	}
	public String getUsername() {
		return prop.getProperty("username");
	}
	public String getPassword() {
		return prop.getProperty("password");
	}

}
