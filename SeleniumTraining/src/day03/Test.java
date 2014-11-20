package day03;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utilities.UtilLibrary;

public class Test {

	UtilLibrary objLibrary = new UtilLibrary();
	WebDriver objBrowser = null;
	
	public static void main(String[] args) throws IOException {
		
		Test objTest = new Test();
		objTest.actualTest();
		
	}
	
	public void actualTest() throws IOException{
	
		objBrowser = objLibrary.launchBrowser("");
		objBrowser.navigate().to("https://na.edit.yahoo.com/registration?.pd=ym_ver%253D0%2526c%253D%2526ivt%253D%2526sg%253D&intl=us&origIntl=&done=http%3A%2F%2Fmail.yahoo.com&src=ym&last=&partner=yahoo_default&wl=&wlcr=&_asdk_embedded=&create_alias=&.scrumb=&domain=&yahooid=&lang=en-US&fsredirect=1&fs=qz3QzleHafDc4JabEdc9fx6JxYTOMZa1wU0hHfLxEKhdNImtYmgrCYHO8wzorlQyZ6f6yWW3");
		
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	
		objLibrary.setTextValue("input#first-name", "Mark");	

		objLibrary.takeScreenshot("YahooReg");
	}
	
	
}
