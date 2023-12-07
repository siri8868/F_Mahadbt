package JSonfiles;

import java.io.File;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class JSONDataUploadTest {
	

    public static void main(String[] args) throws Exception {
    	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Open URL Of "Vidyasarthi"
        driver.get("https://www.vidyasaarathi.co.in/Vidyasaarathi/index");

        // Handle the PopUp
        driver.findElement(By.xpath("//*[@id=\"modalSocial\"]/div/div/div[3]/a")).click();

        // Login to Vidyasarthi
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]/a")).click();

        // Switch to the new page
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Fill in the login credentials
        driver.findElement(By.id("username")).sendKeys("shravanidhumal8868@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Shravani@8868");
        Thread.sleep(2000);

        // Capture CAPTCHA screenshot
        File src = driver.findElement(By.xpath("//*[@id=\"command\"]/div[8]/div[1]/div")).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshot/capcha.png";
        FileHandler.copy(src, new File(path));

        // Perform OCR on CAPTCHA image
        ITesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\tessdata");
        String captcha = tesseract.doOCR(new File("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\screenshot\\capcha.png")).replaceAll("[^a-zA-Z0-9]", " ");

        Thread.sleep(2000);

        // Enter the CAPTCHA value
        driver.findElement(By.xpath("//*[@id=\"txtInput\"]")).sendKeys(captcha);

        Thread.sleep(2000);

        // Submit the login form
        WebElement submitButton = driver.findElement(By.id("login"));
        submitButton.click();
        //close button popup
         driver.findElement(By.xpath("//*[@id=\"modalonlinetest\"]/div/div/div[2]/a")).click();
         //click on profile button 
         driver.findElement(By.xpath("//*[@id=\"studentMenu\"]/li[3]/a")).click();
         
         Thread.sleep(2000);
        // Read the JSON file
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\Vidya.json"));

        for (Object obj : jsonArray) {
            JSONObject userData = (JSONObject) obj;

            // Extract user data from JSON object
            String name = (String) userData.get("name");
            String dateOfBirth = (String) userData.get("date_of_birth");
            String gender = (String) userData.get("gender");
            String category = (String) userData.get("category");
            String title = (String) userData.get("title");
            String fatherName = (String) userData.get("father_name");
            String guardian = (String) userData.get("guardian");
            String occupation = (String) userData.get("occupation");
            String contactNumber = (String) userData.get("contact_number");
            Long salary = (Long) userData.get("salary");
            String address = (String) userData.get("address");
            String accountNumber = (String) userData.get("account_number");
            String reEnter = (String) userData.get("re_enter");
            String name1 = (String) userData.get("name");

            
             
            
         // Find the input fields using the specified paths and enter the values
            WebElement fullNameField = driver.findElement(By.id("fullName"));
            fullNameField.sendKeys(name);

            // Locate the date picker input element
            WebElement datePickerInput = driver.findElement(By.id("dateOfBirth"));

            // Click on the date picker input to open the calendar
            datePickerInput.click();

            // Select the desired year
            Select yearDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[1]")));
            yearDropdown.selectByVisibleText("2001"); // Replace '2001' with the desired year

            // Select the desired month
            Select monthDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[2]")));
            monthDropdown.selectByVisibleText("August"); 

            // Select the desired day
            WebElement desiredDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth_table\"]/tbody/tr[3]/td[4]/div")); 
            desiredDay.click();

            if (gender.equalsIgnoreCase("Female")) {
                WebElement genderFemaleRadioButton = driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[5]/div/div/label[2]"));
                genderFemaleRadioButton.click();
            }

        //    Select castDropdown = new Select(driver.findElement(By.id("category")));
         //   castDropdown.selectByVisibleText(category);

            Select cast=new Select(driver.findElement(By.id("category")));
            cast.selectByIndex(6);
            Thread.sleep(1000);
            
            Select titleDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
            titleDropdown.selectByVisibleText(title);

            WebElement fatherFirstNameField = driver.findElement(By.id("firstName"));
            fatherFirstNameField.sendKeys(fatherName.split(" ")[0]);

            WebElement fatherMiddleNameField = driver.findElement(By.id("middleName"));
            fatherMiddleNameField.sendKeys(fatherName.split(" ")[1]);

            WebElement fatherLastNameField = driver.findElement(By.id("lastName"));
            fatherLastNameField.sendKeys(fatherName.split(" ")[2]);

            Select relationDropdown = new Select(driver.findElement(By.id("relationshipWithStudent")));
            relationDropdown.selectByVisibleText(guardian);

            Select occupationDropdown = new Select(driver.findElement(By.id("occupation")));
            occupationDropdown.selectByVisibleText(occupation);

            WebElement contactNumberField = driver.findElement(By.id("parentsMobileNo"));
            contactNumberField.sendKeys(contactNumber);

            WebElement salaryField = driver.findElement(By.id("familyIncome"));
            salaryField.sendKeys(salary.toString());

            WebElement addressField = driver.findElement(By.id("address"));
            addressField.sendKeys(address);

            WebElement AccountNoField = driver.findElement(By.id("bankAccNo"));
            AccountNoField.sendKeys(accountNumber);
            
            WebElement ReAccountNoField = driver.findElement(By.id("reEnterBankAccNo"));
            ReAccountNoField.sendKeys(reEnter);
            
            WebElement BanknameField = driver.findElement(By.id("nameAsPerBankPassbook"));
            BanknameField.sendKeys(name1);
            

            // Output the uploaded data
            System.out.println("Uploaded Data:");
            System.out.println("Name: " + name);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Gender: " + gender);
            System.out.println("Category: " + category);
            System.out.println("Title: " + title);
            System.out.println("Father Name: " + fatherName);
            System.out.println("Guardian: " + guardian);
            System.out.println("Occupation: " + occupation);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("Salary: " + salary);
            System.out.println("Address: " + address);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Re-entered Account Number: " + reEnter);
            System.out.println("Name: " + name1);
            System.out.println();
        }

        driver.findElement(By.xpath("//*[@id=\"studentMenu\"]/li[8]/a")).click();
        //driver.quit();
    }

	private static Object getMonthName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
