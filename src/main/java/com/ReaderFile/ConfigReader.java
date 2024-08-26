 package com.ReaderFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	static Properties pr;
	static FileInputStream fs;
	
	private Properties getData() throws IOException {
		File file = new File
			("C:\\Users\\Administrator\\eclipse-workspace\\AugestIPTProject\\src\\main\\java\\com\\configProperties\\Config.Properties");
		pr = new Properties();	
		fs = new FileInputStream(file);
		pr.load(fs);
		return pr;
	}
	public String getBrowser() throws IOException {
		
		String browser = getData().getProperty("browser");
		return browser;
	}
	
	public String getUrl() throws IOException {
		String url = getData().getProperty("Url");
		return url;
	}
	
	public String getEmail() throws IOException {
		String email = getData().getProperty("email");
		return email;
	}
	
	public String getPassword() throws IOException {
		String password = getData().getProperty("password");
		return password;
	}
	
}
