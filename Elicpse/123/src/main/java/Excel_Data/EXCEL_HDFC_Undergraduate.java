package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import java.awt.AWTException;

public class EXCEL_HDFC_Undergraduate {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		
		    ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();

	        
	                
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\HDFC_Undergraduate1.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);	
	        
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            
	         
	            String Login  = row.getCell(0).getStringCellValue();
	            String Password = row.getCell(1).getStringCellValue(); 
                long  AlternateMobile=(long) row.getCell(2).getNumericCellValue();
	       
                long WhatsAppNumber =(long) row.getCell(3).getNumericCellValue(); 
	       //     Double DateOfBirth = row.getCell(4).getNumericCellValue();
	            long AnnualFamilyIncome =(long) row.getCell(4).getNumericCellValue();
	            String personsWithDisabilities  = row.getCell(5).getStringCellValue();
	            String parentalStatus  = row.getCell(6).getStringCellValue();
	            int numberOfSiblings = (int) row.getCell(7).getNumericCellValue();
	            String degree = row.getCell(8).getStringCellValue();
	            String courseDuration = row.getCell(9).getStringCellValue();
	            String InstituteType = row.getCell(10).getStringCellValue();
	            String currentAcademicYear = row.getCell(11).getStringCellValue();
	            int currentAcademicSem = (int) row.getCell(12).getNumericCellValue();
	            String state = row.getCell(13).getStringCellValue();
	            String   district = row.getCell(14).getStringCellValue();
	      //      String   InstitutionName = row.getCell(15).getStringCellValue();
	            long totalCourseFee =(long) row.getCell(16).getNumericCellValue();
	            int passingYear = (int) row.getCell(17).getNumericCellValue();
	            String board = row.getCell(18).getStringCellValue();
	            String stream = row.getCell(19).getStringCellValue();
	            String InstituteType1 = row.getCell(20).getStringCellValue();
	            String state1 = row.getCell(21).getStringCellValue();   
	            String district1 = row.getCell(22).getStringCellValue();  
	            String nameOfInstitute1 = row.getCell(23).getStringCellValue(); 
	            int passingYear1 = (int) row.getCell(24).getNumericCellValue();
	            long MarksObtain = (long) row.getCell(25).getNumericCellValue();
	            long TotalMarks =(long) row.getCell(26).getNumericCellValue();
	            String name = row.getCell(27).getStringCellValue(); 
	            long mobile =(long) row.getCell(28).getNumericCellValue();
	            long annualIncome =(long) row.getCell(29).getNumericCellValue();
	            String relation = row.getCell(30).getStringCellValue(); 
	            String occupation = row.getCell(31).getStringCellValue(); 
//Reference : 
	            String name1 = row.getCell(32).getStringCellValue(); 
	            long mobile1 =(long) row.getCell(33).getNumericCellValue();
	            String relation1 = row.getCell(34).getStringCellValue(); 
	            
//Bank : 
	            String accountholderName = row.getCell(35).getStringCellValue(); 
	            long accountnumber =(long) row.getCell(36).getNumericCellValue();
	        
	            String ifscCode = row.getCell(37).getStringCellValue(); 
	            
	            
	            
	         
	            
	            
	            
	          //URL : 	        
		        driver.get("https://www.buddy4study.com/application/HDFC45/instruction");
	//PopUp : 
		        
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
//Login :
		        driver.findElement(By.cssSelector(".loginWithPopup_email__19PBS")).click();

		        driver.findElement(By.id("emailid")).click();
 	            driver.findElement(By.id("emailid")).sendKeys(Login );
	            
//Password : 
 	           WebElement passwordElement = driver.findElement(By.id("password")); 
               passwordElement.sendKeys(Password);
               
// Login click: 
   	          driver.findElement(By.cssSelector(".loginWithMobileEmailPopup_btn__31NqD")).click();  
	          
//Clicking On Ok button :
 	          // Create a WebDriverWait instance with a timeout of 10 seconds
 	          WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
 	          WebElement okButton = waitt.until(ExpectedConditions.elementToBeClickable(By.className("swal-button--confirm")));
 	          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
 	          jsExecutor.executeScript("arguments[0].click();", okButton);

 //Click on Start Application : 
 	          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
 	          WebElement startApplicationButton = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class='applicationInstructions_ctrlWrapper__17X1G']//button")));
 	         ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startApplicationButton); //article[@class='applicationInstructions_ctrlWrapper__17X1G']//button[contains(text(),'START APPLICATION')]
 	         
 	   /*   
 	          WebDriverWait waitb9 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          // First dropdown
	          WebElement firstDropdown = waitb9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[1]//select[@name='option']")));
	          Select select1 = new Select(firstDropdown);
	          select1.selectByVisibleText("Yes"); 	         
 	         
	          //Second Dropdown : 
		         
	          WebDriverWait waitb2 = new WebDriverWait(driver, Duration.ofSeconds(10));
     	      WebElement SecondDropdown = waitb2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section/main/article/article/form/article[1]/article/article[2]/select")));
		      Select select2 = new Select(SecondDropdown);                                                 
		      select2.selectByVisibleText("Yes");  
 	         
	          //Third dropdown
	          WebElement ThirdDropdown = waitb9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[3]//select[@name='option']")));
	          Select select3 = new Select(ThirdDropdown);
	          select3.selectByVisibleText("Yes");  
 	         
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
 	         
	        // driver.findElement(By.id("alternateMobile")).clear();	                    
              WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement alternateMobileElement = waitr.until(ExpectedConditions.visibilityOfElementLocated(By.id("alternateMobile")));
              alternateMobileElement.sendKeys(String.valueOf(AlternateMobile));
              

              WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement WhatappNo = waittt.until(ExpectedConditions.visibilityOfElementLocated(By.id("whatsAppMobile")));
              WhatappNo.sendKeys(String.valueOf(WhatsAppNumber));
   	      /*    
              WebDriverWait waitti = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement DOB = waitti.until(ExpectedConditions.visibilityOfElementLocated(By.id("dob")));
              DOB.sendKeys(String.valueOf(DateOfBirth));
          */    
 //Family income : 
              driver.findElement(By.id("familyIncome")).clear();
              driver.findElement(By.id("familyIncome")).click();
              driver.findElement(By.id("familyIncome")).sendKeys(String.valueOf(String.valueOf(AnnualFamilyIncome)));
              driver.findElement(By.id("familyIncome")).sendKeys(Keys.TAB);
              
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
         
              try {
              WebDriverWait waitE = new WebDriverWait(driver, Duration.ofSeconds(10)); 
              WebElement dropdownElementE = waitE.until(ExpectedConditions.elementToBeClickable(By.id("siblingsNo")));
              Select nosibling = new Select(dropdownElementE);
              nosibling.selectByIndex(numberOfSiblings);
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("arguments[0].scrollIntoView(true);", dropdownElementE);
              } catch (Exception e) {
            	  
                  e.printStackTrace();
             }
               
       
 //Save & Continue option : 
            

              
            try {
            WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(20)); 
            WebElement buttonElement = waitB.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[1]/section/article/article[9]/article/input")));
	        JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
            jsExecutorc.executeScript("arguments[0].click();", buttonElement); 
             } catch (Exception e) {
           	  
            	 System.out.println("Save Button not work");
                 e.printStackTrace();
            }   

              
              
            


            
                                            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

//Education Details  Section : 
//Graduation : 
            WebDriverWait waitClick1 = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement elementToClick1 = waitClick1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/a/article/span/span/i")));
            JavascriptExecutor jsExecutorClick1 = (JavascriptExecutor) driver;
            jsExecutorClick1.executeScript("arguments[0].click();", elementToClick1);
           
            
              
              WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(30));
              WebElement elementToClick = waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article/span/span/i")));
              JavascriptExecutor jsExecutorClick = (JavascriptExecutor) driver;
              jsExecutorClick.executeScript("arguments[0].click();", elementToClick);
             
 //Degree :
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
              durationDropdown.selectByVisibleText(courseDuration);            
              
//Institute Type : 
              Select s1 = new Select(driver.findElement(By.id("instituteTypeId")));
              s1.selectByVisibleText(InstituteType);
              
//currentAcademicYear :             
              Select s2 = new Select(driver.findElement(By.id("currentAcademicYear")));
              s2.selectByVisibleText(currentAcademicYear);
              
 // currentAcademicSem:            
              Select s3 = new Select(driver.findElement(By.id("currentAcademicSem")));
              s3.selectByIndex(currentAcademicSem );
 //  State           
              WebDriverWait waitu = new WebDriverWait(driver, Duration.ofSeconds(10));
              By dropdownLocator4 = By.id("state");
              WebElement dropdownElement4 = waitu.until(ExpectedConditions.elementToBeClickable(dropdownLocator4));

              Select stateSelect = new Select(dropdownElement4);
              stateSelect.selectByVisibleText(state);

              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement4);
      
 //District   
         //     Select ss = new Select(driver.findElement(By.id("district")));
        //      ss.selectByVisibleText(district);
              
              
              WebDriverWait waituU = new WebDriverWait(driver, Duration.ofSeconds(10));
              By dropdownLocator4U = By.id("district");
              WebElement dropdownElement4U = waituU.until(ExpectedConditions.elementToBeClickable(dropdownLocator4U));

              Select stateSelectU = new Select(dropdownElement4U);
              stateSelectU.selectByVisibleText(district);

              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownElement4U);
      
             
          
 //Name of institution:
                
              
                Thread.sleep(4000);
                
                WebDriverWait waitFF = new WebDriverWait(driver, Duration.ofSeconds(20)); 
                WebElement inputField = waitFF.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='react-select-2--value']/div[1]")));

	          //   WebElement inputField = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[1]"));

	           // Create an Actions instance
	             Actions actions = new Actions(driver);

	           // Simulate pressing "Tab" and "Enter" keys sequentially
	             actions.sendKeys(inputField, Keys.TAB).sendKeys(Keys.ENTER).sendKeys("Bharati Vidyapeeth, Pune").perform();
             //   Thread.sleep(2000);
           
  //Total cource fees :
	             driver.findElement(By.id("admissionFee")).sendKeys(String.valueOf(totalCourseFee));
 //Passing year :              
	             Select passyear = new Select(driver.findElement(By.id("passingYear")));
                 passyear.selectByValue(String.valueOf(passingYear));
 
 //Save option : 
              
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement saveButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[1]/article[2]/section/form/article[4]/article/input[1]")));
               ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);

                 
 // OK button : 
                   
                   WebDriverWait waitV = new WebDriverWait(driver, Duration.ofSeconds(10));
                   WebElement element = waitV.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/section[2]/article/article/article/input")));
                   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

                 
                 
 // 12 Board : 
                   WebDriverWait waitClick2 = new WebDriverWait(driver, Duration.ofSeconds(10));
                   WebElement elementToClick2 = waitClick2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[2]/article/span/span/i")));
                   JavascriptExecutor jsExecutorClick2 = (JavascriptExecutor) driver;
                   jsExecutorClick2.executeScript("arguments[0].click();", elementToClick2);  
                   
                   
                   
                   
                 WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
                 WebElement boardElement = waitz.until(ExpectedConditions.presenceOfElementLocated(By.id("board")));
                 JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
                 jsExecutorz.executeScript("arguments[0].scrollIntoView();", boardElement);
                 Select boardSelect = new Select(boardElement);
                 boardSelect.selectByVisibleText(board); 
   	          
//Stream : 
                 
                 Select Streamm = new Select(driver.findElement(By.id("stream")));
                 Streamm.selectByVisibleText(stream);  
                 
// Institute Type :   
                 Select s8 = new Select(driver.findElement(By.id("instituteTypeId")));
                 s8.selectByVisibleText(InstituteType1);
                 
//State : 
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
//Marks :                 
                 WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
                 WebElement inputFields = waits.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#marksObtained")));
                 JavascriptExecutor jsExecutors = (JavascriptExecutor) driver;
                 jsExecutors.executeScript("arguments[0].scrollIntoView();", inputFields);
                 inputFields.sendKeys(String.valueOf(MarksObtain));
                 jsExecutors.executeScript("console.log('JavaScript executed after entering text for MarksObtain');");

// Mark Total mark Obtain:
                 driver.findElement(By.id("totalMarks")).sendKeys(String.valueOf(TotalMarks));                
                 
              
                 
 // Save button:

                 WebDriverWait waitD = new WebDriverWait(driver, Duration.ofSeconds(30));
                 WebElement saveButtonD = waitD.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/article[2]/article/article/article[2]/article[2]/section/form/article[4]/article/input[1]")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButtonD);          

                        
  //Click On Ok button : 
	     /*    
              WebDriverWait waitV1 = new WebDriverWait(driver, Duration.ofSeconds(10));
              WebElement elementV1 = waitV1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[2]/section/section[2]/article/article/article/input")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementV1);
*/
          
  
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
 //ADD Family : 
             
             
             
  // Add family :              
              
  	                  WebDriverWait waitClickk = new WebDriverWait(driver, Duration.ofSeconds(20));
  	                  WebElement elementToClickk = waitClickk.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Family +")));                                                   
  	                  JavascriptExecutor jsExecutorClickk = (JavascriptExecutor) driver;
  	                  jsExecutorClickk.executeScript("arguments[0].click();", elementToClickk);
  	                
  	                              
   
             
                 
  // Name : 
                 WebDriverWait waitk = new WebDriverWait(driver, Duration.ofSeconds(10));
		         WebElement inputFieldk = waitk.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"name\"]")));
		         JavascriptExecutor jsExecutork = (JavascriptExecutor) driver;
		         jsExecutork.executeScript("arguments[0].scrollIntoView();", inputFieldk);
                 inputFieldk.sendKeys(Keys.TAB);
                 inputFieldk.sendKeys(Keys.ENTER);
		         inputFieldk.sendKeys(name);
                 jsExecutork.executeScript("console.log('JavaScript executed after entering text');");
                 
 //  // Mobile 
     	        driver.findElement(By.id("mobile")).sendKeys(String.valueOf(mobile));
// Anual income :    
     	        driver.findElement(By.id("absoluteIncome")).sendKeys(String.valueOf(annualIncome));                
  
// relation : 
     	        
     	        WebDriverWait waitv = new WebDriverWait(driver, Duration.ofSeconds(20));
    	        WebElement relationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class='form-group']//select[@id='relation']")));
    	        relationElement.sendKeys(Keys.TAB);
    	        relationElement.sendKeys(Keys.ENTER);
    	        JavascriptExecutor jsExecutorv = (JavascriptExecutor) driver;
    	        jsExecutorv.executeScript("arguments[0].scrollIntoView();", relationElement);
    	        Select relationDropdown = new Select(relationElement);
    	        relationDropdown.selectByVisibleText(relation);
    	        jsExecutorv.executeScript("console.log('JavaScript executed after relation selection');");
         
 //Occupation :  
    	        
    	        
    	        Select s = new Select(driver.findElement(By.xpath("//article[@class='form-group']//select[@id='occupation']")));
    	        s.selectByVisibleText(occupation);
    	        
    	     /*   WebElement occupationElement = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article[1]/article[6]/article/select")));
    	        occupationElement.sendKeys(Keys.TAB);
    	        occupationElement.sendKeys(Keys.ENTER);
    	        JavascriptExecutor jsExecutorl = (JavascriptExecutor) driver;
    	        jsExecutorl.executeScript("arguments[0].scrollIntoView();", occupationElement);
    	        Select occupationDropdown = new Select(occupationElement);
    	        occupationDropdown.selectByVisibleText(occupation);
    	        jsExecutorl.executeScript("console.log('JavaScript executed after occupation selection');");
              */
  //Save Button :

                WebDriverWait waitD1 = new WebDriverWait(driver, Duration.ofSeconds(30));
                WebElement saveButtonD1 = waitD1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/article/article[2]/article/article/article[2]/article/article[2]/article/input")));
               ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButtonD1);          

    	        
    	  
    	        //Ok button :
     	       
                WebDriverWait waitV11 = new WebDriverWait(driver, Duration.ofSeconds(30));
                WebElement elementV11 = waitV11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[3]/section/section[2]/article/article/article/input")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementV11);

     	       
     	        
     	        
 // Reference: 
    	        WebDriverWait waito = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        WebElement element11 = waito.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/a/article/span/span/i")));
		        JavascriptExecutor jsExecutoro = (JavascriptExecutor) driver;
		        jsExecutoro.executeScript("arguments[0].click();", element11);
		        

// Add Refrence : 
		        WebDriverWait waito1 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        WebElement element111 = waito1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn pull-left']")));
		        JavascriptExecutor jsExecutoro1 = (JavascriptExecutor) driver;
		        jsExecutoro1.executeScript("arguments[0].click();", element111);
		        
		         
 // Name : 
		        WebDriverWait waitka = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement inputFieldka = waitka.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#name")));

	            // Use JavaScript Executor to scroll to the element
	            JavascriptExecutor jsExecutorka = (JavascriptExecutor) driver;
	            jsExecutorka.executeScript("arguments[0].scrollIntoView();", inputFieldka);
	            inputFieldka.sendKeys(Keys.TAB);	            
	            inputFieldka.sendKeys(name1);
	            jsExecutorka.executeScript("console.log('JavaScript executed after entering text');");
		         	        
//Mobile : 
	            driver.findElement(By.id("mobile")).sendKeys(String.valueOf(mobile1));
// Relation : 
	            
	            WebDriverWait waitb = new WebDriverWait(driver, Duration.ofSeconds(20));
	  	         WebElement selectElement = waitb.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select#relation")));
	  	         JavascriptExecutor jsExecutorb = (JavascriptExecutor) driver;
	  	         jsExecutorb.executeScript("arguments[0].value = arguments[1];", selectElement, "588");

	  	         Select rel = new Select(selectElement);
	  	         rel.selectByVisibleText(relation1);		        
		        
//Save button : 
	  	       WebDriverWait waitDD = new WebDriverWait(driver, Duration.ofSeconds(30));
               WebElement saveButtonDD = waitDD.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/article/article[2]/article/article/article[3]/article/input")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButtonDD);          

   	        
	  	         
//Ok Button : 
                WebDriverWait waitV112 = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement elementV112 = waitV112.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/section[2]/article/article/article/input")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementV112);
   
	  	   //  driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[5]/section/section[2]/article/article/article/input")).click();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //Bank Details : 
                
                WebDriverWait waitoo1 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        WebElement element1123 = waitoo1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[6]/a/article/span/span/i")));
		        JavascriptExecutor jsExecutoro112 = (JavascriptExecutor) driver;
		        jsExecutoro112.executeScript("arguments[0].click();", element1123);
                
          	  	     
//Add Bank Details : 
		        WebDriverWait waitoo12 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        WebElement element1122 = waitoo12.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn pull-left familybtnsize']")));
		        JavascriptExecutor jsExecutoro1122 = (JavascriptExecutor) driver;
		        jsExecutoro1122.executeScript("arguments[0].click();", element1122);
                
		        
		        
		        
	  	     
	  	     
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
   			                accountNumberInput.sendKeys(String.valueOf(accountnumber));
   			                waitj.until(ExpectedConditions.elementToBeClickable(accountNumberInput));

   			                // Use JavaScriptExecutor to directly set the value of the input field
   			                JavascriptExecutor jsExecutorh = (JavascriptExecutor) driver;
   			                jsExecutorh.executeScript("arguments[0].value = arguments[1];", accountNumberInput, accountnumber);
      
   	//IFSC CODE : 		
   			                
   			                driver.findElement(By.id("ifscCode")).sendKeys(String.valueOf(ifscCode));
         
//Save option :
   			       WebDriverWait waitC = new WebDriverWait(driver, Duration.ofSeconds(10));
   	               WebElement saveButtonC = waitC.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[6]/section/article/article[2]/article[2]/article/article[2]/article/input")));
   	              ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButtonC);

	  	   			                
	  	   			   
	  	   			                
	//Save and continue  :
	  	   	                
		  	   	           WebDriverWait waitnnn1234 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  	   	               WebElement saveButtonn1234 = waitnnn1234.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/section[2]/section/section[2]/section/section/section[3]/article[6]/section/article/article[2]/article/a")));
	  	   	               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveButtonn1234);
	  	   	                saveButtonn1234.click();
	  	   			                
		  	   			             
	  	   	                
	  	   	     
	  	   			                                            
	  	   			                
//More About yourself :
	  	   			                
	  	   			                
	  	   			                
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
					  	        	        
		        
		        
		        
                 
	}
	}
}
