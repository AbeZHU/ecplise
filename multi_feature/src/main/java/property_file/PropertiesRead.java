package property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesRead {
	public static FileInputStream file;
	public static Properties prop = new Properties();

	public static void PropertiesRead() {
		try {
			file = new FileInputStream("src\\main\\java\\property_file\\prop.properties");
			prop.load(file);

		} catch (Exception e) {
			e.getCause();
			e.printStackTrace();
		}
	}

	public String getUserName() {
		String username = prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String getHomeUrl() {
		String homeUrl = prop.getProperty("homeurl");
		return homeUrl;
	}

	public String getLocation() {
		String location = prop.getProperty("location");
		return location;
	}

	public String getHotel() {
		String hotel = prop.getProperty("hotel");
		return hotel;
	}

	public String getRoomType() {
		String roomType = prop.getProperty("roomtype");
		return roomType;
	}

	public String getRoomNo() {
		String roomNo = prop.getProperty("roomno");
		return roomNo;
	}

	public String getCheckIn() {
		String checkIn = prop.getProperty("checkin");
		return checkIn;
	}

	public String getCheckOut() {
		String checkOut = prop.getProperty("checkout");
		return checkOut;
	}

	public String getNoAdults() {
		return prop.getProperty("noadults");
	}

	public String getNoChild() {
		return prop.getProperty("nochild");
	}

	public String getFirstName() {
		return prop.getProperty("firstname");
	}

	public String getLastName() {
		return prop.getProperty("lastname");
	}

	public String getBillAddress() {
		return prop.getProperty("billaddress");
	}

	public String getCreditcardNo() {
		return prop.getProperty("creditcardno");
	}

	public String getCardType() {
		return prop.getProperty("cardtype");
	}

	public String getExpiryMonth() {
		return prop.getProperty("expirymonth");
	}

	public String getExpYear() {
		return prop.getProperty("expyear");
	}

	public String getCvvNumber() {
		return prop.getProperty("cvvnumber");
	}

	public static void writeFile() {
		try {
			OutputStream out = new FileOutputStream(
					"C:\\Users\\noone\\git\\ecplise\\multi_feature\\src\\main\\java\\property_file\\kk.properties");
			prop.setProperty("maximum", "overdriver");
			prop.store(out, null);

		} catch (FileNotFoundException e) {
			e.getCause();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		writeFile();
	}
}
