package linearframework;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		Actions act=new Actions(driver);
		
		driver.get("https:centific.com");
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("No. of links are present is:" + links.size());
		
		List<String> urlList =new ArrayList<>();
		for (WebElement e : links) {
			String url=e.getAttribute("href");
			urlList.add(url);
			//checkBrokenLinks(url);
		}
		     long sTtime=System.currentTimeMillis();
		     urlList.parallelStream().forEach(e -> checkBrokenLinks(e));
		     //urlList.stream().forEach(e -> checkBrokenLinks(e));
		     long Endtime=System.currentTimeMillis();
		     
		     //parallel >>total time taken :11.1seconds
		     //sequence>>total time taken:77seconds
		     
		     System.out.println("Total time taken is:" + (Endtime-sTtime));
			
		WebElement firstmodule=driver.findElement(By.xpath("//div[normalize-space()='SERVICES & SOLUTIONS']"));
		act.moveToElement(firstmodule).perform();
		Thread.sleep(2000);
		
		WebElement serviceModule=driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		serviceModule.click();
		System.out.println("serviceModule : below are the submodules list");
		
		List<WebElement> submodules1=driver.findElements(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > ul:nth-child(3)"));
		
		List<String> submoduleNames =new ArrayList<>();
		for (WebElement submodule : submodules1) {
			String moduleNames=submodule.getText();
			 submoduleNames.add(moduleNames);
		
			}
		
		List<String> expectedSubmodules=List.of("AI Data","Localization","Digital Safety","Growth Marketing","Safe AI");
		for (String expectedModule : expectedSubmodules) {
			if (!submoduleNames.contains(expectedModule)) {
				System.out.println(expectedModule +" "+ "submodules name inside the service module is present");
			}
		}
				int submodulecount1= expectedSubmodules.size();
				System.out.println("services submodule count: " + submodulecount1);
			
				WebElement solutionsModule=driver.findElement(By.xpath("//div[normalize-space()='Solutions']"));
				 solutionsModule.click();
				System.out.println("solutionsModule : below are the submodules list");
				
				//div[normalize-space()='Solutions']	
		List<WebElement> submodules2=driver.findElements(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(2) > ul:nth-child(3)"));
		List<String> submoduleNames2 =new ArrayList<>();
		for (WebElement submodule : submodules2) {
			String moduleNames=submodule.getText();
			 submoduleNames2.add(moduleNames);
			}
		List<String> expectedSubmodules2=List.of("Generative AI","Dragonfly: Global Experience Assessment","Meerkat: Intelligent Forecasting, Demand & Promotion Planning","Lighthouse: Digital Auditing & Retail Insights","Scout: Intelligent Asset Protection","Sherlock: Advanced Anomaly Detection");
		for (String expectedModule : expectedSubmodules2) {
			if (!submoduleNames2.contains(expectedModule)) {
				System.out.println(expectedModule +" "+ "submodules name inside the solutions module is present");
			}
		}
				int submodulecount2= expectedSubmodules2.size();
				System.out.println("solutions submodule count: " + submodulecount2);
				
		
		
		WebElement secondmodule=driver.findElement(By.xpath("//div[normalize-space()='Industries']"));
		act.moveToElement(secondmodule).perform();
		Thread.sleep(2000);
		WebElement industrysubmodule=driver.findElement(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > ul:nth-child(3)"));
	    System.out.println(industrysubmodule.getText());
		//body > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > ul:nth-child(3)
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Insights']")).click();
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Our Work']")).click();
	  System.out.println(driver.getTitle());
		
	  
	  driver.findElement(By.xpath("//a[normalize-space()='About us']")).click();
	  System.out.println(driver.getTitle());
	  		
		driver.quit();
		}
	
	private static void checkBrokenLinks(String linkUrl) {
		 try {
			 URL url=new URL(linkUrl);
				HttpURLConnection httpUrlconnection= (HttpURLConnection) url.openConnection();
				httpUrlconnection.setConnectTimeout(5000);
				httpUrlconnection.connect();
		 
				if (httpUrlconnection.getResponseCode() >=400) {
					System.out.println(linkUrl +"...........>"+httpUrlconnection.getResponseMessage()+ "is a broken link");
				}
				else {
					System.out.println(linkUrl +"...........>"+httpUrlconnection.getResponseMessage());
				}
		 }
		 catch (Exception e) {
			 
		 }
	}
}
	 
		
	



		 
	


