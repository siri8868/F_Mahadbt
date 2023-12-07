package JSonfiles;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.openqa.selenium.interactions.Actions;
import java.io.FileReader;
import java.time.Duration;
import java.util.function.Function;


public class HDFC_UnderGraduate_Program {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	    
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
//URL	   
	        driver.get("https://www.buddy4study.com/application/HDFC45/instruction");
//PopUp
	        
	        try {

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        	
	            WebElement noThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
	            noThanksButton.click();
	        } catch (Exception e) {
	            // Handle exception if the button is not found or clickable
	            e.printStackTrace();
	        }
	        Thread.sleep(2000);
	        
//Click on Apply Now button :
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[1]/section/article[2]/article/button[1]")).click();

// Login Button :  		   
	      
		    //  Login : 
	      //  driver.findElement(By.xpath("/html/body/div[1]/section/main/article/article/article/button[2]")).click();
	           // driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();
		    //Email
	            
	       //   WebElement loginField = driver.findElement(By.id("emailid"));
	        //    loginField.sendKeys("8793776646");
	      //    driver.findElement(By.className("loginWithMobileEmailPopup_formLabelControl__2GB42")).click();
	         //  driver.findElement(By.className("loginWithMobileEmailPopup_formLabelControl__2GB42")).sendKeys("8793776646");
		    //   driver.findElement(By.id("emailid")).click();
	        
	        
	        
	        
	           driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/article/article/article/button[3]")).click();
		       driver.findElement(By.id("emailid")).sendKeys("0k4k7d8j@wuuvo.com");
		   
		       
		       // Password:
		          driver.findElement(By.cssSelector(".authpopup_overLay__3--dT")).click();
		          driver.findElement(By.id("password")).sendKeys("Samrudhi@123");
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

	//This is the code For the clicking on Start  application : 	          
		          
		          
		       
//Click on Start Application : 
		          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));

		       
		         WebElement startApplicationButton = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class='applicationInstructions_ctrlWrapper__17X1G']//button[contains(text(),'START APPLICATION')]")));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startApplicationButton);

		 /*         
		          WebDriverWait waitb = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		          // First dropdown
		          WebElement firstDropdown = waitb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[1]//select[@name='option']")));
		         Select select1 = new Select(firstDropdown);
		          select1.selectByVisibleText("Yes"); 
		          
		                
		          // Second dropdown:
		          WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));

		          // Wait until the dropdown is visible and clickable
		          WebElement dropdownElement = wait7.until(ExpectedConditions.elementToBeClickable(By.id("option")));

		          // Create a JavascriptExecutor instance
		          JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;

		          // Scroll the dropdown into view using JavaScript
		          jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", dropdownElement);

		          // Create a Select object to interact with the dropdown
		          Select dropdown = new Select(dropdownElement);

		          // Select an option by its visible text
		          dropdown.selectByVisibleText("Yes");
        
		     //     Third dropdown
		          WebElement ThirdDropdown = wait9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[3]//select[@name='option']")));
		          Select select3 = new Select(ThirdDropdown);
		          select3.selectByVisibleText("Yes");  
		          
		     //Thread.sleep(4000);
	         
// Check availability :
		          driver.findElement(By.className("scholarshipEligibility_btn__3dNzB")).click();
		          
//You are eligible : 		          
		          
		          driver.findElement(By.className("swal-button swal-button--continue")).click();
		          
//**********Now fill Up the data as per required :
	*/
//Alternate mobile number:
		          WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(10));
		          WebElement alternateMobileElement = waitr.until(ExpectedConditions.visibilityOfElementLocated(By.id("alternateMobile")));
		          alternateMobileElement.sendKeys("7898765690");
		          
//whatapp number:
		          WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(10));
		          WebElement WhatappNo = waittt.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatsAppMobile")));
		          WhatappNo.sendKeys("8788379686");
		          
		          
		          
//Date Of Birth : 
		         driver.findElement(By.id("dob")).sendKeys("07/03/2001");
		          
	//Adhar card :
		         driver.findElement(By.xpath("//*[@id=\"aadharCard\"]")).sendKeys("222222444444");
		          
//Anual Income:	
		      /*   
		          try {
		             
		              
		              // Find the input element and initial value
		              WebElement inputElement = driver.findElement(By.id("familyIncome"));
		              int initialValue = Integer.parseInt(inputElement.getAttribute("value"));
		              
		              // Find the increment and decrement buttons
		              WebElement incrementButton = driver.findElement(By.xpath("//article[@class='form-group']//button[contains(text(), '+')]"));
		          //    WebElement decrementButton = driver.findElement(By.xpath("//article[@class='form-group']//button[contains(text(), '-')]"));
		              
		              // Click the increment button
		              incrementButton.click();
		              
		              // Wait for any changes to take effect (you can add explicit waits here if needed)
		            //  Thread.sleep(1000);
		              
		              // Get the updated value
		              int updatedValue = Integer.parseInt(inputElement.getAttribute("value"));
		              
		              // Click the decrement button
		       //       decrementButton.click();
		              
		              // Wait for any changes to take effect (you can add explicit waits here if needed)
		              Thread.sleep(1000);
		              
		              // Get the final value
		              int finalValue = Integer.parseInt(inputElement.getAttribute("value"));
		              
		              // Print the results
		              System.out.println("Initial Value: " + initialValue);
		              System.out.println("Updated Value: " + updatedValue);
		              System.out.println("Final Value: " + finalValue);
		              
		          } catch (Exception e) {
		              e.printStackTrace();
		          } 
		          
		     */     
		          
		          
		          
		          
		          driver.findElement(By.id("familyIncome")).click();
		          driver.findElement(By.id("familyIncome")).sendKeys("50000");
		          
		         
		      /*    
		          
		          // Create a WebDriverWait instance with a timeout of 10 seconds
		          WebDriverWait waity = new WebDriverWait(driver, Duration.ofSeconds(10));

		          // Wait for the "familyIncome" element to be clickable, then click on it
		          WebElement familyIncomeButton = waity.until(ExpectedConditions.elementToBeClickable(By.id("familyIncome")));
		          familyIncomeButton.click();

		          // Wait for the "familyIncome" dropdown element to be present and then select the option by value
		          WebElement familyIncomeDropdown = waity.until(ExpectedConditions.presenceOfElementLocated(By.id("familyIncome")));
		          Select Anualincome = new Select(familyIncomeDropdown);
		          Anualincome.selectByValue("50000"); 

		          // Use JavaScript executor to perform any additional actions if needed
		          JavascriptExecutor jsExecutori = (JavascriptExecutor) driver;
		          // Example: Scroll down to the bottom of the page
		          jsExecutori.executeScript("window.scrollTo(0, document.body.scrollHeight)");
*/
		          
		          
		     /*     
		          try {
		         
                      
		              WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		              // Wait for the element to be visible
		              WebElement element = waitt.until(ExpectedConditions.elementToBeClickable(By.id("familyIncome")));
		              
		              // Use JavaScript Executor to set the value of the element
		              JavascriptExecutor jsExecutorr = (JavascriptExecutor) driver;
		              jsExecutorr.executeScript("arguments[0].value = '49999';", element);
 
		              
		          } catch (Exception e) {
		              e.printStackTrace();
		          }  
		          
		 */ 
		          
		          
// This data is for Disability is yes then next option is that : 		          
		          
		          
	/*	          
		          // Create a WebDriverWait instance with a timeout of 10 seconds
		          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

		          // Wait for the "disabled" element to be present and then select it by index
		          WebElement disabledDropdown = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("disabled")));
		          Select s = new Select(disabledDropdown);
		          s.selectByIndex(1);

		          // Wait for the "disabilityType" element to be present and then select it by index
		          WebElement disabilityTypeDropdown = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("disabilityType")));
		          Select stype = new Select(disabilityTypeDropdown);
		          stype.selectByIndex(1);

		          // Wait for the "disabilityPercent" element to be present and then select it by visible text
		          WebElement disabilityPercentDropdown = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("disabilityPercent")));
		          Select percentage = new Select(disabilityPercentDropdown);
		          percentage.selectByVisibleText("75%");

		          // Find the "disabilityDescription" element, wait for it to be clickable, and then enter the description
		          WebElement disabilityDescriptionInput = wait1.until(ExpectedConditions.elementToBeClickable(By.id("disabilityDescription")));
		          disabilityDescriptionInput.sendKeys("I can't able to hear properly");

		          // Use JavaScript executor to perform any additional actions if needed
		          JavascriptExecutor jsExecutorr = (JavascriptExecutor) driver;
		          // Example: Scroll down to the bottom of the page
		          jsExecutorr.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		          
		*/          
		          
		          
		          
		          
		          
	          
		          
//Person with Disability : 
			       
		          Select s1 = new Select(driver.findElement(By.id("disabled")));
		          s1.selectByIndex(2);
		          /*
//Disability Type 
		          Select stype = new Select(driver.findElement(By.id("disabilityType")));
		          stype.selectByIndex(1);
//Disability Percentage :
		          Select percentage = new Select(driver.findElement(By.id("disabilityPercent")));
		          percentage.selectByVisibleText("75%");
//   Disability Discribtion : 
		          driver.findElement(By.id("disabilityDescription")).sendKeys("I can't able to here properlly");
		          
*/		          
//*********************************************************************************************************************************************
//Disability is No then 		          
	/*	          WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds
		            
		            WebElement disabledElement = waitA.until(ExpectedConditions.elementToBeClickable(By.id("disabled")));
		            
		            // Perform a click using JavascriptExecutor
		            JavascriptExecutor jsExecutorA = (JavascriptExecutor) driver;
		            jsExecutorA.executeScript("arguments[0].click();", disabledElement);
		            WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("disabled")));
		            
		            Select dis = new Select(dropdownElement);
		            dis.selectByIndex(2);
	*/	            
		/*   add this in your main code        
		          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		          try {
		              // Check if the disability is "yes"
		              WebElement disabledField = driver.findElement(By.id("disabled"));
		              String disabilityValue = disabledField.getAttribute("value");

		              if (disabilityValue.equals("yes")) {
		                  // Execute code when disability is "yes"
		                  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("familyIncome")));
		                  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		                  jsExecutor.executeScript("arguments[0].value = '50000';", element);
		              } else {
		                  // Execute code when disability is not "yes"
		                  Select dis = new Select(driver.findElement(By.id("disabled")));
		                  dis.selectByIndex(3);
		              }

		              // ... rest of your code ...
		          } catch (Exception e) {
		              e.printStackTrace();
		          }
		          
		*/          
		          	          
// Parental Status  :
		     //     Select parentstatus = new Select(driver.findElement(By.id("otherPersonalDetails")));
		     //     parentstatus.selectByIndex(2);		
		          
		            WebDriverWait waitF = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		            WebElement Parentalst = waitF.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"otherPersonalDetails\"]")));

		            // Perform a click using JavascriptExecutor
		            JavascriptExecutor jsExecutorB = (JavascriptExecutor) driver;
		            jsExecutorB.executeScript("arguments[0].click();", Parentalst);

		            // Wait for the dropdown element to be visible (using its unique XPath)
		            WebElement dropdownElementx = waitF.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='otherPersonalDetails']")));

		            Select Pstatus = new Select(dropdownElementx);
		            Pstatus.selectByIndex(2);

		          
		          
		    
		          
//Number of Sibiling :
		          Select nosibling = new Select(driver.findElement(By.id("siblingsNo")));
		          nosibling.selectByIndex(3);	
		          
		          
	//*******************************************************************************
//Permanent address:
//Address line :		          
		          
		          driver.findElement(By.id("addressLine")).sendKeys("Latur ");
//State : 
		          Select state = new Select(driver.findElement(By.id("state")));
		          state.selectByVisibleText("Maharashtra");
		          
//	District :
		          WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		          WebElement districtDropdown = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("district")));

		            // Create a Select object for the dropdown
		            Select districtSelect = new Select(districtDropdown);

		            // Select "Pune" from the dropdown by visible text
		            districtSelect.selectByVisibleText("Latur");
		      //    Select dis = new Select(driver.findElement(By.id("district")));
		     //     dis.selectByVisibleText("Pune");
		          
// City , Town :
		          driver.findElement(By.id("city")).sendKeys("latur ");
		          
// PinCode :  
		          driver.findElement(By.id("pincode")).sendKeys("412115");    
		          
//Save Button : It Should Select Save button and nevigating to next page 
		         //driver.findElement(By.className("btn  pull-right")).click();
		         
		          WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds
		            
		            // Wait for the element to be clickable
	              WebElement buttonElement = waitB.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[1]/section/article/article[9]/article/input")));
		            
		            // Click the element using JavascriptExecutor
		            JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
	           jsExecutorc.executeScript("arguments[0].click();", buttonElement);    
		   //    Thread.sleep(2000);  
	//*********************************************************************************************************************	            
// Education Details : 
//Click on graduation tab : 
	           
	           
	           
	           WebDriverWait waitd = new WebDriverWait(driver, Duration.ofSeconds(30));

	           try {
	               // Wait for the article element with class "heading topborder" to be clickable before clicking
	               WebElement element = waitd.until(ExpectedConditions.elementToBeClickable(By.cssSelector("article.heading.topborder")));
	               
	               // Click the element using WebDriver's click() method
	               element.click();
	               
	               // Optionally, execute JavaScript after clicking the element
	               JavascriptExecutor jsExecutord = (JavascriptExecutor) driver;
	               jsExecutord.executeScript("console.log('JavaScript executed after clicking');");
	           } catch (Exception e) {
	               e.printStackTrace();
	           }
		       
		       
		       
		     
	           
	      /*    
	           WebDriverWait waito = new WebDriverWait(driver, Duration.ofSeconds(30));
	            
	           // Wait for the element to be clickable before clicking
	            WebElement element = waito.until(ExpectedConditions.elementToBeClickable(By.className("article.heading.topborder")));
	            
	            // Click the element using JavaScript Executor
	            clickElementWithJavaScript(driver, element);
	            
	            // Optionally, execute JavaScript after clicking the element
	            JavascriptExecutor jsExecutorm = (JavascriptExecutor) driver;
	            jsExecutorm.executeScript("console.log('JavaScript executed after clicking');");
	       */
	       
// next filling data : 
//      Degree : 
	            
	            WebDriverWait waitm = new WebDriverWait(driver, Duration.ofSeconds(10));
	            
	            // Find the degree dropdown element and wait for it to be clickable
	            WebElement degreeDropdown = waitm.until(ExpectedConditions.elementToBeClickable(By.id("degree")));
	            
	            // Create a Select object for the dropdown
	            Select degreeSelect = new Select(degreeDropdown);
	            
	            // Select "B.Sc" option using visible text
	            degreeSelect.selectByVisibleText("B.Sc");
	            
	            // Optionally, execute JavaScript after selecting the option
	            JavascriptExecutor jsExecutorn = (JavascriptExecutor) driver;
	            jsExecutorn.executeScript("console.log('JavaScript executed after selecting an option');");

// Course Duration:
	            
		           
		           WebDriverWait waitx = new WebDriverWait(driver, Duration.ofSeconds(10));
		           By dropdownLocator1 = By.id("courseDuration");

		           WebElement dropdownElement2 = waitx.until(ExpectedConditions.elementToBeClickable(dropdownLocator1));
		           Select durationDropdown = new Select(dropdownElement2);
		           durationDropdown.selectByIndex(3);
		           
// Institute Type : 
		           Select IType = new Select(driver.findElement(By.id("instituteTypeId")));
		           IType.selectByIndex(3);
		           
//Current Accedmic year : 
		           Select CurrYear = new Select(driver.findElement(By.id("currentAcademicYear")));
		           CurrYear.selectByIndex(3);
//Current Acedmic Sem :
		           Select Acsem = new Select(driver.findElement(By.id("currentAcademicSem")));
		           Acsem.selectByIndex(6);
// State : 
		           Select statee = new Select(driver.findElement(By.id("state")));
		           statee.selectByVisibleText("Maharashtra");
		           
// District : 
		           Select diss = new Select(driver.findElement(By.id("district")));
		           diss.selectByVisibleText("Pune");
		           
//Name of the institute : 
                   Thread.sleep(2000);
		           WebElement inputField = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]"));

		           // Create an Actions instance
		           Actions actions = new Actions(driver);

		           // Simulate pressing "Tab" and "Enter" keys sequentially
		           actions.sendKeys(inputField, Keys.TAB).sendKeys(Keys.ENTER).sendKeys("Bharati Vidyapeeth, Pune").perform();

		 
		
// Total course fees : 
		           driver.findElement(By.id("admissionFee")).sendKeys("60000");
		           
//Passing Year : 
		           Select passyear = new Select(driver.findElement(By.id("passingYear")));
		           passyear.selectByValue("2023");
		           
// Save button : 
//		           driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/section[2]/article/article/article/input")).click();		           
		           
		       //    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/section[2]/article/article/article/input")).click();
		           
// Click On Save button : 
		    //       driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article[2]/section/form/article[4]/article/input[1]")).click();
	//***************************************************************************************************
	//Class 12 : 
		           
	//	           Thread.sleep(2000);
//		           driver.findElement(By.id("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[2]")).click();
		         
//Board : 
		           WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
		            WebElement boardElement = waitz.until(ExpectedConditions.presenceOfElementLocated(By.id("board")));

		            // Use JavaScript Executor to scroll to the element
		            JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
		            jsExecutorz.executeScript("arguments[0].scrollIntoView();", boardElement);

		            // Create a Select instance and select an option by visible text
		            Select board = new Select(boardElement);
		            board.selectByVisibleText("Maharashtra Board");

		            // Optionally, execute JavaScript after the selection
		            jsExecutorz.executeScript("console.log('JavaScript executed after selection');");
		       
		           
		           
		           
		           
		         
		           
//Stream : 
		            WebDriverWait waitu = new WebDriverWait(driver, Duration.ofSeconds(30));
		            WebElement streamElement = waitu.until(ExpectedConditions.presenceOfElementLocated(By.id("stream")));

		            // Use JavaScript Executor to scroll to the element
		            JavascriptExecutor jsExecutoru = (JavascriptExecutor) driver;
		            jsExecutoru.executeScript("arguments[0].scrollIntoView();", streamElement);

		            // Create a Select instance and select an option by visible text
		            Select stream = new Select(streamElement);
		            stream.selectByVisibleText("PCB");
		            // Optionally, execute JavaScript after the selection
		            jsExecutoru.executeScript("console.log('JavaScript executed after selection');");
		     
		            
		            
		            
		     //      Select stream = new Select(driver.findElement(By.id("stream")));
		    //       stream.selectByVisibleText("PCMB");
		           
// Institute Type : 
		           Select type= new Select(driver.findElement(By.id("instituteTypeId")));
		           type.selectByIndex(3);
//State : 
		           Select statex= new Select(driver.findElement(By.id("state")));
		           statex.selectByVisibleText("Maharashtra");
//District : 
		           
		           Select dist = new Select(driver.findElement(By.id("district")));
		           dist.selectByVisibleText("Pune");
//Name of the institute : 
		           driver.findElement(By.id("instituteName")).sendKeys("LRD Palande College Pune ");
//Passing Year : 
		           Select year = new Select(driver.findElement(By.id("passingYear")));
		           year.selectByVisibleText("2024");
		           
		           		           
// Mark obtain : 
		  //         driver.findElement(By.id("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[2]/article[2]/section/form/article[2]/article[2]/span[1]/label/span")).click();
		           
		           
//Grade : 
		       //    Select grade = new Select(driver.findElement(By.id("grade")));
		       //    grade.selectByIndex(2);
// mark : Mark Obtain :
		           
		           WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
		            WebElement inputFields = waits.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#marksObtained")));

		            // Use JavaScript Executor to scroll to the element
		            JavascriptExecutor jsExecutors = (JavascriptExecutor) driver;
		            jsExecutors.executeScript("arguments[0].scrollIntoView();", inputFields);

		            // Enter text into the input field
		            inputFields.sendKeys("392");

		            // Optionally, execute JavaScript after entering text
		            jsExecutors.executeScript("console.log('JavaScript executed after entering text');");
		      
		           
		     
//Mark Total mark Obtain : 
		           driver.findElement(By.id("totalMarks")).sendKeys("600");
		           
// Save button 
		      //     driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[2]/article[2]/section/form/article[4]/article/input[1]")).click();
// Popup 
// Save button : 
//			       driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/section[2]/article/article/article/input")).click();		           
			 		           
		           
		           
// *****************************************************************************************************
		        // Family member : 
		           /*
		           try {
		               WebDriverWait waitg = new WebDriverWait(driver, Duration.ofSeconds(20));
		               JavascriptExecutor jsExecutorg = (JavascriptExecutor) driver;

		             

		               // Scroll to the "Add Family +" link using JavaScript
		               WebElement addButton = waitg.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("article.col-md-12 a.btn.familybtnsize.pull-left")));
		               jsExecutorg.executeScript("arguments[0].scrollIntoView();", addButton);

		               // Wait for the element to be clickable and then click it
		               wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();

		               // Optionally, execute JavaScript after clicking the link
		               jsExecutorg.executeScript("console.log('JavaScript executed after clicking link');");

		           } catch (Exception e) {
		               e.printStackTrace();
		           } 
		           
		           */
		 
		           
		        // Name :   
		           WebDriverWait waitk = new WebDriverWait(driver, Duration.ofSeconds(30));
		            WebElement inputFieldk = waitk.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#name")));

		            // Use JavaScript Executor to scroll to the element
		            JavascriptExecutor jsExecutork = (JavascriptExecutor) driver;
		            jsExecutork.executeScript("arguments[0].scrollIntoView();", inputFieldk);

		            // Enter text into the input field
		            inputFieldk.sendKeys("ram gajbar");

		            // Optionally, execute JavaScript after entering text
		            jsExecutork.executeScript("console.log('JavaScript executed after entering text');");
		      
		        //Mobile : 
		        		           driver.findElement(By.id("mobile")).sendKeys("8767898760");
		        // Anual income :
		        		           driver.findElement(By.id("absoluteIncome")).sendKeys("50000");

		                       
		        		           
		        		           WebDriverWait waitE = new WebDriverWait(driver, Duration.ofSeconds(10));

		        		           By dropdownLocatorr = By.id("courseDuration");
		        		           WebElement dropdownElementt = waitE.until(ExpectedConditions.elementToBeClickable(dropdownLocatorr));

		        		           Select durationDropdownn = new Select(dropdownElementt);
		        		           durationDropdownn.selectByIndex(3);

		        		           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdownElementx);
		        		           ((JavascriptExecutor) driver).executeScript("arguments[0].selectedIndex = 3;", dropdownElementx);
		
		        		           Thread.sleep(10000);
		        		           
		          // Relation :
		        		           
		        		           try {
		        		               WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(20));
		        		               WebElement relationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[5]/article/select")));

		        		               // Simulate pressing the "Tab" key
		        		               relationElement.sendKeys(Keys.TAB);

		        		               // Simulate pressing the "Enter" key
		        		               relationElement.sendKeys(Keys.ENTER);

		        		               // Use JavaScript Executor to scroll to the element
		        		               JavascriptExecutor jsExecutorv = (JavascriptExecutor) driver;
		        		               jsExecutorv.executeScript("arguments[0].scrollIntoView();", relationElement);

		        		               // Create a Select instance and select an option by visible text
		        		               Select relation = new Select(relationElement);
		        		               relation.selectByVisibleText("Father");

		        		               // Optionally, execute JavaScript after the selection
		        		               jsExecutorv.executeScript("console.log('JavaScript executed after selection');");

		        		           } catch (Exception e) {
		        		               e.printStackTrace();
		        		           }
 		        		         
		        		           
		        		      /*     driver.findElement(By.id("relation")).click();
		        		           Select relation = new Select(driver.findElement(By.id("relation")));
		        		           relation.selectByVisibleText("Father");
		        		       */ 
		        		       //    Thread.sleep(2000);
		        //Occupation : 
		        		           
		        		           try {
		        		               WebDriverWait waitl = new WebDriverWait(driver, Duration.ofSeconds(20));
		        		               JavascriptExecutor jsExecutorl = (JavascriptExecutor) driver;

		        		               WebElement relationElement = waitl.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[6]/article/select")));

		        		               // Simulate pressing the "Tab" key
		        		               relationElement.sendKeys(Keys.TAB);

		        		               // Simulate pressing the "Enter" key
		        		               relationElement.sendKeys(Keys.ENTER);

		        		               // Use JavaScript Executor to scroll to the element
		        		               jsExecutorl.executeScript("arguments[0].scrollIntoView();", relationElement);

		        		               // Create a Select instance for occupation and select an option by visible text
		        		               WebElement occupationElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("occupation")));
		        		               Select occupation = new Select(occupationElement);
		        		               occupation.selectByVisibleText("Farmer");

		        		               // Optionally, execute JavaScript after the occupation selection
		        		               jsExecutorl.executeScript("console.log('JavaScript executed after occupation selection');");

		        		           } catch (Exception e) {
		        		               e.printStackTrace();
		        		           }
		        		           
		        		           
		        		 
		        		           
		        		           /*
		        		           
		        		           Select occupation = new Select(driver.findElement(By.id("occupation")));
		        		           occupation.selectByVisibleText("Farmer");
		        		          */ 
		        		           
		        //Save button :
		        		 //          driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[2]/article/input")).click();
		        		           
	
		           
		 /*          
		           try {
		               JSONParser parser = new JSONParser();
		               Object obj = parser.parse(new FileReader("data.json"));
		               JSONObject jsonObject = (JSONObject) obj;

		               // Assuming your JSON file contains an array of objects
		               JSONArray entries = (JSONArray) jsonObject.get("entries");
		               
		               for (Object entryObj : entries) {
		                   JSONObject entry = (JSONObject) entryObj;

		                
		                   
		                   // Populate data from JSON into fields
		                   driver.findElement(By.id("name")).sendKeys((String) entry.get("name"));
		                   driver.findElement(By.id("mobile")).sendKeys((String) entry.get("mobile"));
		                   // Populate other fields similarly

		                   // Wait for dropdown and select an option
		                   WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("courseDuration")));
		                   Select durationDropdown1 = new Select(dropdownElement);
		                   durationDropdown1.selectByIndex(3);

		                   // Populate other dropdowns and interact with fields
		                   
		                   // Click the Save button
		                   driver.findElement(By.xpath("xpath_for_save_button")).click();
		                   
		                   // Add necessary delays or waits for the next iteration
		                   Thread.sleep(2000);
		               }
		           } catch (Exception e) {
		               e.printStackTrace();
		           } 
		           
		           
		 */    
		        		           pauseForManualInteraction(driver);
		        		           
		        		           
		        		          
		   	//	Thread.sleep(40000);
		        		           
		        		           
		        		           
// After saving this they will ask for next family memeber so here what i have to do is put this family code in loop and give the data from json file .		           
//*********************************************************************************************************************
// Document Section : 
	/*	        		           
		           driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/a/article")).click();
//Document Upload : Passport Size Photograph
		           // Locate the file upload input element
		            WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[1]/article/article[2]/article"));

		            // Specify the local file path to upload
		            String filePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\PassportSize_Photo.jpeg";

		            // Set the file path value to the file input element
		            fileInput.sendKeys(filePath);

//	Adhar card : 	  
		         // Locate the file upload input element
		            WebElement fileInput1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[2]/article/article[2]/article/label"));

		            // Specify the local file path to upload
		            String filePath1 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Aharcard.webp";

		            // Set the file path value to the file input element
		            fileInput1.sendKeys(filePath1);
		           
//Admission Letter :		           
//		            Locate the file upload input element
/*		            WebElement fileInput2 = driver.findElement(By.className(""));

		            // Specify the local file path to upload
		            String filePath2 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Admission Letter.png";

		            // Set the file path value to the file input element
		            fileInput2.sendKeys(filePath2);
*/		           
// Family Income Proof: 
//		            Locate the file upload input element
	/*	            WebElement fileInput3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[4]/article/article[2]/article/label"));

		            // Specify the local file path to upload
		            String filePath3 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Family Income Proof.jpg";

		            // Set the file path value to the file input element
		            fileInput3.sendKeys(filePath3); 
//Latest College Fee Receipt : 
		            
//		            Locate the file upload input element
		            WebElement fileInput4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[4]/article/article[2]/article/label"));

		            // Specify the local file path to upload
		            String filePath4 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Latest College Fee Receipt.jpg";

		            // Set the file path value to the file input element
		            fileInput4.sendKeys(filePath4); 
		            
// Bank passbook : 		         
//		            Locate the file upload input element
		            WebElement fileInput5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[6]/article/article[2]/article/label"));

		            // Specify the local file path to upload
		            String filePath5 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Bank passbook.jpg";

		            // Set the file path value to the file input element
		            fileInput5.sendKeys(filePath5); 
		            
// Previous Class Marksheet : 
//		            Locate the file upload input element
		            WebElement fileInput6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[7]/article/article[2]/article/label"));

		            // Specify the local file path to upload
		            String filePath6 = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\S3_Image\\Previous Class Marksheet.jpg";

		            // Set the file path value to the file input element
		            fileInput6.sendKeys(filePath6); 
		            */
// Save and continue button : 
		//            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[4]/section/article/article[1]/article[3]/article[10]/article/input")).click();
		            
//**************************************************************************************************************************************		            
	              
		        		           
		   //     Thread.sleep(2000);		           
//Reference : Rotate this code in loop For 2  Refrence : 
		        
		        WebDriverWait waito = new WebDriverWait(driver, Duration.ofSeconds(20)); 

		        // Wait for the element to be clickable
		        WebElement element = waito.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/a")));

		        // Perform the click using JavaScript executor
		        JavascriptExecutor jsExecutoro = (JavascriptExecutor) driver;
		        jsExecutoro.executeScript("arguments[0].click();", element);
		        
		        
		        
		        //    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/a")).click();
		            
 //Add reference : 
		       //     driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/article/article[2]/article/a")).click();
// Name             
		        
		        WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		        // Wait for the element to be visible
		        WebElement elementt = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article.col-md-4 article.form-group input#name")));

		       // Simulate pressing the "Tab" key
		        elementt.sendKeys(Keys.TAB);

		       // Use JavaScript Executor to set the value
		       JavascriptExecutor jsExecutor8 = (JavascriptExecutor) driver;
		       jsExecutor8.executeScript("arguments[0].value = 'Tine Andhalkar';", elementt);

		        
		 
		   //   driver.findElement(By.id("name")).sendKeys("Tine Andhalkar");
//Mobile :
		            driver.findElement(By.id("mobile")).sendKeys("8767899065");
		            
// Relation : 
		      /*      
		            WebDriverWait waitb = new WebDriverWait(driver, Duration.ofSeconds(20));
		            
		            // Wait for the select element to be present
		            WebElement selectElement = waitb.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select#relation")));

		            // Use JavaScript Executor to set the selected option
		            JavascriptExecutor jsExecutorb = (JavascriptExecutor) driver;
		            jsExecutorb.executeScript("arguments[0].value = '588';", selectElement);

		            // Use the Select class to work with the options
		            Select rel = new Select(selectElement);
		            rel.selectByVisibleText("Sister");
		            
		           */ 
		            
		       //     Select rel = new Select(driver.findElement(By.cssSelector("select#relation")));
		       //     rel.selectByVisibleText("Sister");
		            
		        //    Thread.sleep(6000);
		            
		            
// Save Button : 
		        //    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/article/article[2]/article/article/article[3]/article/input")).click();
		            
///****************************************************************************************************************************************************
//Bank Details : Add Bank Details : 
		     //       driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[6]/section/article/article[2]/article/a")).click();
//Account Holder name :
		            
		          
		            
		            driver.findElement(By.cssSelector("article.form-group input#accountHolderName")).click();
		            WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(20));

		            // Wait for the input element to be present
		            WebElement inputElement = waiti.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("article.form-group input#accountHolderName")));
		            inputElement.sendKeys(Keys.TAB);
		            
		            // Use JavaScript Executor to set the value
		            JavascriptExecutor jsExecutori = (JavascriptExecutor) driver;
		            jsExecutori.executeScript("arguments[0].value = 'Jayraj Andhalkar';", inputElement);
                   
		            
		         //  driver.findElement(By.cssSelector("article.form-group input#accountHolderName")).sendKeys("Jayraj Andhalkar");
//Account Number : 
		            
		           		            
		            
		            driver.findElement(By.id("accountNumber")).sendKeys("65678987654");
// IFSC Code : 
		            driver.findElement(By.id("ifscCode")).sendKeys("HDFC0000007");
//Bank name : 
		            driver.findElement(By.id("bankName")).sendKeys("HDFC Bank ");
//Branch Name :
		            driver.findElement(By.id("branchName")).sendKeys("PUNE - LAW COLLEGE ROAD");
// Save Button :
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[6]/section/article/article[2]/article[2]/article/article[2]/article/input")).click();
//**********************************************************************************************************************************************************************************8
// More about Yourself : 
//What kind of crisis are you facing? : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[1]/article[2]/label[2]/span")).click();
// Student's relationship with the family member who is facing crisis/ was deceased  :
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[2]/article[2]/label[1]/span")).click();
//Year of Crisis   :
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[3]/article[2]/label[2]/span")).click();
// Cause of Death   :
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[4]/article[2]/label[5]/span")).click();
//  Reason for job loss  : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[5]/article[2]/label[4]/span")).click();
// Type of Natural Disaster   : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[6]/article[2]/label[6]/span")).click();
	
//  Brief description of the disease/critical illness & medical procedure (If Applicable) : 
		            driver.findElement(By.xpath("//*[@id=\"1372\"]")).sendKeys("My dad company was suffering from layoff so they remove all the employee so we suffer a lots of losses we have loan and all things .");
//How did you get to know about this scholarship:
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[1]/article/article[8]/article[2]/label[7]/span")).click();
//Referred By : 
		            driver.findElement(By.xpath("//*[@id=\"1365\"]")).sendKeys("Forstu.co");
// Save button : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[7]/section/article/article/article/article[2]/article/input")).click();
//**********************************************************************************************************************		            
// Check Boxes : 1]
		            driver.findElement(By.id("23")).click();
// 2]
		            driver.findElement(By.id("10")).click();
//3]           
		            driver.findElement(By.id("20")).click();
//4]
		            driver.findElement(By.id("21")).click();
		            
//5]                
		            driver.findElement(By.id("22")).click();	
		            
// Preview : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/section/section[2]/article/article/button")).click();
//*********************************************************************************************************************************************************************************		     
		            
// Last Save Button : 
		            driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[3]/section[4]/section/article/article/button[2]")).click();
		      
		            
		            
			}  
	public static void clickElementWithJavaScript(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
	}
	 public static void selectOptionByTextUsingJS(WebDriver driver, String optionText) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        String script = String.format("document.querySelector('.Select-option').click();", optionText);
	        jsExecutor.executeScript(script);
	    }
	  public static void pauseForManualInteraction(WebDriver driver) {
	        // You can use Thread.sleep() or WebDriverWait here to pause
	        // For example, using WebDriverWait to wait for a specific element:
	        WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(120));
	        WebElement manualSectionIndicator = waitv.until(ExpectedConditions.presenceOfElementLocated(By.id("manual-section-indicator")));
	        
	  }
	 
	 

}
