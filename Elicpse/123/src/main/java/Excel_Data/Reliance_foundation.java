package Excel_Data;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.io.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class Reliance_foundation {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\RelainceFoundation.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);
	        
	        
	        
	      
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            
	            // Assuming your Excel sheet has columns for username and password in the first and second columns.
	            String username = row.getCell(0).getStringCellValue();
	            String password = row.getCell(1).getStringCellValue();
	            String Gender = row.getCell(2).getStringCellValue();
	            Double DOB = row.getCell(3).getNumericCellValue();
	            String POBirth = row.getCell(4).getStringCellValue();
	            String relion = row.getCell(5).getStringCellValue();

	            
	            
	            
	            
	            
	            
	            
	            
	        
//Url :	        
		        driver.get("https://bpm.jio.com/Identity/Sts/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f%26wctx%3drm%253d1%2526id%253dk2passive%2526ru%253d_trust%25252fspauthorize.aspx%25253fsession%25253db45a6a9b-86ce-444f-9e4f-794eefb47879%252526_spInt%25253d1%26wct%3d2023-10-05T04%253a52%253a34Z%26wreply%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f&wa=wsignin1.0&wtrealm=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f&wctx=rm%3d1%26id%3dk2passive%26ru%3d_trust%252fspauthorize.aspx%253fsession%253db45a6a9b-86ce-444f-9e4f-794eefb47879%2526_spInt%253d1&wct=2023-10-05T04%3a52%3a34Z&wreply=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f");
//Username 
	            
		        driver.findElement(By.id("UserName")).sendKeys(username);
//Password : 		        
	            driver.findElement(By.id("Password")).sendKeys(password);
	            
 // Click on Login Button 
	            
	            driver.findElement(By.id("SignInButton")).click();
	            
//window maximize : 
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.maximize")));

	            // Use the JavaScript executor to click the close button
	            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	            jsExecutor.executeScript("arguments[0].click();", closeButton);
	            Thread.sleep(2000); 
////Click on Close button 	            
	            
	            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	            // Wait for the close button to become clickable
	            WebElement closeButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.close")));

	            // Use the JavaScript executor to click the close button
	            JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
	            jsExecutor1.executeScript("arguments[0].click();", closeButton1);
	      
	            Thread.sleep(2000);  
//Click on continue tab : 	            
	            WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement element = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"7785b3bd-973b-4cec-9ebc-89ed74b78deb_b8f05f77-30a3-4f39-b35b-859e1886be9c_1f627182-87ec-c1d5-731a-d4eb8420d2d6_1fdd8ef0-51d7-4d66-8aed-981c687b3703\"]/div[3]/div[2]/div/div/table/tbody/tr/td[6]/div/div/span")));
	            element.click();
	             Thread.sleep(2000);
 //Gender :
	    /*  
	            WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));

	            // Wait for the element to be clickable
	            WebElement element1 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[1]/div[2]/div[2]/div")));
                driver.findElement(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")).click();
	            // Use JavaScript to click the element
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].click();", element1);
 */
	           
	            if(Gender.equals("Male")) {
	                Thread.sleep(2000); 
	           // 	driver.findElement(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")).sendKeys(Gender);
	            	
	            	
	            	
	            	
	            	
	            	WebDriverWait waitC = new WebDriverWait(driver, Duration.ofSeconds(40));

	            	// Wait for the element to be clickable using ExpectedConditions
	            	WebElement elementC = waitC.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")));

	            	// Send the value using JavaScriptExecutor
	            	JavascriptExecutor executor = (JavascriptExecutor) driver;
	            	executor.executeScript("arguments[0].value = arguments[1];", elementC, Gender);
	            	
	            //	Select s= new Select(driver.findElement(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")));
	            //	s.selectByVisibleText(Gender);
	            
	            
	            }else
	            {
	            	
	            	
	                 	driver.findElement(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")).sendKeys(Gender);
	               //   Select S = new Select(driver.findElement(By.xpath("//*[@id=\"706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_62e21fe9-9f38-4df4-95b1-917075fa82a7\"]/div/div[2]")));
	                 //   S.selectByVisibleText(Gender);
	            }
	            
//Date Of Birth :
	            
	        //    driver.findElement(By.xpath("//*[@id=\"83ceb2a0-6cf0-43d0-b2d8-d99340a89705\"]/div/div/div[1]/div[2]/div[2]/div/div")).sendKeys(String.valueOf(DOB));
	            
	            WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement element3 = wait0.until(ExpectedConditions.visibilityOfElementLocated(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_da245adf-528a-4302-9124-59eb851bfb88_TextBox")));

	            // Use JavaScript Executor to send DOB to the element
	            JavascriptExecutor executor5 = (JavascriptExecutor) driver;
	            executor5.executeScript("arguments[0].value = arguments[1];", element3, DOB);
  
//Place of Birth :
	            
	            WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement elementA = waitA.until(ExpectedConditions.visibilityOfElementLocated(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_796f2f8e-3dce-43e4-9fdc-342fc615eee9")));

	            // Use JavaScript Executor to send DOB to the element
	            JavascriptExecutor executorA = (JavascriptExecutor) driver;
	            executorA.executeScript("arguments[0].value = arguments[1];", elementA, POBirth);
	     
//Religion :
	         /*   WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement elementB = waitB.until(ExpectedConditions.visibilityOfElementLocated(By.id("706f0c28-e7b8-4e21-bdb2-d64a0fde8e36_796f2f8e-3dce-43e4-9fdc-342fc615eee9")));

	            // Use JavaScript Executor to send DOB to the element
	            JavascriptExecutor executorB = (JavascriptExecutor) driver;
	            executorB.executeScript("arguments[0].value = arguments[1];", elementB, relion ); 
	           */ 
	            
	           Select s = new Select(driver.findElement(By.className("input-control-buttons styling-right styling-inner-wrapper")));
	           s.selectByVisibleText(relion);
	            
//	            
	            
	            
	            
	            
	            
	            
	            
	      
	            
	            
	        }
	        
	  
	        
	}
}
