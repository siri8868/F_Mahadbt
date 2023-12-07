package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.support.ui.WebDriverWait;











public class Size_Reducer_Document {

	
		
		
		public static void main1(String[] args) throws FileNotFoundException, IOException, InterruptedException {

			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
		       
		        ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
		        options.addArguments("--disable-notifications");
		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
		   
		        
		        
		        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\Ex.xlsx");
		        FileInputStream fis = new FileInputStream(src);
		        
		        XSSFWorkbook xsf = new XSSFWorkbook(fis);
		        XSSFSheet sheet = xsf.getSheetAt(0);	
		        
		        
		        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
		            XSSFRow row = sheet.getRow(rowNum);
		         
		            String Login  = row.getCell(0).getStringCellValue();
		            String Password = row.getCell(1).getStringCellValue();	            
		            
		           
		            

		
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


		//		        
				        
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
				               if (fileSize > 256 * 1024) { 
				            	   
				            	   
				            	   
				               
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

		            
		
				        
		         
		           
		        }
		        }

}
