package JSonfiles;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;



public class Code_WithFunction {
	
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.buddy4study.com/application/HDFC45/instruction");

        
        
        
        
        String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC";

        try {
        	studentpersonaldetails(driver, jsonFilePath);
            // Call other functions as needed
            // ...
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    

        try {
        	Educationaldetails(driver, jsonFilePath);
            // Call other functions as needed
            // ...
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        
        
       /*
        studentpersonaldetails(driver);
        Educatinaldetails(driver);
        FamilyDetails(driver);
        Reference(driver);
        Bankdetails(driver);
        */
	}	
public static void studentpersonaldetails(WebDriver driver, String jsonFilePath) throws FileNotFoundException, IOException, ParseException {
		
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
         JSONArray loginData = (JSONArray) parser.parse(new FileReader(jsonFilePath));
    
        
        for (Object obj : loginData) {
            JSONObject loginObj = (JSONObject) obj;
        
            String loginType = (String) loginObj.get("LoginType");
            String loginValue = (String) loginObj.get("LoginValue");
            String password = (String) loginObj.get("Password");
            String alternateMobile = (String) loginObj.get("AlternateMobile");
            String whatsappNumber = (String) loginObj.get("WhatsAppNumber");
            String dateOfBirth = (String) loginObj.get("DateOfBirth");            
           String adharcardString = (String) loginObj.get("adharcard");
         //   long adharcardString = (long) loginObj.get("adharcard");
            long annualFamilyIncome = (long) loginObj.get("AnnualFamilyIncome");
            String personsWithDisabilities = (String) loginObj.get("PersonsWithDisabilities");
            String parentalStatus = (String) loginObj.get("ParentalStatus");
            long numberOfSiblings = (long) loginObj.get("NumberOfSiblings");
            String addressLine = (String) loginObj.get("AddressLine");
            String stateName = (String) loginObj.get("StateName");
            String districtName = (String) loginObj.get("DistrictName");
            String cityName = (String) loginObj.get("CityName");
             String pincode = (String) loginObj.get("Pincode");

            
            
            
            
            
            
            

            
            // Click on appropriate login button based on the login type
            if (loginType.equalsIgnoreCase("email")) {
              //  driver.findElement(By.cssSelector(".login > span")).click();
     	        driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();
            //	driver.findElement(By.cssSelector("button.loginWithPopup_btn__1rHzq")).click();

     	       driver.findElement(By.id("emailid")).click();
   	           driver.findElement(By.id("emailid")).sendKeys(loginValue);
     	        
             //   driver.findElement(By.id("emailid")).sendKeys(loginValue);
            } else if (loginType.equalsIgnoreCase("mobile")) {
                driver.findElement(By.xpath("//*[@id=\"__next\"]/article[1]/article/article/button[2]")).click();
                driver.findElement(By.id("emailid")).sendKeys(loginValue);
            }

            
            // Perform actions on the website using the retrieved data
            
            WebElement passwordElement = driver.findElement(By.id("password")); // Replace with the actual password field's ID
            passwordElement.sendKeys(password);
            
            // Login click: 
	          driver.findElement(By.cssSelector(".loginWithMobileEmailPopup_btn__31NqD")).click();  
	          
	   //Clicking On Ok button :
	          // Create a WebDriverWait instance with a timeout of 10 seconds
	          WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));

	          // Wait until the OK button is clickable
	          WebElement okButton = waitt.until(ExpectedConditions.elementToBeClickable(By.className("swal-button--confirm")));

	          // Create a JavascriptExecutor instance
	          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	          // Click the OK button using JavaScript
	          jsExecutor.executeScript("arguments[0].click();", okButton);

            
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
              
              WebDriverWait waitti = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement DOB = waitti.until(ExpectedConditions.visibilityOfElementLocated(By.id("dob")));
              DOB.sendKeys(dateOfBirth);
              
              
              
              
             //Adharcard : 

              WebDriverWait waittn = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement adharCardElement = waittn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#aadharCard")));
             adharCardElement.sendKeys(adharcardString);
              
               //Family income : 
              driver.findElement(By.id("familyIncome")).click();
              driver.findElement(By.id("familyIncome")).sendKeys(String.valueOf(annualFamilyIncome));

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
              
              
              driver.findElement(By.id("addressLine")).sendKeys(addressLine);
              
           // Select state
              Select state = new Select(driver.findElement(By.id("state")));
              state.selectByVisibleText(stateName);
              
           // Select district
              WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
              WebElement districtDropdown = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("district")));
              Select districtSelect = new Select(districtDropdown);
              districtSelect.selectByVisibleText(districtName);
              
           // Input city
              driver.findElement(By.id("city")).sendKeys(cityName);

              // Input pincode
              driver.findElement(By.id("pincode")).sendKeys(pincode); 
                           
              
 //Save option : 
            WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            WebElement buttonElement = waitB.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[1]/section/article/article[9]/article/input")));
	        JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
            jsExecutorc.executeScript("arguments[0].click();", buttonElement);    
           
            
            
      
           
            
            
        //    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/a/article/span/span/i")).click();
               
        }
        
       
        }
	
	
//*********************************************************************************************************************************************	
	
 public static void Educationaldetails(WebDriver driver, String jsonFilePath) throws InterruptedException, FileNotFoundException, IOException, ParseException
 
 {
        
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementToClick = waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article/span/span/i")));
        JavascriptExecutor jsExecutorClick = (JavascriptExecutor) driver;
        jsExecutorClick.executeScript("arguments[0].click();", elementToClick);
		
        
    	
   	    JSONParser parser = new JSONParser();
        JSONArray loginData = (JSONArray) parser.parse(new FileReader(jsonFilePath));
		for (Object obj : loginData) {
	            JSONObject loginObj = (JSONObject) obj;
		
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
        
        String board = (String) loginObj.get("board11");
        String stream = (String) loginObj.get("stream");
        long instituteType1 = (long) loginObj.get("instituteType1");
        String state1  = (String) loginObj.get("state1");
        String district1  = (String) loginObj.get("district1");
        String  nameOfInstitute1 = (String) loginObj.get("nameOfInstitute1");           
        long passingYear1 = (long) loginObj.get("passingYear1");
        long MarksObtain = (long) loginObj.get("MarksObta");
        long TotalMarks = (long) loginObj.get("TotalMarks");
		
      
        
        
        
/*
        // Graduation section - Clicking on Graduation tab:
        WebDriverWait waitd = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            WebElement element = waitd.until(ExpectedConditions.elementToBeClickable(By.cssSelector("article.heading.topborder")));
            element.click();
            JavascriptExecutor jsExecutord = (JavascriptExecutor) driver;
            jsExecutord.executeScript("console.log('JavaScript executed after clicking');");
            } catch (Exception e) {
            e.printStackTrace();
        }
        */
        // Graduation section - Selecting values:
        WebDriverWait waitm = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement degreeDropdown = waitm.until(ExpectedConditions.elementToBeClickable(By.id("degree")));
        Select degreeSelect = new Select(degreeDropdown);
        degreeSelect.selectByVisibleText(degree);
        JavascriptExecutor jsExecutorn = (JavascriptExecutor) driver;
        jsExecutorn.executeScript("console.log('JavaScript executed after selecting an option');");
        
     // Course Duration:
        WebDriverWait waitx = new WebDriverWait(driver, Duration.ofSeconds(10));
        By dropdownLocator1 = By.id("courseDuration");
        WebElement dropdownElement2 = waitx.until(ExpectedConditions.elementToBeClickable(dropdownLocator1));
        Select durationDropdown = new Select(dropdownElement2);
        durationDropdown.selectByValue(String.valueOf(courseDuration));
        
     // Institute Type:
        Select IType = new Select(driver.findElement(By.id("instituteTypeId")));
        IType.selectByValue(String.valueOf(instituteType));

        // Current Academic Year:
        Select CurrYear = new Select(driver.findElement(By.id("currentAcademicYear")));
        CurrYear.selectByValue(String.valueOf(currentAcademicYear));

        // Current Academic Sem:
        Select Acsem = new Select(driver.findElement(By.id("currentAcademicSem")));
        Acsem.selectByValue(String.valueOf(currentAcademicSem));

        // State:
        Select statee = new Select(driver.findElement(By.id("state")));
        statee.selectByVisibleText(state);

        // District:
        Select diss = new Select(driver.findElement(By.id("district")));
        diss.selectByVisibleText(district);

        // Name of the institute:
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]"));
        Actions actions = new Actions(driver);
        actions.sendKeys(inputField, Keys.TAB).sendKeys(Keys.ENTER).sendKeys(nameOfInstitute).perform();

     // Total course fees:
        driver.findElement(By.id("admissionFee")).sendKeys(String.valueOf(totalCourseFee));

        // Passing Year:
        Select passyear = new Select(driver.findElement(By.id("passingYear")));
        passyear.selectByValue(String.valueOf(passingYear));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       // Wait for the button to be clickable
         WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='button'].btn")));

         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveButton);

         saveButton.click();

        //Board :  
        
        WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement boardElement = waitz.until(ExpectedConditions.presenceOfElementLocated(By.id("board")));
        JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
        jsExecutorz.executeScript("arguments[0].scrollIntoView();", boardElement);
        Select boardSelect = new Select(boardElement);
        boardSelect.selectByVisibleText(board); 
        
        //boardElement       
       // Stream:
        WebDriverWait waitu = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement streamElement = waitu.until(ExpectedConditions.presenceOfElementLocated(By.id("stream")));

        // Use JavaScript Executor to scroll to the element
        JavascriptExecutor jsExecutoru = (JavascriptExecutor) driver;
        jsExecutoru.executeScript("arguments[0].scrollIntoView();", streamElement);

        // Create a Select instance and select an option by visible text
        Select streamSelect = new Select(streamElement);
        streamSelect.selectByVisibleText(stream); // Use the correct variable "stream"
        // Optionally, execute JavaScript after the selection
        jsExecutoru.executeScript("console.log('JavaScript executed after selection');");
         
      // Institute Type:
         Select type = new Select(driver.findElement(By.id("instituteTypeId")));
         type.selectByIndex((int) instituteType1);

         // State:
         Select statet = new Select(driver.findElement(By.id("state")));
         statet.selectByVisibleText(state1);

         // District:
         Select dist = new Select(driver.findElement(By.id("district")));
         dist.selectByVisibleText(district1);

         // Name of the institute:
         driver.findElement(By.id("instituteName")).sendKeys(nameOfInstitute1);

         // Passing Year:
         Select year = new Select(driver.findElement(By.id("passingYear")));
         year.selectByValue(String.valueOf(passingYear1));

         // Mark Obtain:
         WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement inputFields = waits.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#marksObtained")));
         JavascriptExecutor jsExecutors = (JavascriptExecutor) driver;
         jsExecutors.executeScript("arguments[0].scrollIntoView();", inputFields);
         inputFields.sendKeys(String.valueOf(MarksObtain));
         jsExecutors.executeScript("console.log('JavaScript executed after entering text for MarksObtain');");

         // Mark Total mark Obtain:
         driver.findElement(By.id("totalMarks")).sendKeys(String.valueOf(TotalMarks));

         // Save button:
         driver.findElement(By.cssSelector("input[type='button'].btn")).click();
          
  
		 }
      
}
	
 public static void FamilyDetails(WebDriver driver) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
	 WebDriverWait waitClickk = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement elementToClickk = waitClickk.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article/a")));
                                                                                                    
     // Use JavascriptExecutor to click the element
     JavascriptExecutor jsExecutorClickk = (JavascriptExecutor) driver;
     jsExecutorClickk.executeScript("arguments[0].click();", elementToClickk);
     
	 
	 // Read login data from JSON
     JSONParser parser = new JSONParser();
     JSONArray loginData = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC"));

     
  		for (Object obj : loginData) {
  	            JSONObject loginObj = (JSONObject) obj;
  		
           driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article/a")).click();
  	       
           String name = (String) loginObj.get("name");
  	        String mobile = (String) loginObj.get("mobile");
  	        long annualIncome = (long) loginObj.get("annualIncome");
  	        String relation = (String) loginObj.get("Relation");
  	        String occupation = (String) loginObj.get("occupation");
  
  	            
  	      try {
  	        WebDriverWait waitk = new WebDriverWait(driver, Duration.ofSeconds(30));
  	        WebElement inputFieldk = waitk.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#name")));
  	        JavascriptExecutor jsExecutork = (JavascriptExecutor) driver;
  	        jsExecutork.executeScript("arguments[0].scrollIntoView();", inputFieldk);
  	        inputFieldk.sendKeys(name);
  	        jsExecutork.executeScript("console.log('JavaScript executed after entering name');");

  	        driver.findElement(By.id("mobile")).sendKeys(mobile);
  	        driver.findElement(By.id("absoluteIncome")).sendKeys(String.valueOf(annualIncome));

  	        WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(20));
  	        WebElement relationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[5]/article/select")));
  	        relationElement.sendKeys(Keys.TAB);
  	        relationElement.sendKeys(Keys.ENTER);
  	        JavascriptExecutor jsExecutorv = (JavascriptExecutor) driver;
  	        jsExecutorv.executeScript("arguments[0].scrollIntoView();", relationElement);
  	        Select relationDropdown = new Select(relationElement);
  	        relationDropdown.selectByVisibleText(relation);
  	        jsExecutorv.executeScript("console.log('JavaScript executed after relation selection');");

  	        WebElement occupationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[6]/article/select")));
  	        occupationElement.sendKeys(Keys.TAB);
  	        occupationElement.sendKeys(Keys.ENTER);
  	        JavascriptExecutor jsExecutorl = (JavascriptExecutor) driver;
  	        jsExecutorl.executeScript("arguments[0].scrollIntoView();", occupationElement);
  	        Select occupationDropdown = new Select(occupationElement);
  	        occupationDropdown.selectByVisibleText(occupation);
  	        jsExecutorl.executeScript("console.log('JavaScript executed after occupation selection');");

  	    } catch (Exception e) {
  	        e.printStackTrace();
  	    }
  	}
  	        
  	        
 }
 public static void Reference(WebDriver driver) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
	 WebDriverWait waitClickk = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement elementToClickk = waitClickk.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/a/article/span/span/i")));

     // Use JavascriptExecutor to click the element
     JavascriptExecutor jsExecutorClickk = (JavascriptExecutor) driver;
     jsExecutorClickk.executeScript("arguments[0].click();", elementToClickk);
     
	 
	 // Read login data from JSON
     JSONParser parser = new JSONParser();
     JSONArray loginData = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC"));

     
  		for (Object obj : loginData) {
  	            JSONObject loginObj = (JSONObject) obj;
  	            
  	           driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/article/article[2]/article/a")).click();

  	         String name2 = (String) loginObj.get("Name2");
  	         String mobile2 = String.valueOf(loginObj.get("mobile2")); // Assuming mobile2 is a long
  	         String relation2 = (String) loginObj.get("Relation2");

  	         
  	         
  	       try {
  	         WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10));
  	         WebElement elementt = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article.col-md-4 article.form-group input#name")));
  	         elementt.sendKeys(Keys.TAB);

  	         JavascriptExecutor jsExecutor8 = (JavascriptExecutor) driver;
  	         jsExecutor8.executeScript("arguments[0].value = arguments[1];", elementt, name2);

  	         // Mobile
  	         driver.findElement(By.id("mobile")).sendKeys(mobile2);
//           Relation:
  	         WebDriverWait waitb = new WebDriverWait(driver, Duration.ofSeconds(20));
  	         WebElement selectElement = waitb.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select#relation")));
  	         JavascriptExecutor jsExecutorb = (JavascriptExecutor) driver;
  	         jsExecutorb.executeScript("arguments[0].value = arguments[1];", selectElement, "588");

  	         Select rel = new Select(selectElement);
  	         rel.selectByVisibleText(relation2);
  	     } catch (Exception e) {
  	         e.printStackTrace();
  	     }
  	              
  		}
         }
 
 public static void Bankdetails(WebDriver driver) throws InterruptedException, FileNotFoundException, IOException, ParseException {
 

	 // Read login data from JSON
     JSONParser parser = new JSONParser();
     JSONArray loginData = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC"));


	 
	 for (Object obj : loginData) {
		    JSONObject loginObj = (JSONObject) obj;

		    String accountHolderName = (String) loginObj.get("Account_Holder_Name");
		    String accountNumber = (String) loginObj.get("Account_Number");
		    String ifscCode = (String) loginObj.get("IFSC_Code");

		    try {
		        driver.findElement(By.cssSelector("article.form-group input#accountHolderName")).click();
		        WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(20));

		        WebElement inputElement = waiti.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("article.form-group input#accountHolderName")));
		        inputElement.sendKeys(Keys.TAB);

		        JavascriptExecutor jsExecutori = (JavascriptExecutor) driver;
		        jsExecutori.executeScript("arguments[0].value = arguments[1];", inputElement, accountHolderName);

		        driver.findElement(By.id("accountNumber")).sendKeys(accountNumber);
		        driver.findElement(By.id("ifscCode")).sendKeys(ifscCode);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	 }
	 
	 }
 
}
