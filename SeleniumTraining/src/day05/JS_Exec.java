package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JS_Exec {

	public static void main(String[] args) {
/*
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        
		String domain_name = (String) js.executeScript("return document.domain");
	    System.out.println(domain_name);
        
        js.executeScript("document.querySelector('button[name=\"btnI\"]').click();");
*/
		
		for(int i=0;i<=7;i++){
			System.out.println(i);
		}
    
    
	}

}
