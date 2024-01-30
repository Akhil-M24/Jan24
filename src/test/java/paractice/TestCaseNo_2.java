package paractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCaseNo_2 {
@Test
public void autosuggetions()
{
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WebElement ele=//
	driver.findElement(By.id("APjFqb")).sendKeys("java tutorials");
	//ele.sendKeys("sel");
	List<WebElement> ele=driver.findElements(By.xpath("//*[@role='presentation']"));
	System.out.println("Size Of the The AutoSuggetions Options:" +ele.size());
	for(WebElement v:ele)
	{
		//System.out.println(v.getText());
		if(v.getText().equals(" programiz")) //we can use contains also on the place of the equals
		{
			v.click();
			break;
		}
		
	}
	
	
	driver.close();
	
}
}
