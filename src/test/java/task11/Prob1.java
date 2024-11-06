package task11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click the new window
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		//Verify the text "New Window" is present on the new window page
		String expectedText = driver.findElement(By.xpath("/html/body/div/h3")).getText();
		System.out.println(expectedText);
		
		//Close the current window
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		//Verify that the "Original Url" is present on the current window page
		 String originalUrl = driver.getCurrentUrl();
	     System.out.println("Original window URL: " + originalUrl);
	        
	      //Close the browser
	      driver.quit();
	}

}
