package basicmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {
   @Test
   public void myntraTest()
   {
	   WebDriver d=new ChromeDriver();
	   d.manage().window().maximize();
	   d.get("https://www.myntra.com/");
	   String actualtitle = d.getTitle();
	   System.out.println(actualtitle);
   }
   
}
