package day04;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.internal.PropertiesFile;

import utilities.UtilLibrary;

public class ConfigurableCode {

	public static Properties CONFIG;
	
	public static void main(String[] args) throws IOException {
		
		PropertiesFile objPropFile = new PropertiesFile("config.properties");
		CONFIG = objPropFile.getProperties();
			
		ConfigurableCode objTest = new ConfigurableCode();
		objTest.test();
		
	}

	public void test(){
		
		UtilLibrary objLib = new UtilLibrary();
		WebDriver objBrowser = objLib.launchBrowser(CONFIG.getProperty("browserType"));
		
		objBrowser.navigate().to(CONFIG.getProperty("TestURL"));
		
	}
}
