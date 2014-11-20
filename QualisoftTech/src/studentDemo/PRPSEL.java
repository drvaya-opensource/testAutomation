package studentDemo;

//package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PRPSEL{
	
	final private int IMPLICIT_WAIT = 30;
	final private int SLEEP_MEDIUM = 5;
	final private int THOUSAND = 1000;
	
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://pmdemo.oats.co.uk/";
    driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
  }

  @Test
  public void testSanket() throws Exception {
	    driver.get(baseUrl + "/");
	    assertEquals("OATS Product Manager: beta test", driver.getTitle());
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("Ardent");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Ardent");
	    driver.findElement(By.name("enter")).click();
	    
	    //Add Channel
	    driver.findElement(By.cssSelector("div.crystalIcon.icon-sitemap")).click();
	    driver.findElement(By.linkText("Add Channel")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.id("newChanName")).clear();
	    driver.findElement(By.id("newChanName")).sendKeys("QACH1");
	    driver.findElement(By.cssSelector("#newChannelConfirm > a")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.linkText("Add Channel")).click();
	    driver.findElement(By.id("newChanName")).clear();
	    driver.findElement(By.id("newChanName")).sendKeys("QACH2");
	    driver.findElement(By.cssSelector("#newChannelConfirm > a")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.linkText("Add Channel")).click();
	    driver.findElement(By.id("newChanName")).click();
	    driver.findElement(By.id("newChanName")).clear();
	    driver.findElement(By.id("newChanName")).sendKeys("QACH3");
	    driver.findElement(By.cssSelector("#newChannelConfirm > a")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.linkText("Add Channel")).click();
	    driver.findElement(By.id("newChanName")).clear();
	    driver.findElement(By.id("newChanName")).sendKeys("QACH4");
	    driver.findElement(By.cssSelector("#newChannelConfirm > a")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.linkText("Add Channel")).click();
	    driver.findElement(By.id("newChanName")).clear();
	    driver.findElement(By.id("newChanName")).sendKeys("QACH5");
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.cssSelector("#newChannelConfirm > a")).click();
	    driver.findElement(By.linkText("Save")).click();
	    driver.findElement(By.cssSelector("#saveChanges > span")).click();
	    
	    /*Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    Alert alert = driver.switchTo().alert();
	    alert.accept(); 
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    */
	    //Above code is now replace with reusable function handleAlert
	    handleAlert(true);
	    
	    //driver.findElement(By.linkText("Save")).click();
	    //driver.findElement(By.cssSelector("#saveChanges > span")).click();
	      
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    driver.findElement(By.linkText("Home")).click();
	    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    
	    //Add Tier
	    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	    driver.findElement(By.xpath("//div[@id='content']/article/ul/li[4]/span")).click();
    
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
                
    //driver.findElement(By.cssSelector("#new_tier > div.buttonSection > ul > li > a")).click();
    
    driver.findElement(By.linkText("Add New")).click();      
    driver.findElement(By.xpath("//input[@value='']")).click();
    driver.findElement(By.xpath("//input[@value='']")).clear();
    driver.findElement(By.xpath("//input[@value='']")).sendKeys("QA New Tier 1");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.cssSelector("#new_tier > div.buttonSection > ul > li > a")).click();
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("QA New Tier 2");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.cssSelector("#new_tier > div.buttonSection > ul > li > a")).click();
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("QA New Tier 3");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.cssSelector("#new_tier > div.buttonSection > ul > li > a")).click();
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[4]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[4]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[4]")).sendKeys("QA New Tier 4");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.cssSelector("#new_tier > div.buttonSection > ul > li > a")).click();
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[5]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[5]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[5]")).sendKeys("QA New Tier 5");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.xpath("//div[@id='tierNames']/div[16]")).click();
        
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
      
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        
        Thread.sleep(THOUSAND*SLEEP_MEDIUM);
        
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    //Add Pseudo Product
    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
    driver.findElement(By.cssSelector("li.active > span")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("//input[@value='']")).click();
    driver.findElement(By.xpath("//input[@value='']")).clear();
    driver.findElement(By.xpath("//input[@value='']")).sendKeys("QA PS 1");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("QA PS 2");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Add New")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("QA PS 3");
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //driver.findElement(By.xpath("//div[@id='pseudoProducts']/div[6]")).click();
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    Alert alert2 = driver.switchTo().alert();
    alert2.accept();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //Add Group
    driver.findElement(By.cssSelector("div.crystalIcon.icon-group")).click();
    driver.findElement(By.linkText("Add Group")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.id("newGroupName")).click();
    driver.findElement(By.id("newGroupName")).clear();
    driver.findElement(By.id("newGroupName")).sendKeys("QA GRP 1");
    driver.findElement(By.cssSelector("#newGroupConfirm > a")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Add Group")).click();
    driver.findElement(By.id("newGroupName")).click();
    driver.findElement(By.id("newGroupName")).clear();
    driver.findElement(By.id("newGroupName")).sendKeys("QA GRP 2");
    driver.findElement(By.cssSelector("#newGroupConfirm > a")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    driver.findElement(By.linkText("Add Group")).click();
    driver.findElement(By.id("newGroupName")).click();
    driver.findElement(By.id("newGroupName")).clear();
    driver.findElement(By.id("newGroupName")).sendKeys("QA GRP 3");
    driver.findElement(By.cssSelector("#newGroupConfirm > a")).click();
    
    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
    
    //QA New Tier 1
    //WebElement test = driver.findElement(By.linkText("QA GRP 1"));
    //Alert myalert=driver.switchTo().alert();
    //System.out.println(test.getAttribute("id"));
    //myalert.accept(); 
    driver.findElement(By.cssSelector("#tierListg6 > div.avatar")).click();
    driver.findElement(By.xpath("//div[@id='tierListg6']/ul/li[Lowest]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#tierListg12 > div.avatar")).click();
    driver.findElement(By.xpath("//div[@id='tierListg12']/ul/li[15]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("#tierListg13 > div.avatar")).click();
    driver.findElement(By.xpath("//div[@id='tierListg13']/ul/li[16]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.id("saveChanges")).click();
    
    Thread.sleep(5000);
    
    Alert alert3 = driver.switchTo().alert();
    alert3.accept();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
    driver.findElement(By.xpath("//div[@id='content']/article/ul/li[2]/span")).click();
    driver.findElement(By.cssSelector("div.labelItems")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("extidname")).click();
    driver.findElement(By.id("extidname")).clear();
    driver.findElement(By.id("extidname")).sendKeys("QA OilCo ID 1");
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
    
    Thread.sleep(5000);
    
    Alert alert4 = driver.switchTo().alert();
    alert4.accept();
        
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(5000);
    
    
    //Add Equipment Classification
    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='content']/article/ul/li[6]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewProducerFamily")).click();
    driver.findElement(By.id("newPFText")).click();
    driver.findElement(By.id("newPFText")).clear();
    driver.findElement(By.id("newPFText")).sendKeys("QA Cat 1");
    driver.findElement(By.linkText("Confirm")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewProducerFamily")).click();
    driver.findElement(By.id("newPFText")).click();
    driver.findElement(By.id("newPFText")).clear();
    driver.findElement(By.id("newPFText")).sendKeys("QA Cat 2");
    driver.findElement(By.linkText("Confirm")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewProducerFamily")).click();
    driver.findElement(By.id("newPFText")).click();
    driver.findElement(By.id("newPFText")).clear();
    driver.findElement(By.id("newPFText")).sendKeys("QA Cat 3");
    driver.findElement(By.linkText("Confirm")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[6]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[6]/div[2]/ul/li[20]")).click();
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[5]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[5]/div[2]/ul/li[21]/span")).click();
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[7]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFamily']/div/ul/li[7]/div[2]/ul/li[22]/span")).click();
    driver.findElement(By.xpath("//ul[@id='pfList']/li[19]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='pfList']/li[20]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='pfList']/li[21]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='pfList']/li[14]/div[3]")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
    
    Thread.sleep(5000);
    
    Alert alert5 = driver.switchTo().alert();
    alert5.accept();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(5000);
    
    //Add Lubricant Classification
    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='content']/article/ul/li[7]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewAppType")).click();
    driver.findElement(By.id("newATText")).click();
    driver.findElement(By.id("newATText")).clear();
    driver.findElement(By.id("newATText")).sendKeys("QA Lub 1");
    driver.findElement(By.cssSelector("#newat > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewAppType")).click();
    driver.findElement(By.id("newATText")).click();
    driver.findElement(By.id("newATText")).clear();
    driver.findElement(By.id("newATText")).sendKeys("QA Lub 2");
    driver.findElement(By.cssSelector("#newat > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewAppType")).click();
    driver.findElement(By.id("newATText")).click();
    driver.findElement(By.id("newATText")).clear();
    driver.findElement(By.id("newATText")).sendKeys("QA Lub 3");
    driver.findElement(By.cssSelector("#newat > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[7]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[7]/div[2]/ul/li[13]")).click();
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[8]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[8]/div[2]/ul/li[14]")).click();
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[9]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsAppType']/div/ul/li[9]/div[2]/ul/li[15]/span")).click();
    driver.findElement(By.xpath("//ul[@id='atList']/li[12]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='atList']/li[13]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='atList']/li[14]/div[2]")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
    //driver.findElement(By.linkText("Save")).click();
    //driver.findElement(By.id("savepc")).click();
    
    Thread.sleep(5000);
    
    Alert alert6 = driver.switchTo().alert();
    alert6.accept();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Home")).click();
    
    Thread.sleep(5000);
    
    //Add Fuel Classification
    
    driver.findElement(By.cssSelector("div.crystalIcon.icon-edit")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='content']/article/ul/li[8]/span")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewFuelType")).click();
    driver.findElement(By.id("newFTText")).click();
    driver.findElement(By.id("newFTText")).clear();
    driver.findElement(By.id("newFTText")).sendKeys("QA FC 1");
    driver.findElement(By.cssSelector("#newft > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewFuelType")).click();
    driver.findElement(By.id("newFTText")).click();
    driver.findElement(By.id("newFTText")).clear();
    driver.findElement(By.id("newFTText")).sendKeys("QA FC 2");
    driver.findElement(By.cssSelector("#newft > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("createNewFuelType")).click();
    driver.findElement(By.id("newFTText")).click();
    driver.findElement(By.id("newFTText")).clear();
    driver.findElement(By.id("newFTText")).sendKeys("QA FC 3");
    driver.findElement(By.cssSelector("#newft > a")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[20]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[20]/div[2]/ul/li[10]/span")).click();
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[21]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[21]/div[2]/ul/li[12]/span")).click();
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[22]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='oatsFuelType']/div/ul/li[22]/div[2]/ul/li[11]/span")).click();
    driver.findElement(By.xpath("//ul[@id='ftList']/li[11]")).click();
    driver.findElement(By.xpath("//ul[@id='ftList']/li[11]/div[2]")).click();
    driver.findElement(By.xpath("//ul[@id='ftList']/li[3]/div[3]")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Save")).click();
    driver.findElement(By.cssSelector("#savepc > span")).click();
    
    Thread.sleep(5000);
    
    Alert alert7 = driver.switchTo().alert();
    alert7.accept();
    
    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Home")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private void handleAlert(boolean blnAction) throws InterruptedException{
	  
	  //blnAccept = true -> Accept the alert
	  //blnAccept = false -> dismiss the alert
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
	
	    Alert alert = driver.switchTo().alert();
	    if(alert != null){
		    if(blnAction)
			    alert.accept();		 
		    else
		    	alert.dismiss();
	    }
	      
	    Thread.sleep(THOUSAND*SLEEP_MEDIUM);
  }
  
}
