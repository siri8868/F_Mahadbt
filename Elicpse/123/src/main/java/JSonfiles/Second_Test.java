package JSonfiles;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class Second_Test {
	
	
	 public static void  main(String[] args) throws Exception {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	     // Open URL Of "Vidyasarthi"
	        driver.get("https://www.vidyasaarathi.co.in/Vidyasaarathi/index");

	         // Handle the PopUp
	        driver.findElement(By.xpath("//*[@id=\"modalSocial\"]/div/div/div[3]/a")).click();

	       //  Login to Vidyasarthi
	        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]/a")).click();

	        // Switch to the new page
	        String mainWindowHandle = driver.getWindowHandle();
	        for (String handle : driver.getWindowHandles()) {
	            if (!handle.equals(mainWindowHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        try {
	        	
	        	
	      //Read Data from json        
	        JSONParser parser = new JSONParser();
	        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\Second.json"));
            
	        for (Object obj : jsonArray) {
	            JSONObject userData = (JSONObject) obj;
               
	           
	            
	            
	            // Extract user data from JSON object
	            String email = (String) userData.get("email");
	            String password = (String) userData.get("password");
	            
            // Find the input fields using the specified paths and enter the values
	            
	            WebElement emailInput = driver.findElement(By.id("username"));
	            emailInput.sendKeys(email);

	            WebElement passwordInput = driver.findElement(By.name("password"));
	            passwordInput.sendKeys(password);
	            
	            
	            
	            Thread.sleep(13000);
	         // Submit the login form
	            WebElement submitButton = driver.findElement(By.id("login"));
	            submitButton.click();
	            Thread.sleep(3000);
	            //close button popup
	            driver.findElement(By.xpath("//*[@id=\"modalonlinetest\"]/div/div/div[2]/a")).click();
	            
	          
	            
	             //click on profile button 
	             driver.findElement(By.xpath("//*[@id=\"studentMenu\"]/li[3]/a")).click();
	             Thread.sleep(2000);
	           
	        
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

	            
	             

	/*            boolean isEntryIncomplete = true;  // Set the initial value based on your condition

	      	             if (isEntryIncomplete) {
	      	                 continue;  // Skip the current iteration if the entry is incomplete
	      	             }
	      	           try {
	      	             // Perform operations for the complete entry
	      	             System.out.println("Processing entry: " + userData);

	      	             // Locate and interact with the element
	      	             WebElement element = driver.findElement(By.xpath(".//*")); // Use XPath wildcard selector to locate any element
	      	             // Perform desired operations with the element
	      	             // ...

	      	         } catch (NoSuchElementException e) {
	      	             // Handle the exception when the locator is not found
	      	             System.out.println("Locator not found. Skipping this operation.");
	      	             continue;  // Skip the current iteration and move to the next entry
	      	         }     
	   */         
	           
	            
	            WebElement fullNameField = driver.findElement(By.id("fullName"));
	            fullNameField.sendKeys(name);
	            
	            
	            
	         // Locate the date picker input element
	            WebElement datePickerInput = driver.findElement(By.id("dateOfBirth"));

	            // Click on the date picker input to open the calendar
	            datePickerInput.click();

	            // Select the desired year
	            Select yearDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[1]")));
	            yearDropdown.selectByVisibleText("2022"); 

	            // Select the desired month
	            Select monthDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[2]")));
	            monthDropdown.selectByVisibleText("June");

	            // Select the desired day
	            WebElement desiredDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth_table\"]/tbody/tr[3]/td[4]/div"));
	            desiredDay.click();

	            
	            
	            
	            
	            
	            
	            

	            // Locate the date picker input element
	/*            WebElement datePickerInput = driver.findElement(By.id("dateOfBirth"));
	           
	            // Click on the date picker input to open the calendar
	            datePickerInput.click();

	            // Select the desired year
	            Select yearDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[1]")));
	            yearDropdown.selectByVisibleText(dateOfBirth); // Replace '2001' with the desired year

	            // Select the desired month
	            Select monthDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth_root\"]/div/div/div/div/div[1]/select[2]")));
	            monthDropdown.selectByVisibleText("August"); 

	            // Select the desired day
	            WebElement desiredDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth_table\"]/tbody/tr[3]/td[4]/div")); 
	            desiredDay.click();
*/
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
	            
	            //Save option 
	  //        driver.findElement(By.xpath("//*[@id=\"saveProfile\"]")).click();
	            
//*******************************************************************************************************
	            //Current Academic details
	            
	        driver.findElement(By.cssSelector("#headingFour .mb-0")).click();
	            
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));

	       
	        driver.findElement(By.cssSelector(".round:nth-child(1) .lever")).click();

	      
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	        String jsScript = "console.log('JavaScript executed successfully!');";

	        jsExecutor.executeScript(jsScript);

	    
	            
/////***********Course Level 
	        

	        WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(20));

	        WebElement element = wait0.until(ExpectedConditions.elementToBeClickable(By.id("currAcadCourseLevelId")));
	        element.click();

	        Select courselevel = new Select(driver.findElement(By.id("currAcadCourseLevelId")));
	        courselevel.selectByIndex(5);
	     
///*************Course name***********
	
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

	        try {
	            // Wait until the element with id "currAcadCourseName" is clickable
	            WebElement courseNameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("currAcadCourseName")));

	            // Scroll the element into view using JavaScriptExecutor
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].scrollIntoView();", courseNameInput);

	            // Interact with the element using Actions
	            String courseName = "B.C.A"; // Replace with the desired course name
	            courseNameInput.sendKeys(courseName);

	            // Simulate arrow down key press
	            Actions actions = new Actions(driver);
	            actions.sendKeys(courseNameInput, Keys.ARROW_DOWN).perform();

	            // Simulate Enter key press
	            actions.sendKeys(Keys.ENTER).perform();
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Handle the exception or add more specific conditions
	        }
	        
//***********Institute name	:
	       driver.findElement(By.id("currAcadInstituteName")).click(); 
	        WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));

	        try {
	        	
	            WebElement instituteNameInput = wait9.until(ExpectedConditions.elementToBeClickable(By.id("currAcadInstituteName")));

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].scrollIntoView();", instituteNameInput);

	            // Enter the institute name in the autocomplete field
	            String instituteName = "PROGRESSIVE EDUCATIONAL SOCIETYS MODERN COLLEGE OF ARTS, SCIENCE & COMMERCE , SHIVAJINAGAR,, PUNE 5";
	            js.executeScript("arguments[0].value = arguments[1];", instituteNameInput, instituteName);

	            // Wait for autocomplete suggestions to appear
	            WebDriverWait autocompleteWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            autocompleteWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".autocomplete-selected")));

	            // Click on the autocomplete suggestion
	            WebElement autocompleteSuggestion = driver.findElement(By.cssSelector(".autocomplete-selected"));
	            autocompleteSuggestion.click();
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Handle the exception or add more specific conditions
	        }
	        
	        driver.findElement(By.id("currAcadInstituteState")).click();
	                  
	            
	            driver.findElement(By.id("tutionFees")).click();
	            driver.findElement(By.id("tutionFees")).sendKeys("56787");
	            driver.findElement(By.id("nonTutionFees")).click();
	            driver.findElement(By.id("nonTutionFees")).sendKeys("00000");
	      
 // Total current fees 
	            driver.findElement(By.id("currentFees")).sendKeys("50000");  
//any other Scholarship :****************************	        
	            
	            
	            WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(13));

	            // Click on the first element using WebDriver
	            driver.findElement(By.cssSelector(".round:nth-child(1) .lever")).click();

	            // Execute JavaScript using JavaScriptExecutor
	            JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
	            String jsScript1 = "console.log('JavaScript executed successfully!');";
	            jsExecutor.executeScript(jsScript);

	            // Click on the second element using WebDriver
	            driver.findElement(By.cssSelector(".switch:nth-child(3) .lever")).click();

	            // Execute JavaScript for the second element
	            String jsScript2 = "console.log('Clicked the second element using JavaScript!');";
	            jsExecutor.executeScript(jsScript2);

	            driver.findElement(By.cssSelector(".switch:nth-child(3) .lever")).click();
	            driver.findElement(By.cssSelector(".switch:nth-child(3) .lever")).click();
	            driver.findElement(By.cssSelector(".label_otherScholarshipName")).click();
	            driver.findElement(By.id("otherScholarshipName")).sendKeys("Buddy4U");
	            driver.findElement(By.cssSelector(".label_otherScholarshipAmt")).click();
	            driver.findElement(By.id("otherScholarshipAmt")).sendKeys("20000");
	            
	
	            Thread.sleep(5000);
	            driver.findElement(By.id("saveProfileDiv")).click();
////////*****************************Educational Details :*************************************************************
	     
	            
	         driver.findElement(By.xpath("/html/body/div[8]/div/form/div[2]/div/div/div[4]/div[1]")).click();
                
///////************************Class 10 
	         
	            driver.findElement(By.xpath("/html/body/div[8]/div/form/div[2]/div/div/div[4]/div[2]/div/div[1]/div[1]/div[1]/div/div/input")).sendKeys("S.B.Dhavkhare");
	            Thread.sleep(4000);
	            
	            // State
	            Select state = new Select(driver.findElement(By.id("edu_state_other_384")));
	            state.selectByVisibleText("MAHARASHTRA");
	            
//*******************
	/*             
	         
	          //Month and Year of Passing:
	            driver.findElement(By.xpath("//*[@id=\"edu_year_of_passing_384\"]")).click();
	            
	         // Select the desired year
	            WebElement yearElement = driver.findElement(By.xpath("//div[@class='calendar']//span[contains(text(), '2017')]")); 
	            yearElement.click();
	            Thread.sleep(2000);
	            
	            // Locate the month dropdown
	            WebElement monthDropdown1 = driver.findElement(By.id("month")); 

	            // Select the desired month
	            Select month = new Select(driver.findElement(By.xpath("/html/body/div[15]/div[2]/table/tbody/tr/td/span[5]")));
	            month.selectByVisibleText("may"); 
	            Thread.sleep(10000);
*/	 
//**********************CGPA
	            try {
	                

	                // Find the checkbox element
	                WebElement markCheckbox = driver.findElement(By.id("marksCGPA_384"));

	                // Click the checkbox using JavaScript executor
	                JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
	                jsExecutor3.executeScript("arguments[0].click();", markCheckbox);
	            } catch (Exception e) {
	                e.printStackTrace();
	            } 
	            //Mark optain
	            driver.findElement(By.xpath("//*[@id=\"marksObtained_384\"]")).sendKeys("420");
	            Thread.sleep(2000);
	            //Out of Total Marks
	            driver.findElement(By.xpath("//*[@id=\"totalMarks_384\"]")).sendKeys("500");
	            driver.findElement(By.id("edu_percentage_marks_384")).click();
	            Thread.sleep(5000);
	            driver.findElement(By.xpath("//*[@id=\"saveProfile\"]"));           
	            
	            
//12 standard **********************************************************************************************
	            driver.findElement(By.xpath("//*[@id=\"edu_name_of_institute_other_386\"]")).sendKeys("Lrg Palande College");
	            Thread.sleep(2000);
	            // State
	              Select state1 = new Select(driver.findElement(By.id("edu_state_other_386")));
	              state1.selectByIndex(9);
	              Thread.sleep(2000);
	          /*    
	            //Month and Year of Passing:
	              driver.findElement(By.xpath("//*[@id=\"edu_year_of_passing_386\"]")).click();
	              Thread.sleep(2000);
	              // Select the desired year
	              WebElement yearElement1 = driver.findElement(By.xpath("//div[@class='calendar']//span[contains(text(), '2019')]")); // Replace "2023" with the desired year
	              yearElement1.click();                                 
	              Thread.sleep(2000);
	              // Select the desired month
	              Select month1 = new Select(driver.findElement(By.xpath("/html/body/div[15]/div[2]/table/tbody/tr/td/span[5]")));
	              month1.selectByVisibleText("may"); 
	              Thread.sleep(2000);
	              */
	              
	              //CGPA = Mark
	              
	              try {
		                

		                // Find the checkbox element
		                WebElement markCheckbox = driver.findElement(By.id("marksCGPA_386"));

		                // Click the checkbox using JavaScript executor
		                JavascriptExecutor jsExecutor4 = (JavascriptExecutor) driver;
		                jsExecutor4.executeScript("arguments[0].click();", markCheckbox);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
	              WebElement mark1 = driver.findElement(By.xpath("//*[@id=\"pastEduDtlsDiv_386\"]/div[4]/div[2]/div/label")); 
	              mark1.click();
	              Thread.sleep(2000);
	              //Mark optain
	              driver.findElement(By.id("marksObtained_386")).sendKeys("360");
	              Thread.sleep(2000);
	              //Out of Total Marks
	              driver.findElement(By.id("totalMarks_386")).sendKeys("500");
	              
                  driver.findElement(By.id("edu_percentage_marks_386")).click();
                  Thread.sleep(5000);
//Diploma***********************************************************************************	            
         /*         try {
                	    WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));

                	    // Locate the input element
                	    WebElement instituteNameInput = wait5.until(ExpectedConditions.elementToBeClickable(By.id("edu_name_of_institute_3")));

                	    // Scroll the element into view using JavaScriptExecutor
                	    JavascriptExecutor js = (JavascriptExecutor) driver;
                	    js.executeScript("arguments[0].scrollIntoView();", instituteNameInput);

                	    // Click on the input element to focus
                	    instituteNameInput.click();

                	    // Enter the institute name in the input field
                	    String instituteName = "other";
                	    instituteNameInput.sendKeys(instituteName);

                	    // Create an Actions object
                	    Actions actions = new Actions(driver);

                	    // Simulate arrow down key press to select the "Other" option
                	    actions.sendKeys(Keys.ARROW_DOWN).perform();
                	    
                	    // Add a sleep for a delay
                	    Thread.sleep(5000); 

                	    // Simulate Enter key press to confirm selection
                	    actions.sendKeys(Keys.ENTER).perform();
                	} catch (Exception e) {
                	    e.printStackTrace();
                	}

// Name of the Institute *************************************               
                 driver.findElement(By.id("edu_name_of_institute_other_3")).sendKeys("PROGRESSIVE EDUCATIONAL SOCIETYS MODERN COLLEGE OF ARTS, SCIENCE & COMMERCE , SHIVAJINAGAR,, PUNE 5");  
// State ********************
                 driver.findElement(By.id("edu_state_3")).click();
//Month And Year :*************************
  */               
//CGPA And Marks :**********************************
                 
                 try {
 	                

 	                // Find the checkbox element
 	                WebElement markCheckbox = driver.findElement(By.xpath("//*[@id=\"pastEduDtlsDiv_3\"]/div[6]/div[2]/div"));

 	                // Click the checkbox using JavaScript executor
 	                JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
 	                jsExecutor3.executeScript("arguments[0].click();", markCheckbox);
 	            } catch (Exception e) {
 	                e.printStackTrace();
 	            } 
 	            //Mark optain
 	            driver.findElement(By.id("marksObtained_3")).sendKeys("678");
 	            Thread.sleep(2000);
 	            //Out of Total Marks
 	            driver.findElement(By.id("totalMarks_3")).sendKeys("800");
 	            driver.findElement(By.id("edu_percentage_marks_3")).click();
 	            Thread.sleep(5000);
                 
//Graduation *************************************************************************************************
// 	     Name of the institute 
 	           driver.findElement(By.id("edu_name_of_institute_4")).click(); 
 		        WebDriverWait wait90 = new WebDriverWait(driver, Duration.ofSeconds(20));

 		        try {
 		            WebElement instituteNameInput = wait90.until(ExpectedConditions.elementToBeClickable(By.id("edu_name_of_institute_4")));

 		            JavascriptExecutor js = (JavascriptExecutor) driver;
 		            js.executeScript("arguments[0].scrollIntoView();", instituteNameInput);

 		            // Enter the institute name in the autocomplete field
 		            String instituteName = "PROGRESSIVE EDUCATIONAL SOCIETYS MODERN COLLEGE OF ARTS, SCIENCE & COMMERCE , SHIVAJINAGAR,, PUNE 5";
 		            js.executeScript("arguments[0].value = arguments[1];", instituteNameInput, instituteName);

 		            // Wait for autocomplete suggestions to appear
 		            WebDriverWait autocompleteWait = new WebDriverWait(driver, Duration.ofSeconds(10));
 		            autocompleteWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".autocomplete-selected")));

 		            // Click on the autocomplete suggestion
 		            WebElement autocompleteSuggestion = driver.findElement(By.cssSelector(".autocomplete-selected"));
 		            autocompleteSuggestion.click();
 		        } catch (Exception e) {
 		            e.printStackTrace();
 		            
 		        }

 		        WebDriverWait wait901 = new WebDriverWait(driver, Duration.ofSeconds(10));
 		        driver.findElement(By.id("edu_state_4")).click();
 		        
                  
     //Month and year of passing :
 		        
                  
                  
                  
    //CGPA And Marks ********************
 		       try {
	                

	                // Find the checkbox element
	                WebElement markCheckbox = driver.findElement(By.xpath("//*[@id=\"pastEduDtlsDiv_4\"]/div[6]/div[2]/div/label"));

	                // Click the checkbox using JavaScript executor
	                JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
	                jsExecutor3.executeScript("arguments[0].click();", markCheckbox);
	            } catch (Exception e) {
	                e.printStackTrace();
	            } 
	            //Mark optain
	            driver.findElement(By.id("marksObtained_4")).sendKeys("600");
	            Thread.sleep(2000);
	            //Out of Total Marks
	            driver.findElement(By.id("totalMarks_4")).sendKeys("800");
	            driver.findElement(By.id("edu_percentage_marks_4")).click();
	            Thread.sleep(5000);
                  
                  
                  
	            
	        
	         
	            
	            driver.findElement(By.xpath("//*[@id=\"studentMenu\"]/li[8]/a")).click();
	            // Output the uploaded data
	            System.out.println("Uploaded Data:");
	            System.out.println("Email: " + email);
	            System.out.println("Password: " + password);
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
	        }
	       
	     
	        catch (NoSuchElementException e) {
	            // Handle the exception when the locator is not found
	            System.out.println("Locator not found. Skipping this operation.");
	        }
	        driver.findElement(By.xpath("//*[@id=\"studentMenu\"]/li[8]/a")).click();
	        //driver.quit();
			
	    }

		private static Object getMonthName(String string) {
			// TODO Auto-generated method stub
			return null;
		}

	        
     }
  