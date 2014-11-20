package day04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.UtilLibrary;

public class Dates {

	WebDriver objBrowser = null;
	UtilLibrary objLibrary = new UtilLibrary();
	
	public static void main(String[] args) {

		Dates objDates = new Dates();		
		objDates.setDateType_0();
		objDates.setDateType_1();
	}
	
	public void setDateType_0(){
		
		objBrowser = objLibrary.launchBrowser("CR");
		objBrowser.navigate().to("http://devbot9.biz.ly/autoprobe.html");
		WebElement dateBox = objBrowser.findElement(By.xpath("//input[@name='bdaytime']"));
		
		//Fill date  
        dateBox.sendKeys("14Mar");
        dateBox.sendKeys(Keys.TAB);
        dateBox.sendKeys("1980");
        dateBox.sendKeys(Keys.TAB);
        //Fill time
        dateBox.sendKeys("0945AM");
    }
	
	public void setDateType_1(){
		
		objBrowser.findElement(By.id("datepicker")).click();
		objBrowser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		objBrowser.findElement(By.cssSelector("div#ui-datepicker-div a[title='Next'] span")).click();  
		WebElement dateWidget = objBrowser.findElement(By.id("ui-datepicker-div"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));  
		   
		for (WebElement cell: columns){  
		   if (cell.getText().equals("13")){  
			   cell.findElement(By.linkText("13")).click();  
			   break; 
		   }
		}
	}
}
