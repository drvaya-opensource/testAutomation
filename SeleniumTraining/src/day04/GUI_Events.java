package day04;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GUI_Events {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setEnableNativeEvents(true);  
		
		driver = new FirefoxDriver(profile);
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		//"#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.standartTreeRow > span"
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		//#treebox2 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.standartTreeRow > span
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From)
							.moveToElement(To)
							.release(To)
							.build();

		dragAndDrop.perform();
		
		//takeElementScreenshot("#treebox2", "afterEvent");
		 		
				
	}

}
