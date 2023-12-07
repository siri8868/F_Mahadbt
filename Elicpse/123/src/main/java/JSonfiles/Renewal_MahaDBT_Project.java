package JSonfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Renewal_MahaDBT_Project {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    //  URL
	        driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");
		
	        String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\RenewalMahaDBT";

	        
	        try {
	        	
		           JSONParser parser = new JSONParser();
		            JSONArray loginData = (JSONArray) parser.parse(new FileReader(jsonFilePath));
		        
		            for (Object obj : loginData) {
		            JSONObject loginObj = (JSONObject) obj;
	        
		            String loginValue = (String) loginObj.get("Username");
		            String password = (String) loginObj.get("Password");
		            long annualFamilyIncome = (long) loginObj.get("AnnualFamilyIncome");
		            long InCertiNo = (long) loginObj.get("IncomeCertificateno");
		      //    long Date = (long) loginObj.get("date");
		            
		            String YearOfStudy = (String) loginObj.get("YearOfStudy");
		            
		            String YearCom_Pursuving = (String) loginObj.get("YearCom_Pursuving1");
		            
		            long Admissionyear = (long) loginObj.get("AdmissionY");
		         	String Persentage = (String) loginObj.get("Percentage");            
		         	String Result = (String) loginObj.get("result");   
		         	long FeesPaid = (long) loginObj.get("FeesPaid");
		            String HostelType = (String) loginObj.get("hosteltype");
		            String HostelName  = (String) loginObj.get("hostelname");
		            String HostelAddress  = (String) loginObj.get("hosteladdress");
		            long pincode = (long) loginObj.get("Pincode");
		            String mess  = (String) loginObj.get("Messavailable");
		            long rent = (long) loginObj.get("Rent");
		            
		            
		            
		            
		            
		            //Username : 
		            driver.findElement(By.id("UserName")).click();
			        driver.findElement(By.id("UserName")).sendKeys( loginValue);
		            //Password :
			        driver.findElement(By.id("Password")).click();
			        driver.findElement(By.id("Password")).sendKeys(password );
		            
		            //Timestamp :
			        Thread.sleep(10000);
		            
		            //Click On Login button : 
			        driver.findElement(By.id("btnLogin")).click();
		            
		            //Click On the Profile Button :
		            driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/section/div/div/div[1]/div[1]/ul/ul/li[3]/a")).click();

		            //Click On OK button :
		            driver.findElement(By.xpath("//*[@id=\"MsgModal\"]/div/div/div[3]/button")).click();
		            
		            
		            //Family Annual Income: 
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).clear(); 
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys(String.valueOf(annualFamilyIncome ));
		            Thread.sleep(2000);
		            //Income Certificate No
		            driver.findElement(By.id("IncomeCertNo")).clear(); 
		            driver.findElement(By.id("IncomeCertNo")).sendKeys(String.valueOf(InCertiNo));
		            
		           Thread.sleep(2000);
	                driver.findElement(By.id("btnUpdate")).click();
	                
	                Thread.sleep(2000);
	                driver.findElement(By.id("T_CourseApplied1")).click();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////		            
		            Select s = new Select(driver.findElement(By.id("DegreeWiseYearID")));
	                s.selectByVisibleText(YearOfStudy); 
	                     
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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                    driver.findElement(By.id("Percentage")).sendKeys(Persentage);

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
	                
	           //Logout : 
	               driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button/i[2]")).click();
	               driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/ul/li[3]/a")).click();
	           //    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/div[2]/div/div/div/ul[2]/li[2]/div/button")));
	          //     dropdown.selectByVisibleText("Log out");
		            
		            
		                 
		            }
	               
		            
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
	        
	}

}
