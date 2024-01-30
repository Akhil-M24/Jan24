package paractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCaseNo_3 {

	@Test
	public void dropdown() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//*[text()='About']")).click();
		 driver.findElement(By.xpath("//*[text()='Live Posting']")).click();//liveposting  link 
		 
		 WebElement ele=driver.findElement(By.id("category_id"));
		 Select s=new Select(ele);
		// s.selectByVisibleText("Animals & Agriculture");
		 
		 List<WebElement> options=s.getOptions();
		 
		 ArrayList originallist=new ArrayList();
		 ArrayList templist=new ArrayList();
		 
		 for(WebElement option:options)
		 {
			originallist.add(option.getText());
			templist.add(option.getText());

		 }
		 
		 System.out.println("Original List:" +originallist);
		 System.out.println("TempList List:" +templist);
		 //sort the array list of the templist
		
		  Collections.sort(templist);
		  
		  System.out.println("Original List:" +originallist);
		  System.out.println("TempList List After Sorting The List:" +templist);
		  
		  if(originallist.equals(templist))
		  {
			  System.out.println("DropDown is sorted....");
		  }
		  else
		  {
			  System.out.println("DropDown is NOT sorted....");
		  }
		 
		 
		 
		 
        driver.close();
       
	}
}
