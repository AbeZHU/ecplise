package com_FileManager;

import com_properties.Addemployee_config;
import com_properties.Login_config;

public class Com_File {

	private Com_File() {
	
}

	public static Com_File manager() {
		Com_File manage = new Com_File();
		return manage;
	}

	public Login_config getInstance_Login_config() {
		Login_config log = new Login_config();
		return log;
	}

	public Addemployee_config getInstance_AddEmployee_config() {
		Addemployee_config add = new Addemployee_config();
		return add;
	}

}
