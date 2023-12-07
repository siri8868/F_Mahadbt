package JSonfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Buddy_json {
	 public static  void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    //  URL
	        driver.get("https://www.buddy4study.com/page/jyoti-prakash-scholarship-program");
	       
	        
	    //  PopUp
	        
	        // Handle the PopUp
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement noThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
	            noThanksButton.click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
	        
	      //  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button[2]")).click();
	     //   driver.findElement(By.className("align-right secondary slidedown-button")).click();   
	    //  Login :
	        
	        driver.findElement(By.cssSelector(".login > span")).click();
	        driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();
	    //Email
	        driver.findElement(By.id("emailid")).click();
	        driver.findElement(By.id("emailid")).sendKeys("shravanidhumal8868@gmail.com");
	   // Password:
	          driver.findElement(By.cssSelector(".authpopup_overLay__3--dT")).click();
	          driver.findElement(By.id("password")).sendKeys("Shravani@8868");
	   // Login click:       
	          driver.findElement(By.xpath("//*[@id=\"__next\"]/article[1]/article/article/form/article[3]/button")).click();
	          Thread.sleep(2000);
	   //////////////////////////////////////
	   //HomePage:
	       //   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/article[1]/nav[2]/article[2]/ul/li[2]/a")).click();
	     
	          
	      //    driver.findElement(By.cssSelector(".siteNav > ul > li:nth-child(1) > a")).click();
	          driver.findElement(By.id("class")).click();
	          {
	            WebElement dropdown = driver.findElement(By.id("class"));
	            dropdown.findElement(By.xpath("//option[. = 'Graduation']")).click();
	          }
	          driver.findElement(By.id("gender")).click();
	          {
	            WebElement dropdown = driver.findElement(By.id("gender"));
	            dropdown.findElement(By.xpath("//option[. = 'Female']")).click();
	          }
	          driver.findElement(By.id("foreign")).click();
	          {
	            WebElement dropdown = driver.findElement(By.id("foreign"));
	            dropdown.findElement(By.xpath("//option[. = 'India']")).click();
	          }
	          driver.findElement(By.cssSelector("ul > button")).click();
	          driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/article[1]/section[1]/article[5]/ul/li/a")).click();
	          driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[1]/div/div/article/article[2]/button")).click();
	          {
	            WebElement element = driver.findElement(By.cssSelector("h3"));
	            Actions builder = new Actions(driver);
	            builder.moveToElement(element).perform();
	          }
	          {
	            WebElement element = driver.findElement(By.tagName("body"));
	            Actions builder = new Actions(driver);
	            builder.moveToElement(element, 0, 0).perform();
	          }
	          driver.findElement(By.cssSelector(".applicationInstructions_ctrlWrapper__17X1G > button")).click();
	          driver.findElement(By.id("option")).click();
	          {
	            WebElement dropdown = driver.findElement(By.id("option"));
	            dropdown.findElement(By.xpath("//option[. = 'No']")).click();
	          }
	          driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(3) > #option")).click();
	          {
	            WebElement dropdown = driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(3) > #option"));
	            dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
	          }
	          driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(5) > #option")).click();
	          {
	            WebElement dropdown = driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(5) > #option"));
	            dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
	          }
	          driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(2) > #option")).click();
	          {
	            WebElement dropdown = driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(2) > #option"));
	            dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
	          }
	          driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(4) > #option")).click();
	          {
	            WebElement dropdown = driver.findElement(By.cssSelector(".scholarshipEligibility_formGroup__3u2Fz:nth-child(4) > #option"));
	            dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
	          }
	          driver.findElement(By.cssSelector(".scholarshipEligibility_btn__3dNzB")).click();
	          driver.findElement(By.cssSelector(".swal-button")).click();
	        }
	      
	          
	          
	        
	 }

