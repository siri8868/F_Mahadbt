package Excel_Data;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Relaince_WithSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	        
	        
	        driver.get("https://bpm.jio.com/Identity/Sts/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f%26wctx%3drm%253d1%2526id%253dk2passive%2526ru%253d_trust%25252fspauthorize.aspx%25253fsession%25253db45a6a9b-86ce-444f-9e4f-794eefb47879%252526_spInt%25253d1%26wct%3d2023-10-05T04%253a52%253a34Z%26wreply%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f&wa=wsignin1.0&wtrealm=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f&wctx=rm%3d1%26id%3dk2passive%26ru%3d_trust%252fspauthorize.aspx%253fsession%253db45a6a9b-86ce-444f-9e4f-794eefb47879%2526_spInt%253d1&wct=2023-10-05T04%3a52%3a34Z&wreply=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f");
	        driver.manage().window().setSize(new Dimension(1296, 688));
	        driver.findElement(By.id("UserName")).sendKeys("shravanidhumal8868@gmail.com");
	        driver.findElement(By.id("Password")).click();
	        driver.findElement(By.id("Password")).sendKeys("Dream@9556");
	        driver.findElement(By.id("SignInButton")).click();
	        
	        
	        
	      //window maximize : 
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.maximize")));

            // Use the JavaScript executor to click the close button
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", closeButton);
            Thread.sleep(2000); 
	        
	        
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the close button to become clickable
            WebElement closeButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.close")));

            // Use the JavaScript executor to click the close button
            JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
            jsExecutor1.executeScript("arguments[0].click();", closeButton1);
      
       //     Thread.sleep(2000); 
            
       //     /Click on continue tab : 	            
	            WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement element1 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"7785b3bd-973b-4cec-9ebc-89ed74b78deb_b8f05f77-30a3-4f39-b35b-859e1886be9c_1f627182-87ec-c1d5-731a-d4eb8420d2d6_1fdd8ef0-51d7-4d66-8aed-981c687b3703\"]/div[3]/div[2]/div/div/table/tbody/tr/td[6]/div/div/span")));
	            element1.click();
	             Thread.sleep(2000);
            
            
            
            
	        
	  //      driver.findElement(By.cssSelector(".close > span")).click();
	   //     driver.findElement(By.cssSelector(".center-align img")).click();
	   //     driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7 span > span")).click();
	      //  driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7_droplist li:nth-child(3) span")).click();
	        driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_da245adf-528a-4302-9124-59eb851bfb88_Image > span > span")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        {
	          WebElement element = driver.findElement(By.cssSelector(".top-calendar-left"));
	          Actions builder = new Actions(driver);
	          builder.doubleClick(element).perform();
	        }
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".top-calendar-left")).click();
	        driver.findElement(By.cssSelector(".styling-inner-wrapper .input-control-watermark")).click();
	        driver.findElement(By.cssSelector(".styling-inner-wrapper .input-control-watermark")).click();
	        driver.findElement(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_da245adf-528a-4302-9124-59eb851bfb88_TextBox")).click();
	        driver.findElement(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_da245adf-528a-4302-9124-59eb851bfb88_TextBox")).sendKeys("08/06/2001");
	        driver.findElement(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_796f2f8e-3dce-43e4-9fdc-342fc615eee9")).click();
	        driver.findElement(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_796f2f8e-3dce-43e4-9fdc-342fc615eee9")).sendKeys("Talegoan ");
	        driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_dfd3b23e-d546-44b6-9335-c322af8ec132 span > span")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_dfd3b23e-d546-44b6-9335-c322af8ec132_droplist li:nth-child(4) span")).click();
	        driver.findElement(By.cssSelector("#\\37 06f0c28-e7b8-4e21-bdb2-d64a0fde8e36_e1e81ead-e26d-4088-f785-240935f30296 span > span")).click();
	        driver.findElement(By.cssSelector("li:nth-child(15) span")).click();
	        driver.findElement(By.cssSelector(".stack:nth-child(6) .input-control-img")).click();
	        driver.findElement(By.cssSelector("#ef735b11-90a7-4700-8870-02a4d51f5eea .input-control-watermark")).click();
	        driver.findElement(By.id("9e1bbc80-8d20-4e20-973d-d903171af703_1b2b0807-bd44-48b6-a7db-ed04e872d556_TextArea")).sendKeys("126 karmveer housing socity SB road pune");
	        driver.findElement(By.id("9e1bbc80-8d20-4e20-973d-d903171af703_bdd5ac34-e4fe-4627-967d-dd030c88ba3e")).click();
	        driver.findElement(By.id("9e1bbc80-8d20-4e20-973d-d903171af703_bdd5ac34-e4fe-4627-967d-dd030c88ba3e")).sendKeys("411016");
	        driver.findElement(By.xpath("//body")).click();
	        driver.findElement(By.linkText("Select an item")).click();
	        driver.findElement(By.cssSelector("#\\39 e1bbc80-8d20-4e20-973d-d903171af703_599f99d6-0c0c-0424-a009-c08ba50d19c0_droplist li:nth-child(3) span")).click();
	        driver.findElement(By.cssSelector("#bc95a362-9246-9718-5128-e5b139e8e049 .input-control-img")).click();
	        driver.findElement(By.cssSelector(".stack:nth-child(1) .checked > .input-control-img")).click();
	        driver.findElement(By.id("6cb47773-9f3e-46b0-834e-d6eb824afd03_20f9b788-5559-d1fa-bbe9-486ba83f12c9")).click();
	        driver.findElement(By.id("6cb47773-9f3e-46b0-834e-d6eb824afd03_20f9b788-5559-d1fa-bbe9-486ba83f12c9")).sendKeys("4");
	        driver.findElement(By.id("6cb47773-9f3e-46b0-834e-d6eb824afd03_e941a32d-be64-c07b-916b-e78d8c232054")).click();
	        driver.findElement(By.id("6cb47773-9f3e-46b0-834e-d6eb824afd03_e941a32d-be64-c07b-916b-e78d8c232054")).sendKeys("2");
	        driver.findElement(By.linkText("Select an item")).click();
	        driver.findElement(By.cssSelector("#\\36 cb47773-9f3e-46b0-834e-d6eb824afd03_3f449c98-1788-dd33-0525-9c509795dbba_droplist li:nth-child(3) span")).click();
	        driver.findElement(By.cssSelector("#\\36 cb47773-9f3e-46b0-834e-d6eb824afd03_667d939d-7a86-6ae2-3fb5-b7635634af6f_radioButtonItem_1_base > .input-control-img")).click();
	        driver.findElement(By.cssSelector("#\\36 cb47773-9f3e-46b0-834e-d6eb824afd03_2a9da1de-fb97-bd9f-6c77-6c0060ed2e41 .input-control-buttons")).click();
	        driver.findElement(By.id("6cb47773-9f3e-46b0-834e-d6eb824afd03_eabf66bc-55c8-6558-4a6c-180d282d37f3")).click();
	        driver.findElement(By.cssSelector("#\\36 cb47773-9f3e-46b0-834e-d6eb824afd03_2a9da1de-fb97-bd9f-6c77-6c0060ed2e41 span > span")).click();
	        driver.findElement(By.cssSelector("#\\36 cb47773-9f3e-46b0-834e-d6eb824afd03_2a9da1de-fb97-bd9f-6c77-6c0060ed2e41_droplist li:nth-child(5) span")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_abcec48b-fd84-9512-36dc-8307d85f380a")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_abcec48b-fd84-9512-36dc-8307d85f380a")).sendKeys("Ajit ");
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_8f06296f-85d8-5243-7d76-452707cb6b85")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_8f06296f-85d8-5243-7d76-452707cb6b85")).sendKeys("Dhumal");
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_af63e250-3ec8-9380-4c3d-3c6b22cabd9d")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_af63e250-3ec8-9380-4c3d-3c6b22cabd9d")).sendKeys("9878677898");
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_458fa1f2-a60d-1c5f-5591-75ecde918e20")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_458fa1f2-a60d-1c5f-5591-75ecde918e20")).sendKeys("shravanidhumal8868@gmail.com");
	        driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_672f4f78-3762-2e56-329d-dae160e92fcb span > span")).click();
	        driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_672f4f78-3762-2e56-329d-dae160e92fcb_droplist li:nth-child(3) span")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_82074af1-9a20-ccc3-8ed5-75e33f50c377")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_82074af1-9a20-ccc3-8ed5-75e33f50c377")).sendKeys("Shikrapur Pune");
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_bde2cde3-e8da-34fd-2983-952842694bb6")).click();
	        driver.findElement(By.id("38c4f36c-3301-4950-be3d-21a50aa53793_bde2cde3-e8da-34fd-2983-952842694bb6")).sendKeys("412208");
	        driver.findElement(By.xpath("//body")).click();
	        driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_b52dd2cc-1ab2-bbde-e732-d4666e4d64d7 span > span")).click();
	        driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_b52dd2cc-1ab2-bbde-e732-d4666e4d64d7 span > span")).click();
	        driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_b52dd2cc-1ab2-bbde-e732-d4666e4d64d7_droplist li:nth-child(4) span")).click();
	        {
	          WebElement element = driver.findElement(By.cssSelector("#\\33 8c4f36c-3301-4950-be3d-21a50aa53793_b52dd2cc-1ab2-bbde-e732-d4666e4d64d7_droplist li:nth-child(4) span"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element).perform();
	        }
	        {
	          WebElement element = driver.findElement(By.tagName("body"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element, 0, 0).perform();
	        }
	        driver.findElement(By.id("00000000-0000-0000-0000-000000000000_942c4b10-d874-4eb7-9d15-793d8df073d4_Picture")).click();
	      }  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}
	