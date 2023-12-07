package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.web.util.UriComponentsBuilder;

public class Renewal_MahaDBT_WithAllDocument {

	public static void main(String[] args) throws Exception {

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	   
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\RenewalMahadbt.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);
	        Workbook workbook = new XSSFWorkbook();   
	        
	        
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            
	          
	            String Login  = row.getCell(0).getStringCellValue();
	            String Password = row.getCell(1).getStringCellValue();  
	        //    String Anualincome = row.getCell(1).getStringCellValue();  
	            long Anualincome = (long) row.getCell(2).getNumericCellValue(); 
	            String IncomeCer = row.getCell(3).getStringCellValue(); 
	            long incomecerNo = (long) row.getCell(4).getNumericCellValue(); 
	            String IssAuthority = row.getCell(5).getStringCellValue(); 
	            String s3UrlIncome = row.getCell(6).getStringCellValue();  
	            String localFilePathIncome = row.getCell(7).getStringCellValue();  
	            String Domacile = row.getCell(8).getStringCellValue();  
	            String DCertificate = row.getCell(9).getStringCellValue();  
	            String relationtype = row.getCell(10).getStringCellValue();  
	            long Domacileno = (long) row.getCell(11).getNumericCellValue(); 
	            String Applicantname = row.getCell(12).getStringCellValue();  
	            String Authority = row.getCell(13).getStringCellValue();  
	            String s3UrlDomacile  = row.getCell(14).getStringCellValue();  
	            String localFilePathDomacile  = row.getCell(15).getStringCellValue(); 
	            String YearOfStudy  = row.getCell(16).getStringCellValue(); 
	            String YearCom_Pursuving  = row.getCell(17).getStringCellValue(); 
	            long Admissionyear = (long) row.getCell(18).getNumericCellValue(); 
	            long Persentage = (long) row.getCell(18).getNumericCellValue(); 
	        //    String Persentage  = row.getCell(19).getStringCellValue(); 
	            String  Result  = row.getCell(20).getStringCellValue(); 
	          
	            
	            long FeesPaid  = (long) row.getCell(21).getNumericCellValue(); 
	            String  HostelType   = row.getCell(22).getStringCellValue(); 
	            String  HostelName   = row.getCell(23).getStringCellValue(); 
	            String  HostelAddress     = row.getCell(24).getStringCellValue(); 
	            long pincode  = (long) row.getCell(25).getNumericCellValue(); 
	            String  mess = row.getCell(26).getStringCellValue(); 
	            long  rent = (long) row.getCell(27).getNumericCellValue(); 
	            
	            
	            
	           
	            
	            
	         
	            
	            
	            
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
		           
		            
 // Annual income : 
		            
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys(String.valueOf(Anualincome));
		            Thread.sleep(2000);
		            	            
// Income Certificate : 
		            
		            if(IncomeCer.equals("Yes")) {
//Income Yes : 		            	
		            	driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[2]/span")).click();
// Income certificate no.:
		            	   //Income Certificate No: 
				           driver.findElement(By.id("IncomeCertNo")).sendKeys(String.valueOf(incomecerNo));
// Issuing Authority :     
				           Select se = new Select(driver.findElement(By.id("IssuingAuthorityNoBarcode")));
				           se.selectByVisibleText(IssAuthority); 
		            	
//Income Certificate :
//Upload Document :				           
				       	try {
			        	    WebElement fileInput = driver.findElement(By.id("FileNameIncomecert")); 
	                        Thread.sleep(2000);
			        	    // Encode the S3 URL
			        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
			        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlIncome).build().toUriString();  
			        	    // Download the file from S3 to your local machine
			        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathIncome));

			        	    // Provide the local file path to the file input element
			        	    fileInput.sendKeys(localFilePathIncome);

			        	    // Delete the downloaded file
			        	    File downloadedFile = new File(localFilePathIncome);
			        	    if (downloadedFile.exists()) {
			        	        downloadedFile.delete();
			        	        System.out.println("Downloaded file deleted successfully.");
			        	    }  
			        	} catch (IOException e) {
			        	    System.out.println("Not work");
			        	    e.printStackTrace();
			        	}

				        	
		            }
		            else if(IncomeCer.equals("No")) {
				    
		              driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[3]/span")).click();
		            	
				    }
		            else {
		            	
		            	System.out.println("Income Certificate not upload");
		            }
//Date Of Issue : 
		            
		            
		        	  
		        	  WebElement dateInput = driver.findElement(By.id("DateOfIssue"));
		        	  dateInput.click();

		        	  // Locate and click the specific date on the calendar
		        	  WebElement targetDate = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='15']"));
		        	  targetDate.click();
		        	 	     
//Are you Domicile of Maharashtra / Maharashtra-Karnataka Border ? :
		        	  
		        	  
		            
		            
		        	  if(Domacile.equals("Yes")) {
			           driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
			           Thread.sleep(2000);
			           if( DCertificate.equals("Yes")) {
//Do you have Domicile Certificate ?:
			        	   
			        	   driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[2]/span")).click();
//Relationship Type			        	   
				           Select see = new Select(driver.findElement(By.id("DomicileRelation")));
				           see.selectByVisibleText(relationtype);   
//Domicile Certificate No : 
				           driver.findElement(By.id("DomicileCertNo")).sendKeys(String.valueOf(Domacileno));			        	  				         
//Applicant Name:

				           driver.findElement(By.id("DomicileNoBarcodePersonName")).sendKeys(Applicantname);
				           
 //Issuing Authority:
				           
				           Select sr1 = new Select(driver.findElement(By.id("DomicileNoBarcodeIssuingAuth")));
				           sr1.selectByVisibleText(Authority);			        	   
//Domacile upload :
				           
				           
				        	try {
				        	    WebElement fileInput = driver.findElement(By.id("Domicileupload")); 
		                        Thread.sleep(2000);
				        	    // Encode the S3 URL
				        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
				        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3UrlDomacile).build().toUriString();  
				        	    // Download the file from S3 to your local machine
				        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePathDomacile));

				        	    // Provide the local file path to the file input element
				        	    fileInput.sendKeys(localFilePathDomacile);

				        	    // Delete the downloaded file
				        	    File downloadedFile = new File(localFilePathDomacile);
				        	    if (downloadedFile.exists()) {
				        	        downloadedFile.delete();
				        	        System.out.println("Downloaded file deleted successfully.");
				        	    }  
				        	} catch (IOException e) {
				        	    System.out.println("Not work");
				        	    e.printStackTrace();
				        	}
				        	
				        	
				        	
				        	
//Date of issuing : 
				        	
				           
				        	  
		        	  WebElement dateInput1 = driver.findElement(By.id("DomicileIssueDate"));
		        	  dateInput1.click();

		        	  // Locate and click the specific date on the calendar
		        	  WebElement targetDate1 = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']//td[@class='day' and text()='15']"));
		        	  targetDate1.click();
		        	  
		        	  
		        	  
		       	   
			           }
			           
			            
		        	  }
		        	  else {
		        		  System.out.println("Not work");
		        		  
		        	  }	  
		        	  
		        	  
		        	  
		        	  
		        	  
		        	  
		        	 	                
//	Year of Study : 
		        	  
		        	  Select s = new Select(driver.findElement(By.id("DegreeWiseYearID")));
		              s.selectByVisibleText(YearOfStudy);  
		        	  
//		        	  
				           
				           
		              switch (YearCom_Pursuving) {
		                case "Third Year Completed":
		                    Select s2 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s2.selectByVisibleText(YearCom_Pursuving);
	                         
		                    Thread.sleep(1000);
		                    // Admission Year in College
		                    Select s3 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s3.selectByVisibleText(String.valueOf(Admissionyear));
	                        Thread.sleep(2000);
		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s4 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s4.selectByVisibleText(Result);
	                        Thread.sleep(2000);
		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
		                    break;

		                case "Third Year Pursuing":
		                    Select s5 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s5.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
		                    break;
		                    
						case "Second Year Completed":
		                    Select s6 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s6.selectByVisibleText(YearCom_Pursuving);
	                         
		                    Thread.sleep(2000);
		                    // Admission Year in College
		                    Select s7 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s7.selectByVisibleText(String.valueOf(Admissionyear));

		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s8 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s8.selectByVisibleText(Result);
	                        Thread.sleep(2000);
		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
		                    break;
		                    
		                    
		                case "Second Year Pursuing":
		                    Select s9 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s9.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;
		                     
		                    
		                case "First Year Completed":
		                    Select s12 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s12.selectByVisibleText(YearCom_Pursuving);

		                    // Admission Year in College
		                    Select s13 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s13.selectByVisibleText(String.valueOf(Admissionyear));

		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s14 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s14.selectByVisibleText(Result);

		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;
		                    
		                    
		                case "first Year Pursuing":
		                    Select s15 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s15.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;   
		                    
		                    
		                case "Fourth Year Completed":
		                    Select s16 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s16.selectByVisibleText(YearCom_Pursuving);
	                        Thread.sleep(2000);

		                    // Admission Year in College
		                    Select s17 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s17.selectByVisibleText(String.valueOf(Admissionyear));
	                        Thread.sleep(2000);


		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s18 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s18.selectByVisibleText(Result);
	                        Thread.sleep(2000);

		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
		                    break;
		                    
		                    
		                case "Fourth Year Pursuing":
		                    Select s19 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s19.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;  
		                    
		                    
		                case "Direct Second Year Completed":
		                    Select s20 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s20.selectByVisibleText(YearCom_Pursuving);
	                        Thread.sleep(2000);

		                    // Admission Year in College
		                    Select s21 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s21.selectByVisibleText(String.valueOf(Admissionyear));

		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s22 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s22.selectByVisibleText(Result);
	                        Thread.sleep(2000);

		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
		                    break;
		                    
		                    
		                case "Direct Second Year Pursuing":
		                    Select s23 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s23.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;       
		                    
		                 
		                case "Direct Third Year Completed":
		                    Select s24 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s24.selectByVisibleText(YearCom_Pursuving);

		                    // Admission Year in College
		                    Select s25 = new Select(driver.findElement(By.id("CourseCompletedYearID")));
		                    s25.selectByVisibleText(String.valueOf(Admissionyear));
	                        Thread.sleep(2000);

		                    driver.findElement(By.id("Percentage")).click();
		                    driver.findElement(By.id("Percentage")).sendKeys(String.valueOf(Persentage));

		                    Select s26 = new Select(driver.findElement(By.id("ClassOrGrade")));
		                    s26.selectByVisibleText(Result);

		                    // Fees Paid
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;
		                    
		                    
		                case "Direct Third Year Pursuing":
		                    Select s27 = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
		                    s27.selectByVisibleText(YearCom_Pursuving);
		                    driver.findElement(By.id("FeesPaid")).sendKeys(String.valueOf(FeesPaid));
	                        Thread.sleep(2000);

		                    break;       
		                        
		                default:
		                    System.out.println("Not Printed");
		                    Thread.sleep(2000);
		            }
		                driver.findElement(By.id("btnSubmit")).click();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
//Hostel 
		                //Hostel fees : 
		                
		                driver.findElement(By.id("T_HostelDetails1")).click();
	                    Thread.sleep(2000);

	          //Edit Hostel details :
		                driver.findElement(By.xpath("//*[@id=\"Part1\"]/div/table/tbody/tr/td[11]/a")).click();
	                    Thread.sleep(2000);

		     //PopUp Handle:           
		                Alert alert = driver.switchTo().alert();
		                alert.accept(); 
	                    Thread.sleep(2000);

		                
		      //Hostel Type : 
		              //   driver.findElement(By.id("HostelType")).clear();
		                 Select hostelT = new Select(driver.findElement(By.id("HostelType")));
		                 hostelT.selectByVisibleText(HostelType);
		          Thread.sleep(2000);      
		       // Hostel/ P.G/Rented House Address:
		                driver.findElement(By.id("HostelName")).clear();
		                driver.findElement(By.id("HostelName")).sendKeys(HostelName); 
		                
		       //Hostel/ P.G/Rented House Address:          
		               driver.findElement(By.id("HostelAddress")).clear(); 
		               driver.findElement(By.id("HostelAddress")).click();
		               driver.findElement(By.id("HostelAddress")).sendKeys(HostelAddress);  
	                   Thread.sleep(2000);

		         //Hostel/ P.G/Rented House Pincode :
		               driver.findElement(By.id("HostelPincode")).clear();
		               driver.findElement(By.id("HostelPincode")).sendKeys(String.valueOf(pincode));
		               
		          //Is Mess Available : 
		               Select Mess = new Select(driver.findElement(By.id("IsMessAvailable")));
		               Mess.selectByVisibleText(mess);
	                   Thread.sleep(2000);
	 
		          //Rent Per Month (Without Mess Charges):      
		               driver.findElement(By.id("RentPerMonth")).clear();
		               driver.findElement(By.id("RentPerMonth")).sendKeys(String.valueOf(rent));
		                
		          //Save Button :
		               driver.findElement(By.id("btnSubmit")).click();
		               
		          //Ok PopUp :
		               
		               driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[4]/div[2]/button[1]")).click();

				           
				           
				           
				           
				           
				           
				           
				           
				        
		              
		              
		              
			        
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            	
		          
				    
	            } catch (Exception e) {
	                e.printStackTrace();
	              
	                continue;
	            } 
		
	        }	
	}

}
