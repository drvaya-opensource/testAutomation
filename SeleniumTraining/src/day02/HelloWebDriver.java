package day02;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWebDriver {
	
	
	public static WebDriver objBrowser = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		
		objBrowser = new ChromeDriver();  
		
		objBrowser.navigate().to("https://na.edit.yahoo.com/registration?.pd=ym_ver%253D0%2526c%253D%2526ivt%253D%2526sg%253D&intl=us&origIntl=&done=http%3A%2F%2Fmail.yahoo.com&src=ym&last=&partner=yahoo_default&wl=&wlcr=&_asdk_embedded=&create_alias=&.scrumb=&domain=&yahooid=&lang=en-US&fsredirect=1&fs=qz3QzleHafDc4JabEdc9fx6JxYTOMZa1wU0hHfLxEKhdNImtYmgrCYHO8wzorlQyZ6f6yWW3");
		
		setTextValue("input#firstName", "Mark");	
		setDropDownValue("select#month", "February", "Text");
		
	}
	
	public static void setTextValue(String locator, String data){
		WebElement txtBox = objBrowser.findElement(By.cssSelector(locator));
		txtBox.sendKeys(data);		
	}
	
	public static void setDropDownValue(String locator, String data, String type){
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

}
