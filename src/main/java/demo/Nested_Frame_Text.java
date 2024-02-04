package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_Frame_Text {
    ChromeDriver driver;
    public Nested_Frame_Text()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: Nested_Frame_Text");
        driver.close();
        driver.quit();

    }

    public void Nested_Frame_Text() {
        System.out.println("Start Test case: Nested_Frame_Text");
        //Navigate to url "https://the-internet.herokuapp.com/nested_frames"
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        //Switch to frame "frame-top"
        driver.switchTo().frame("frame-top");
        //Get the text of frame "frame-left"
        driver.switchTo().frame("frame-left");

        //Get the text of frame "frame-right" by using tagName "body"
        WebElement leftFrame = driver.findElement(By.tagName("body"));
        //Print the text of frame "frame-left"
        String leftFrameText = leftFrame.getText();
        System.out.println(leftFrameText);
       //Switch to parent frame
        driver.switchTo().parentFrame();
        // driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        //Get the text of frame "frame-right" by using tagName "body"
        WebElement rightFrame = driver.findElement(By.tagName("body"));
        //Print the text of frame "frame-right"
        String rightFrameText = rightFrame.getText();
        System.out.println(rightFrameText);
        //Switch to parent frame
        driver.switchTo().parentFrame();
        // driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        //Get the text of frame "frame-middle" by using tagName "body"
        WebElement middleFrame = driver.findElement(By.tagName("body"));
        //Print the text of frame "frame-middle"
        String middleFrameText = middleFrame.getText();
        System.out.println(middleFrameText);
           //Switch to parent frame
        driver.switchTo().parentFrame();
        // driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        // driver.switchTo().frame bottom
        driver.switchTo().frame("frame-bottom");
        //Get the text of frame "frame-bottom" by using tagName "body"
        WebElement bottomFrame = driver.findElement(By.tagName("body"));
        //Store the text of frame "frame-bottom" 
        String bottomFrameText = bottomFrame.getText();
        //Print the text of frame "frame-bottom"
        System.out.println(bottomFrameText);
        System.out.println("End Test case: Nested_Frame_Text");

    }

}
