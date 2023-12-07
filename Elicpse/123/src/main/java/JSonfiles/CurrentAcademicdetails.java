package JSonfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileReader;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
// Add other necessary import statements for Selenium



public class CurrentAcademicdetails {
	

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.buddy4study.com/application/HDFC45/instruction");
//https://www.buddy4study.com/application/HDFC45/instruction
	        
	        // Handle the PopUp
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement noThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
	            noThanksButton.click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        // Click on Apply Now button:
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();

	        String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\TestHDFC ";
	      
	        try {
	        	
	        	
	        //	 String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\HDFC.json";

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

	                 
//Graduation :      
	                
	                String degree = (String) loginObj.get("Degree");
	                long courseDuration = (long) loginObj.get("CourseDuration");
	                String instituteType = (String) loginObj.get("instituteType");
	                long currentAcademicYear = (long) loginObj.get("CurrentAcademicYear");
	                long currentAcademicSem = (long) loginObj.get("CurrentAcademicSem");
	                String state = (String) loginObj.get("State");
	                String district = (String) loginObj.get("District");
	                String nameOfInstitute = (String) loginObj.get("InstitutionName");
	                long totalCourseFee = (long) loginObj.get("TotalCourseFee");
	                long passingYear = (long) loginObj.get("PassingYear");

	                String board = (String) loginObj.get("board11");
	                String stream = (String) loginObj.get("stream");
	                String instituteType1 = (String) loginObj.get("instituteType1");
	                String state1 = (String) loginObj.get("state1");
	                String district1 = (String) loginObj.get("district1");
	                String nameOfInstitute1 = (String) loginObj.get("nameOfInstitute1");
	                String passingYear1 = (String) loginObj.get("passingYear1");
	                long MarksObtain = (long) loginObj.get("MarksObtain");
	                long TotalMarks = (long) loginObj.get("TotalMarks");

	                
//Family :            
	                   
	                    try {
	                        JSONArray parentsArray = (JSONArray) parser.parse(loginObj.get("Parents").toString());
	                        for (int i = 0; i < parentsArray.size(); i++) {
	                            JSONObject parent = (JSONObject) parentsArray.get(i);

	                            String name = (String) parent.get("Name");
	                            String mobile = (String) parent.get("Mobile");
	                            long annualIncome = (Long) parent.get("AnnualIncome");
	                            String relation = (String) parent.get("Relation");
	                            String occupation = (String) parent.get("Occupation");

	                        
	//Refrence : 
	                            try {
	                                JSONArray referenceArray = (JSONArray) parser.parse(loginObj.get("Reference").toString());
	                                for (int j = 0; j < referenceArray.size(); j++) {
	                                    JSONObject reference = (JSONObject) referenceArray.get(j);

	                                    String name1 = (String) reference.get("Name");
	                                    String mobile1 = (String) reference.get("Mobile");
	                                    String relation1 = (String) reference.get("Relation");   
	                    
	                    
	                    
	// Bank details : 
	                                  
	                            try {
	                                JSONArray bankArray = (JSONArray) parser.parse(loginObj.get("bank").toString());
	                                for (int k = 0; k < bankArray.size(); k++) {
	                                     JSONObject bank = (JSONObject) bankArray.get(k);
	                                            
	                                      String accountholderName = (String) bank.get("accountHolderName");
	                                      String accountnumber = (String) bank.get("accountNumber");
	                                      String ifscCode = (String) bank.get("ifscCode");
	                                            
	                                    
	    	                        		    
	                
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
	               /*    
	                   WebDriverWait waittn = new WebDriverWait(driver, Duration.ofSeconds(10));
	                   WebElement adharCardElement = waittn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#aadharCard")));
	                   adharCardElement.sendKeys(String.valueOf(adharcard));
*/
	                  
	                  
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
	                   Select state2 = new Select(driver.findElement(By.id("state")));
	                   state2.selectByVisibleText(stateName);
	                   
	                // Select district
	                   WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	                   WebElement districtDropdown = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("district")));
	                   Select districtSelect = new Select(districtDropdown);
	                   districtSelect.selectByVisibleText(districtName);
	                   
	                // Input city:
	                   driver.findElement(By.id("city")).sendKeys(cityName);

	                   // Input pincode
	                   driver.findElement(By.id("pincode")).sendKeys(pincode); 
	                                
	                   
	      //Save option : 
	                   /*
	                 WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	                 WebElement buttonElement = waitB.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[1]/section/article/article[9]/article/input")));
	     	        JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
	                 jsExecutorc.executeScript("arguments[0].click();", buttonElement);    
	*/
	                 
	                 
	                 
	                 
 //  Click On Graduation : 
	                 
	                 WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 WebElement elementToClick = waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article/span/span/i")));
	                 JavascriptExecutor jsExecutorClick = (JavascriptExecutor) driver;
	                 jsExecutorClick.executeScript("arguments[0].click();", elementToClick);
	                
//	     
	                 
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
	                 
	                 WebDriverWait waitd1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator0 = By.id("instituteTypeId");
	                 WebElement dropdownElement2xx = waitd1.until(ExpectedConditions.elementToBeClickable(dropdownLocator0));

	                 dropdownElement2xx.sendKeys(Keys.TAB);
	                 dropdownElement2xx.sendKeys(Keys.ENTER);
	                 dropdownElement2xx.sendKeys(Keys.ARROW_DOWN);
	                 JavascriptExecutor jsExecutorz1 = (JavascriptExecutor) driver;
	                 jsExecutorz1.executeScript("arguments[0].click();", dropdownElement2xx);

	                 // Continue with the rest of your code

	                 
	               /* 
	                 
	                 WebDriverWait waitxx = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator12 = By.id("instituteTypeId");
	                 WebElement dropdownElement22 = waitxx.until(ExpectedConditions.elementToBeClickable(dropdownLocator12));

	                 // Using JavaScriptExecutor to click on the dropdown and open it
	                 JavascriptExecutor jsExecutorz1 = (JavascriptExecutor) driver;
	                 jsExecutorz1.executeScript("arguments[0].click();", dropdownElement22);

	                 Select durationDropdown1 = new Select(dropdownElement22);
	                 durationDropdown1.selectByValue(String.valueOf(instituteType));
	             //    dropdownElement22.click();
	                 */
	          /*       WebDriverWait waitxx = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator12 = By.id("instituteTypeId");
	                 WebElement dropdownElement22 = waitxx.until(ExpectedConditions.elementToBeClickable(dropdownLocator12));
                     dropdownElement22.sendKeys(Keys.ENTER);
                     dropdownElement22.sendKeys(Keys.TAB);
                     JavascriptExecutor jsExecutorz1 = (JavascriptExecutor) driver;
	                 jsExecutorz1.executeScript("arguments[0].click();", dropdownElement22);
*/
	                
	               //   dropdownElement22.click();

	            //         Select durationDropdown1 = new Select(dropdownElement22);
	           //         durationDropdown1.selectByValue(String.valueOf(instituteType));

	                 
	                
	             //   durationDropdown1.selectByIndex(String.valueOf(instituteType));

	               
	               //  Select IType = new Select(driver.findElement(By.id("instituteTypeId")));
	               //  IType.selectByValue(String.valueOf(instituteType));

	                 // Current Academic Year:  
	                  WebDriverWait waitd = new WebDriverWait(driver, Duration.ofSeconds(10));
	                  By dropdownLocator = By.cssSelector("#currentAcademicYear");
	                  WebElement dropdownElement2x = waitd.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
	                  new Select(dropdownElement2x).selectByValue(String.valueOf(currentAcademicYear));
	              //    dropdownElement2x.sendKeys(Keys.ENTER);
	                  dropdownElement2x.sendKeys(Keys.TAB);
	                  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement2x);

	             /*    WebDriverWait waitd = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator = By.cssSelector("#currentAcademicYear");
	                 WebElement dropdownElement2x = waitd.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
	                 new Select(dropdownElement).selectByValue(String.valueOf(currentAcademicYear));
	                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement2x);

	               */  
	                 //Select CurrYear = new Select(driver.findElement(By.id("currentAcademicYear")));
	                 //CurrYear.selectByValue(String.valueOf(currentAcademicYear));

	                 // Current Academic Sem:
	                 
	                 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator3 = By.id("currentAcademicSem");
	                 WebElement dropdownElement3 = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator3));

	                 Select acSemSelect = new Select(dropdownElement3);
	                 acSemSelect.selectByValue(String.valueOf(currentAcademicSem));

	                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement3);
	                 

	                 // State:
	                 
	                 WebDriverWait waitu = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator4 = By.id("state");
	                 WebElement dropdownElement4 = waitu.until(ExpectedConditions.elementToBeClickable(dropdownLocator4));

	                 Select stateSelect = new Select(dropdownElement4);
	                 stateSelect.selectByVisibleText(state);

	                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement4);
  
	             //    Select statee = new Select(driver.findElement(By.id("state")));
	             //    statee.selectByVisibleText(state);

	                 // District:
	                 WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator5 = By.id("district");
	                 WebElement dropdownElement5 = waiti.until(ExpectedConditions.elementToBeClickable(dropdownLocator5));

	                 Select districtSelect2 = new Select(dropdownElement5);
	                 districtSelect2.selectByVisibleText(district);

	                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement5);	                 
	                 //Select diss = new Select(driver.findElement(By.id("district")));
	                 //diss.selectByVisibleText(district);
                     Thread.sleep(3000);
                     
	                 // Name of the institute:
                     
                     Thread.sleep(4000);
  		             WebElement inputField = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]"));

  		           // Create an Actions instance
  		             Actions actions = new Actions(driver);

  		           // Simulate pressing "Tab" and "Enter" keys sequentially
  		             actions.sendKeys(inputField, Keys.TAB).sendKeys(Keys.ENTER).sendKeys("Bharati Vidyapeeth, Pune").perform();

                            
	              // Total course fees:
	                 driver.findElement(By.id("admissionFee")).sendKeys(String.valueOf(totalCourseFee));

	                 // Passing Year:
	                 Select passyear = new Select(driver.findElement(By.id("passingYear")));
	                 passyear.selectByValue(String.valueOf(passingYear));

	           //      WebDriverWait waitnn = new WebDriverWait(driver, Duration.ofSeconds(10));

	                // Wait for the button to be clickable
	         /*         WebElement saveButton = waitnn.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='button'].btn")));

	                  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveButton);

	                  saveButton.click();
*/
//Board :  
	                 
	                 WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
	                 WebElement boardElement = waitz.until(ExpectedConditions.presenceOfElementLocated(By.id("board")));
	                 JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
	                 jsExecutorz.executeScript("arguments[0].scrollIntoView();", boardElement);
	                 Select boardSelect = new Select(boardElement);
	                 boardSelect.selectByVisibleText(board); 
	                 
	                 //boardElement       
	                // Stream:
	                 Thread.sleep(2000);
	                 WebDriverWait waitun = new WebDriverWait(driver, Duration.ofSeconds(30));
	                 WebElement streamElement = waitun.until(ExpectedConditions.presenceOfElementLocated(By.id("stream")));

	                 // Use JavaScript Executor to scroll to the element
	                 JavascriptExecutor jsExecutoru = (JavascriptExecutor) driver;
	                 jsExecutoru.executeScript("arguments[0].scrollIntoView();", streamElement);

	                 // Create a Select instance and select an option by visible text
	                 Select streamSelect = new Select(streamElement);
	                 streamSelect.selectByVisibleText(stream); // Use the correct variable "stream"
	                 // Optionally, execute JavaScript after the selection
	                 jsExecutoru.executeScript("console.log('JavaScript executed after selection');");
	                  
	               // Institute Type:
	                 WebDriverWait waitd19 = new WebDriverWait(driver, Duration.ofSeconds(10));
	                 By dropdownLocator19 = By.id("instituteTypeId");
	                 WebElement dropdownElement2xm = waitd19.until(ExpectedConditions.elementToBeClickable(dropdownLocator19));

	                 dropdownElement2xm.sendKeys(Keys.TAB);
	                 dropdownElement2xm.sendKeys(Keys.ENTER);
	                 dropdownElement2xm.sendKeys(Keys.ARROW_DOWN);
	                 JavascriptExecutor jsExecutorz1m = (JavascriptExecutor) driver;
	                 jsExecutorz1m.executeScript("arguments[0].click();", dropdownElement2xm);

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
	             //     driver.findElement(By.cssSelector("input[type='button'].btn")).click();
	                   
//ADD Family : 
	           /*      WebDriverWait waitClickk = new WebDriverWait(driver, Duration.ofSeconds(10));
	                  WebElement elementToClickk = waitClickk.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.familybtnsize")));
	                                                                   
	                  JavascriptExecutor jsExecutorClickk = (JavascriptExecutor) driver;
	                  jsExecutorClickk.executeScript("arguments[0].click();", elementToClickk);
	                 
	           */       
	                  
	                  WebDriverWait waitk = new WebDriverWait(driver, Duration.ofSeconds(10));
			            WebElement inputFieldk = waitk.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"name\"]")));

			            // Use JavaScript Executor to scroll to the element
			            JavascriptExecutor jsExecutork = (JavascriptExecutor) driver;
			            jsExecutork.executeScript("arguments[0].scrollIntoView();", inputFieldk);
                         inputFieldk.sendKeys(Keys.TAB);
                         inputFieldk.sendKeys(Keys.ENTER);
			            // Enter text into the input field
			            inputFieldk.sendKeys(name);

			            // Optionally, execute JavaScript after entering text
			            jsExecutork.executeScript("console.log('JavaScript executed after entering text');");
	                  
	                 // Mobile 
	        	        driver.findElement(By.id("mobile")).sendKeys(mobile);
	        	     // Anual income :    
	        	        driver.findElement(By.id("absoluteIncome")).sendKeys(String.valueOf(annualIncome));
                      //Relation : 
	        	        WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(20));
	        	        WebElement relationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[5]/article/select")));
	        	        relationElement.sendKeys(Keys.TAB);
	        	        relationElement.sendKeys(Keys.ENTER);
	        	        JavascriptExecutor jsExecutorv = (JavascriptExecutor) driver;
	        	        jsExecutorv.executeScript("arguments[0].scrollIntoView();", relationElement);
	        	        Select relationDropdown = new Select(relationElement);
	        	        relationDropdown.selectByVisibleText(relation);
	        	        jsExecutorv.executeScript("console.log('JavaScript executed after relation selection');");
                   //  Occupation : 
	        	        WebElement occupationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[6]/article/select")));
	        	        occupationElement.sendKeys(Keys.TAB);
	        	        occupationElement.sendKeys(Keys.ENTER);
	        	        JavascriptExecutor jsExecutorl = (JavascriptExecutor) driver;
	        	        jsExecutorl.executeScript("arguments[0].scrollIntoView();", occupationElement);
	        	        Select occupationDropdown = new Select(occupationElement);
	        	        occupationDropdown.selectByVisibleText(occupation);
	        	        jsExecutorl.executeScript("console.log('JavaScript executed after occupation selection');");
	                 
	        	 //Save Button :
	        	        
	        	        
	        	               	        
	        	 //Add Family : 
	        	        
	        	        
	        	        
// Reference: 
	        	        WebDriverWait waito = new WebDriverWait(driver, Duration.ofSeconds(20)); 

	    		        // Wait for the element to be clickable
	    		        WebElement element = waito.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/a")));

	    		        // Perform the click using JavaScript executor
	    		        JavascriptExecutor jsExecutoro = (JavascriptExecutor) driver;
	    		        jsExecutoro.executeScript("arguments[0].click();", element);
	    		        
	    		        
	 // Name : 
	    		        WebDriverWait waitka = new WebDriverWait(driver, Duration.ofSeconds(30));
			            WebElement inputFieldka = waitka.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#name")));

			            // Use JavaScript Executor to scroll to the element
			            JavascriptExecutor jsExecutorka = (JavascriptExecutor) driver;
			            jsExecutorka.executeScript("arguments[0].scrollIntoView();", inputFieldka);
			            inputFieldka.sendKeys(Keys.TAB);
			            
			            inputFieldka.sendKeys(name1);

			            // Optionally, execute JavaScript after entering text
			            jsExecutorka.executeScript("console.log('JavaScript executed after entering text');");
	    		        
	    		        
	   //Mobile : 
			            driver.findElement(By.id("mobile")).sendKeys(mobile1);
	   // Relation : 
			            
			            WebDriverWait waitb = new WebDriverWait(driver, Duration.ofSeconds(20));
			  	         WebElement selectElement = waitb.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select#relation")));
			  	         JavascriptExecutor jsExecutorb = (JavascriptExecutor) driver;
			  	         jsExecutorb.executeScript("arguments[0].value = arguments[1];", selectElement, "588");

			  	         Select rel = new Select(selectElement);
			  	         rel.selectByVisibleText(relation1);
			            
	        	        
	        	        
// Bank details : 	
	//Bank holder name : 		  	         
					        WebDriverWait waitkac = new WebDriverWait(driver, Duration.ofSeconds(30));
				            WebElement inputFieldkaa = waitkac.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accountHolderName\"]")));
				            JavascriptExecutor jsExecutorkaa = (JavascriptExecutor) driver;
				            jsExecutorkaa.executeScript("arguments[0].scrollIntoView();", inputFieldkaa);
				            inputFieldkaa.sendKeys(Keys.TAB);
				            inputFieldkaa.sendKeys(Keys.ENTER);
				            inputFieldkaa.sendKeys(accountholderName);
				            jsExecutorkaa.executeScript("console.log('JavaScript executed after entering text');");
					        
	//Account Number : 
				            WebDriverWait waitj = new WebDriverWait(driver, Duration.ofSeconds(20));
				            WebElement accountNumberInput = driver.findElement(By.id("accountNumber"));
			                accountNumberInput.sendKeys(accountnumber);
			                waitj.until(ExpectedConditions.elementToBeClickable(accountNumberInput));

			                // Use JavaScriptExecutor to directly set the value of the input field
			                JavascriptExecutor jsExecutorh = (JavascriptExecutor) driver;
			                jsExecutorh.executeScript("arguments[0].value = arguments[1];", accountNumberInput, accountnumber);
   
	//IFSC CODE : 		  	         
			                driver.findElement(By.id("ifscCode")).sendKeys(ifscCode);
			  	         
/////////////*******************
// More about Yourself : 
			                
			                driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/div/div/p[1]/label/span")).click();
			  	         
			  	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/div/div/p[2]/label/span")).click();
			  	            
			  	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/div/div/p[3]/label/span")).click();
			  	            
			  	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/div/div/p[4]/label/span")).click();
			  	            
			  	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/div/div/p[5]/label/span")).click();
			  	            
			  	            
	        	      
	                                }    
	                       
	                    } catch (ParseException e) {
	                        e.printStackTrace();
	                    }
	                       
	                        }
	                    } catch (ParseException e) {
	                        e.printStackTrace();
	                    }        
	                            
	            } 
	           
	                    
	                    } catch (ParseException e) {
	                e.printStackTrace();
	            }
	            }
	            
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Handle the exception or add more specific conditions
	        }

	        
	
		        
	        
	}

	}
