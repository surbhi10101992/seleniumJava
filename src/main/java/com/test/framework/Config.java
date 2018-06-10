package com.test.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	static Properties prop = null;
	InputStream input = null;

	public Config(String configName) throws IOException {
		input = new FileInputStream(System.getProperty("user.dir") + "\\config\\" + configName + ".properties");
		prop = new Properties();
		prop.load(input);
	}

	public static String getProperty(String key) throws Exception {
		try {
			return prop.getProperty(key);
		} catch (Exception ex) {
			System.out.println("KEY NOT FOUND");
			throw ex;
		}
	}

}
