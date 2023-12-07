package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.web.util.UriComponentsBuilder;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;




public class DocumentMahadbt {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//		 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		    WebDriverManager.chromedriver().setup();
		    
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	   
	        
	        
	   //   File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\A2.xlsx");
	 //     File src = new File("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\Excel_Data\\Excelsheet\\Ex.xlsx");
	       // File src = new File("src/main/java/Excel_Data/Excelsheet/Ex.xlsx");
	//      FileInputStream fis = new FileInputStream(src);
	        
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\Ex.xlsx");
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
	            String Caste1 = row.getCell(8).getStringCellValue();  
	            long  certificationNo = (long) row.getCell(9).getNumericCellValue(); 
	            String  district = row.getCell(10).getStringCellValue(); 
	            String  ApplicantName  = row.getCell(11).getStringCellValue(); 
	            String  Iss_Authority   = row.getCell(12).getStringCellValue(); 
	            String  s3Url = row.getCell(13).getStringCellValue(); 
	            String localFilePath  = row.getCell(14).getStringCellValue();
	        //      String Incomedate  = row.getCell(15).getStringCellValue();
	        //    long Incomedate   = (long) row.getCell(15).getNumericCellValue(); 
	       
	            
	            long  Anualincome = (long) row.getCell(15).getNumericCellValue(); 
	            String incer  = row.getCell(16).getStringCellValue();  
	            long   incomecerNo  = (long) row.getCell(17).getNumericCellValue(); 
	            String  IssAuthority = row.getCell(18).getStringCellValue();  
	            String  s3UrlIncome = row.getCell(19).getStringCellValue(); 
	            String  localFilePathincome = row.getCell(20).getStringCellValue(); 
	            String Domacile = row.getCell(21).getStringCellValue(); 
	            String domacileY = row.getCell(22).getStringCellValue(); 
	            String  relationtype = row.getCell(23).getStringCellValue();  
	            long   Domacileno  = (long) row.getCell(24).getNumericCellValue(); 
	            String  Applicantname = row.getCell(25).getStringCellValue();  
	            String  Authority  = row.getCell(26).getStringCellValue(); 
	            String  s3UrlDomasile = row.getCell(27).getStringCellValue(); 
	            String localFilePathdomacile  = row.getCell(28).getStringCellValue(); 
	            String  Personal_eligibility = row.getCell(29).getStringCellValue(); 
	            String  Jobtype  = row.getCell(30).getStringCellValue(); 
	            String Disability = row.getCell(31).getStringCellValue(); 
	            String Disability_Type = row.getCell(32).getStringCellValue(); 
	            String With_Disability = row.getCell(33).getStringCellValue(); 
	            String  Disability_Certificate = row.getCell(34).getStringCellValue(); 
	            long   Dis_Cer_No = (long) row.getCell(35).getNumericCellValue(); 
	            long Dis_Percentage  = (long) row.getCell(36).getNumericCellValue(); 
	            String   Issuing_Authority  = row.getCell(37).getStringCellValue(); 
	            String   s3UrlDisability     = row.getCell(38).getStringCellValue(); 
	            String localFilePathDisability = row.getCell(39).getStringCellValue(); 
//Address Information :
	            String Village = row.getCell(40).getStringCellValue(); 
	            String Correspo_Address = row.getCell(41).getStringCellValue(); 
	            String District = row.getCell(42).getStringCellValue(); 
	            String Taluka = row.getCell(43).getStringCellValue(); 
	            String address = row.getCell(44).getStringCellValue(); 
	            String State = row.getCell(45).getStringCellValue(); 
	            String district1 = row.getCell(46).getStringCellValue(); 
	            String Taluka1 = row.getCell(47).getStringCellValue(); 
	            String village1 = row.getCell(48).getStringCellValue(); 
	            long pincode = (long) row.getCell(49).getNumericCellValue(); 
	          
//Other Information : 
	            String Father = row.getCell(50).getStringCellValue(); 
	            String Fathername = row.getCell(51).getStringCellValue(); 
	            String Occupation = row.getCell(52).getStringCellValue();
	            String Salaried1 = row.getCell(53).getStringCellValue();
	            String Mother = row.getCell(54).getStringCellValue(); 
	            String Mothername = row.getCell(55).getStringCellValue(); 
	            String  Occup = row.getCell(56).getStringCellValue(); 
	            String  salrid  = row.getCell(57).getStringCellValue(); 
	            String  Guardianname = row.getCell(58).getStringCellValue(); 
	            String  Guardianaddress = row.getCell(59).getStringCellValue(); 
	         //   long Guardianaddress = (long) row.getCell(35).getNumericCellValue(); 
	            String GuardianOcuupation = row.getCell(60).getStringCellValue(); 
	            String  Guardiansallaried= row.getCell(61).getStringCellValue(); 
	            String  Relationtype = row.getCell(62).getStringCellValue(); 
	            String   s3UrlGuardian = row.getCell(63).getStringCellValue(); 
	            String localFilePathGuardian = row.getCell(64).getStringCellValue(); 
	            
//Current Course :	
	            
	            long AdmissionYear = (long) row.getCell(65).getNumericCellValue(); 
	            String  state  = row.getCell(66).getStringCellValue(); 
	            String  districtt    = row.getCell(67).getStringCellValue(); 
	            String  taluka   = row.getCell(68).getStringCellValue(); 
	            String  qualifilevel = row.getCell(69).getStringCellValue(); 
	            String  Streamm = row.getCell(70).getStringCellValue(); 
	            String  Ncollege = row.getCell(71).getStringCellValue(); 
	            long coursename = (long) row.getCell(72).getNumericCellValue(); 
	          //  String  coursename = row.getCell(41).getStringCellValue(); 
	            String  AdmissionType = row.getCell(73).getStringCellValue(); 
	            long CETMarks = (long) row.getCell(74).getNumericCellValue(); 
	            long ApplicationID = (long) row.getCell(75).getNumericCellValue(); 
	         //   String  ApplicationID = row.getCell(44).getStringCellValue(); 
	            String  s3UrlCurrent = row.getCell(76).getStringCellValue(); 
	            String  localFilePathCurrent  = row.getCell(77).getStringCellValue(); 
	            String  yearofstudy = row.getCell(78).getStringCellValue(); 
	            String  iscompleted = row.getCell(79).getStringCellValue(); 
	            long feespaid = (long) row.getCell(80).getNumericCellValue(); 
	            String  s3url = row.getCell(81).getStringCellValue(); 
	            String  localfilepath = row.getCell(82).getStringCellValue(); 
	            String  category = row.getCell(83).getStringCellValue(); 
	            String  mode = row.getCell(84).getStringCellValue(); 
	            
//Pass qulification : 
//10 th : 
	            String Qulificationlevel  = row.getCell(85).getStringCellValue(); 
	            long Stream = (long) row.getCell(86).getNumericCellValue(); 
	            String State3 = row.getCell(87).getStringCellValue(); 
	            String  District3 = row.getCell(88).getStringCellValue(); 
	            String  taluka3 = row.getCell(89).getStringCellValue(); 
	            String  Course1 = row.getCell(90).getStringCellValue();
	         //   long DBoard = (long) row.getCell(60).getNumericCellValue(); 
	            String  DBoard = row.getCell(91).getStringCellValue();
	        
	            String  Mode1 = row.getCell(92).getStringCellValue(); 
	            long Admissionyear = (long) row.getCell(93).getNumericCellValue(); 
	            long Passingyear = (long) row.getCell(94).getNumericCellValue(); 
	            
//////////////////	                  
	            String  result = row.getCell(95).getStringCellValue(); 
	            long Persentage = (long) row.getCell(96).getNumericCellValue(); 
	            long attempt = (long) row.getCell(97).getNumericCellValue();  
	            String DURLL = row.getCell(98).getStringCellValue(); 
	            String machineurl1   = row.getCell(99).getStringCellValue(); 
//If board is Maharashtra board :
	            
	            String  Modee = row.getCell(100).getStringCellValue(); 
	            long admissionyear = (long) row.getCell(101).getNumericCellValue(); 
	            long passingyear = (long) row.getCell(102).getNumericCellValue(); 
	            
		      //  long Seatnumber = (long) row.getCell(64).getNumericCellValue(); 
		        String  Seatnumber  = row.getCell(103).getStringCellValue(); 
		        String  monthofexam  = row.getCell(104).getStringCellValue(); 
		        long markobtain = (long) row.getCell(105).getNumericCellValue(); 
		        long  attempts = (long) row.getCell(106).getNumericCellValue();
/////////////////////////////////////////////////////////////////////////////////////////////////
//12 th : 
		        
		        
		      //12 th : 		         

	            String Qulifilevel  = row.getCell(107).getStringCellValue(); 
	            String Stream12 = row.getCell(108).getStringCellValue(); 
	            String dist = row.getCell(109).getStringCellValue(); 
	            String  tal = row.getCell(110).getStringCellValue(); 
	            String  CollegeN = row.getCell(111).getStringCellValue(); 
	            String  Course = row.getCell(112).getStringCellValue();      
	            String  Boardd = row.getCell(113).getStringCellValue(); 
	             
	            String  modde = row.getCell(114).getStringCellValue(); 
	            long  Addyear = (long) row.getCell(115).getNumericCellValue();  
	            long  Passyear = (long) row.getCell(116).getNumericCellValue(); 
	            String Resultt  = row.getCell(117).getStringCellValue();
	            long  Persentage1 = (long) row.getCell(118).getNumericCellValue(); 
	            long  Attempts = (long) row.getCell(119).getNumericCellValue(); 
	            String  DURL = row.getCell(120).getStringCellValue(); 
	            String  machineurl = row.getCell(121).getStringCellValue(); 
//	            
		        String  SeatNo_12Th  = row.getCell(122).getStringCellValue(); 
		        String  Exam_month  = row.getCell(123).getStringCellValue(); 
		        long  Mark_12Th = (long) row.getCell(124).getNumericCellValue(); 
//	            
	            
	            
	            
	            String  gap = row.getCell(125).getStringCellValue(); 
	            long GapYears  = (long) row.getCell(126).getNumericCellValue();
	            
	            
	            String  GURL = row.getCell(127).getStringCellValue();  
	            String Gapurl = row.getCell(128).getStringCellValue(); 
	            
	            
//Hostel details : 
	             
	            String Hostelar  = row.getCell(129).getStringCellValue();  
	            String Hstate  = row.getCell(130).getStringCellValue();  
	            String Hdist = row.getCell(131).getStringCellValue(); 
	            String Htaluka  = row.getCell(132).getStringCellValue(); 
	            String  Hosteltype = row.getCell(133).getStringCellValue(); 
	            String  Hostelname = row.getCell(134).getStringCellValue(); 
	            String  Hosteladd = row.getCell(135).getStringCellValue(); 
	            String  Hosteladdress = row.getCell(136).getStringCellValue(); 
	            long pincode1  = (long) row.getCell(137).getNumericCellValue(); 
	        //    long mess  = (long) row.getCell(94).getNumericCellValue(); 
	            String  mess= row.getCell(138).getStringCellValue(); 
	            long rent= (long) row.getCell(139).getNumericCellValue(); 
	            String HURL= row.getCell(140).getStringCellValue(); 
	            String  Hostelurl = row.getCell(141).getStringCellValue(); 

	            
	            
	            
	            
	            
	            
	       
        
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
    						     
    						     
    						  if(Caste1.equals("Yes")) { 
    							  
 //	Do you have Caste Certificate? :	  
    			                driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[2]/span")).click();
    			               
  //Caste Certificate Number : 
    	 //Caste Certificate Number:
    			                driver.findElement(By.id("CasteCertificateNumberNoBarcode")).sendKeys(String.valueOf(certificationNo));
    			                
      //Issuing District:
    			                Select Sq = new Select(driver.findElement(By.id("CasteDistrictCode")));
    			                Sq.selectByVisibleText(district);
    			                
      //Applicant Name:
    			                driver.findElement(By.id("CastePersonName")).sendKeys(ApplicantName);
    			                
     //Issuing Authority :
    			                Select sw = new Select(driver.findElement(By.id("CastCerIssuingAuth")));
    			                sw.selectByVisibleText(Iss_Authority);
    			                
    			                
 //Upload Caste Certificate : 
    				        	
			        	try {
			        		Thread.sleep(2000);
			        	    WebElement fileInput = driver.findElement(By.id("FileNameCastcert")); 
	                        Thread.sleep(2000);
			        	    // Encode the S3 URL
			        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
			        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3Url).build().toUriString();  
			        	    // Download the file from S3 to your local machine
			        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePath));

			        	    // Provide the local file path to the file input element
			        	    fileInput.sendKeys(localFilePath);

			        	    // Delete the downloaded file
			        /*	    File downloadedFile = new File(localFilePath);
			        	    if (downloadedFile.exists()) {
			        	        downloadedFile.delete();
			        	        System.out.println("Downloaded file deleted successfully.");
			        	    }  */
			        	} catch (IOException e) {
			        	    System.out.println("Not work");
			        	    e.printStackTrace();
			        	} 
			        	
			        	
			        	  Thread.sleep(2000); 
			        	  Robot robot = new Robot(); 	
			        	  robot.keyPress(KeyEvent.VK_ENTER);
			              robot.keyRelease(KeyEvent.VK_ENTER);
    //Date : 
		        	
		        	 Thread.sleep(2000);
		        	 WebDriverWait waitE = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        	 WebElement dateInput = waitE.until(ExpectedConditions.elementToBeClickable(By.id("CasteIssuingDate")));
		        	 dateInput.click();
		    //    	 Long Incomedate ;
		        	 WebElement targetDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='1']")));
		        	 JavascriptExecutor js = (JavascriptExecutor) driver;
		        	 js.executeScript("arguments[0].click();", targetDate);
		        	 	 
    						  }
    						  
    						  else {
    							  driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[3]/span")).click();
    						  }
   			               	          	
//////////////////////////
   //Anual Income : 			
    						  driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).clear();
    						   driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys(String.valueOf(Anualincome));
    				            Thread.sleep(2000);		                
    			                
 //Income certificate : 
    				            
    				            
    				         if(incer.equals("Yes")) {   
    			                
				        	 //Do you have Income Certificate?:
					            
					            driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[2]/span")).click();
					            
					          //Income Certificate No: 
					           driver.findElement(By.id("IncomeCertNo")).sendKeys(String.valueOf(incomecerNo));
					       
					          //Issuing Authority:
					           Thread.sleep(2000);
					           Select se = new Select(driver.findElement(By.id("IssuingAuthorityNoBarcode")));
					           se.selectByVisibleText(IssAuthority);     
			                
					           Thread.sleep(2000); //Income Certificate  Upload : 
					           
					           try {
					            Thread.sleep(5000);
   				        	    WebElement fileInput = driver.findElement(By.id("FileNameIncomecert")); 
   		                        Thread.sleep(2000);
   				        	    // Encode the S3 URL
   				        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
   				        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlIncome).build().toUriString();  
   				        	    // Download the file from S3 to your local machine
   				        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathincome));

   				        	    // Provide the local file path to the file input element
   				        	    fileInput.sendKeys(localFilePathincome);

   				        	    // Delete the downloaded file
   				        	    File downloadedFile = new File(localFilePathincome);
   				        	    if (downloadedFile.exists()) {
   				        	        downloadedFile.delete();
   				        	        System.out.println("Downloaded file deleted successfully.");
   				        	    }  
   				        	} catch (IOException e) {
   				        	    System.out.println("Not work");
   				        	    e.printStackTrace();
   				        	}  

					          Thread.sleep(2000);
					          Robot robot = new Robot(); 	
 				        	  robot.keyPress(KeyEvent.VK_ENTER);
 				              robot.keyRelease(KeyEvent.VK_ENTER);    
					          
					           
   			                 
// Income certificate date : 
					           
					           
			              Thread.sleep(2000); 
			              
			          
			              WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(20)); 
			              WebElement dateInput1 = waitA.until(ExpectedConditions.elementToBeClickable(By.id("DateOfIssue")));
			              dateInput1.click();
			              WebElement targetDate1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='1']")));
			              JavascriptExecutor js = (JavascriptExecutor) driver;
			              js.executeScript("arguments[0].click();", targetDate1);
			               
    				         }
			        	  else {
			        		  driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[3]/span")).click();
			        		  
			        	  }
			        	  
			        	  
			           
////////////////////////
//Domicile Details : 
			        	  if(Domacile.equals("Yes")) {
			        		  
					           
			        		  //Domicile Details:
					           
					           driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
					           Thread.sleep(2000);
					           if(domacileY.equals("Yes")) {
					           driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[2]/span")).click();
					           Thread.sleep(2000); 
					         
					          
					           //Relation Type : 
					           Select see = new Select(driver.findElement(By.id("DomicileRelation")));
					           see.selectByVisibleText(relationtype);
					           
					           //Domicile Certificate No : 
					           
					           driver.findElement(By.id("DomicileCertNo")).sendKeys(String.valueOf(Domacileno));
					           
					           //Applicant Name:
					           driver.findElement(By.id("DomicileNoBarcodePersonName")).sendKeys(Applicantname);
					           
					          //Issuing Authority:
					           
					           Select sr1 = new Select(driver.findElement(By.id("DomicileNoBarcodeIssuingAuth")));
					           sr1.selectByVisibleText(Authority);
					           
//Domicile Certificate : 
					           
					           try {
					        	    Thread.sleep(2000);
	   				        	    WebElement fileInput = driver.findElement(By.id("Domicileupload")); 
	   		                        Thread.sleep(2000);
	   				        	    // Encode the S3 URL
	   				        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
	   				        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlDomasile).build().toUriString();  
	   				        	    // Download the file from S3 to your local machine
	   				        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathdomacile));

	   				        	    // Provide the local file path to the file input element
	   				        	    fileInput.sendKeys(localFilePathdomacile);

	   				        	    // Delete the downloaded file
	   				        	    File downloadedFile = new File(localFilePathdomacile);
	   				        	    if (downloadedFile.exists()) {
	   				        	        downloadedFile.delete();
	   				        	        System.out.println("Downloaded file deleted successfully.");
	   				        	    }  
	   				        	} catch (IOException e) {
	   				        	    System.out.println("Not work");
	   				        	    e.printStackTrace();
	   				        	}  
					           Thread.sleep(2000);  
					          Robot robot = new Robot(); 	
 				        	  robot.keyPress(KeyEvent.VK_ENTER);
 				              robot.keyRelease(KeyEvent.VK_ENTER);
					           
	   			                       
//Date of issuing : 
					           
					             Thread.sleep(2000); 
					             
					             WebDriverWait waitP = new WebDriverWait(driver, Duration.ofSeconds(10)); 
					             WebElement dateInput1 = waitP.until(ExpectedConditions.elementToBeClickable(By.id("DomicileIssueDate")));
					             dateInput1.click();
					             WebElement targetDate1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='1']")));

					             JavascriptExecutor js = (JavascriptExecutor) driver;
					             js.executeScript("arguments[0].click();", targetDate1);
					                
			        	  }
			        	 
			        	  else {
			        		  driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[3]/span")).click();
			        		  
			        	  }   
			        	  }
			        	  else {
				        	   driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[3]/span")).click(); 
				           }
			        	  
    					 }   
  //Personal Eligibility Details : 
  //
			            
			            
				           if(Personal_eligibility.equals("Yes")) {
				           Select sr2 = new Select(driver.findElement(By.id("IsSalaried")));
				           sr2.selectByVisibleText(Personal_eligibility);
				           
//    				           Job Type :
				           Select sr3 = new Select(driver.findElement(By.id("JobType")));
				           sr3.selectByVisibleText(Jobtype);
				           
				         
				           } 
				           else if(Personal_eligibility.equals("No")) {
				        	   Select sr4 = new Select(driver.findElement(By.id("IsSalaried")));
					           sr4.selectByVisibleText("No");  
				           }
//				           
				           
//				         boolean personIsDisabled = false;
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
		        	    
		        	    if( Disability_Certificate.equals("Yes")) {
		        	    	
		        	    driver.findElement(By.xpath("//*[@id=\"IsDisabilityDiv\"]/div[3]/div/label[2]/span")).click();	
//Disability Certificate Number :
		        	  driver.findElement(By.id("DisabilityNoBarcodeCertNo")).sendKeys(String.valueOf(Dis_Cer_No));  	
//Disability Percentage :
		        	  driver.findElement(By.id("DisabilityPercentageNoBarcode")).sendKeys(String.valueOf(Dis_Percentage));  
// Issuing Authority: 
		        	  Select sr6 = new Select(driver.findElement(By.id("DisabilityCerIssuingAuthNoBarcode")));
		        	  sr6.selectByVisibleText(Issuing_Authority);		  
		        	  
//Disability Certificate : 
		        	  
		        	  try {
			        	    Thread.sleep(2000);
				        	    WebElement fileInput = driver.findElement(By.id("FileNameDisability")); 
		                        Thread.sleep(2000);
				        	    // Encode the S3 URL
				        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
				        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlDisability).build().toUriString();  
				        	    // Download the file from S3 to your local machine
				        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathDisability));

				        	    // Provide the local file path to the file input element
				        	    fileInput.sendKeys(localFilePathDisability);

				        	    // Delete the downloaded file
				        	    File downloadedFile = new File(localFilePathDisability);
				        	    if (downloadedFile.exists()) {
				        	        downloadedFile.delete();
				        	        System.out.println("Downloaded file deleted successfully.");
				        	    }  
				        	} catch (IOException e) {
				        	    System.out.println("Not work");
				        	    e.printStackTrace();
				        	} 
	// PopUp :
		        	  
		        	  Thread.sleep(2000);
			          Robot robot = new Robot(); 	
		        	  robot.keyPress(KeyEvent.VK_ENTER);
		              robot.keyRelease(KeyEvent.VK_ENTER);    
	        	  
//Date of issuing : 
		              
		               Thread.sleep(2000); 
			             
			             WebDriverWait waitS = new WebDriverWait(driver, Duration.ofSeconds(10)); 
			             WebElement dateInput1 = waitS.until(ExpectedConditions.elementToBeClickable(By.id("DisabilityCerIssueDate")));
			             dateInput1.click();
			             WebElement targetDate1 = waitS.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='1']")));

			             JavascriptExecutor js = (JavascriptExecutor) driver;
			             js.executeScript("arguments[0].click();", targetDate1);
		      
		        	    }
		        	    else {
		        	    
		        	    driver.findElement(By.xpath("//*[@id=\"IsDisabilityDiv\"]/div[3]/div/label[3]/span")).click();
		        	    }
				          
				       	} else {
				        	   
			        		
			        		Select sr7 = new Select(driver.findElement(By.id("IsDisability")));
			        		sr7.selectByVisibleText("No");
			        		
			        	}			        	          
				          
 //Aadhaar Bank Details : 
	        	  
  //Adhar link: 
	  		           driver.findElement(By.xpath("//*[@id=\"BankDetails\"]/div[1]/div/label[2]/span")).click();  			            
	            
	            
  // Save Inforamation : 
	  		           
	  		       //   driver.findElement(By.id("btnAdd")).click();     
	  		           
// Sucess button PopUp : 
	  		     //    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
	  		           
	  		         
	  		         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  		       //   String columnName = "PerInfo";
			            try {
			              
			                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));
			                row.createCell(142).setCellValue("Yes");
			            } catch (TimeoutException e) {

			                row.createCell(142).setCellValue("No");
			      
			           }   
			     
			            FileOutputStream outputStream = new FileOutputStream(src);
			            xsf.write(outputStream);
			            Thread.sleep(2000);   
			            
			         
			            
		            } catch (Exception e) {
		                e.printStackTrace();
		              
		                continue;
		            }       
			               
	  		          	  		           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Address Information : 
	  		           
 //click on Address Button to fill the data 
				    try {
				    	
			        driver.findElement(By.id("T_AddressInformation1")).click();
			        Thread.sleep(2000);            
			       
			//1] Village details :
			        driver.findElement(By.id("Village")).sendKeys(Village);
			        Thread.sleep(2000);  		            
			       
			//Is Correspondence Address same as Permanent?   
			           
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
			//	  driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
				    
			// Sucess Option :
				    
		 //  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
				    
				    
				    
				    
				 
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			        try {
			            // Check if a success condition exists on the page
			            WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));
			
			            // If success condition is met, write "Yes" to Excel
			            row.createCell(143).setCellValue("Yes");
			        } catch (TimeoutException e) {
			
			            row.createCell(143).setCellValue("No");
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
//
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
				
//	Guradian information : 
//Guardian Name : 
				
				driver.findElement(By.id("GuardianName")).sendKeys(Guardianname);
// Guardian Address":
				driver.findElement(By.id("GuardianAddress")).sendKeys(String.valueOf(Guardianaddress));
//Occupation :
				
				Select GuardianOcuu = new Select(driver.findElement(By.id("GuardianOccupationID")));
				GuardianOcuu.selectByVisibleText(GuardianOcuupation);
				Thread.sleep(2000);
				
//Is Guardian Salaried : 
				Select GuardianSall = new Select(driver.findElement(By.id("IsGuardianSalaried")));
				GuardianSall.selectByVisibleText(Guardiansallaried);
				Thread.sleep(2000);
				
				
				
//Relation Type :
				
				Select Gua_relation= new Select(driver.findElement(By.id("RelationTypeID")));
				Gua_relation.selectByVisibleText(Relationtype);
				Thread.sleep(2000);
//  Upload Proof Of RelationShip:
				
				  try {
		        	    Thread.sleep(2000);
			        	    WebElement fileInput = driver.findElement(By.id("FileNameProofOfRelationShip")); 
	                        Thread.sleep(2000);
			        	    // Encode the S3 URL
			        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
			        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlGuardian).build().toUriString();  
			        	    // Download the file from S3 to your local machine
			        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathGuardian));

			        	    // Provide the local file path to the file input element
			        	    fileInput.sendKeys(localFilePathGuardian);

			        	    // Delete the downloaded file
			        	    File downloadedFile = new File(localFilePathGuardian);
			        	    if (downloadedFile.exists()) {
			        	        downloadedFile.delete();
			        	        System.out.println("Downloaded file deleted successfully.");
			        	    }  
			        	} catch (IOException e) {
			        	    System.out.println("Not work");
			        	    e.printStackTrace();
			        	} 
				
				  Thread.sleep(2000);
		          Robot robot = new Robot(); 	
	        	  robot.keyPress(KeyEvent.VK_ENTER);
	              robot.keyRelease(KeyEvent.VK_ENTER);   
				
			}
	//Save button :
			//	  driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
// Sucess PopUp :
			//	driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				try {
				// Check if a success condition exists on the page
				WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));
				
				// If success condition is met, write "Yes" to Excel
				row.createCell(144).setCellValue("Yes");
				} catch (TimeoutException e) {
				
				row.createCell(144).setCellValue("No");
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
		           District1.selectByVisibleText( districtt );
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
		            
		            Thread.sleep(4000) ; 
		            WebDriverWait waittt = new WebDriverWait(driver, Duration.ofSeconds(100));
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
		        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlCurrent).build().toUriString();  
		        	    // Download the file from S3 to your local machine
		        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathCurrent));

		        	    // Provide the local file path to the file input element
		        	    fileInput.sendKeys(localFilePathCurrent);

		        	    // Delete the downloaded file
		        	    File downloadedFile = new File(localFilePathCurrent);
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
		        
		   //    driver.findElement(By.id("btnSubmit")).click();
// Sucess Button : 
		  //    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
		        
		        
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            try {
	                // Check if a success condition exists on the page
	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));

	                // If success condition is met, write "Yes" to Excel
	                row.createCell(145).setCellValue("Yes");
	            } catch (TimeoutException e) {

	                row.createCell(145).setCellValue("No");
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
		  		        
//		 //Passing year :
		  	          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	            Thread.sleep(2000);
		  	            Select Passyear1 = new Select(driver.findElement(By.id("ddnPassingYr")));
		  	            new Actions(driver).sendKeys(Keys.TAB).perform();
		  	            Passyear1.selectByVisibleText(String.valueOf(Passingyear));      

			        	
//		 Result :
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
			        else if(DBoard.equals("MAHARASHTRA STATE BOARD OF SECONDARY AND HIGHER SECONDARY EDUCATION")) {
			     //  
			        	
			       	 WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	            	 WebElement boardDropdown = waitX.until(ExpectedConditions.visibilityOfElementLocated(By.id("BoardUniversityID")));
	            	 Select board = new Select(boardDropdown);
	          //  	 board.selectByValue(DBoard);
	            	 board.selectByVisibleText(DBoard);
			        	
			        	
			        	
				        
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
	    			        
//			 //Passing year :
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
	    		            Thread.sleep(2000);
	    		     /*     driver.findElement(By.id("btnCallSSC_HSC_Service")).click();
	    		          
	    		           WebDriverWait waitZ = new WebDriverWait(driver, Duration.ofSeconds(40));
	    		         
	    		    //       WebElement elementZ = waitZ.until(ExpectedConditions.elementToBeClickable(By.className("ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close")));
  
	    		          WebElement elementZ = waitZ.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/button")));
	    		        //   Thread.sleep(3000);
	    		           ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    		         Actions actions = new Actions(driver);
	    		          Thread.sleep(3000);
	    		        //  elementZ.click();
	    		         actions.moveToElement(elementZ).click().perform();
	    		          Thread.sleep(5000);
	    		      */
	    		            
	    		            driver.findElement(By.id("btnCallSSC_HSC_Service")).click();

	    		            WebDriverWait waitZ = new WebDriverWait(driver, Duration.ofSeconds(40));

	    		            // The page may change after the button click; re-locate the element
	    		            WebElement elementZ = waitZ.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/button")));

	    		            // Scroll to the element (if needed)
	    		            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementZ);

	    		            Actions actions = new Actions(driver);

	    		            // Wait for the element to be clickable (if necessary)
	    		            waitZ.until(ExpectedConditions.elementToBeClickable(elementZ));

	    		            // Click the element
	    		            actions.moveToElement(elementZ).click().perform();
     
	    		            
	    		            
	    		            
	    		            
	    		               
	    	//Attempts :
	    		           Thread.sleep(4000); 
	    		         //  driver.findElement(By.id("Attempts")).sendKeys(String.valueOf(attempts)); 
	    		           
	    		         WebDriverWait waitY = new WebDriverWait(driver, Duration.ofSeconds(10));
	    		         WebElement attemptsElement = waitY.until(ExpectedConditions.visibilityOfElementLocated(By.id("Attempts")));
	    		        String attemptsValue = String.valueOf(attempts);
	    		        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", attemptsElement, attemptsValue);  
	    		                    
			        }
			        else {
			        	System.out.println("Not Work");
			        }   
		            
		            
		            Thread.sleep(2000);
 //Save Button
		       //     driver.findElement(By.id("btnAdd")).click();
//Sucess Button : 
		       //     driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
		            
		            
		            
		         
		           
		           WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10));
		            try {
		                // Check if a success condition exists on the page
		                WebElement successElement = waitA.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));

		                // If success condition is met, write "Yes" to Excel
		                row.createCell(146).setCellValue("Yes");
		            } catch (TimeoutException e) {

		                row.createCell(146).setCellValue("No");
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
			        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		           
      //12 Th Education details :
      //Again click on Past education tab :
      	           try {
      	           driver.findElement(By.id("T_QualificationInformation1")).click();  
      	           
      //Qualification : 
      	           
      	            Select Qulification2 = new Select(driver.findElement(By.id("QualificationTypeID")));
      	            Qulification2.selectByVisibleText(Qulifilevel);
      	           
//			      	Stream :
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      		        
      		       
      //		        if(Boardd.equals("CBSE")|| Boardd.equals("ICSE")) {
      		        	
      		        	
      //Board/University:
      	          Thread.sleep(2000);
      	          driver.findElement(By.id("BoardUniversityText")).sendKeys(Boardd);	
      		        	
   //Mode :
          		        Thread.sleep(2000);
          		        Select S6 = new Select(driver.findElement(By.id("EducationMode")));
          		        S6.selectByVisibleText(modde);
          		        
//	Admission Year : 
          		        Thread.sleep(2000);
          		        Select S5 = new Select(driver.findElement(By.id("ddnAdmissionYr")));
          		        S5.selectByVisibleText(String.valueOf(Addyear));
 // Passing Year :
          		        Thread.sleep(2000);
          		        Select s6 = new Select(driver.findElement(By.id("ddnPassingYr")));
          		        s6.selectByVisibleText(String.valueOf(Passyear));
// 	Result :
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

      		        	
      		        
      		        	 	
      		        	 	
      		        Thread.sleep(3000);	 	
      		  //      }
      		/*        else if(Boardd.equals("MAHARASHTRA STATE BOARD OF SECONDARY AND HIGHER SECONDARY EDUCATION")) {
      		        
     //Board/University:
        	          Thread.sleep(2000);
        	          driver.findElement(By.id("BoardUniversityText")).sendKeys(Boardd);	  		        	
      		        	
  //Mode :
          		        Thread.sleep(2000);
          		        Select S6 = new Select(driver.findElement(By.id("EducationMode")));
          		        S6.selectByVisibleText(modde);
          		        
//	Admission Year : 
          		        Thread.sleep(2000);
          		        Select S5 = new Select(driver.findElement(By.id("ddnAdmissionYr")));
          		        S5.selectByVisibleText(String.valueOf(Addyear));
 // Passing Year :
          		        Thread.sleep(2000);
          		        Select s6 = new Select(driver.findElement(By.id("ddnPassingYr")));
          		        s6.selectByVisibleText(String.valueOf(Passyear));
                    
//Seat Number : 
          		        Thread.sleep(4000);
          		        driver.findElement(By.id("txtRollNo")).sendKeys(SeatNo_12Th);
          		        
// Month of exam :
          		        Select SS =new Select(driver.findElement(By.id("ddnExsession")));
          		        SS.selectByValue(Exam_month);
// Mark obtain in 12 th : 
          		        driver.findElement(By.id("txtTotalMarksObtained")).sendKeys(String.valueOf(Mark_12Th));
      		        	
 //validation of 12 th  :      		        	
      		        	
          		    driver.findElement(By.id("btnCallSSC_HSC_Service")).click();

  		            WebDriverWait waitZ = new WebDriverWait(driver, Duration.ofSeconds(40));

  		            // The page may change after the button click; re-locate the element
  		            WebElement elementZ = waitZ.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/button")));

  		            // Scroll to the element (if needed)
  		            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementZ);

  		            Actions actions = new Actions(driver);

  		            // Wait for the element to be clickable (if necessary)
  		            waitZ.until(ExpectedConditions.elementToBeClickable(elementZ));

  		            // Click the element
  		            actions.moveToElement(elementZ).click().perform();
      		        	
      		        	
      		        	
      		        	
      		        	
      		        }
      		        else {
      		        	System.out.println("Not Work");
      		        	
      		        }
      		       
      		  */      
      		        
 //Board/University:
      		   //     Thread.sleep(2000);
      		  //      driver.findElement(By.id("BoardUniversityText")).sendKeys(Boardd);
           		        
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
      		      
      		//      driver.findElement(By.id("btnAdd")).click();
  //Sucess Button : 
      		//     driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
      		        
      		     
      		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      	            try {
      	                // Check if a success condition exists on the page
      	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));

      	                // If success condition is met, write "Yes" to Excel
      	                row.createCell(147).setCellValue("Yes");
      	            } catch (TimeoutException e) {

      	                row.createCell(147).setCellValue("No");
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////     		        
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
       		      
       		      
       	//	   driver.findElement(By.id("btnSubmit")).click();
       		      
 // Sucess Button : 
       		      
       //	   driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();
       	            
        
       // logout :
       		  //    Select logout = new Select(driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button")));
       		 //     logout.selectByVisibleText("Log Out");
       		       
       		      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       	            try {
       	                // Check if a success condition exists on the page
       	                WebElement successElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")));

       	                // If success condition is met, write "Yes" to Excel
       	                row.createCell(148).setCellValue("Yes");
       	            } catch (TimeoutException e) {

       	                row.createCell(148).setCellValue("No");
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
