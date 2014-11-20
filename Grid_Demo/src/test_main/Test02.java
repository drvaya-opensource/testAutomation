package test_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test02 extends TestBase{
 
    @Test
    public void testLink()throws Exception{
        getDriver().get("https://twitter.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@id='signin-email']"));
        textBox.click();
        textBox.sendKeys("twitter@tweet.com");
        Thread.sleep(2000);
    }
    
}