package utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.PropertiesFile;

public class UtilLibrary {

	WebDriver objBrowser = null;
	
	public WebDriver launchBrowser(String browserType){
		
		if(browserType.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer.exe");
			objBrowser = new InternetExplorerDriver();
		}
		else if(browserType.equalsIgnoreCase("cr")){
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
			objBrowser = new ChromeDriver();
		}
		else {
			objBrowser = new FirefoxDriver();
		}
		
		objBrowser.manage().window().maximize();
		objBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return objBrowser;
	}
	

	public void setTextValue(String locator, String data){
		
		WebElement txtBox = objBrowser.findElement(By.cssSelector(locator));
		txtBox.sendKeys(data);		
	}
	
	public void setDropDownValue(String locator, String data, String type){
		WebElement objDropdown = objBrowser.findElement(By.cssSelector(locator));
		Select objSelect = new Select(objDropdown);
	
		if(type.equalsIgnoreCase("index")){
			objSelect.selectByIndex(Integer.parseInt(data));
		}
		else if(type.equalsIgnoreCase("value")){
			objSelect.selectByValue(data);
		}
		else if(type.equalsIgnoreCase("text")){
			objSelect.selectByVisibleText(data);
		}
	}
	
	public void takeScreenshot(String strFileName) throws IOException {		
		File objScrshot = ((TakesScreenshot)objBrowser).getScreenshotAs(OutputType.FILE);				
		FileUtils.copyFile(objScrshot, new File("C:\\auto_images\\" + strFileName + ".png"));
		//return objScrshot;
	}
	
	public void takeElementScreenshot(String selector, String strPath, String strFileName) throws IOException {
		
		File scrFile = ((TakesScreenshot)objBrowser).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(scrFile);
		
		WebElement element = objBrowser.findElement(By.cssSelector(selector));		
		//Get the location of element on the page
		Point point = element.getLocation();
		//System.out.println(point.getX() + "-" + point.getY());
		//Get width and height of the element
		int eleWidth = element.getSize().getWidth();
		int eleHeight = element.getSize().getHeight();
		
		//Crop the entire page screenshot to get only element screenshot
		BufferedImage elementScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(elementScreenshot, "png", scrFile);
		//Copy the element screenshot to dis
		//System.out.println(strPath + strFileName + ".png");
		FileUtils.copyFile(scrFile, new File(strPath + strFileName + ".png"));
		
	}

	public void test_abc(String strData){
		System.out.println("Inside test_abc..." + strData);		
	}


	public void click(String locator) {
		
		WebElement element = objBrowser.findElement(By.cssSelector(locator));
		element.click();	
	}
	
	
	
}
