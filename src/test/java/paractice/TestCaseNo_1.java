package paractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TestCaseNo_1 {
	@Test
	public void ActionClass()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       //1 Rclick Action
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions a=new Actions(driver);
		a.contextClick(button).perform();
		
		//double click Action
	/*	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		WebElement dbutton=driver.findElement(By.xpath("(//*[text()='Double-click me'])[2]"));
		Actions a2=new Actions(driver);
	    a2.doubleClick(dbutton).perform();
	*/	
		
		//drag and drop operation
	/*	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		
		a.dragAndDrop(rome, italy).perform();
	 */	
		
	 /*  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	   WebElement iframeele=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	   driver.switchTo().frame(iframeele);
	   WebElement img=driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
	   WebElement trash=driver.findElement(By.id("trash"));
	   
	   a.dragAndDrop(img, trash);
		*/
		driver.get("https://www.amazon.in/");
		WebElement amazon=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		a.moveToElement(amazon).perform();
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		a.moveToElement(ele2).perform();
		ele2.click();
	
		
		
		
		
		
		
		
		
		
	}

}
