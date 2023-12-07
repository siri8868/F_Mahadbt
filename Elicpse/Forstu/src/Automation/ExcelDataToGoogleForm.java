package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataToGoogleForm {
    public static void main(String[] args) throws InterruptedException {
    
    	
        // Provide the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        // Provide the path to your Excel file
        String excelFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Forstu.xlsx";

        // Open the Excel file and retrieve the data
        try (FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
             Workbook workbook = WorkbookFactory.create(inputStream)) {
        	
            // Specify the sheet name or index from which to read the data
           Sheet sheet = (Sheet) workbook.getSheet("Forstu Data ");

            // Set up ChromeDriver options (if needed)
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless"); // Uncomment this line to run in headless mode

            // Create a new ChromeDriver instance
            WebDriver driver = new ChromeDriver(options);

            // Launch Google Form
            driver.get("https://forms.gle/VbMvW7oZQTNwhN1P7");

            // Iterate through each row in the Excel sheet (starting from row 1, assuming row 0 is header)
            for (int i = 1; i <= ((XSSFSheet) sheet).getLastRowNum(); i++) {
                Row row = ((XSSFSheet) sheet).getRow(i);

                // Retrieve data from Excel columns
                String name = row.getCell(0).getStringCellValue();
                String FamilyBackground = row.getCell(1).getStringCellValue();
                String Gender = row.getCell(2).getStringCellValue();
                String City = row.getCell(3).getStringCellValue();
                String Hobbies = row.getCell(4).getStringCellValue();

                // Fill out the Google Form
                WebElement nameField = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]"));
                nameField.sendKeys(name);

                WebElement Family = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]"));
                Family.sendKeys(FamilyBackground);
                
                WebElement Gende= driver.findElement(By.xpath("//*[@id=\"i13\"]/div[3]/div"));
                Gende.click();
                //Female
                driver.findElement(By.xpath("//*[@id=\"i16\"]/div[3]/div/div")).click();
                
                Select city = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
        		//step 2:Select option
        		 city.selectByIndex(1);
        		Thread.sleep(2000);
               
                
                WebElement Hob= driver.findElement(By.xpath("//input[@aria-label='Name']"));
                Hob.click();
                
                
                
                
                // Submit the form
                WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span"));
                submitButton.click();

                // Wait for the form submission confirmation message (adjust wait time as needed)
              //  WebDriverWait wait = new WebDriverWait(driver, 10);
             //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='heading' and contains(text(),'Your response has been recorded.')]")));

                // Clear the form fields for the next iteration
               // nameField.clear();
             //   emailField.clear();
            }

            // Close the browser
            driver.quit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}