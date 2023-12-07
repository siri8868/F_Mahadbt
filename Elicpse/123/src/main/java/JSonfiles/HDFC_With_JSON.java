package JSonfiles;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;

public class HDFC_With_JSON {
	
	
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.buddy4study.com/application/HDFC45/instruction");

       
        // Handle the PopUp
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement noThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
            noThanksButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
      //Click on Apply Now button :
        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();

        // Read login data from JSON
        JSONParser parser = new JSONParser();
        JSONArray loginData = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC"));

        for (Object obj : loginData) {
            JSONObject loginObj = (JSONObject) obj;
        
            String loginType = (String) loginObj.get("LoginType");
            String loginValue = (String) loginObj.get("LoginValue");
            String password = (String) loginObj.get("Password");
            String alternateMobile = (String) loginObj.get("AlternateMobile");
            String whatsappNumber = (String) loginObj.get("WhatsAppNumber");
            long   annualFamilyIncome = (long) loginObj.get("AnnualFamilyIncome");
            String personsWithDisabilities = (String) loginObj.get("PersonsWithDisabilities");
            String parentalStatus = (String) loginObj.get("ParentalStatus");
            long numberOfSiblings = (long) loginObj.get("NumberOfSiblings");
//Graduation            
            String degree = (String) loginObj.get("degree");
            long courseDuration = (long) loginObj.get("courseDuration");
            long instituteType = (long) loginObj.get("instituteType");
            long currentAcademicYear = (long) loginObj.get("currentAcademicYear");
            long currentAcademicSem = (long) loginObj.get("currentAcademicSem");
            String state= (String) loginObj.get("state");
            String district = (String) loginObj.get("district");
            String nameOfInstitute = (String) loginObj.get("nameOfInstitute");
            long totalCourseFee = (long) loginObj.get("totalCourseFee");
            long passingYear = (long) loginObj.get("passingYear");
//12 Board :            
            String board = (String) loginObj.get("board");
            String stream = (String) loginObj.get("stream");
            long instituteType1 = (long) loginObj.get("instituteType1");
            String state1  = (String) loginObj.get("state1");
            String district1  = (String) loginObj.get("district1");
            String  nameOfInstitute1 = (String) loginObj.get("nameOfInstitute1");           
            long passingYear1 = (long) loginObj.get("passingYear1");
            long MarksObtain = (long) loginObj.get("MarksObta");
            long TotalMarks = (long) loginObj.get("TotalMarks");
// Family Member : 
            
            String Name = (String) loginObj.get("Name");
            long mobile = (long) loginObj.get("mobile");
            long Annual_income = (long) loginObj.get("Annual_income");
            String Relation = (String) loginObj.get("Relation");
            String Occupation = (String) loginObj.get("Occupation");
 //2 Family member : 

            String Name1 = (String) loginObj.get("Name1");
            long mobile1 = (long) loginObj.get("mobile1");
            long Annual_income1 = (long) loginObj.get("Annual_income1");
            String Relation1 = (String) loginObj.get("Relation1");
            String Occupation1 = (String) loginObj.get("Occupation1");
 
// Reference : 
            String Name2 = (String) loginObj.get("Name2");
            long mobile2 = (long) loginObj.get("mobile2");
            String Relation2 = (String) loginObj.get("Relation2");
//2 Reference :             
            String Name3 = (String) loginObj.get("Name3");
            long mobile3 = (long) loginObj.get("mobile3");
            String Relation3 = (String) loginObj.get("Relation3");
            
//  Bank Account Details : 
            String Account_Holder_Name  = (String) loginObj.get("Account_Holder_Name");
            long Account_Number  = (long) loginObj.get("Account_Number");
            long IFSC_Code  = (long) loginObj.get("IFSC_Code");
            
            
            
            
            
            
           // driver.findElement(By.cssSelector("button.loginWithPopup_btn__1rHzq")).click();

            
            // Click on appropriate login button based on the login type
            if (loginType.equalsIgnoreCase("email")) {
            //	 driver.findElement(By.cssSelector(".login > span")).click();
            
                driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();
                driver.findElement(By.id("emailid")).sendKeys(loginValue);
            } else if (loginType.equalsIgnoreCase("mobile")) {
                driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/article/article/article/button[2]")).click();
                driver.findElement(By.id("emailid")).sendKeys(loginValue);
            }

            
            // Perform actions on the website using the retrieved data
            
            WebElement passwordElement = driver.findElement(By.id("password")); // Replace with the actual password field's ID
            passwordElement.sendKeys(password);
            
            // Login click: 
	          driver.findElement(By.cssSelector(".loginWithMobileEmailPopup_btn__31NqD")).click();  
	          
	   //Clicking On Ok button :
	          // Create a WebDriverWait instance with a timeout of 10 seconds
	          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	          // Wait until the OK button is clickable
	          WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("swal-button--confirm")));

	          // Create a JavascriptExecutor instance
	          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	          // Click the OK button using JavaScript
	          jsExecutor.executeScript("arguments[0].click();", okButton);
	          
// For dropdown here is code i have to write it here : 
   
	          
	          
	        //Click on Start Application : 
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement startApplicationButton = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class='applicationInstructions_ctrlWrapper__17X1G']//button[contains(text(),'START APPLICATION')]")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startApplicationButton); 
            
            WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement alternateMobileElement = waitr.until(ExpectedConditions.visibilityOfElementLocated(By.id("alternateMobile")));
            alternateMobileElement.sendKeys(alternateMobile);

            WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement WhatappNo = waittt.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatsAppMobile")));
            WhatappNo.sendKeys(whatsappNumber);
          
      /*      
            WebDriverWait waitti = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement anual_income1 = waitti.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatsAppMobile")));
            anual_income1.sendKeys(annualFamilyIncome);
       */    
            
            
            
            
            
            WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement disabledElement = waitA.until(ExpectedConditions.elementToBeClickable(By.id("disabled")));
            JavascriptExecutor jsExecutorA = (JavascriptExecutor) driver;
            jsExecutorA.executeScript("arguments[0].click();", disabledElement);
            WebElement dropdownElement = waitA.until(ExpectedConditions.visibilityOfElementLocated(By.id("disabled")));
            Select dis = new Select(dropdownElement);
            dis.selectByVisibleText(personsWithDisabilities);

            // Set parental status
            Select parentstatus = new Select(driver.findElement(By.id("otherPersonalDetails")));
            parentstatus.selectByVisibleText(parentalStatus);

            // Set number of siblings
            Select nosibling = new Select(driver.findElement(By.id("siblingsNo")));
            nosibling.selectByVisibleText(String.valueOf(numberOfSiblings));
           
          //Click on graduation tab : 		            
	           WebDriverWait waitC = new WebDriverWait(driver, Duration.ofSeconds(20));
	           By elementLocator = By.xpath("//article[contains(@class, 'heading') and contains(@class, 'topborder')]");

	           WebElement element = waitC.until(ExpectedConditions.elementToBeClickable(elementLocator));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            // Degree : 
	           By dropdownLocator = By.id("degree");
	           By optionLocator = By.xpath("//option[text()='" + degree + "']");
	           WebElement dropdownElement1 = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdownElement1);
	           WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(optionLocator));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionElement);
           //  Select Course Duration
		       By dropdownLocator1 = By.id("courseDuration");
	           WebElement dropdownElement2 = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator1));
	           Select durationDropdown = new Select(dropdownElement2);
	           durationDropdown.selectByIndex((int) courseDuration); 
	           

	           // Select Institute Type
	           Select IType = new Select(driver.findElement(By.id("instituteTypeId")));
	           IType.selectByIndex((int) instituteType);
            

	           // Select Current Academic Year
	           Select CurrYear = new Select(driver.findElement(By.id("currentAcademicYear")));
	           CurrYear.selectByIndex((int) currentAcademicYear);

	           // Select Current Academic Semester
	           Select Acsem = new Select(driver.findElement(By.id("currentAcademicSem")));
	           Acsem.selectByIndex((int) currentAcademicSem);

	           // Select State
	           Select statee = new Select(driver.findElement(By.id("state")));
	           statee.selectByVisibleText(state);
	           
	        // Select District
	           Select diss = new Select(driver.findElement(By.id("district")));
	           diss.selectByVisibleText(district);

	           // Select Name of the Institute
	           Select institute = new Select(driver.findElement(By.xpath("//*[@id=\"react-select-3--value\"]/div[1]")));
	           institute.selectByVisibleText(nameOfInstitute);

	           // Fill Total Course Fees
	           driver.findElement(By.id("admissionFee")).sendKeys(String.valueOf(totalCourseFee));

	           // Select Passing Year
	           Select passyear = new Select(driver.findElement(By.id("passingYear")));
	           passyear.selectByValue(String.valueOf(passingYear));
	          //Board :  
	           Select boardSelect = new Select(driver.findElement(By.id("board")));
	           boardSelect.selectByVisibleText(board);

	        // Select Stream
	           Select streamSelect = new Select(driver.findElement(By.id("stream")));
	           streamSelect.selectByVisibleText(stream);

	        // Select Institute Type
	           Select typeSelect = new Select(driver.findElement(By.id("instituteTypeId")));
	           typeSelect.selectByIndex((int) instituteType1);

	           // Select State
	           Select stateSelect = new Select(driver.findElement(By.id("state")));
	           stateSelect.selectByVisibleText(state1);

	           // Select District
	           Select distSelect = new Select(driver.findElement(By.id("district")));
	           distSelect.selectByVisibleText(district1);

	           // Enter Name of the Institute
	           driver.findElement(By.id("instituteName")).sendKeys(nameOfInstitute1);  
	           
	        // Select Passing Year
	           Select yearSelect = new Select(driver.findElement(By.id("passingYear")));
	           yearSelect.selectByVisibleText(String.valueOf(passingYear1));

	           // Click on CGPA Obtain
	           By cgpaObtainLocator = By.xpath("//span[contains(text(), 'CGPA')]/../input");
	           WebElement cgpaObtainCheckbox = wait.until(ExpectedConditions.elementToBeClickable(cgpaObtainLocator));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cgpaObtainCheckbox);

	           // Select Grade
	           Select gradeSelect = new Select(driver.findElement(By.id("marksObtained")));
	           gradeSelect.selectByIndex((int) MarksObtain );

	           // Enter CGPA
	           driver.findElement(By.id("totalMarks")).sendKeys(String.valueOf(TotalMarks));
//***********************************************************************************************************************
//family memeber : 	           
	           // Family member data
	           WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(20));

	           // Name
	           WebElement nameElement = waitv.until(ExpectedConditions.elementToBeClickable(By.id("name")));
	           nameElement.click();
	           nameElement.sendKeys(Name);
	           //mobile
	           driver.findElement(By.id("mobile")).sendKeys(String.valueOf(mobile));
	           //Annual income
               driver.findElement(By.id("absoluteIncome")).sendKeys(String.valueOf(Annual_income));
               
               // Example: Select Relation from dropdown
               Select relationSelect = new Select(driver.findElement(By.id("relation")));
               relationSelect.selectByVisibleText(Relation);

               // Example: Select Occupation from dropdown
               Select occupationSelect = new Select(driver.findElement(By.id("occupation")));
               occupationSelect.selectByVisibleText(Occupation);
// Save Button : 
               
               // Family member data
	           WebDriverWait waitvv = new WebDriverWait(driver, Duration.ofSeconds(20));

	           // Name
	           WebElement nameElement1 = waitvv.until(ExpectedConditions.elementToBeClickable(By.id("name")));
	           nameElement1.click();
	           nameElement.sendKeys(Name1);
	           //mobile
	           driver.findElement(By.id("mobile")).sendKeys(String.valueOf(mobile1));
	           //Annual income
               driver.findElement(By.id("absoluteIncome")).sendKeys(String.valueOf(Annual_income1));
               
               // Example: Select Relation from dropdown
               Select relationSelect1 = new Select(driver.findElement(By.id("relation")));
               relationSelect1.selectByVisibleText(Relation1);

               // Example: Select Occupation from dropdown
               Select occupationSelect1 = new Select(driver.findElement(By.id("occupation")));
               occupationSelect1.selectByVisibleText(Occupation1);
               
//Save button : 
               
 //Reference : 
               WebElement nameField = driver.findElement(By.id("name"));
               nameField.sendKeys(Name2);

               // Mobile
               WebElement mobileField = driver.findElement(By.id("mobile"));
               mobileField.sendKeys(String.valueOf(mobile2));
  
              // Relation
               Select relationDropdown = new Select(driver.findElement(By.id("relation")));
               relationDropdown.selectByVisibleText(Relation2);
               
               
 //2 Reference: 
            // Fill in the form fields using the retrieved JSON data:
               WebDriverWait waitj = new WebDriverWait(driver, Duration.ofSeconds(10));

               // Name
               waitj.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys(Name3);

               WebElement nameField1 = driver.findElement(By.id("name"));
               nameField1.sendKeys(Name3);

               // Mobile
               WebElement mobileField1 = driver.findElement(By.id("mobile"));
               mobileField1.sendKeys(String.valueOf(mobile3));
  
              // Relation
               Select relationDropdown1 = new Select(driver.findElement(By.id("relation")));
               relationDropdown1.selectByVisibleText(Relation3);
               
 //Bank Details :               
               
            // Account Holder name:
               driver.findElement(By.id("accountHolderName")).sendKeys(Account_Holder_Name);

               // Account Number:
               driver.findElement(By.id("accountNumber")).sendKeys(String.valueOf(Account_Number));

               // IFSC Code:
               driver.findElement(By.id("ifscCode")).sendKeys(String.valueOf(IFSC_Code));
              
               
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
            // Print the current data for verification
            System.out.println("Alternate Mobile: " + alternateMobile);
            System.out.println("WhatsApp Number: " + whatsappNumber);
            System.out.println("Annual Family Income: " + annualFamilyIncome);
            System.out.println("Persons with Disabilities: " + personsWithDisabilities);
            System.out.println("Parental Status: " + parentalStatus);
            System.out.println("Number of Siblings: " + numberOfSiblings);
            System.out.println("--------------------------------------");
            
            

        }

        // Close the driver at the end
        driver.quit();
    }
    
}
