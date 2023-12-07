package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScript_RelainceScholarship {

	public static void main(String[] args) throws IOException, InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\RCPIPER_Relaince_LoginCheck.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);
	        Workbook workbook = new XSSFWorkbook();

	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);

	            String username = row.getCell(0).getStringCellValue();
	            String password = row.getCell(1).getStringCellValue();
            //    Double password = row.getCell(1).getNumericCellValue();
	            
	            
	            driver.get("https://bpm.jio.com/Identity/Sts/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f%26wctx%3drm%253d1%2526id%253dk2passive%2526ru%253d_trust%25252fspauthorize.aspx%25253fsession%25253dd4644e93-a1ca-4fda-9fce-867cb5373ab0%252526_spInt%25253d1%26wct%3d2023-10-05T10%253a44%253a10Z%26wreply%3dhttps%253a%252f%252fscholarshipapplication.reliancefoundation.org%252fProgrammes%252f&wa=wsignin1.0&wtrealm=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f&wctx=rm%3d1%26id%3dk2passive%26ru%3d_trust%252fspauthorize.aspx%253fsession%253dd4644e93-a1ca-4fda-9fce-867cb5373ab0%2526_spInt%253d1&wct=2023-10-05T10%3a44%3a10Z&wreply=https%3a%2f%2fscholarshipapplication.reliancefoundation.org%2fProgrammes%2f");

	            driver.findElement(By.id("UserName")).sendKeys(username);
	            driver.findElement(By.id("Password")).sendKeys(String.valueOf(password));

	            // Click on Login Button 
	            driver.findElement(By.id("SignInButton")).click();

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.close")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(2).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(2).setCellValue("No");
	            }

	            // Save the changes back to the Excel file after each login
	            FileOutputStream outputStream = new FileOutputStream(src);
	            xsf.write(outputStream);

	            // Wait for a while before proceeding to the next user login
	            Thread.sleep(2000);
	        }

	        // Close resources after the loop finishes
	        workbook.close();
	        fis.close();

	        
	        
	        
	        
	        
	        
	        
	        
	 	      
	        
	    	}

}
