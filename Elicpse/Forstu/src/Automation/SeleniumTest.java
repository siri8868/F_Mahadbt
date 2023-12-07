package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");

        // Configure ChromeOptions to bypass security checks
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-web-security"); // Disable web security
        options.addArguments("--allow-running-insecure-content"); // Allow running insecure content


        WebDriver driver = new ChromeDriver(options);

        // Navigate to the form URL
        driver.get("https://forms.gle/VbMvW7oZQTNwhN1P7");

        // Find and interact with the sign-in elements
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailInput.sendKeys("forstutesting@gmail.com");

        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        nextButton.click();
         
     //   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
        
        // Wait for the password input field to be visible
        WebElement passwordInput = driver.findElement(By.name("Passwd"));
        passwordInput.sendKeys("Shravani@8868");
       
        
        
     //  driver.findElement(By.xpath("//*[@id=\"forgotPassword\"]/div/button/span")).click();

        WebElement nextButton1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]"));
        nextButton1.click();
        
        // Rest of your test script...

        driver.quit();
    }
}
