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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;






public class MAHADBT_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	   
	        
	    
	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\MAHADBT.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);	
	        
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	         
	           	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	         
	            String Login  = row.getCell(0).getStringCellValue();
	            String Password = row.getCell(1).getStringCellValue();
	            long targetDate = (long) row.getCell(2).getNumericCellValue();
	            String targetMonth = row.getCell(3).getStringCellValue();
	          //  long targetMonth = (long) row.getCell(3).getNumericCellValue(); 
	       //     Long targetYear = (long) row.getCell(4).getNumericCellValue(); 
	        //    int targetYear = (int) row.getCell(4).getNumericCellValue();
	        //    int targetYear = (int) row.getCell(4).getNumericCellValue();
	            int targetYear = (int) row.getCell(4).getNumericCellValue();

	            
	            
	            /*
	            String Name = row.getCell(2).getStringCellValue(); 
	            String relationtype = row.getCell(3).getStringCellValue(); 
	     //     String filePath = row.getCell(4).getStringCellValue(); 
	            String s3Url = row.getCell(5).getStringCellValue(); 
	            String localFilePath = row.getCell(6).getStringCellValue(); 
	        
	          */  
	        
	        
	        
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

		        
		        driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[2]/span")).click();
		        
		        
		        // Locate the date input field and click it to open the calendar
		        WebElement dateInput = driver.findElement(By.id("CasteIssuingDate"));
		        dateInput.click();
		        
		        WebElement dateInput1 = driver.findElement(By.className("datepicker-switch"));
		        dateInput1.click();
		    //    Thread.sleep(4000);
		        
		     //   driver.findElement(By.className("datepicker-switch")).click();
		      	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		      //	Thread.sleep(2000);
		        WebElement datePickerSwitch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[2]")));

		        // Use JavaScript Executor to click the element
		        JavascriptExecutor executor = (JavascriptExecutor) driver;
		        executor.executeScript("arguments[0].click();", datePickerSwitch);
		        
		       
		        
		        
		        
		        
		        if (targetYear >= 2020 && targetYear <= 2029) {
		        	
		        	
			           WebElement calendar = driver.findElement(By.className("datepicker-years"));
			           WebElement desiredYear = calendar.findElement(By.xpath("//span[@class='year' and text()='" + targetYear+ "']"));
			           desiredYear.click();
		        	
		        	    WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
				        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
				        desiredMonth.click();
				        
				        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
				        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
				        desiredDate.click();
				       
				      
		        	
		        	
		        } else if (targetYear >= 2010 && targetYear <= 2019) {
		        	
		        	 WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
				        List<WebElement> yearElements = calendarYears.findElements(By.xpath("//span[@class='year']"));

				        for (WebElement yearElement : yearElements) {
				            if (yearElement.getText().equals(targetYear)) {
				                yearElement.click();
				                break; 
				            }
				        }

				     
				          WebElement calendar = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				          calendar.click();
				            WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
				            desiredYear.click();
		        	
				            WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
					        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
					        desiredMonth.click();
					        
					        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
					        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
					        desiredDate.click();
		        	
		          
		        	
		        } else if (targetYear >= 2000 && targetYear <= 2009) {
		        	
		        	 WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
				        List<WebElement> yearElements = calendarYears.findElements(By.xpath("//span[@class='year']"));

				        for (WebElement yearElement : yearElements) {
				            if (yearElement.getText().equals(targetYear)) {
				                yearElement.click();
				                break; 
				            }
				        }

				     
				            WebElement calendar = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar.click();
				            WebElement calendar1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar1.click();
				            
				            WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
				            desiredYear.click();
		        	
				            WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
					        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
					        desiredMonth.click();
					        
					        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
					        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
					        desiredDate.click();
		        	
		        	
		          
		        	
		        } else if (targetYear >= 1990 && targetYear <= 1999) {
		        	
		        	 WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
				        List<WebElement> yearElements = calendarYears.findElements(By.xpath("//span[@class='year']"));

				        for (WebElement yearElement : yearElements) {
				            if (yearElement.getText().equals(targetYear)) {
				                yearElement.click();
				                break; 
				            }
				        }

				     
				            WebElement calendar = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar.click();
				            WebElement calendar1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar1.click();
				            WebElement calendar2 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar2.click();
				            
				            WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
				            desiredYear.click();
		        	
				            WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
					        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
					        desiredMonth.click();
					        
					        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
					        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
					        desiredDate.click();
		        	
		        	
		         
		        	
		        } else if (targetYear >= 1980 && targetYear <= 1989) {
		          
		        	 WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
				        List<WebElement> yearElements = calendarYears.findElements(By.xpath("//span[@class='year']"));

				        for (WebElement yearElement : yearElements) {
				            if (yearElement.getText().equals(targetYear)) {
				                yearElement.click();
				                break; 
				            }
				        }

				     
				            WebElement calendar = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar.click();
				            WebElement calendar1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar1.click();
				            WebElement calendar2 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar2.click();
				            WebElement calendar3 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
				            calendar3.click();
				            
				            WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
				            desiredYear.click();
		        	
				            WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
					        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
					        desiredMonth.click();
					        
					        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
					        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
					        desiredDate.click();
		        	
		        	
		         
		        	
		        	
		        	
		        } else {


		        	
		        }

		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		  //      WebElement dateInput2 = driver.findElement(By.className("datepicker-switch"));
		  //      dateInput2.click();  
		        
		     //   WebElement calendar = driver.findElement(By.className("datepicker-switch"));
		   //     calendar.click(); 
		        // Locate the calendar and select the desired year datepicker-switch     datepicker-years
		   //     WebElement calendar = driver.findElement(By.className("prev"));
		    //    WebElement desiredYear = calendar.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
		    //    desiredYear.click();
		      
		        
		      /*  
		        WebElement calendar = driver.findElement(By.className("datepicker-switch"));
		        calendar.click(); // Click on the calendar switch to open the year selection view

		        WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
		        WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
		        desiredYear.click();
*/
		        
		       
		        
		      
		     //   int currentYear = Integer.parseInt(driver.findElement(By.className("datepicker-switch")).getText());
		        /*
		        while (currentYear > Integer.parseInt(Integer.toString(targetYear))) {
		           
		       
		            WebElement prevButton = driver.findElement(By.xpath("//th[@class='prev']"));
		            prevButton.click();
		            currentYear = Integer.parseInt(driver.findElement(By.className("datepicker-switch")).getText());
		        }
		        */
		        
		        WebElement calendarYears = driver.findElement(By.className("datepicker-years"));
		        List<WebElement> yearElements = calendarYears.findElements(By.xpath("//span[@class='year']"));

		        for (WebElement yearElement : yearElements) {
		            if (yearElement.getText().equals(targetYear)) {
		                yearElement.click();
		                break; 
		            }
		        }

		     
		          WebElement calendar = driver.findElement(By.xpath("/html/body/div[4]/div[3]/table/thead/tr/th[1]"));
		          calendar.click();
		            WebElement desiredYear = calendarYears.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
		            desiredYear.click();
		      
		        
     
		        
		        // Locate the calendar and select the desired year datepicker-switch     datepicker-years
		   //     WebElement calendar = driver.findElement(By.className("datepicker-switch"));
		   //     WebElement desiredYear = calendar.findElement(By.xpath("//span[@class='year' and text()='" + targetYear + "']"));
		   //     desiredYear.click();
		        
		        WebElement calendarMonths = driver.findElement(By.className("datepicker-months"));
		        WebElement desiredMonth = calendarMonths.findElement(By.xpath("//span[@class='month' and text()='" + targetMonth + "']"));
		        desiredMonth.click();
		        

		      
		       

		        WebElement calendarDays = driver.findElement(By.className("datepicker-days"));
		        WebElement desiredDate = calendarDays.findElement(By.xpath("//td[@class='day' and text()='" + targetDate + "']"));
		        desiredDate.click();
		       
		      
		   
		       


		      
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
/*	             
 //Applicant Full Name 
		        
	            driver.findElement(By.id("ApplicantNameAsPerSSCOrHSC")).sendKeys(Name);
	            
	            
		         driver.findElement(By.xpath("//*[@id=\"DomicileDetails\"]/div[1]/div/label[2]/span")).click();
		         Thread.sleep(2000);
		            
		          driver.findElement(By.xpath("//*[@id=\"IsDomicileDiv\"]/div[1]/div/label[2]/span")).click();
		          Thread.sleep(2000); 
		           
		           //Relation Type : 
		          Select see = new Select(driver.findElement(By.id("DomicileRelation")));
		          see.selectByVisibleText(relationtype);
	            	        
	        
		          Thread.sleep(3000);
		          
		    //      WebElement fileInput = driver.findElement(By.id("Domicileupload")); 

                  // Provide the local file path to the file input element
             //     fileInput.sendKeys(filePath);
		          
		          
		           
		      //     WebElement fileInput = driver.findElement(By.id("Domicileupload")); 

		           // Provide the local file path to the file input element
		       //    String filePath = "C:\\Users\\Shravani\\Downloads\\s.jpg"; 
		     //      fileInput.sendKeys(filePath);

		          try {
	            
		        	  
             //     String s3Url = "https://forstubucket1.s3.ap-south-1.amazonaws.com/documents/DIBugnQ8vfea50qb3XvtgL7bzyOqPGyxQK64PSh1.jpg";

                  // Local path where you want to save the downloaded file
           //      String localFilePath = "C:\\Users\\Shravani\\Desktop\\S3_URL_File\\New folder.jpg";
	                  WebElement fileInput = driver.findElement(By.id("Domicileupload")); 

                  // Download the file from S3 to your local machine
                  FileUtils.copyURLToFile(new URL(s3Url), new File(localFilePath));

	        

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
	       
	        
	     
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	     
	        
	        
	        
	        
	        
		
			           
			           
			           
			           
			           
			           
			           
			           
			           
			        /*   
			           try {
			               
			               
			               WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			               // Wait for the file upload element to become visible
			               WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Domicileupload")));

			               // Set the URL of the file you want to download from S3 or Google Drive
			               String fileUrl = "https://forstubucket1.s3.ap-south-1.amazonaws.com/documents/DIBugnQ8vfea50qb3XvtgL7bzyOqPGyxQK64PSh1.jpg";

			               // Check if the file size is below 256 KB
			               HttpURLConnection connection = (HttpURLConnection) new URL(fileUrl).openConnection();
			               connection.setRequestMethod("HEAD");
			               int fileSize = connection.getContentLength();
			               if (fileSize > 256 * 1024) {  // Check if file size is greater than 256 KB
			                   throw new RuntimeException("File size exceeds 256 KB. Cannot download.");
			               }

			               // Download the file in its original format
			               InputStream inputStream = new URL(fileUrl).openStream();
			               FileOutputStream fos = new FileOutputStream("downloaded_file.txt");
			               byte[] bytes = new byte[1024];
			               int length;
			               while ((length = inputStream.read(bytes)) >= 0) {
			                   fos.write(bytes, 0, length);
			               }
			            //   fos.close();

			               // Upload the file
			                  fileInput.sendKeys(new File("downloaded_file.txt").getAbsolutePath());
			           //    fileInput.sendKeys(downloaded_File.getAbsolutePath());
			               // Wait for the file to upload
			            //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Upload complete')]")));
			               wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"docs1\"]/div/a")));
			               
                           Thread.sleep(4000);
			               // Delete the uploaded file
			           //    File uploadedFile = new File("downloaded_file.txt");
			           //    if (uploadedFile.exists()) {
			              //     uploadedFile.delete();
			            //   }

			           } catch (IOException e) {
			        	   
			        	   System.out.println("Not work ");
			               e.printStackTrace();
			           } 
			           
			          */ 
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
	        }		           
		
		
	}
	        
}
