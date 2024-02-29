package projpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();	
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("confirm")).click();
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String AlertText=alert.getText();
		System.out.println(AlertText);
		Thread.sleep(2000);
	    alert=driver.switchTo().alert();
		alert.dismiss();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("prompt")).click();
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		alert.sendKeys("sonal");
		Thread.sleep(5000);
		alert.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.id("modern")).click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
     WebElement SweetAlertElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='title']")));
    String sweetAlertText= SweetAlertElement.getText();
		System.out.println(sweetAlertText);	
		
	driver.findElement(By.xpath("//button[@aria-label='close']")).click();
	Thread.sleep(5000);
	driver.quit();
		

	}

}
