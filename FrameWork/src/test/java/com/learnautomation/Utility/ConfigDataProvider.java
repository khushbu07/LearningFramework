package com.learnautomation.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Config/config.properties");

		FileInputStream fis;

		try {
			fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);

		}

		catch (Exception e)

		{
			System.out.println("Not able to load Config file " + e.getMessage());

		}
	}

	public String getDataFromConfig(String keyToSearch) {
     return pro.getProperty(keyToSearch);
	}

	public String getBrowser() {

		return pro.getProperty("Browser");
	}

	public String getqaUrl() {
		return pro.getProperty("qaUrl");
	}
}
