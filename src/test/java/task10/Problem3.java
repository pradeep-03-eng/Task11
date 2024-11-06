package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Locate the Signup field
		driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div[2]/a")).click();
		
		
		//Enter all the input field
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("testuser guvi");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("guvitester@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("guvi@JAT3");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("1234567890");
		driver.findElement(By.className("signup-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"laterBtn\"]")).click();
		
		
		//Validate the output
		String str = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[1]/h1")).getText();
		System.out.println(str);
		
		 //Navigate to previous page
		driver.navigate().back();

		//Locate and click the Login button
		driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
			
		//Enter the credentials in input field
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kgpradeep3@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("03Nov1991");
		
		//Click the login button
		driver.findElement(By.className("login-btn")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
}

		
		
