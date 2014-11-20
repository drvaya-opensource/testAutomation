package finale;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.internal.PropertiesFile;

import utilities.UtilLibrary;

public class SearchTest {

	public static Properties CONFIG;
	
	public static void main(String[] args) throws IOException {

		PropertiesFile objPropFile = new PropertiesFile("config.properties");
		CONFIG = objPropFile.getProperties();
			
		SearchTest objTest = new SearchTest();
		objTest.test();
		
	}
	
	public void test() throws IOException{
		
		UtilLibrary objLib = new UtilLibrary();
		WebDriver objBrowser = objLib.launchBrowser(CONFIG.getProperty("browserType"));
		
		String strKeywords = CONFIG.getProperty("SearchKeywords");
		String[] arrKeywords = strKeywords.split(",");
		
		for(String keyword : arrKeywords){
		
			objBrowser.navigate().to(CONFIG.getProperty("TestURL"));
			objLib.setTextValue(CONFIG.getProperty("searchBox"), keyword);
			objLib.click(CONFIG.getProperty("searchButton"));
			
			WebElement searchResult = objBrowser.findElement(By.cssSelector(CONFIG.getProperty("searchURL")));
			System.out.println("Keyword: "+ keyword);//Keyword: Google
			System.out.println("Link: "+ searchResult.getText());//Link: http://www.google.co.in/
			
			objLib.takeElementScreenshot(CONFIG.getProperty("searchSpan"), CONFIG.getProperty("SnapshotFolder"), keyword);
			
			for(int i=0; i<30; i++){System.out.print("-");}System.out.println();
		}
	}

}
