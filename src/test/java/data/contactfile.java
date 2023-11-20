package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class contactfile {

	public String getDataFromFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("src\\test\\resources\\contact.properties");
		Properties p=new Properties();
		p.load(file);
		 String value = p.getProperty(key);
		 return value;
	}
}
