package JSonfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdityaBirla_Prof_ {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		
		   
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	     //   driver.get("https://www.buddy4study.com/application/ABCC8/instruction");

	        
	        // Handle the PopUp
	    /*    try {
	        	
	        	 //  driver.get("https://www.buddy4study.com/application/ABCC8/instruction");
	        	
	        	
	            WebDriverWait waitn1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement noThanksButton = waitn1.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
	            noThanksButton.click();
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	     */
	     //   Thread.sleep(2000);
	        // Click on Apply Now button:
	 //       driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();

	        String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\Legrand_";
 
	        try {
	        	
	            JSONParser parser = new JSONParser();
	            JSONArray loginData = (JSONArray) parser.parse(new FileReader(jsonFilePath));
	        
	            for (Object obj : loginData) {
	            JSONObject loginObj = (JSONObject) obj;

	              
	               

	                String loginType = (String) loginObj.get("LoginType");
	                String loginValue = (String) loginObj.get("LoginValue");
	                String password = (String) loginObj.get("Password");
	                String alternateMobile = (String) loginObj.get("AlternateMobile");
	                String whatsappNumber = (String) loginObj.get("WhatsAppNumber");
	                String category = (String) loginObj.get("Category");
	                long annualFamilyIncome = (long) loginObj.get("AnnualFamilyIncome");
	                String personsWithDisabilities = (String) loginObj.get("PersonsWithDisabilities");
	                String Parentalstatus = (String) loginObj.get("ParentalStatus");
	               long numberOfSiblings = (long) loginObj.get("NumberOfSiblings");
	            
	        
	        
//Graduation :    
	//12 th                
	                String board = (String) loginObj.get("board11");
	                String stream = (String) loginObj.get("stream");
	                String InstituteType1 = (String) loginObj.get("instituteType1");
	                String state1 = (String) loginObj.get("state1");
	                String district1 = (String) loginObj.get("district1");
	                String nameOfInstitute1 = (String) loginObj.get("nameOfInstitute1");
	                String passingYear1 = (String) loginObj.get("passingYear1");
	                long MarksObtain = (long) loginObj.get("MarksObtain");
	                long TotalMarks = (long) loginObj.get("TotalMarks");
	               
	               
	               
	               
	               
//	Graduation               
	                
	                String degree = (String) loginObj.get("Degree");
	                long currentAcademicYear = (long) loginObj.get("CurrentAcademicYear");
	                long currentAcademicSem = (long) loginObj.get("CurrentAcademicSem");
	                String state = (String) loginObj.get("State");
	                String district = (String) loginObj.get("District");
	                String nameOfInstitute = (String) loginObj.get("InstitutionName");
	                long totalCourseFee = (long) loginObj.get("TotalCourseFee");
	                long passingYear = (long) loginObj.get("PassingYear");

	                              
	                
//Family :         
	                
	                   
	                    try {
	                        JSONArray parentsArray = (JSONArray) parser.parse(loginObj.get("Parents").toString());
	                        for (int i = 0; i < parentsArray.size(); i++) {
	                            JSONObject parent = (JSONObject) parentsArray.get(i);

	                            String name = (String) parent.get("Name");
	                            String mobile = (String) parent.get("Mobile");
	                            long annualIncome = (Long) parent.get("AnnualIncome");
	                            String relation = (String) parent.get("Relation");
	                            String Qualifi = (String) parent.get("Qualification");
	                            String occupation = (String) parent.get("Occupation");

	                        
	
	                    
// Bank details : 
                
       try {
            JSONArray bankArray = (JSONArray) parser.parse(loginObj.get("bank").toString());
            for (int k = 0; k < bankArray.size(); k++) {
                 JSONObject bank = (JSONObject) bankArray.get(k);
                        
                  String accountholderName = (String) bank.get("accountHolderName");
                  String accountnumber = (String) bank.get("accountNumber");
                  String ifscCode = (String) bank.get("ifscCode");
                        
                
      

                  driver.get("https://www.buddy4study.com/application/ABCC8/instruction");
                  
                  
                  try {
      	        	
     	        	 //  driver.get("https://www.buddy4study.com/application/ABCC8/instruction");
     	        	
     	        	/*
     	            WebDriverWait waitn1 = new WebDriverWait(driver, Duration.ofSeconds(10));
     	            WebElement noThanksButton = waitn1.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
     	            noThanksButton.click(); */
                	  Thread.sleep(2000);
     	      } catch (Exception e) {
     	           e.printStackTrace();
     	      }
     	     
                  
                  
                  driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();
                  
                  
                  
                  
                  
                  
                 // Click on appropriate login button based on the login type
                 if (loginType.equalsIgnoreCase("email")) {
                	 
                	 WebDriverWait waite2 = new WebDriverWait(driver, Duration.ofSeconds(10));

                     // Use the WebDriverWait to wait for the element to be clickable
                     WebElement element = waite2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/section/main/article/article/article/button[3]")));

                     // Execute JavaScript to click the element (if needed)
                     JavascriptExecutor js = (JavascriptExecutor) driver;
                     js.executeScript("arguments[0].click();", element);
                 //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                /*	 
                	 WebDriverWait waite1 = new WebDriverWait(driver, Duration.ofSeconds(10));
                     WebElement element = waite1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/section/main/article/article/article/button[3]")));
                     element.click();
                   */
              //  	 driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/article/article/article/button[3]")).click();
          	   //     driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();

          	       driver.findElement(By.id("emailid")).click();
        	           driver.findElement(By.id("emailid")).sendKeys(loginValue);
          	        
                  //   driver.findElement(By.id("emailid")).sendKeys(loginValue);
                 } else if (loginType.equalsIgnoreCase("mobile")) {
                     driver.findElement(By.xpath("//*[@id=\"__next\"]/article[1]/article/article/button[2]")).click();
                     driver.findElement(By.id("emailid")).sendKeys(loginValue);
                 }

                 
                 // Perform actions on the website using the retrieved data
                 
                 WebElement passwordElement = driver.findElement(By.id("password")); 
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
     	       /*  
 	     	       // First Dropdown :
 	     	        WebDriverWait waitb1 = new WebDriverWait(driver, Duration.ofSeconds(10));
 	     	        WebElement firstDropdown = waitb1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[1]//select[@name='option']")));
 			        Select select1 = new Select(firstDropdown);
 			        select1.selectByVisibleText("Yes"); 
 			          
 	     	       //Second Dropdown : 
 			         
 			          WebDriverWait waitb2 = new WebDriverWait(driver, Duration.ofSeconds(10));
 		     	      WebElement SecondDropdown = waitb2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section/main/article/article/form/article[1]/article/article[2]/select")));
 				      Select select2 = new Select(SecondDropdown);
 				      select2.selectByVisibleText("Yes");  
 				      
 			      //Third Dropdown : 
 				      WebDriverWait waitb3 = new WebDriverWait(driver, Duration.ofSeconds(10));
 		     	      WebElement ThirdDropdown = waitb3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[3]//select[@name='option']")));
 				      Select select3 = new Select(ThirdDropdown);
 				      select3.selectByVisibleText("Yes"); 
 	     	         
 	     	     //Four Dropdown : 
 				      WebDriverWait waitb4 = new WebDriverWait(driver, Duration.ofSeconds(10));
 		     	      WebElement fourDropdown = waitb4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[4]//select[@name='option']")));
 				      Select select4 = new Select(fourDropdown);
 				      select4.selectByVisibleText("Yes"); 
 				      
 	     	    //five dropdown :
 				      
 				      WebDriverWait waitb5 = new WebDriverWait(driver, Duration.ofSeconds(10));
 		     	      WebElement fiveDropdown = waitb5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[5]//select[@name='option']")));
 				      Select select5 = new Select(fiveDropdown);
 				      select5.selectByVisibleText("Yes"); 
 	     	         
 //Check Your Eligibility : 
 				      
 				      driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/article/article/form/article[2]/button")).click();
 //Continue button : 				      
 	     	      	  driver.findElement(By.cssSelector(".swal-button-container .swal-button--continue")).click();     
 	     	      	
 				      try {
 				            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 				            WebElement noThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[4]/div/button")));
 				            noThanksButton.click();
 				        } catch (Exception e) {
 				            e.printStackTrace();
 				        }
 				  
 				     
 				     */ 
			      
           WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement alternateMobileElement = waitr.until(ExpectedConditions.visibilityOfElementLocated(By.id("alternateMobile")));
           alternateMobileElement.sendKeys(alternateMobile);

           WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement WhatappNo = waittt.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatsAppMobile")));
           WhatappNo.sendKeys(whatsappNumber);

       /*    WebElement selectElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("article.show.col-md-4 article.form-group select#quota")));
       	               ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", selectElement, category);
       	               selectElement.sendKeys(Keys.TAB);
       	               selectElement.sendKeys(Keys.LEFT);
       	               selectElement.sendKeys(Keys.ENTER);
       	               selectElement.sendKeys(Keys.ARROW_DOWN);
       	               selectElement.click();
*/

            //Family income : 
               driver.findElement(By.id("familyIncome")).click();
               driver.findElement(By.id("familyIncome")).sendKeys(String.valueOf(annualFamilyIncome));

               WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10));
               WebElement disabledElement = waitA.until(ExpectedConditions.elementToBeClickable(By.id("disabled")));
               JavascriptExecutor jsExecutorAn = (JavascriptExecutor) driver;
               jsExecutorAn.executeScript("arguments[0].click();", disabledElement);
               WebElement dropdownElement = waitA.until(ExpectedConditions.visibilityOfElementLocated(By.id("disabled")));
               Select dist = new Select(dropdownElement);
               dist.selectByVisibleText(personsWithDisabilities);

  // Set parental status :
               
               WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10));
               WebElement disabledElementA = waitB.until(ExpectedConditions.elementToBeClickable(By.cssSelector("article.form-group select#otherPersonalDetails")));
               JavascriptExecutor jsExecutorAnB = (JavascriptExecutor) driver;
               jsExecutorAnB.executeScript("arguments[0].click();", disabledElementA);
               WebElement dropdownElementB = waitB.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article.form-group select#otherPersonalDetails")));
               disabledElementA.sendKeys(Keys.TAB);
               disabledElementA.sendKeys(Keys.ENTER);
            //   disabledElementA.sendKeys(Keys.ARROW_DOWN);
           //    disabledElementA.sendKeys(Keys.ENTER);
               Select distB = new Select(dropdownElementB);
               distB.selectByVisibleText(Parentalstatus);
               disabledElementA.click();
               
               
       
               // Set number of sibling : 
               WebDriverWait waitlk = new WebDriverWait(driver,Duration.ofSeconds(10));
               WebElement districtDropdown = waitlk.until(ExpectedConditions.visibilityOfElementLocated(By.id("siblingsNo")));
               Select nosibling = new Select(districtDropdown);
               nosibling.selectByVisibleText(String.valueOf(numberOfSiblings));
               

               
     	      //Save option : 
     	                   /*
     	                 WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10)); 
     	                 WebElement buttonElement = waitB.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[1]/section/article/article[9]/article/input")));
     	     	        JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
     	                 jsExecutorc.executeScript("arguments[0].click();", buttonElement);    
     	*/
			     	                 
			  //Board :  
			  /*             WebDriverWait waitClick1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			       WebElement elementToClick1 = waitClick1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/a/article/span/span/i")));
			       JavascriptExecutor jsExecutorClick1 = (JavascriptExecutor) driver;
			       jsExecutorClick1.executeScript("arguments[0].click();", elementToClick1);
			                     
			       
			          
			     WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(10));
			     WebElement elementToClick = waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article/span/span/i")));
			     JavascriptExecutor jsExecutorClick = (JavascriptExecutor) driver;
			     jsExecutorClick.executeScript("arguments[0].click();", elementToClick);
			*/         
			     WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
			     WebElement boardElement = waitz.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#board")));
			     JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
			     jsExecutorz.executeScript("arguments[0].scrollIntoView();", boardElement);
			     Select boardSelect = new Select(boardElement);	            	         	                
			     boardSelect.selectByVisibleText(board); 
			                 
			                 //boardElement       
			                // Stream:
			             //    Thread.sleep(2000);
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
			           /*      WebDriverWait waitd19 = new WebDriverWait(driver, Duration.ofSeconds(10));
				            	         	                 By dropdownLocator19 = By.id("instituteTypeId");
	            	         	                 WebElement dropdownElement2xm = waitd19.until(ExpectedConditions.elementToBeClickable(dropdownLocator19));

	            	         	                 dropdownElement2xm.sendKeys(Keys.TAB);
	            	         	                 dropdownElement2xm.sendKeys(Keys.ENTER);
	            	         	                 dropdownElement2xm.sendKeys(Keys.ARROW_DOWN);
	            	         	                 JavascriptExecutor jsExecutorz1m = (JavascriptExecutor) driver;
	            	         	                 jsExecutorz1m.executeScript("arguments[0].click();", dropdownElement2xm);
*/
                  // State:
                 
                  Select statet = new Select(driver.findElement(By.id("state")));
                  statet.selectByVisibleText(state1);

                  // District:
                  Select dist1 = new Select(driver.findElement(By.id("district")));
                  dist1.selectByVisibleText(district1);

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
                 
        	         	                  
	            	         	                 
 //  Click On Graduation : 
         	             /*    
         	                 WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(10));
         	                 WebElement elementToClick = waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article/span/span/i")));
         	                 JavascriptExecutor jsExecutorClick = (JavascriptExecutor) driver;
         	                 jsExecutorClick.executeScript("arguments[0].click();", elementToClick);
         	             */   
//	            		            	         	     
         	                 
         	               // Graduation section - Selecting values:
         	                 WebDriverWait waitm = new WebDriverWait(driver, Duration.ofSeconds(10));
         	                 WebElement degreeDropdown = waitm.until(ExpectedConditions.elementToBeClickable(By.id("degree")));
         	                 Select degreeSelect = new Select(degreeDropdown);
         	                 degreeSelect.selectByVisibleText(degree);
         	                 JavascriptExecutor jsExecutorn = (JavascriptExecutor) driver;
         	                 jsExecutorn.executeScript("console.log('JavaScript executed after selecting an option');");
         	               
         	                 // Current Academic Year:  
         	                  WebDriverWait waitd = new WebDriverWait(driver, Duration.ofSeconds(10));
         	                  By dropdownLocator = By.cssSelector("#currentAcademicYear");
         	                  WebElement dropdownElement2x = waitd.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
         	                  new Select(dropdownElement2x).selectByValue(String.valueOf(currentAcademicYear));
         	                  dropdownElement2x.sendKeys(Keys.ENTER);
         	                  dropdownElement2x.sendKeys(Keys.TAB);
         	                  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement2x);

         	             
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
           
         	         

         	                 // District:
         	                 WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(10));
         	                 By dropdownLocator5 = By.id("district");
         	                 WebElement dropdownElement5 = waiti.until(ExpectedConditions.elementToBeClickable(dropdownLocator5));

         	                 Select districtSelect2 = new Select(dropdownElement5);
         	                 districtSelect2.selectByVisibleText(district);

         	                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement5);	                 
         	                
         	                 // Name of the institute:
                              
                              Thread.sleep(4000);
           		             WebElement inputField = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]"));

           		           // Create an Actions instance
           		             Actions actions = new Actions(driver);

           		           // Simulate pressing "Tab" and "Enter" keys sequentially
           		             actions.sendKeys(inputField, Keys.TAB).sendKeys(Keys.ENTER).sendKeys(" Bharati Vidyapeeth Pune ").perform();
           		      //       actions.sendKeys(Keys.ENTER);
                                     
         	              // Total course fees:
         	                 driver.findElement(By.id("tuitionFee")).sendKeys(String.valueOf(totalCourseFee));

         	                 // Passing Year:
         	                 Select passyear = new Select(driver.findElement(By.id("passingYear")));
         	                 passyear.selectByValue(String.valueOf(passingYear));

         	                 WebDriverWait waitnn = new WebDriverWait(driver, Duration.ofSeconds(10));

   // Wait for the button to be clickable
        	         	                 WebElement saveButton = waitnn.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='button'].btn")));

        	         	                  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveButton);

        	         	                  saveButton.click();
        	         
        	         	                 
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
 	                  
     	                  
//ADD Family : 
     	                WebDriverWait waitClickk = new WebDriverWait(driver, Duration.ofSeconds(10));
     	                  WebElement elementToClickk = waitClickk.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.familybtnsize")));
     	                                                                   
     	                  JavascriptExecutor jsExecutorClickk = (JavascriptExecutor) driver;
     	                  jsExecutorClickk.executeScript("arguments[0].click();", elementToClickk);
     	                 
     	                //  driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/a/article/span/span/i")).click();
     		                  
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
     	        	       
     	        	        //Qulification:
     	        	        WebDriverWait waitva = new WebDriverWait(driver, Duration.ofSeconds(20));
     	        	        WebElement relationElementa = waitva.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification\"]")));
     	        	    //  relationElementa.sendKeys(Keys.TAB);
     	        	    //  relationElementa.sendKeys(Keys.ENTER);
     	        	        JavascriptExecutor jsExecutorva = (JavascriptExecutor) driver;
     	        	        jsExecutorva.executeScript("arguments[0].scrollIntoView();", relationElementa);
     	        	        Select relationDropdownv = new Select(relationElementa);
     	        	        relationDropdownv.selectByVisibleText(Qualifi);
     	        	        jsExecutorva.executeScript("console.log('JavaScript executed after relation selection');");
     	        	        
     	        	        
                        //  Occupation : 
     	        	        WebElement occupationElement = waitva.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"occupation\"]")));
     	        	        JavascriptExecutor jsExecutorlp = (JavascriptExecutor) driver;
     	        	        jsExecutorlp.executeScript("arguments[0].scrollIntoView();", occupationElement);
     	        	        Select occupationDropdown = new Select(occupationElement);
     	        	        occupationDropdown.selectByVisibleText(occupation);
     	        	        jsExecutorlp.executeScript("console.log('JavaScript executed after occupation selection');");
     	                 
     	        	 //Save Button : 
     	        	        
     	        	        
     	        	        
     	        	               	        
     	        	 //Add Family : 
     	        	        
     	        	        
     	        	        
     			            
     	        	        
     	        	        
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
		  	            
     			  	            
     			  	            
     //Logout Section :
		  	            
		  	           WebElement elementToHover = driver.findElement(By.className("img-circle"));
		    	        Actions actions1 = new Actions(driver);

		    	        // Hover over the element and click it
		    	        actions1.moveToElement(elementToHover).click().perform();

		    	        // Create a new Actions object for sending keys
		    	        Actions keyboardActions = new Actions(driver);

		    	        // Send TAB and ENTER keys
		    	        keyboardActions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		  	        

		    	        
		    	        System.out.println("Uploaded Data:");
		    	        System.out.println("LoginType: " + loginType);
		    	        System.out.println("LoginValue: " + loginValue);
		    	        System.out.println("Password: " + password);
		    	        System.out.println("AlternateMobile: " + alternateMobile);
		    	        System.out.println("WhatsAppNumber: " + whatsappNumber);
		    	        System.out.println("Category: " + category);
		    	        System.out.println("AnnualFamilyIncome: " + annualFamilyIncome);
		    	        System.out.println("PersonsWithDisabilities: " + personsWithDisabilities);
		    	        System.out.println("ParentalStatus: " + Parentalstatus);
		    	        System.out.println("NumberOfSiblings: " + numberOfSiblings);

		    	        System.out.println("Graduation:");
		    	        System.out.println("Board: " + board);
		    	        System.out.println("Stream: " + stream);
		    	        System.out.println("InstituteType1: " + InstituteType1);
		    	        System.out.println("State1: " + state1);
		    	        System.out.println("District1: " + district1);
		    	        System.out.println("NameOfInstitute1: " + nameOfInstitute1);
		    	        System.out.println("PassingYear1: " + passingYear1);
		    	        System.out.println("MarksObtain: " + MarksObtain);
		    	        System.out.println("TotalMarks: " + TotalMarks);

		    	        System.out.println("Graduation:");
		    	        System.out.println("Degree: " + degree);
		    	        System.out.println("CurrentAcademicYear: " + currentAcademicYear);
		    	        System.out.println("CurrentAcademicSem: " + currentAcademicSem);
		    	        System.out.println("State: " + state);
		    	        System.out.println("District: " + district);
		    	        System.out.println("NameOfInstitute: " + nameOfInstitute);
		    	        System.out.println("TotalCourseFee: " + totalCourseFee);
		    	        System.out.println("PassingYear: " + passingYear);

		    	        System.out.println("Bank Information:");
		    	        System.out.println("AccountHolderName: " + accountholderName);
		    	        System.out.println("AccountNumber: " + accountnumber);
		    	        System.out.println("IFSCCode: " + ifscCode);

		    	        
		    	        
		    	        
		    
		  	            
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




	
	    
	        
	        
	        
	        
	        
	        
	        

	

}
