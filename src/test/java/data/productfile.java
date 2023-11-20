package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class productfile {

	public String getDataFromFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("src\\test\\resources\\products.properties");
		Properties p=new Properties();
		p.load(file);
		 String  data = p.getProperty(key);
		 return data;
	}
}
