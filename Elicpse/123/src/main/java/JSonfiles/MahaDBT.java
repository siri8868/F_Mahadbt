package JSonfiles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class MahaDBT {
	
	       
	 public static  void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	    //  URL
	        driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");
	        
	        driver.findElement(By.id("UserName")).click();
	        driver.findElement(By.id("UserName")).sendKeys("Sirii");
	        driver.findElement(By.id("Password")).click();
	        driver.findElement(By.id("Password")).sendKeys("Dhumal@8868");
	        Thread.sleep(10000);
	    //    driver.findElement(By.id("CaptchaInputText")).click();
	   //     driver.findElement(By.id("CaptchaInputText")).sendKeys("MQNNZ");
	        driver.findElement(By.id("btnLogin")).click();
	    //    driver.findElement(By.cssSelector(".col-sm-4 > .radios:nth-child(3) > .checkmark")).click();
         //   driver.findElement(By.id("EnterAadhaarNumber")).sendKeys("459199418178");
         //   driver.findElement(By.id("AuthenticationType")).click();
            
///Click On Profile :   
            
            driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/section/div/div/div[1]/div[1]/ul/ul/li[3]/a")).click();
                       
            
//Click on Personal inforamation : 
            driver.findElement(By.id("T_PersonalInformation1")).click();
            
//Applicant Full name :
            driver.findElement(By.id("ApplicantNameAsPerSSCOrHSC")).sendKeys("Shivabai Rajkumar melkunde");
            Thread.sleep(2000);
 //Parent Mobile No:
            driver.findElement(By.id("ParentMobile")).sendKeys("8275173535");
            Thread.sleep(2000);
//Marital Status :
            driver.findElement(By.xpath("//*[@id=\"4thYearDetails\"]/div[20]/div/label[3]/span")).click();
            Thread.sleep(2000);
            
//Region 
            Select region = new Select(driver.findElement(By.id("ReligionID")));
            region.selectByVisibleText("Hindu");
            Thread.sleep(2000);
//Caste Details :            
            Select Caste=new Select(driver.findElement(By.id("CasteCategoryID")));
            Caste.selectByVisibleText("General");
            Thread.sleep(2000);
//Income Details:
            driver.findElement(By.id("FamillyAnnualIncomeNoBarcode")).sendKeys("200000");
            Thread.sleep(2000);
//Do you have income certificate:
            driver.findElement(By.xpath("//*[@id=\"IncomeDetails\"]/div[1]/div/label[3]/span")).click();
            
//Domicile certificate :
            driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
            Thread.sleep(2000);
//Do you have Domicile Certificate :
            driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[2]/span")).click();
            Thread.sleep(2000);
//RelationType :
            Select relation = new Select(driver.findElement(By.id("DomicileRelation")));
            relation.selectByVisibleText("Father");
            Thread.sleep(2000);
            
//Domicile Certificate No:
            driver.findElement(By.id("DomicileCertNo")).sendKeys("123456789");
            Thread.sleep(2000);
            
//Applicant Name:
            driver.findElement(By.id("DomicileNoBarcodePersonName")).sendKeys("Shivabai Rajkumar melkunde");
            Thread.sleep(2000);
// Issuing Authority:
            Select authority = new Select(driver.findElement(By.id("DomicileNoBarcodeIssuingAuth")));
            authority.selectByVisibleText("Tahsildar");
            Thread.sleep(2000);
//Date of Issue :
        /*    WebElement dateInput = driver.findElement(By.id("DomicileIssueDate"));
            dateInput.click();

            // Wait for the datepicker to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-days")));

            // Select the target year (2023)
            driver.findElement(By.cssSelector(".datepicker-switch")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-years")));

            // Click the "2023" year
            driver.findElement(By.xpath("//span[text()='2023']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-months")));

            // Click the "April" month
            driver.findElement(By.xpath("//span[text()='Apr']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".datepicker-days")));

            // Click the 1st day
            driver.findElement(By.xpath("//td[text()='1']")).click();
        } 
   */        
            
            
//  Personal Eligibility Details:
// Are you Salariad :
            Select salaried = new Select(driver.findElement(By.xpath("//*[@id=\"IsSalaried\"]")));
            salaried.selectByVisibleText("Yes");
 //Job Type :
            Select Job = new Select(driver.findElement(By.id("JobType")));
            Job.selectByIndex(1);
//Disability of any type :
            Select disability = new Select(driver.findElement(By.id("IsDisability")));
            disability.selectByIndex(2);
            
//Adhar Bank Details :
 //account have a limit on Withdrawal or Deposit ?
            driver.findElement(By.xpath("//*[@id=\"BankDetails\"]/div[1]/div/label[2]/span")).click();
            Thread.sleep(2000);
//Bank Details:Account Number
            driver.findElement(By.id("BankAccountNo")).sendKeys("76545678765");
            Thread.sleep(2000);
            
 // IFS Code :
            driver.findElement(By.id("IFSCCode")).sendKeys("HDFC0000360");
            Thread.sleep(2000);
 //           
            
            
//**********************************************************************************************************            
           
//click on Address Button to fill the data 
            driver.findElement(By.id("T_AddressInformation1")).click();
            Thread.sleep(2000);
//1] Village details :
            driver.findElement(By.id("Village")).sendKeys("Sakol");
            Thread.sleep(2000);
//Is Correspondence Address same as Permanent
            driver.findElement(By.className("checkmark")).click();
            Thread.sleep(2000);
//Now Select District with dropDown :
            
            Select district = new Select(driver.findElement(By.id("DistrictID2")));
            district.selectByVisibleText("Latur");
            Thread.sleep(2000);
 //No select Taluka :
            
            Select taluka = new Select(driver.findElement(By.id("TalukaID2")));
            taluka.selectByVisibleText("Shirur-Anantpal");
            Thread.sleep(2000);
            
//****************************************************************************************************************
            
//Other Information :
            
            driver.findElement(By.id("T_OtherInformation1")).click();
            Thread.sleep(2000);
            
  //Is Father Alive :
            driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[1]/div/label[2]/span")).click();
            Thread.sleep(2000); 
 //Father name :
            driver.findElement(By.id("FatherName")).sendKeys("Rajkumar Shivmurti Melkunde");
            Thread.sleep(2000);
// Occupation :
            Select occupation = new Select(driver.findElement(By.id("FatherOccupationID")));
            occupation.selectByVisibleText("Teacher");
            Thread.sleep(2000);
//Is Salaried? :
            Select salaried1 = new Select(driver.findElement(By.id("IsFatherSalaried")));
            salaried1.selectByVisibleText("Yes");
            Thread.sleep(2000);
//Is Mother Alive? : 
            driver.findElement(By.xpath("//*[@id=\"ParentDetails\"]/div[5]/div/label[2]/span")).click();
            Thread.sleep(2000);
 //Mother name :
            driver.findElement(By.id("MotherName")).sendKeys("Premabai Rajkumar Melkunde");
            Thread.sleep(2000);
 //Occupation:
            Select occup = new Select(driver.findElement(By.id("MotherOccupationID")));
            occup.selectByVisibleText("Others");
            Thread.sleep(2000);
 //Is Salaried :
            Select Salrid = new Select(driver.findElement(By.id("IsMotherSalaried")));
            Salrid.selectByVisibleText("No");
            Thread.sleep(2000);
            
//********************************************************************************************************
            
 //Current Course :
            driver.findElement(By.id("T_CourseApplied1")).click();
         //   Thread.sleep(2000);
            
 //Admission Year Cu.cource:
           Select AdmissionYear = new Select(driver.findElement(By.id("AdmissionYearID")));
           AdmissionYear.selectByVisibleText("2020");
         //  Thread.sleep(2000);
           
 //Institute State :
           Select state = new Select(driver.findElement(By.id("StateID")));
           state.selectByVisibleText("Maharashtra"); 
       //    Thread.sleep(2000);
            
 //Institute District :
           Select District = new Select(driver.findElement(By.id("DistrictID"))); 
           District.selectByVisibleText("Latur");
         //  Thread.sleep(2000);
  //Institute Taluka
           Select Taluka = new Select(driver.findElement(By.id("TalukaID")));
           Taluka.selectByVisibleText("Shirur-Anantpal");
           Thread.sleep(2000);
 // Qualification Level
            Select Qulification = new Select(driver.findElement(By.id("QualificationTypeID")));
            Qulification.selectByVisibleText("Under Graduate Course ");
            Thread.sleep(2000);
// Stream :
            Select Stream = new Select(driver.findElement(By.id("DegreeNameID")));
            Stream.selectByVisibleText("Arts");
            Thread.sleep(2000);
//College Name :
            
            WebElement collegeDropdown = driver.findElement(By.id("CollegeID"));
            Select collegeSelect = new Select(collegeDropdown);
            collegeSelect.selectByIndex(2);
            
            
            
      //     Select CollegeName = new Select(driver.findElement(By.id("CollegeID")));
       //     CollegeName.selectByIndex(2);
            Thread.sleep(2000);
 //Course Name:
            Select CourseName = new Select(driver.findElement(By.id("StrCourseId")));
            CourseName.selectByIndex(1);
             Thread.sleep(2000);
 //*******************            
             
 //Add this statement if you select the diploma and course name the there is option call admission type then in this add switch statement :               
//Admission Type:
 //            Select admission = new Select(driver.findElement(By.id("AdmissionType")));
  //           admission.selectByIndex(2);
             
  
             
 //**********************            
 //Year Of Study   :
            Select YearOfStudy = new Select(driver.findElement(By.id("DegreeWiseYearID")));
            YearOfStudy.selectByIndex(2);
            Thread.sleep(2000);
                     
 // Direct year Completed Or Continue : 
            Select completed = new Select(driver.findElement(By.id("IsCompletedOrContinue")));
            completed.selectByIndex(2);
            Thread.sleep(2000);
 
     /*     here add switch Statement :   
            
  //Admission Year in College/Institute (Direct Second Year)
       Select year = new Select(driver.findElement(By.id("CourseCompletedYearID")));    
       year.selectByIndex(2);     
            
  //Percentage : 
       driver.findElement(By.id("Percentage")).sendKeys("89");
       
  // Result : 
       Select resullt = new Select(driver.findElement(By.id("")));
       resullt.selectByIndex(2);    
       
       
  */
            
            
            
            
 // Fees Paid:
            driver.findElement(By.id("FeesPaid")).sendKeys("20000");
            
            
            
 // Is Admission Through Open Or Reserved Category ?            
            Select Open = new Select(driver.findElement(By.id("CasteCategoryID")));
            Open.selectByVisibleText("General");
            Thread.sleep(2000);
// Mode :
            Select Mode = new Select(driver.findElement(By.id("EducationMode")));
            Mode.selectByIndex(1);
            Thread.sleep(2000);
            
//**************************************************************************************************************************            
// Past Qulification :
            
            driver.findElement(By.id("T_QualificationInformation1")).click();
            
// Qualification Level:
            Select Qulification1 = new Select(driver.findElement(By.id("QualificationTypeID")));
            Qulification1.selectByIndex(10);
       
            
 //  Stream :
         /* 
            try {
                // Handle the alert if it is present
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert Text: " + alertText);
                alert.accept();

            } catch (Exception e) {
                // No alert found, continue with other actions
            }

            // Locate the dropdown element
            WebElement streamDropdown = driver.findElement(By.id("DegreeNameID"));

            // Get all the options within the dropdown
            List<WebElement> options1 = streamDropdown.findElements(By.tagName("option"));

            // Iterate through the options and select the desired option by text
            for (WebElement option : options1) {
                if (option.getText().equals("SSC")) { // Change to the text of the desired option
                    option.click();
                    break;
                }
            }
*/
            
           
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 

            // Wait for the element to be visible
            WebElement degreeNameDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DegreeNameID")));
            degreeNameDropdown.sendKeys(Keys.TAB);
            degreeNameDropdown.sendKeys(Keys.ENTER);
            degreeNameDropdown.sendKeys(Keys.ARROW_DOWN);
            // Use JavaScriptExecutor to select the option
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", degreeNameDropdown);
            Select s1 = new Select(degreeNameDropdown);
            s1.selectByVisibleText("SSC");


            
            
            
            
            
            
            
       //     Select s1 = new Select(driver.findElement(By.id("DegreeNameID")));
       //     s1.selectByVisibleText("SSC");
            
            
                   
 //Institute State:   
            Select state1 = new Select(driver.findElement(By.id("StateID")));
            state1.selectByVisibleText("Maharashtra");
 //Institute District          
            Select district1 = new Select(driver.findElement(By.id("DistrictID")));
            district1.selectByVisibleText("Latur");
            
 //Institute Taluka : 
            Select Taluka1 = new Select(driver.findElement(By.id("TalukaID")));
            Taluka1.selectByVisibleText("Shirur-Anantpal");
           
  // College Name : 
            
 //      Select colleName = new Select(driver.findElement(By.id("CollegeID")));     
 //      colleName.selectByVisibleText("Other");     
            
         
 //Course :  
            Select course1 = new Select(driver.findElement(By.id("SubjectID")));
            course1.selectByVisibleText("SSC");
  
  //if you Select Different field in college then cource name  is in text field So here we have to add if statement        
  //   driver.findElement(By.id("SubjectText")).sendKeys("science Tech ");
            
            
 //Board/University :
            Select board = new Select(driver.findElement(By.id("BoardUniversityID")));
            board.selectByVisibleText("MAHARASHTRA STATE BOARD OF SECONDARY AND HIGHER SECONDARY EDUCATION");
  //if the course name is ssc then board and university is in dropdown if there is another code rather than that then board or univercity is in text           
//So for those sendkeys code is down
            
     //      driver.findElement(By.id("BoardUniversityText")).sendKeys("Pune University");
            
  
            
            
            
            
            
//:::::     
//Mode : 
            Select mode = new Select(driver.findElement(By.id("EducationMode")));
            mode.selectByIndex(1);
            
//Admission Year 
            Select year = new Select(driver.findElement(By.id("ddnAdmissionYr")));
            year.selectByVisibleText("2014");
//Passing year :
            Select Passyear = new Select(driver.findElement(By.id("ddnPassingYr")));
            Passyear.selectByVisibleText("2015");
 //Result           
            Select Result = new Select(driver.findElement(By.id("Result")));
            Result.selectByVisibleText("Passed");  
            
//  Percentage :
            driver.findElement(By.id("Percentage")).sendKeys("71");
            Thread.sleep(2000);
// Attempts             
            driver.findElement(By.id("Attempts")).sendKeys("1");
            
 //Was any Gap in this Qualification / Course
            
            driver.findElement(By.xpath("//*[@id=\"divgap\"]/div[1]/div/label[3]/span")).click();
            
 //***************************************************************************************************
 //Hostel Details :
 //Beneficiary Category:
            driver.findElement(By.xpath("//*[@id=\"BeneficiaryCategoryDiv\"]/div/div[1]/label/span")).click();
            
  //State :
            Thread.sleep(2000);
            Select stat = new Select(driver.findElement(By.id("StateID")));
            stat.selectByVisibleText("Maharashtra");
            
 //District :
            Select dis = new Select(driver.findElement(By.id("DistrictID")));
            dis.selectByVisibleText("Latur");
 //Taluka :
            Select tal = new Select(driver.findElement(By.id("TalukaID")));
            tal.selectByVisibleText("Shirur-Anantpal");
            
//  Hostel Type : 
            Select hostel = new Select(driver.findElement(By.id("HostelType")));
            hostel.selectByIndex(3);
            
//  Hostel/ P.G/Rented House Name:
            
            driver.findElement(By.id("HostelName")).sendKeys("Ram");
            Thread.sleep(2000);
 //  Hostel/ P.G/Rented House Address:
            
            driver.findElement(By.id("HostelAddress")).sendKeys("latur");
            
  //  Hostel/ P.G/Rented House Pincode:
            
            driver.findElement(By.id("HostelPincode")).sendKeys("412208");
            Thread.sleep(2000);
            
 //  Admission Date:
            
            
            
 //  Is Mess Available ? :          
            
      Select mess = new Select(driver.findElement(By.id("IsMessAvailable")));      
      mess.selectByVisibleText("Yes");     
            
//  Rent Per Month (Without Mess Charges):
      driver.findElement(By.id("RentPerMonth")).sendKeys("3000");
            
                   
            
            
	 }
	 }