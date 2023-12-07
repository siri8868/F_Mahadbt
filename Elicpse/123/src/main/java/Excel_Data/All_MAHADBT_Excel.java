package Excel_Data;


import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.util.UriComponentsBuilder;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;






public class All_MAHADBT_Excel {
 
	public static <JavascriptExecutor> void main(String[] args) throws IOException, InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	   
	        
	   
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\MahaDBT_Sheet.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);
	        Workbook workbook = new XSSFWorkbook();   
	        
	        
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            
	         
	            String Login  = row.getCell(0).getStringCellValue();
	            String Password = row.getCell(1).getStringCellValue(); 	        
	            String Name = row.getCell(2).getStringCellValue(); 
	            long ParentNo = (long) row.getCell(3).getNumericCellValue(); 
	            String MaritalStatus = row.getCell(4).getStringCellValue(); 
	            String religion = row.getCell(5).getStringCellValue(); 
	            String CasteCategory = row.getCell(6).getStringCellValue(); 
	            String Caste = row.getCell(7).getStringCellValue(); 
	            long Anualincome = (long) row.getCell(8).getNumericCellValue(); 
	            String Personal_eligibility = row.getCell(9).getStringCellValue(); 
	            String Jobtype = row.getCell(10).getStringCellValue(); 
	            String Disability = row.getCell(11).getStringCellValue(); 
	            String Disability_Type = row.getCell(12).getStringCellValue(); 
	            String With_Disability = row.getCell(13).getStringCellValue(); 
	            long BankAccountNo = (long) row.getCell(14).getNumericCellValue(); 
	            String IfscCode = row.getCell(15).getStringCellValue();
	            
	            String Village = row.getCell(16).getStringCellValue(); 
	            String Correspo_Address = row.getCell(17).getStringCellValue(); 
	            String District = row.getCell(18).getStringCellValue(); 
	            String Taluka = row.getCell(19).getStringCellValue(); 
	            String address = row.getCell(20).getStringCellValue(); 
	            String State = row.getCell(21).getStringCellValue(); 
	            String district1 = row.getCell(22).getStringCellValue(); 
	            String Taluka1 = row.getCell(23).getStringCellValue(); 
	            String village1 = row.getCell(24).getStringCellValue(); 
	            long pincode = (long) row.getCell(25).getNumericCellValue(); 
	            
	            String Father = row.getCell(26).getStringCellValue(); 
	            String Fathername = row.getCell(27).getStringCellValue(); 
	            String Occupation = row.getCell(28).getStringCellValue();
	            String Salaried1 = row.getCell(29).getStringCellValue();
	            String Mother = row.getCell(30).getStringCellValue(); 
	            String Mothername = row.getCell(31).getStringCellValue(); 
	            String  Occup = row.getCell(32).getStringCellValue(); 
	            String  salrid  = row.getCell(33).getStringCellValue(); 
	            
	            
	            long AdmissionYear = (long) row.getCell(34).getNumericCellValue(); 
	            String  state  = row.getCell(35).getStringCellValue(); 
	            String  district   = row.getCell(36).getStringCellValue(); 
	            String  taluka   = row.getCell(37).getStringCellValue(); 
	            String  qualifilevel = row.getCell(38).getStringCellValue(); 
	            String  Streamm = row.getCell(39).getStringCellValue(); 
	            String  Ncollege = row.getCell(40).getStringCellValue(); 
	            long coursename = (long) row.getCell(41).getNumericCellValue(); 
	          //  String  coursename = row.getCell(41).getStringCellValue(); 
	            String  AdmissionType = row.getCell(42).getStringCellValue(); 
	            long CETMarks = (long) row.getCell(43).getNumericCellValue(); 
	            long ApplicationID = (long) row.getCell(44).getNumericCellValue(); 
	         //   String  ApplicationID = row.getCell(44).getStringCellValue(); 
	            String  s3Url = row.getCell(45).getStringCellValue(); 
	            String  localFilePath = row.getCell(46).getStringCellValue(); 
	            String  yearofstudy = row.getCell(47).getStringCellValue(); 
	            String  iscompleted = row.getCell(48).getStringCellValue(); 
	            long feespaid = (long) row.getCell(49).getNumericCellValue(); 
	            String  s3url = row.getCell(50).getStringCellValue(); 
	            String  localfilepath = row.getCell(51).getStringCellValue(); 
	            String  category = row.getCell(52).getStringCellValue(); 
	            String  mode = row.getCell(53).getStringCellValue(); 
//10 Th :
	           
	            String Qulificationlevel  = row.getCell(54).getStringCellValue(); 
	            long Stream = (long) row.getCell(55).getNumericCellValue(); 
	            String State3 = row.getCell(56).getStringCellValue(); 
	            String  District3 = row.getCell(57).getStringCellValue(); 
	            String  taluka3 = row.getCell(58).getStringCellValue(); 
	            String  Course1 = row.getCell(59).getStringCellValue();
	         //   long DBoard = (long) row.getCell(60).getNumericCellValue(); 
	            String  DBoard = row.getCell(60).getStringCellValue();
	        
	            String  Mode1 = row.getCell(61).getStringCellValue(); 
	            long Admissionyear = (long) row.getCell(62).getNumericCellValue(); 
	            long Passingyear = (long) row.getCell(63).getNumericCellValue(); 
	            
//////////////////	                  
	            String  result = row.getCell(64).getStringCellValue(); 
	            long Persentage = (long) row.getCell(65).getNumericCellValue(); 
	            long attempt = (long) row.getCell(66).getNumericCellValue();  
	            String DURLL = row.getCell(67).getStringCellValue(); 
	            String machineurl1   = row.getCell(68).getStringCellValue(); 
//If board is Maharashtra board :
	            
	            String  Modee = row.getCell(69).getStringCellValue(); 
	            long admissionyear = (long) row.getCell(70).getNumericCellValue(); 
	            long passingyear = (long) row.getCell(71).getNumericCellValue(); 
	            
		      //  long Seatnumber = (long) row.getCell(64).getNumericCellValue(); 
		        String  Seatnumber  = row.getCell(72).getStringCellValue(); 
		        String  monthofexam  = row.getCell(73).getStringCellValue(); 
		        long markobtain = (long) row.getCell(74).getNumericCellValue(); 
		        long  attempts = (long) row.getCell(75).getNumericCellValue();
		    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	            
	           
//12 th : 		         

	            String Qulifilevel  = row.getCell(76).getStringCellValue(); 
	            String Stream12 = row.getCell(77).getStringCellValue(); 
	            String dist = row.getCell(78).getStringCellValue(); 
	            String  tal = row.getCell(79).getStringCellValue(); 
	            String  CollegeN = row.getCell(80).getStringCellValue(); 
	            String  Course = row.getCell(81).getStringCellValue();      
	            String  Boardd = row.getCell(82).getStringCellValue(); 
	            
	            
	            
	            
	            
	            
	            
	            
	            String  modde = row.getCell(83).getStringCellValue(); 
	            long  Addyear = (long) row.getCell(84).getNumericCellValue();  
	            long  Passyear = (long) row.getCell(85).getNumericCellValue(); 
	            String Resultt  = row.getCell(86).getStringCellValue();
	            long  Persentage1 = (long) row.getCell(87).getNumericCellValue(); 
	            long  Attempts = (long) row.getCell(88).getNumericCellValue(); 
	            String  DURL = row.getCell(89).getStringCellValue(); 
	            String  machineurl = row.getCell(90).getStringCellValue(); 
	            String  gap = row.getCell(91).getStringCellValue(); 
	            long GapYears  = (long) row.getCell(92).getNumericCellValue();
	            
	            
////////////////////////////////////////////////////////////////////////////////////////////	            
	            
	            
//Hostel details:
	            String Hostelar  = row.getCell(93).getStringCellValue();  
	            String Hstate  = row.getCell(94).getStringCellValue();  
	            String Hdist = row.getCell(95).getStringCellValue(); 
	            String Htaluka  = row.getCell(96).getStringCellValue(); 
	            String  Hosteltype = row.getCell(97).getStringCellValue(); 
	            String  Hostelname = row.getCell(98).getStringCellValue(); 
	            String  Hosteladd = row.getCell(99).getStringCellValue(); 
	            String  Hosteladdress = row.getCell(100).getStringCellValue(); 
	            long pincode1  = (long) row.getCell(101).getNumericCellValue(); 
	        //    long mess  = (long) row.getCell(94).getNumericCellValue(); 
	            String  mess= row.getCell(102).getStringCellValue(); 
	            long rent= (long) row.getCell(103).getNumericCellValue(); 
	            String HURL= row.getCell(104).getStringCellValue(); 
	            String  Hostelurl = row.getCell(105).getStringCellValue(); 

	            
	           
	            
//////////////////////////////////////////////////////////////////////////////////////////////////////
//Script Started : 
	            
	            try {
	            
 //URL : 	        
		            driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");
//Login :
		            driver.findElement(By.id("UserName")).sendKeys(Login);
		            
//Password :
		            driver.findElement(By.id("Password")).sendKeys(Password);
		        
		             Thread.sleep(13000);
	        
//Click On Login button : 
					driver.findElement(By.id("btnLogin")).click();
				            
//Click On the Profile Button :
				    driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/section/div/div/div[1]/div[1]/ul/ul/li[3]/a")).click();
		           
//Applicant Full Name 
				        
			        driver.findElement(By.id("ApplicantNameAsPerSSCOrHSC")).sendKeys(Name);
			            
//Parent's/Guardian Mobile No:
		            driver.findElement(By.id("ParentMobile")).sendKeys(String.valueOf(ParentNo));
		            Thread.sleep(2000);	        
//Marital Status :
		            if(MaritalStatus.equals("Married")) {
		            	driver.findElement(By.xpath("//*[@id=\"4thYearDetails\"]/div[20]/div/label[2]/span")).click();
		            	
			 }
		            else {
		            	driver.findElement(By.xpath("//*[@id=\"4thYearDetails\"]/div[20]/div/label[3]/span")).click();
	        
		            }
		            
// Religion Details :

		            Select region = new Select(driver.findElement(By.id("ReligionID")));
		            region.selectByVisibleText(religion);
		            Thread.sleep(2000);   
		            
		            
		            
// Category Selection : 
		            
		            WebElement categoryDropdown = driver.findElement(By.id("CasteCategoryID"));

		            WebDriverWait waitq1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		            waitq1.until(ExpectedConditions.elementToBeClickable(categoryDropdown));

		            Select categorySelect = new Select(categoryDropdown);

		            if (CasteCategory.equals("General")) {
		                categorySelect.selectByVisibleText(CasteCategory);
		            } 
		            else {
		            
		            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		            	WebElement categoryDropdown1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CasteCategoryID")));

// Select the category based on excel  data
		            	Select categorySelect1 = new Select(categoryDropdown1);
		            	categorySelect1.selectByVisibleText(CasteCategory);
		            	
		            	            	
		            	Thread.sleep(2000);
		            	 WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(30));
					     WebElement castee = waitz.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubCasteCategoryID\"]")));
					     JavascriptExecutor jsExecutorz = (JavascriptExecutor) driver;
					     ((org.openqa.selenium.JavascriptExecutor) jsExecutorz).executeScript("arguments[0].scrollIntoView();", castee );
					     Select casteSelect = new Select(castee );
					     castee.sendKeys(Keys.TAB);
					     casteSelect.selectByVisibleText(Caste); 
		            	
		        	            
//Do you have Caste Certificate:
		                driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[3]/span")).click();
	        
		            }
		            
		           
		            
		            
 // Annual income : 
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).clear();
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys(String.valueOf(Anualincome));
		            Thread.sleep(2000);
		            
 //Do you have Income Certificate?:
		            
		            driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[3]/span")).click();		            
		            
//Domicile Details :
//Are you Domicile of Maharashtra / Maharashtra-Karnataka Border ?
		            
		            driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
			        Thread.sleep(2000);
			            
		           driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[3]/span")).click();
		           Thread.sleep(2000);
		           
//Personal Eligibility Details :	
//Are you Salaried? :
		         //Are you Salaried? :
		           
		           
		           if(Personal_eligibility.equals("Yes")) {
		           Select sr2 = new Select(driver.findElement(By.id("IsSalaried")));
		           sr2.selectByVisibleText(Personal_eligibility);
		           
//		           Job Type :
		           Select sr3 = new Select(driver.findElement(By.id("JobType")));
		           sr3.selectByVisibleText(Jobtype);
		           
		           
		           
		           } 
		           else if(Personal_eligibility.equals("No")) {
		        	   Select sr4 = new Select(driver.findElement(By.id("IsSalaried")));
			           sr4.selectByVisibleText("No");  

		        	          
		           }

		           
		           
		           
		           
 //     boolean personIsDisabled = false;
		           if (Disability.equals("Yes")) {
 // If the person is disabled, execute the code for disability-related information
		        	    Select sr3 = new Select(driver.findElement(By.id("IsDisability")));
		        	    sr3.selectByVisibleText(Disability);
  // Disability Type
		        	    Select sr4 = new Select(driver.findElement(By.id("DisabilityType")));
		        	    sr4.selectByVisibleText(Disability_Type);

// Person with Disability:
		        	    Select sr5 = new Select(driver.findElement(By.id("PersonWithDisabilityID")));
		        	    sr5.selectByVisibleText(With_Disability);		           

		        	    
//Do you have Disability Certificate :
		        	    
		        	    // Disability Certification :
		        	    driver.findElement(By.xpath("//*[@id=\"IsDisabilityDiv\"]/div[3]/div/label[3]/span")).click();
		        	    
		           
		       	} else {
		        	   
	        		
	        		Select sr7 = new Select(driver.findElement(By.id("IsDisability")));
	        		sr7.selectByVisibleText("No");
	        		
	        	}

//Aadhaar Bank Details :
		           
		           
 //Adhar link: 
		           driver.findElement(By.xpath("//*[@id=\"BankDetails\"]/div[1]/div/label[2]/span")).click();
		           
		           //Bank Details : 
		           
		           driver.findElement(By.id("BankAccountNo")).sendKeys(String.valueOf(BankAccountNo));
		            Thread.sleep(2000);
		            
		 // IFSC Code :
		            driver.findElement(By.id("IFSCCode")).sendKeys(IfscCode);
		            Thread.sleep(2000);
		           
		           
		           
		 //Save button :
		     //       driver.findElement(By.id("btnAdd")).click();
		        
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            try {
		                // Check if a success condition exists on the page
		                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

		                // If success condition is met, write "Yes" to Excel
		                row.createCell(106).setCellValue("Yes");
		            } catch (TimeoutException e) {

		                row.createCell(106).setCellValue("No");
		            }   
		            
		            // Save the changes back to the Excel file after each login
		            FileOutputStream outputStream = new FileOutputStream(src);
		            xsf.write(outputStream);

		            // Wait for a while before proceeding to the next user login
		            Thread.sleep(2000);   
		            
		         
		            
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            }       
		            
		            
		            
		            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Address information :
		            
 //click on Address Button to fill the data 
	            try {
	            	
			        driver.findElement(By.id("T_AddressInformation1")).click();
			        Thread.sleep(2000);            
			       
	 //1] Village details :
		            driver.findElement(By.id("Village")).sendKeys(Village);
		            Thread.sleep(2000);  		            
		           
//  Is Correspondence Address same as Permanent?   
			           
				    if(Correspo_Address.equals("Yes")) {
				    	
				       	driver.findElement(By.xpath("//*[@id=\"PermanentAddressDetails\"]/div[8]/div/label[2]/span")).click();
				    	
		//District :
			    	   Select district11 = new Select(driver.findElement(By.id("DistrictID2")));
			           district11.selectByVisibleText(District);
			            Thread.sleep(2000);
			    	
			          //No select Taluka :
			            
			            Select taluka1 = new Select(driver.findElement(By.id("TalukaID2")));
			            taluka1.selectByVisibleText(Taluka);
			            Thread.sleep(2000);
			            
				          }	
				    else  if(Correspo_Address.equals("No"))
				    {
				    driver.findElement(By.xpath("//*[@id=\"PermanentAddressDetails\"]/div[8]/div/label[3]/span")).click();
		//Address:
				    driver.findElement(By.id("CorrespondenceAddress")).sendKeys(address);
		//State:
				    Select Sr = new Select(driver.findElement(By.id("StateID")));
				    Sr.selectByVisibleText(State);
				    
		//District: 
				    Thread.sleep(2000);
				    Select Srr = new Select(driver.findElement(By.id("DistrictID")));
				    Srr.selectByVisibleText(district1);
				    
//Taluka  :
				    Thread.sleep(1000);
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				    WebElement talukaDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("TalukaID")));
				    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", talukaDropdown);
				    Select selectTaluka = new Select(talukaDropdown);
			    	 selectTaluka.selectByVisibleText(Taluka1);
				  //  selectTaluka.selectByValue(Taluka);
				    
			    	
			    	 
			    	 
				    
				   /* 
				   Select Srrr = new Select(driver.findElement(By.id("TalukaID")));
			       Srrr.selectByVisibleText(Taluka1); 
			       */
		//Village :
			    	 
				    driver.findElement(By.id("CorrespondenceVillage")).sendKeys(village1);
		//Pincode : 
				    driver.findElement(By.id("CorrespondencePincode")).sendKeys(String.valueOf(pincode));
				     
				    }
				    else {
				    	System.out.println("Print Statement");
				    	
				    }
		 
//Save option :
				//   driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();	
				 
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            try {
		                // Check if a success condition exists on the page
		                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

		                // If success condition is met, write "Yes" to Excel
		                row.createCell(107).setCellValue("Yes");
		            } catch (TimeoutException e) {

		                row.createCell(107).setCellValue("No");
		            }   
		            
		            // Save the changes back to the Excel file after each login
		            FileOutputStream outputStream = new FileOutputStream(src);
		            xsf.write(outputStream);

		            // Wait for a while before proceeding to the next user login
		            Thread.sleep(2000); 
				    
				    
				    
				    
				    
				    
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            } 
				    
				    
				    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		           
//Other Information :		           
		            try {
		            	
		            Thread.sleep(2000);
		            driver.findElement(By.id("T_OtherInformation1")).click();
		            Thread.sleep(2000);           

//Father mother conditions :
		            if (Father.equalsIgnoreCase("Yes") && Mother.equalsIgnoreCase("Yes")) {
		            	
		            	 //Is Father Alive :
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[1]/div/label[2]/span")).click();
		                Thread.sleep(2000); 
		     //Father name :
		                driver.findElement(By.id("FatherName")).sendKeys(Fathername);
		                Thread.sleep(2000);
		    // Occupation :
		                Select occupation = new Select(driver.findElement(By.id("FatherOccupationID")));
		                occupation.selectByVisibleText(Occupation);
		                Thread.sleep(2000);
		    //Is Salaried? :
		                Select salaried1 = new Select(driver.findElement(By.id("IsFatherSalaried")));
		                salaried1.selectByVisibleText(Salaried1);
		                Thread.sleep(2000);
//Mother : 
		              //Is Mother Alive? : 
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[5]/div/label[2]/span")).click();
		                Thread.sleep(2000);
		     //Mother name :
		                driver.findElement(By.id("MotherName")).sendKeys(Mothername);
		                Thread.sleep(2000);
		     //Occupation:
		                Select occup = new Select(driver.findElement(By.id("MotherOccupationID")));
		                occup.selectByVisibleText(Occup);
		                Thread.sleep(2000);
		     //Is Salaried :
		                Select Salrid = new Select(driver.findElement(By.id("IsMotherSalaried")));
		                Salrid.selectByVisibleText(salrid );
		                Thread.sleep(2000);
		                          
		        
	                } else if (Father.equalsIgnoreCase("No") && Mother.equalsIgnoreCase("Yes")) {
	                	
	         //Father:
	                	
	                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[1]/div/label[3]/span")).click();	
	                Thread.sleep(2000);	
	                	
	           //Is Mother Alive? : 
	                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[5]/div/label[2]/span")).click();
	                Thread.sleep(2000);
	     //Mother name :
	                driver.findElement(By.id("MotherName")).sendKeys(Mothername);
	                Thread.sleep(2000);
	     //Occupation:
	                Select occup = new Select(driver.findElement(By.id("MotherOccupationID")));
	                occup.selectByVisibleText(Occup);
	                Thread.sleep(2000);
	     //Is Salaried :
	                Select Salrid = new Select(driver.findElement(By.id("IsMotherSalaried")));
	                Salrid.selectByVisibleText(salrid );
	                Thread.sleep(2000);         	
	                	
	                	
	                	
	                    // Your code for the "father=No && mother=Yes" condition.
	                } else if (Father.equalsIgnoreCase("Yes") && Mother.equalsIgnoreCase("No")) {
	                	
	                	
	         //Is Father Alive :
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[1]/div/label[2]/span")).click();
		                Thread.sleep(2000); 
		     //Father name :
		                driver.findElement(By.id("FatherName")).sendKeys(Fathername);
		                Thread.sleep(2000);
		    // Occupation :
		                Select occupation = new Select(driver.findElement(By.id("FatherOccupationID")));
		                occupation.selectByVisibleText(Occupation);
		                Thread.sleep(2000);
		    //Is Salaried? :
		                Select salaried1 = new Select(driver.findElement(By.id("IsFatherSalaried")));
		                salaried1.selectByVisibleText(Salaried1);
		                Thread.sleep(2000);
		                
		                
		     //Is Mother Alive? : 
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[5]/div/label[3]/span")).click();
		                Thread.sleep(2000);            
		                
	                	
	                	
	                	
	                    // Your code for the "father=Yes && mother=No" condition.
	                } else if (Father.equalsIgnoreCase("No") && Mother.equalsIgnoreCase("No")) {
	                	
	                //Father:
	                	
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[1]/div/label[3]/span")).click();	
		                Thread.sleep(2000);	
	                	
	                	
	                //Is Mother Alive? : 
		                driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[5]/div/label[3]/span")).click();
		                Thread.sleep(2000);            
		                
	                	
	                    // Your code for the "father=No && mother=No" condition.
	                }
		            
// Save button :
		         //  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/section/div/div/div[2]/div[2]/form/div[1]/div/div/div/div/div[7]/div/div/div[4]/div/div/center/button[1]")).click();
		            
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            try {
		                // Check if a success condition exists on the page
		                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

		                // If success condition is met, write "Yes" to Excel
		                row.createCell(108).setCellValue("Yes");
		            } catch (TimeoutException e) {

		                row.createCell(108).setCellValue("No");
		            }   
		            
		            // Save the changes back to the Excel file after each login
		            FileOutputStream outputStream = new FileOutputStream(src);
		            xsf.write(outputStream);

		            // Wait for a while before proceeding to the next user login
		            Thread.sleep(2000); 
		            
		            
		            
		            
		            
		            
		            
		            
		            } catch (Exception e) {
		                e.printStackTrace();
		              
		                continue;
		            } 
		            
		            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Current Course :
		            
		  //Current Course :
		            try {
		            driver.findElement(By.id("T_CourseApplied1")).click();
		         //   Thread.sleep(2000);
		            
		 //Admission Year Cu.cource:
		           Select admissionYear = new Select(driver.findElement(By.id("AdmissionYearID")));
		           admissionYear.selectByVisibleText(String.valueOf(AdmissionYear));
		         //  Thread.sleep(2000);
		           
		 //Institute State :
		           Select state1 = new Select(driver.findElement(By.id("StateID")));
		           state1.selectByVisibleText(state); 
		       //    Thread.sleep(2000);
		            
		 //Institute District :
		           Select District1 = new Select(driver.findElement(By.id("DistrictID"))); 
		           District1.selectByVisibleText( district );
		           Thread.sleep(2000);
		  //Institute Taluka
		           Select Taluka2 = new Select(driver.findElement(By.id("TalukaID")));
		           Taluka2.selectByVisibleText( taluka);
		           Thread.sleep(2000);    
		            
		  // Qualification Level
		            Select Qulification = new Select(driver.findElement(By.id("QualificationTypeID")));
		            Qulification.selectByVisibleText(qualifilevel);
		            Thread.sleep(2000);
		// Stream :
		            WebDriverWait waitxx = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement ste = waitxx.until(ExpectedConditions.elementToBeClickable(By.id("DegreeNameID")));
		            Select Stream1 = new Select(driver.findElement(By.id("DegreeNameID")));
		            Stream1.selectByVisibleText(Streamm);
		     //       Thread.sleep(2000);
		//College Name :
		           /* 
		            WebElement collegeDropdown = driver.findElement(By.id("CollegeID"));
		            Select collegeSelect = new Select(collegeDropdown);
		            collegeSelect.selectByVisibleText(Ncollege);   
		            */
		            
		            Thread.sleep(6000) ; 
		            WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(90));
		            WebElement collegeDropdown = waittt.until(ExpectedConditions.elementToBeClickable(By.id("CollegeID")));
                     
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            ((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].scrollIntoView();", collegeDropdown);
		            collegeDropdown = waittt.until(ExpectedConditions.elementToBeClickable(By.id("CollegeID")));

		      //      JavascriptExecutor js = (JavascriptExecutor) driver;
		     //       ((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].scrollIntoView();", collegeDropdown);

		            Select collegeSelect = new Select(collegeDropdown);
		            collegeSelect.selectByVisibleText(Ncollege);
		            
		 //Course Name:
		            Thread.sleep(2000);
		            Select CourseName = new Select(driver.findElement(By.id("StrCourseId")));
		            CourseName.selectByValue(String.valueOf(coursename));
		          //  CourseName.selectByVisibleText(coursename);
		             Thread.sleep(2000);            
		            
//Admission Type :
		             
		        if(AdmissionType.equals("Through CAP/Govt. Quota")) {
		        	
		    	    Select st = new Select(driver.findElement(By.id("AdmissionType")));
		        	st.selectByVisibleText("Through CAP/Govt. Quota");  
		       // 	driver.findElement(By.id("Cap_Percentage")).sendKeys(String.valueOf(CETMarks));
		         	
		        	
		        	// Wait for the 'Cap_Percentage' element to be clickable.
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		            WebElement capPercentageElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("Cap_Percentage")));

		            // Use JavaScript Executor to set the value of 'Cap_Percentage'.
		            JavascriptExecutor jsExecutor21 = (JavascriptExecutor) driver;
		            String script = "arguments[0].value = arguments[1];";
		            ((org.openqa.selenium.JavascriptExecutor) jsExecutor21).executeScript(script, capPercentageElement, String.valueOf(CETMarks));
		          
		        	
		        	
		        	
		        	Thread.sleep(2000);
		        	driver.findElement(By.id("CapID")).sendKeys(String.valueOf(ApplicationID));
		        	
//////*************
//Upload Document : 
		        		        	
		        	try {
		        	    WebElement fileInput = driver.findElement(By.id("FileNameCapCert")); 
                        Thread.sleep(2000);
		        	    // Encode the S3 URL
		        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
		        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3Url).build().toUriString();  
		        	    // Download the file from S3 to your local machine
		        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePath));

		        	    // Provide the local file path to the file input element
		        	    fileInput.sendKeys(localFilePath);

		        	    // Delete the downloaded file
		        	    File downloadedFile = new File(localFilePath);
		        	    if (downloadedFile.exists()) {
		        	        downloadedFile.delete();
		        	        System.out.println("Downloaded file deleted successfully.");
		        	    }  
		        	} catch (IOException e) {
		        	    System.out.println("Not work");
		        	    e.printStackTrace();
		        	}

		        	
		        			        	
// Year of study :
		        	Thread.sleep(1000);
		        	  Select s = new Select(driver.findElement(By.id("DegreeWiseYearID")));
		        	  s.selectByVisibleText( yearofstudy );
		        	  
//First year completed or pursuing : 
		        	  Thread.sleep(1000);
		        	  Select s1 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		        	  s1.selectByVisibleText( iscompleted); 
		        	  
//Admission date :
		        	//  driver.findElement(By.id("DateOfAdmission")).click();
		        	  
		        	 Thread.sleep(2000); 
		        	  WebElement dateInput = driver.findElement(By.id("DateOfAdmission"));
		        	  dateInput.click();

		        	  // Locate and click the specific date on the calendar
		        	  WebElement targetDate = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='1']"));
		        	  targetDate.click();
		        	 	  
		        	
//Fees Paid :
		        	  Thread.sleep(1000);
		        	  driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(feespaid ));
		        	  
		        	  
//Upload Fees/Admission Receipt/bonafide certificate : 

		        	  try {
		        		  
		        		  WebElement fileInput = driver.findElement(By.id("FileNameFeeReceipt")); 
		        		// Download the file from S3 to your local machine
		              //    FileUtils.copyURLToFile(new URL( s3url), new File( localfilepath));
		                  
		                  
		                    String encodeds3url = UriComponentsBuilder.fromHttpUrl(s3url).build().toUriString();  
			        	    // Download the file from S3 to your local machine
			        	    FileUtils.copyURLToFile(new URL(encodeds3url), new File(localfilepath));
		                  
		                  // Provide the local file path to the file input element
		                  fileInput.sendKeys(localfilepath);
			        
		                  
		                  
		                  // Delete the downloaded file
		                  File downloadedFile = new File( localfilepath);
		                  if (downloadedFile.exists()) {
		                      downloadedFile.delete();
		                      System.out.println("Downloaded file deleted successfully.");
		                  }  
		        		  
		        	  }catch (IOException e) {
			        	  System.out.println("Not work");
			              e.printStackTrace();
			          }
		        	  
//Is Admission Through Open Or Reserved Category :
 
                Select S3 = new Select(driver.findElement(By.id("CasteCategoryID")));
                S3.selectByVisibleText(category);
                Thread.sleep(1000);
 
//Mode :
                Select S4 = new Select(driver.findElement(By.id("EducationMode")));
                S4.selectByVisibleText(mode);
                Thread.sleep(1000);
		        	  
		        	   }
// Save button : 
		        Thread.sleep(2000);
		        
		 //       driver.findElement(By.id("btnSubmit")).click();
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(109).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(109).setCellValue("No");
	            }   
	            
	            // Save the changes back to the Excel file after each login
	            FileOutputStream outputStream = new FileOutputStream(src);
	            xsf.write(outputStream);

	            // Wait for a while before proceeding to the next user login
	            Thread.sleep(2000); 
		        
		        
		        
		        
		        
		        
		        
		            } catch (Exception e) {
		                e.printStackTrace();
		              
		                continue;
		            } 
		        
		        
		        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Past Qualification : 
		        try {
		        		
		        	
		        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("T_QualificationInformation1")));

		        	JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		        	((org.openqa.selenium.JavascriptExecutor) jsExecutor1).executeScript("arguments[0].scrollIntoView(true);", element);
		        	element.click();
		        	
		    //    driver.findElement(By.id("T_QualificationInformation1")).click();  
///10 th Standard : 
		        
//// Qualification Level:
		        
	            Select Qulification1 = new Select(driver.findElement(By.id("QualificationTypeID")));
	            Qulification1.selectByVisibleText(Qulificationlevel);
//Stream :	      
	          /*    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	              WebElement s12 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DegreeNameID")));
	              Select s12 = new Select(driver.findElement(By.id("DegreeNameID")));
	              
	               s12.selectByValue(String.valueOf(Stream));
		        */
	            Thread.sleep(2000);
	            Select s12 = new Select(driver.findElement(By.cssSelector("select.form-control#DegreeNameID")));
	            new Actions(driver).sendKeys(Keys.TAB).perform();
	            new Actions(driver).sendKeys(Keys.ENTER).perform();
	            new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
	            new Actions(driver).sendKeys(Keys.ENTER).perform();
	            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(s12.getWrappedElement()));
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", s12.getWrappedElement());
	            s12.selectByValue(String.valueOf(Stream));
	            
	            
	      /*      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 

	            // Wait for the element to be visible
	            WebElement degreeNameDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DegreeNameID")));
	            degreeNameDropdown.sendKeys(Keys.TAB);
	            degreeNameDropdown.sendKeys(Keys.ENTER);
	       //     degreeNameDropdown.sendKeys(Keys.ARROW_DOWN);
	            
	            // Use JavaScriptExecutor to select the option
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            ((org.openqa.selenium.JavascriptExecutor) js).executeScript("arguments[0].scrollIntoView(true);", degreeNameDropdown);
	             Select s1 = new Select(degreeNameDropdown);
	             s1.selectByVisibleText("SSC");
*/
	   //Institute State:  
	            Thread.sleep(1000);
	            Select state3 = new Select(driver.findElement(By.id("StateID")));
	            state3.selectByVisibleText(State3);
	 //Institute District 
	            Thread.sleep(1000);
	            Select district3 = new Select(driver.findElement(By.id("DistrictID")));
	            district3.selectByVisibleText( District3);
	            
	 //Institute Taluka : 
	            Thread.sleep(2000);
	            Select Taluka3 = new Select(driver.findElement(By.id("TalukaID")));
	            Taluka3.selectByVisibleText(taluka3);
	  //Course :  
	            Thread.sleep(1000);
	            Select course1 = new Select(driver.findElement(By.id("SubjectID")));
	            course1.selectByVisibleText(Course1);                  
		        
	   //Board/University :
	            Thread.sleep(2000);
	       //     Select board = new Select(driver.findElement(By.id("BoardUniversityID")));
	       //     board.selectByValue(String.valueOf(DBoard));
	         //   board.selectByVisibleText(DBoard);	
	
//Board : 	            
	            
	            
	            if(DBoard.equals("CBSE")||DBoard.equals("ICSE")) {
	            	
        	
        	
            	 Thread.sleep(2000);
  	        //     Select board = new Select(driver.findElement(By.id("BoardUniversityID")));
  	        //      board.selectByValue(String.valueOf(DBoard));
  	        //     board.selectByVisibleText(DBoard);	
            	 
            	 WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(10)); 
            	 WebElement boardDropdown = waitX.until(ExpectedConditions.visibilityOfElementLocated(By.id("BoardUniversityID")));

            	 // Now select an option from the dropdown
            	 Select board = new Select(boardDropdown);
          //  	 board.selectByValue(DBoard);
            	 board.selectByVisibleText(DBoard);
            	 
            	 
            	 
	        
//Mode 10 th :
	    //Mode :
	  	            Thread.sleep(1000);
	  	            Select mode1 = new Select(driver.findElement(By.id("EducationMode")));
	  	            mode1.selectByVisibleText(Mode1);
//Admission year :
	  	          //Admission Year 
	  	            Thread.sleep(1000);
	  	            Select year = new Select(driver.findElement(By.id("ddnAdmissionYr")));
	  	            year.selectByVisibleText(String.valueOf(Admissionyear));
	  		        
//	 //Passing year :
	  	          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	            Thread.sleep(2000);
	  	            Select Passyear1 = new Select(driver.findElement(By.id("ddnPassingYr")));
	  	            new Actions(driver).sendKeys(Keys.TAB).perform();
	  	            Passyear1.selectByVisibleText(String.valueOf(Passingyear));      

		        	
//	 Result :
	  	            Thread.sleep(1000);
	  	            Select resultt = new Select(driver.findElement(By.id("Result")));
	  	            resultt.selectByVisibleText(String.valueOf(result));
	  		          
	  	            
// Persentage :
	  	            Thread.sleep(2000);
	  	          driver.findElement(By.id("Percentage")).clear();
	  	            driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));
// Attempt : 
	  	            Thread.sleep(2000);
	  	            driver.findElement(By.id("Attempts")).sendKeys(String.valueOf(attempt));
	  	            
  	               //Upload Markshit :
		        
		        try {
	        	    WebElement fileInput = driver.findElement(By.id("FileName1")); 
                    Thread.sleep(2000);
	        	   
	        	    String encodedS3url = UriComponentsBuilder.fromHttpUrl(DURLL).build().toUriString();  
	        	    // Download the file from S3 to your local machine
	        	    FileUtils.copyURLToFile(new URL(encodedS3url), new File( machineurl1));

	        	    // Provide the local file path to the file input element
	        	    fileInput.sendKeys(machineurl1);

	        	    // Delete the downloaded file
	        	    File downloadedFile = new File(machineurl1);
	        	    if (downloadedFile.exists()) {
	        	        downloadedFile.delete();
	        	        System.out.println("Downloaded file deleted successfully.");
	        	    }  
	        	} catch (IOException e) {
	        	    System.out.println("Not work");
	        	    e.printStackTrace();
	        	}	  	            
	  	            
	  	            
	  	          	
		        	
		        }	        
		        else if(DBoard.equals("Maharstra board")) {
		        	
			        
    	//Mode 10 th :
    		          //Mode :
    		            Thread.sleep(1000);
    		            Select mode1 = new Select(driver.findElement(By.id("EducationMode")));
    		            mode1.selectByVisibleText(Modee);
    	//Admission year :
    		          //Admission Year 
    		            Thread.sleep(1000);
    		            Select year = new Select(driver.findElement(By.id("ddnAdmissionYr")));
    		            year.selectByVisibleText(String.valueOf(admissionyear));
    			        
//		 //Passing year :
    		          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		            Thread.sleep(2000);
    		            Select Passyear1 = new Select(driver.findElement(By.id("ddnPassingYr")));
    		            new Actions(driver).sendKeys(Keys.TAB).perform();
    		            Passyear1.selectByVisibleText(String.valueOf(passingyear));      
    			             
    	//Seat number :
    		            Thread.sleep(1000);
    		            driver.findElement(By.id("txtRollNo")).sendKeys(Seatnumber);
    			            
//Month Of Exam :
    		            Thread.sleep(1000);
    		            Select S4 = new Select(driver.findElement(By.id("ddnExsession")));
    		        //   S4.selectByVisibleText(monthofexam);
    		            S4.selectByValue(monthofexam);
    	//Marks Obtained:
    		            Thread.sleep(1000);
    		            driver.findElement(By.id("txtTotalMarksObtained")).sendKeys(String.valueOf(markobtain));
    		            
    		            
    	//Validation button : 
    		          driver.findElement(By.id("btnCallSSC_HSC_Service")).click();
    		            
    		         
    		           WebDriverWait waitZ = new WebDriverWait(driver, Duration.ofSeconds(20)); 
    		           WebElement elementZ = waitZ.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/button/span[1]")));

    		          // Scroll the element into view using JavaScript (optional)
    		           ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    		        // Create Actions instance to perform the click
    		          Actions actions = new Actions(driver);
    		          actions.moveToElement(elementZ).click().perform();
    		         
    	//Attempts :
    		           Thread.sleep(2000); 
    		           driver.findElement(By.id("Attempts")).sendKeys(String.valueOf(attempts)); 
    		           
    		           
		        	
		        	
		        	
		        }
		        else {
		        	System.out.println("Not Work");
		        }   
	            
	            
	            Thread.sleep(2000);
	            //Save Button
	      //      driver.findElement(By.id("btnAdd")).click();
	            
	         
	           
	           WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10));
	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = waitA.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(110).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(110).setCellValue("No");
	            }   
	            
	            // Save the changes back to the Excel file after each login
	            FileOutputStream outputStream = new FileOutputStream(src);
	            xsf.write(outputStream);

	            // Wait for a while before proceeding to the next user login
	            Thread.sleep(2000); 
	           
	           
	           
	           
	           
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            } 
	           
	           
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//12 Th Education details :
//Again click on Past education tab :
	           try {
	           driver.findElement(By.id("T_QualificationInformation1")).click();  
	           
//Qualification : 
	           
	            Select Qulification2 = new Select(driver.findElement(By.id("QualificationTypeID")));
	            Qulification2.selectByVisibleText(Qulifilevel);
	           
//	Stream :
	          //  Select s4 = new Select(driver.findElement(By.id("//*[@id=\"DegreeNameID\"]")));
	        //    s4.selectByVisibleText(Stream12);
	            
	            Thread.sleep(2000);
	            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(90));
	            WebElement degreeNameElement = wait2.until(ExpectedConditions.elementToBeClickable(By.id("DegreeNameID")));
	            degreeNameElement.sendKeys(Keys.TAB);
	            degreeNameElement.sendKeys(Keys.ENTER);
	            degreeNameElement.sendKeys(Keys.ARROW_DOWN);
	            degreeNameElement.sendKeys(Keys.ARROW_DOWN);
	            degreeNameElement.sendKeys(Keys.ARROW_DOWN);
	            degreeNameElement.sendKeys(Keys.ARROW_DOWN);
	            // Use JavaScript Executor to select the option by text.
	            JavascriptExecutor jsExecutorrr = (JavascriptExecutor) driver;
	            String script = "arguments[0].value = arguments[1];";
	            ((org.openqa.selenium.JavascriptExecutor) jsExecutorrr).executeScript(script, degreeNameElement, Stream12);
	            
	            
// Institute District : 
	            Thread.sleep(2000);
	            Select district4 = new Select(driver.findElement(By.id("DistrictID")));
	            district4.selectByVisibleText(dist);
	            
//Institute Taluka :
	            
	            //Institute Taluka : 
	            Thread.sleep(2000);
	            Select Taluka4 = new Select(driver.findElement(By.id("TalukaID")));
	            Taluka4.selectByVisibleText(tal);
	            
//College name :
	            Thread.sleep(2000);
	            Select s5 = new Select(driver.findElement(By.id("CollegeID")));
		        s5.selectByVisibleText(CollegeN);    
		        
//Course : 
		        Thread.sleep(2000);
		        driver.findElement(By.id("SubjectText")).sendKeys(Course);
///////////////////////////////
		        
		      /*  
		        if(Boardd.equals("CBSC")|| Boardd.equals("ICSE")) {
		        	
		        	
		        	
		        	 	
		        }
		        else if(Boardd.equals("MAHARASHTRA STATE BOARD OF SECONDARY AND HIGHER SECONDARY EDUCATION")) {
		        	
		        	
		        	
		        	
		        }
		        else {
		        	System.out.println("");
		        	
		        }
		  */      
		        
		        
//Board/University:
		   //     Thread.sleep(2000);
		        driver.findElement(By.id("BoardUniversityText")).sendKeys(Boardd);
//Mode :
		        Thread.sleep(2000);
		        Select S6 = new Select(driver.findElement(By.id("EducationMode")));
		        S6.selectByVisibleText(modde);
		        
// 	Admission Year : 
		        Thread.sleep(2000);
		        Select S5 = new Select(driver.findElement(By.id("ddnAdmissionYr")));
		        S5.selectByVisibleText(String.valueOf(Addyear));
// Passing Year :
		        Thread.sleep(2000);
		        Select s6 = new Select(driver.findElement(By.id("ddnPassingYr")));
		        s6.selectByVisibleText(String.valueOf(Passyear));
//	Result :
		        Thread.sleep(2000);
		        Select s7 = new Select(driver.findElement(By.id("Result")));
		        s7.selectByVisibleText(Resultt);
		        
//Percentage :
		        Thread.sleep(2000);
		        driver.findElement(By.id("Percentage")).clear();
		        driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage1));

		          
//Attempts :
		        Thread.sleep(2000);
		        driver.findElement(By.id("Attempts")).sendKeys(String.valueOf(Attempts));
		        
//Upload Markshit :
		        
		        try {
	        	    WebElement fileInput = driver.findElement(By.id("FileName1")); 
                    Thread.sleep(2000);
	        	   
	        	    String encodedS3url = UriComponentsBuilder.fromHttpUrl(DURL).build().toUriString();  
	        	    // Download the file from S3 to your local machine
	        	    FileUtils.copyURLToFile(new URL(encodedS3url), new File( machineurl));

	        	    // Provide the local file path to the file input element
	        	    fileInput.sendKeys(machineurl);

	        	    // Delete the downloaded file
	        	    File downloadedFile = new File(machineurl);
	        	    if (downloadedFile.exists()) {
	        	        downloadedFile.delete();
	        	        System.out.println("Downloaded file deleted successfully.");
	        	    }  
	        	} catch (IOException e) {
	        	    System.out.println("Not work");
	        	    e.printStackTrace();
	        	}
		        
//Was any Gap in this Qualification / Course ? :
		        Thread.sleep(2000);
		        if(gap.equals("Yes"))
		        {
		        	
		           driver.findElement(By.xpath("//*[@id=\"divgap\"]/div[1]/div/label[2]/span")).click();
		         //Gap Years :
		           driver.findElement(By.id("GapYears")).sendKeys(String.valueOf(GapYears)); 
// Gap Certificate : 
		           
		       /*    
		           try {
		        	    WebElement fileInput = driver.findElement(By.id("File1_Name")); 
	                    Thread.sleep(2000);
		        	   
		        	    String encodedS3url = UriComponentsBuilder.fromHttpUrl(GURL).build().toUriString();  
		        	    // Download the file from S3 to your local machine
		        	    FileUtils.copyURLToFile(new URL(encodedS3url), new File(Gapurl));

		        	    // Provide the local file path to the file input element
		        	    fileInput.sendKeys(Gapurl);

		        	    // Delete the downloaded file
		        	    File downloadedFile = new File(Gapurl);
		        	    if (downloadedFile.exists()) {
		        	        downloadedFile.delete();
		        	        System.out.println("Downloaded file deleted successfully.");
		        	    }  
		        	} catch (IOException e) {
		        	    System.out.println("Not work");
		        	    e.printStackTrace();
		        	}
		         */  
		           
		           
		           
		           
		           
		          
		           
		        }
		        else {
		        
		        driver.findElement(By.xpath("//*[@id=\"divgap\"]/div[1]/div/label[3]/span")).click();
		        
		        }
		        

		        
		     
		       
		        
//Save Button :
		      
		 //     driver.findElement(By.id("btnAdd")).click();
		        
		     
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(111).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(111).setCellValue("No");
	            }   
	            
	            // Save the changes back to the Excel file after each login
	            FileOutputStream outputStream = new FileOutputStream(src);
	            xsf.write(outputStream);

	            // Wait for a while before proceeding to the next user login
	            Thread.sleep(2000); 
		        
		        
		        
		        
		        
		        
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            } 
		        
		        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Hostel Details :
//Hotel details :
	//	 Thread.sleep(2000);
		   try {  
		  WebDriverWait waitt5 = new WebDriverWait(driver, Duration.ofSeconds(30));

		  // Wait for the element to be clickable
		  WebElement hostelDetailsElement = waitt5.until(ExpectedConditions.elementToBeClickable(By.linkText("Hostel Details")));
		  JavascriptExecutor jst = (JavascriptExecutor) driver;
		  ((org.openqa.selenium.JavascriptExecutor) jst).executeScript("arguments[0].scrollIntoView();", hostelDetailsElement);
		  hostelDetailsElement.click();
		     
		     
		     
		     
		     // driver.findElement(By.xpath("T_HostelDetails1")).click();
		      
		      if(Hostelar.equals("Hosteller")) {
//click on hostellar :		    	  
		    	  driver.findElement(By.xpath("//*[@id=\"BeneficiaryCategoryDiv\"]/div/div[1]/label/span")).click();
//
		    	  
		           
	  //State :
	            Thread.sleep(2000);
	            Select stat = new Select(driver.findElement(By.id("StateID")));
	            stat.selectByVisibleText(Hstate);
	            
	 //District :
	            Thread.sleep(2000);
	            Select dis = new Select(driver.findElement(By.id("DistrictID")));
	            dis.selectByVisibleText(Hdist);
	 //Taluka :
	            Thread.sleep(2000);
	            Select tall = new Select(driver.findElement(By.id("TalukaID")));
	            tall.selectByVisibleText(Htaluka);
//Hostel Type :
	            if( Hosteltype.equals("Govt. Hostel")) {
	            	 Select hostel = new Select(driver.findElement(By.id("HostelType")));
	                 hostel.selectByVisibleText(Hosteltype);
	                 
	                 Select hostel1 = new Select(driver.findElement(By.id("HostelID")));
	                 hostel1.selectByVisibleText(Hostelname);
	            	
	            }else {
	            	driver.findElement(By.id("HostelType")).sendKeys(Hosteltype);
	            	driver.findElement(By.id("HostelName")).sendKeys(Hosteladd);
		    	   
	            }  
		    	  
//Hostel Address : 
	            Thread.sleep(2000);
	            driver.findElement(By.id("HostelAddress")).sendKeys(Hosteladdress);
	            
 //  Hostel/ P.G/Rented House Pincode:
	            Thread.sleep(2000);
	            driver.findElement(By.id("HostelPincode")).sendKeys(String.valueOf(pincode1));
	            Thread.sleep(2000);	
	            
//Admission date :
	            //AdmissionDate
	            
	             Thread.sleep(2000);
	        	  WebElement dateInput = driver.findElement(By.id("AdmissionDate"));
	        	  dateInput.click();

	        	  // Locate and click the specific date on the calendar
	        	  WebElement targetDate = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='5']"));
	        	  targetDate.click();                                   
	            
	             Thread.sleep(3000);
	            
	            
	            
//Is Mess Available  :
	            
	            Thread.sleep(2000);
	            Select mess1 = new Select(driver.findElement(By.id("IsMessAvailable")));      
	            mess1.selectByVisibleText(mess);    

// Rent Per Month : 
	            Thread.sleep(2000);
	            driver.findElement(By.id("RentPerMonth")).clear();
	            driver.findElement(By.id("RentPerMonth")).sendKeys(String.valueOf(rent));   
	            
//Hosteller Certificate/Warden Certificate	            
	            try {
	        	    WebElement fileInput = driver.findElement(By.id("File1_Name")); 
                    Thread.sleep(2000);
	        	   
	        	    String encodedS3url = UriComponentsBuilder.fromHttpUrl(HURL).build().toUriString();  
	        	    // Download the file from S3 to your local machine
	        	    FileUtils.copyURLToFile(new URL(encodedS3url), new File(Hostelurl));

	        	    // Provide the local file path to the file input element
	        	    fileInput.sendKeys(Hostelurl);

	        	    // Delete the downloaded file
	        	    File downloadedFile = new File(Hostelurl);
	        	    if (downloadedFile.exists()) {
	        	        downloadedFile.delete();
	        	        System.out.println("Downloaded file deleted successfully.");
	        	    }  
	        	} catch (IOException e) {
	        	    System.out.println("Not work");
	        	    e.printStackTrace();
	        	}
	            
		      } 
		      else {
		    	  driver.findElement(By.xpath("//*[@id=\"BeneficiaryCategoryDiv\"]/div/div[2]/label/span")).click();
		      }
		      
	            
//Save button :
		      
		      
		 //     driver.findElement(By.id("btnSubmit")).click();
	            
 
// logout :
		  //    Select logout = new Select(driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button")));
		 //     logout.selectByVisibleText("Log Out");
		        
		      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSubmit")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(112).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(112).setCellValue("No");
	            }   
	            
	            // Save the changes back to the Excel file after each login
	            FileOutputStream outputStream = new FileOutputStream(src);
	            xsf.write(outputStream);

	            // Wait for a while before proceeding to the next user login
	            Thread.sleep(2000); 
		      
		 		    	  
		        
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            } 
		   //     Thread.sleep(2000);		        
		        
		 //     Select logout = new Select(driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button")));
		 //     logout.selectByVisibleText("Log Out");
		      Thread.sleep(2000);
		       WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button"));
		       logoutButton.click();   
		     
		   
		   
		   
	            }
		            
		        
	}

}
