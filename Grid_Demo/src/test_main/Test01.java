package test_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class Test01 extends TestBase{
 
    @Test
    public void testLink()throws Exception{
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@value='Email']"));
        textBox.click();
        textBox.sendKeys("fb_01@facebook.com");
        Thread.sleep(2000);
    }
}
