package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigProperties {
	
	static Properties properties = new Properties();	
	
	public static void init() throws IOException {
		try {
			properties.load(new FileInputStream(new File("src/main/resources/config.properties")));
		}
		catch(FileNotFoundException e2){
			e2.printStackTrace();
		}
		
	}
	
	public static String getFromProperties(String description) throws IOException {
		init();
		return properties.getProperty(description);
	}
}
