package JSonfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class virchow_scholarship {

	public static void main(String[] args ) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    //  URL
	        driver.get("https://www.buddy4study.com/application/VISC3/instruction");
	        
	        
	        WebElement popupElement = null;
	        try {
	            // Try to find the popup element with an explicit wait of 10 seconds
	            popupElement = driver.findElement(By.id("onesignal-slidedown-dialog"));
	        } catch (TimeoutException e) {
	            // If the popup does not appear within 10 seconds, catch the TimeoutException
	            // and continue with the rest of the code
	            System.out.println("Popup did not appear within 10 seconds. Continuing with the rest of the code.");
	        }

	        // If the popup element is found, it means the popup appeared
	        if (popupElement != null) {
	            // Find the two answer buttons
	            WebElement noThanksButton = popupElement.findElement(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]"));
	            WebElement allowButton = popupElement.findElement(By.xpath("//*[@id=\"onesignal-slidedown-allow-button\"]"));

	            // Click the desired button (e.g., "No Thanks")
	            noThanksButton.click();

	        
	        
	        
	        
	        
	        
	        
	        
	   //  POP_UP
	     //   driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
	        driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]")).click();
	        
	   // Apply now
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();
	  //  Login      
	        driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click(); 
	        //Email
	        driver.findElement(By.id("emailid")).click();
	        driver.findElement(By.id("emailid")).sendKeys("shravanidhumal8868@gmail.com");
	   // Password:
	        driver.findElement(By.cssSelector(".authpopup_overLay__3--dT")).click();
	          driver.findElement(By.id("password")).sendKeys("Shravani@8868");
	   // Login click:       
	          driver.findElement(By.className("loginWithMobileEmailPopup_btn__31NqD loginWithMobileEmailPopup_btnBlue__3a8Mm")).click();
	          Thread.sleep(2000);
	        
	        
	}

}
}