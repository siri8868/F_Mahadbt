package Excel_Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CaptureScreenshot {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        // Initialize the WebDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode (no GUI)
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the web application where you uploaded the image
        driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");

        // Find the element that displays the uploaded image (replace with your locator strategy)
        WebElement imageElement = driver.findElement(By.id("uploaded-image"));

        // Capture a screenshot of the image element
        byte[] screenshotBytes = imageElement.getScreenshotAs(OutputType.BYTES);

        // Save the screenshot as an image file (e.g., in PNG format)
        String screenshotPath = "screenshot.png";
        try {
            FileUtils.writeByteArrayToFile(new File(screenshotPath), screenshotBytes);
            
         } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the WebDriver
        driver.quit();
    }
}
