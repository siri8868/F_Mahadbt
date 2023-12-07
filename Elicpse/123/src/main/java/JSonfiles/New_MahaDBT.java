package JSonfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.RemoteWebDriver;

public class New_MahaDBT {

	private static final String Yes = null;

	public static <JavascriptExecutor> void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    //  URL
	        driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");
	        
	        
            String jsonFilePath = "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\New_MahaDBT";

	        
	        try {
	        	
		           JSONParser parser = new JSONParser();
		            JSONArray loginData = (JSONArray) parser.parse(new FileReader(jsonFilePath));
		        
		            for (Object obj : loginData) {
		            JSONObject loginObj = (JSONObject) obj;
	        
		            String loginValue = (String) loginObj.get("Username");
		            String password = (String) loginObj.get("Password");
		            String name = (String) loginObj.get("Name");
			        long ParentNo = (long) loginObj.get("ParentNumber");
	                String religion = (String) loginObj.get("Religion");
	                String CasteCategory = (String) loginObj.get("castecategory");
	                String Caste = (String) loginObj.get("caste");
	                long certificationNo = (long) loginObj.get("CertificationNo");
	                String district = (String) loginObj.get("District");
	                String ApplicantName = (String) loginObj.get("ApplicationName");
	                String Iss_Authority = (String) loginObj.get("Issuing Authority");
	                long Anualincome = (long) loginObj.get("AnnualIncome");
	                long incomecerNo = (long) loginObj.get("Incomecerti_No");
	                String IssAuthority = (String) loginObj.get("IssuingAuthority");
	                String relationtype = (String) loginObj.get("Relationtype");
	                long Domacileno = (long) loginObj.get("Domacile_No");
	                String Applicantname = (String) loginObj.get("Applicantname");
	                String Authority = (String) loginObj.get("Authority_");
	                String Personal_eligibility = (String) loginObj.get("Personal_Eligibility");
	                String Disability = (String) loginObj.get("Disability");
	                String Disability_Type = (String) loginObj.get("Disability_Type");
	                String With_Disability = (String) loginObj.get("with_disability");
	            //    String Dis_Certification = (String) loginObj.get("Dis_Certification");
	                String CertificateNo = (String) loginObj.get("CertificateNo");
	                String Dis_Percentage = (String) loginObj.get("Dis_Percentage"); 
	                String Issuing_Auto = (String) loginObj.get("Issuing_Auto"); 
	                String BankAccountNo = (String) loginObj.get("BankAccountNo"); 
	                String IfscCode = (String) loginObj.get("IfscCode"); 
	                
//Address :
	                String Village = (String) loginObj.get("Village");  
	                String Correspo_Address = (String) loginObj.get("Correspo_Address");
	                String District = (String) loginObj.get("District");
	                String Taluka = (String) loginObj.get("Taluka");   
	                String address = (String) loginObj.get("Address");  
	                String State = (String) loginObj.get("State");  
	                String district1 = (String) loginObj.get("district1");  
	                String Taluka1 = (String) loginObj.get("Taluka1");
	                String vill = (String) loginObj.get("village");
	                String pincode = (String) loginObj.get("pincode");
	                
	                
	                
	                
	                
	        
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

		            
		            //Applicant Full Name 
	        
		            driver.findElement(By.id("ApplicantNameAsPerSSCOrHSC")).sendKeys(name);
		         //   Thread.sleep(2000);
	        
		            //Parent's/Guardian Mobile No:
		            driver.findElement(By.id("ParentMobile")).sendKeys(String.valueOf(ParentNo));
		            Thread.sleep(2000);
		            
		          //Marital Status:
		            driver.findElement(By.xpath("//*[@id=\"4thYearDetails\"]/div[20]/div/label[3]/span")).click();
		            Thread.sleep(2000);
		           
		           //Religion:
		            Select region = new Select(driver.findElement(By.id("ReligionID")));
		            region.selectByVisibleText(religion);
		            Thread.sleep(2000);
		            
		            
		            WebElement categoryDropdown = driver.findElement(By.id("CasteCategoryID"));

		            WebDriverWait waitq1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		            waitq1.until(ExpectedConditions.elementToBeClickable(categoryDropdown));

		            Select categorySelect = new Select(categoryDropdown);

		            if (CasteCategory.equals("General")) {
		                categorySelect.selectByVisibleText(CasteCategory);
		            } 
		            else {
		            	
		            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            	WebElement categoryDropdown1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CasteCategoryID")));

		            	// Select the category based on JSON data
		            	Select categorySelect1 = new Select(categoryDropdown1);
		            	categorySelect1.selectByVisibleText(CasteCategory);

		            	// Use JavaScript executor to scroll to the sub-caste dropdown
		            	JavascriptExecutor js = (JavascriptExecutor) driver;
		            	((RemoteWebDriver) js).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", categoryDropdown1);

		            	// Wait for the sub-caste dropdown to be clickable
		            	WebElement subCasteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubCasteCategoryID")));
		            	Select S1 = new Select(subCasteDropdown);
		            
  		            	// Simulate pressing the TAB key after selecting the sub-caste
		            	S1.getWrappedElement().sendKeys(Keys.TAB);
		            	S1.selectByVisibleText(Caste);
		            
		            /*	
		            	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		            	WebElement casteDropdown1 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("casteDropdown1")));

		            	// Select the category based on JSON data
		            	Select casteSelect1 = new Select(casteDropdown1);
		            	casteSelect1.selectByVisibleText(CasteCategory);
*/
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            /*	
		            	WebDriverWait waitw1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		            //	WebElement categoryDropdown1 = waitw1.until(ExpectedConditions.elementToBeClickable(By.id("CasteCategoryID")));

		                categorySelect.selectByVisibleText(CasteCategory);
		                Select S1 = new Select(driver.findElement(By.id("SubCasteCategoryID")));
		                S1.getWrappedElement().sendKeys(Keys.TAB);
		                S1.selectByVisibleText(Caste);
		            */    
		                 //Do you have Caste Certificate:
		                driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[2]/span")).click();
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
		                
		               //Date : 
		                
		                
		                
		            
		            }
		            
		           // Annual income : 
		            
		            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys(String.valueOf(Anualincome));
		            Thread.sleep(2000);
		            
		           //Do you have Income Certificate?:
		            
		            driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[2]/span")).click();
		            
		          //Income Certificate No: 
		           driver.findElement(By.id("IncomeCertNo")).sendKeys(String.valueOf(incomecerNo));
		       
		          //Issuing Authority:
		           
		           Select se = new Select(driver.findElement(By.id("IssuingAuthorityNoBarcode")));
		           se.selectByVisibleText(IssAuthority); 
		       
		          //Date Is issue :
		           
		            
		            
		           //Domicile Details:
		           
		           driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
		           Thread.sleep(2000);
		            
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
		           
		           //Are you Salaried? :
		           Select sr2 = new Select(driver.findElement(By.id("IsSalaried")));
		           sr2.selectByVisibleText(Personal_eligibility);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
		              
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

		        	    // Disability Certification :
		        	    driver.findElement(By.xpath("//*[@id=\"IsDisabilityDiv\"]/div[3]/div/label[2]/span")).click();

		        	    // Disability Certificate Number
		        	    driver.findElement(By.id("DisabilityNoBarcodeCertNo")).sendKeys(CertificateNo);

		        	    // Disability Percentage :
		        	    driver.findElement(By.id("DisabilityPercentageNoBarcode")).sendKeys(Dis_Percentage);

		        	    // Issuing Authority:
		        	    Select sr6 = new Select(driver.findElement(By.id("DisabilityCerIssuingAuthNoBarcode")));
		        	    sr6.selectByVisibleText(Issuing_Auto);
		        	} else {
		        	   
		        		
		        		Select sr7 = new Select(driver.findElement(By.id("IsDisability")));
		        		sr7.selectByVisibleText("No");
		        		
		        	}

		           
		           //Adhar link: 
		           driver.findElement(By.xpath("//*[@id=\"BankDetails\"]/div[1]/div/label[2]/span")).click();
		           
		           //Bank Details : 
		           
		           driver.findElement(By.id("BankAccountNo")).sendKeys(BankAccountNo);
		            Thread.sleep(2000);
		            
		 // IFSC Code :
		            driver.findElement(By.id("IFSCCode")).sendKeys(IfscCode);
		            Thread.sleep(2000);
		           
		           
		           
		 //Save button 
		            driver.findElement(By.id("btnAdd")).click();
		            
		            
	        
	      //click on Address Button to fill the data 
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
	            
	            Select taluka = new Select(driver.findElement(By.id("TalukaID2")));
	            taluka.selectByVisibleText(Taluka);
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
		    Select Srr = new Select(driver.findElement(By.id("DistrictID")));
		    Srr.selectByVisibleText(district1);
		    
//Taluka 
		    Select Srrr = new Select(driver.findElement(By.id("TalukaID")));
		    Srrr.selectByVisibleText(Taluka1); 
//Village :
		    driver.findElement(By.id("CorrespondenceVillage")).sendKeys(vill);
//Pincode : 
		    driver.findElement(By.id("CorrespondencePincode")).sendKeys(pincode);
		     
		    }
		    else {
		    	System.out.println("Print Statement");
		    	
		    }
 
//Save option :
		    driver.findElement(By.id("btnAdd")).click();	    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
 // Other information :
		    
		//    Is Father Alive?
		    
		    
		    
		    
		    
		    
            
            
            
            
            
            
            
		           
		           
		           
		            
		            }
	               
		            
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
	            
	        
	        

	}

}
