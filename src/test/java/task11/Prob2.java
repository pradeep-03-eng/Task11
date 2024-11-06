package task11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 // Switch to the top frame
        driver.switchTo().frame("frame-top");
        
        // Use CSS selector to find all frames within the top frame
        List<WebElement> frames = driver.findElements(By.cssSelector("frame"));
        
        // Verify that there are exactly three frames
        if (frames.size() == 3) {
            System.out.println("Verification passed: There are three frames in the top frame.");
        } else {
            System.out.println("Verification failed: Expected 3 frames, but found " + frames.size());
        }
        
        // Switch to the left frame
        driver.switchTo().frame("frame-left");
        
        // Verify that the left frame contains the text "LEFT"
        WebElement leftFrameText = driver.findElement(By.cssSelector("body"));
        String actualString = leftFrameText.getText();
        String expectedText = "LEFT";
        System.out.println("Text in left frame: " + expectedText);
        
        // Switch back to the top frame
        driver.switchTo().parentFrame();
        
        // Switch to the middle frame
        driver.switchTo().frame("frame-middle");
     
        
        // Verify that the middle frame contains the text "MIDDLE"
        WebElement middleTextElement = driver.findElement(By.cssSelector("div#content"));
        String actualText = middleTextElement.getText();
        String expectedText1 = "MIDDLE";
        System.out.println("Text in middle frame: " + expectedText1);
          
        if (actualString.equals(expectedText)) {
            System.out.println("Text verification passed: 'MIDDLE' is present.");
        } else {
            System.out.println("Text verification failed. Expected: " + expectedText + ", but got: " + actualString);
        }

        // Switch back to the top frame
        driver.switchTo().parentFrame();
        
        // Switch to the middle frame
        driver.switchTo().frame("frame-right");
        
        // Verify that the right frame contains the text "RIGHT"
        WebElement rightTextElement = driver.findElement(By.cssSelector("body"));
        String actualText1 = rightTextElement.getText();
        String expectedText11 = "RIGHT";
        System.out.println("Text in right frame: " + expectedText11);
        
        if (actualText1.equals(expectedText11)) {
            System.out.println("Text verification passed: 'RIGHT' is present.");
        } else {
            System.out.println("Text verification failed. Expected: " + expectedText11 + ", but got: " + actualText);
        }
        
        
        // Switch back to the top frame
        driver.switchTo().parentFrame();
        
        
         // Verify the page title
        String expectedTitle = "Frames";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed: The title is 'Frames'.");
        } else {
            System.out.println("Title verification failed. Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
        
        
        
	}

}
