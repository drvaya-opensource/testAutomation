package test_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test03  extends TestBase{
 
    @Test
    public void testLink()throws Exception{
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Re-enter email']"));
        textBox.click();
        textBox.sendKeys("fb_03@facebook.com");
        Thread.sleep(2000);
    }
}