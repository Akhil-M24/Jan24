package paractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCaseNo_4 {
@Test
public void enterclearandcaptureTheText() throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement emailbox= driver.findElement(By.id("Email"));
   // emailbox.clear();
 
   // emailbox.sendKeys("admin1234@gmail.com");
    WebElement ele=driver.findElement(By.id("Password"));
    System.out.println("Result from the getAttribute() method is:"+ele.getAttribute("value"));
    System.out.println("Result from the getAttribute() method is:"+emailbox.getAttribute("value"));
    System.out.println(emailbox.getText());
    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    System.out.println(loginbtn.getText());
    String title=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
    System.out.println(title);
    
    emailbox.clear();
    ele.clear();
    driver.close();
}
}
