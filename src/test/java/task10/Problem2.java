package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Locate the draggable and droppable element
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		//Perform the drag and drop actions
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, target).perform();
		
		//Validate the output
		String str = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		System.out.println(str);
		
	  } 
		  
	}


