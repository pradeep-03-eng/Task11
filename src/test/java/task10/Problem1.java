package task10;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Problem1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		//Launch the web browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Switch to frame
		driver.switchTo().frame(0);	
		driver.findElement(By.id("datepicker")).click();
		
		
		//Find the next button and click
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		
		//Find the date and select 
		WebElement dateElement = driver.findElement(By.xpath(".//a[text()='22']"));
		dateElement.click();
		Thread.sleep(1000);
		
		//Validate the output
		System.out.println("Selected date is 22nd december");
		
	
		}
	

	}


