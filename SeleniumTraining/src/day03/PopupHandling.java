package day03;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.UtilLibrary;

public class PopupHandling {

	UtilLibrary objLibrary = new UtilLibrary();
	WebDriver objBrowser = null;
	
	public static void main(String[] args) throws IOException {
		
		PopupHandling objTest = new PopupHandling();
		
		objTest.testAlertBox();	
		objTest.takeScreenshot("afterTest");
	}
	
	public void testAlertBox(){
	
		objBrowser = objLibrary.launchBrowser("ff");
		objBrowser.navigate().to("http://devbot9.biz.ly/autoprobe.html");
		
		/*WebElement btnShowAlert = objBrowser.findElement(By.cssSelector("input#show_alert"));
		btnShowAlert.click();
		
		Alert objAlert = objBrowser.switchTo().alert();
		String strAlertText = objAlert.getText();
		System.out.println(strAlertText);

		if(strAlertText.contains("alert")){
			System.out.println("Test case failed");
		}
		objAlert.accept();*/

		
	}
	
	public void testConfirmBox(boolean action){
		
		objBrowser = objLibrary.launchBrowser("ff");
		objBrowser.navigate().to("http://devbot9.biz.ly/autoprobe.html");
		
		WebElement btnShowAlert = objBrowser.findElement(By.cssSelector("button#show_confirm"));
		btnShowAlert.click();
		Alert objAlert = objBrowser.switchTo().alert();
		
		String strAlertText = objAlert.getText();
		System.out.println(strAlertText);

		if(action){
			objAlert.accept();
		}
		else{
			objAlert.dismiss();
		}
		
		WebElement objResult = objBrowser.findElement(By.cssSelector("p#demo"));
		String result = objResult.getText().toLowerCase();
		
		//  true && true
		if(action && result.contains("ok")){
			System.out.println("You clicked OK & text shown is OK");
		}
		//       !false && true --> 
		// 		true && true --> true
		else if(!action && result.contains("cancel")){
			System.out.println("You clicked Cancel & text shown is Cancel");
		}
	}
	
	
	public void testPopupWindow(){
		
		objBrowser = objLibrary.launchBrowser("ff");
		objBrowser.navigate().to("http://devbot9.biz.ly/autoprobe.html");
		
		String parentWindowHandle = objBrowser.getWindowHandle();
		   
		WebElement btnShowPopup = objBrowser.findElement(By.cssSelector("a#display_popup"));
		btnShowPopup.click();
		 
		WebDriver popup = null;
	      
	    Set<String> windowSet = objBrowser.getWindowHandles();
	    
	    Iterator<String> windowIterator = windowSet.iterator();
	    
	    while(windowIterator.hasNext()) { 
	    	
	    	String windowHandle = windowIterator.next();
	    	System.out.println(windowHandle);
	    	popup = objBrowser.switchTo().window(windowHandle);
	    	
	    	if (popup.getTitle().equals("Google")){
	    		break;
	    	}
	    }
	    
	    popup.findElement(By.cssSelector("button[name='btnI']")).click();
	    popup.close();	    
	    objBrowser.switchTo().window(parentWindowHandle); // Switch back to parent window.

	}
	
	public void takeScreenshot(String strFileName) throws IOException {
		
		File objScrshot = ((TakesScreenshot)objBrowser).getScreenshotAs(OutputType.FILE);				
		FileUtils.copyFile(objScrshot, new File("C:\\auto_images\\" + strFileName + ".png"));
		
	}
	
	
}
