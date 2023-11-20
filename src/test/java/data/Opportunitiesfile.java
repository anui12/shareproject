package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Opportunitiesfile {

	public String getDataFromfile(String key) throws IOException {
		FileInputStream file=new FileInputStream("src\\test\\resources\\Oppornities.properties");
		Properties p=new Properties();
		p.load(file);
		String data=p.getProperty(key);
		return data;
	}
}
