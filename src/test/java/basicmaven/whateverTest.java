package basicmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class whateverTest {
	 @Test
	   public void youwantTest() throws InterruptedException
	   {
		 ChromeDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.tirabeauty.com/");
			Thread.sleep(3000);
			WebElement dc = d.findElement(By.id("search"));
			dc.sendKeys("perfume");
			dc.sendKeys(Keys.ENTER);
		
	   }
	   

}
