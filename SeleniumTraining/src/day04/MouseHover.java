package day04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
	     
	     WebElement element = driver.findElement(By.linkText("Support"));
	     
	     Actions builder = new Actions(driver);
	     
	     builder.moveToElement(element).build().perform();
	     driver.findElement(By.linkText("Samples")).click();
	     
	}
}
