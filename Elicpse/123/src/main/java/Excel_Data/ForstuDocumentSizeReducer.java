package Excel_Data;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Format;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.web.util.UriComponentsBuilder;
import java.io.BufferedInputStream;

import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorStreamFactory;





public class ForstuDocumentSizeReducer {
	
	public static void main(String[] args) throws IOException, InterruptedException, CompressorException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");
	       
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--disable-notifications");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	   
	        

	        File src = new File("C:\\Users\\Shravani\\Desktop\\Excel_data\\Size_Reducer.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        
	        XSSFWorkbook xsf = new XSSFWorkbook(fis);
	        XSSFSheet sheet = xsf.getSheetAt(0);
	        Workbook workbook = new XSSFWorkbook();   
	        
	        
	        
	        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            
	         
	            String Login  = row.getCell(0).getStringCellValue();
	            String Password = row.getCell(1).getStringCellValue(); 	
	            String  s3Url = row.getCell(2).getStringCellValue(); 
	            String localFilePath  = row.getCell(3).getStringCellValue();
	
	            
	            
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
			   	 
//Upload the Document :
			    

			    
			    
			    
			    
			    
			    
			   
				try {
	        		Thread.sleep(2000);
	        	    WebElement fileInput = driver.findElement(By.id("FileNameCastcert")); 
                    Thread.sleep(2000);
	        	    // Encode the S3 URL
	        	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
	        	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3Url).build().toUriString();  
	        	    // Download the file from S3 to your local machine
	        	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePath));
	        	   
	        	  
	                    
	        	    File file = new File(localFilePath);
	                long fileSizeInKB = file.length() / 1024;

	                if (fileSizeInKB > 256) {
	                	compressFile(file);
	                //	 reduceFileSize(file);
	                	
	                }

	                System.out.println("File size: " + fileSizeInKB + " KB");
	        	    
	        	    
	        	    
	        	    
	        	    
	        	    fileInput.sendKeys(localFilePath);
	        	         Thread.sleep(2000);
	        	        Path path = Paths.get(localFilePath); 
	        	        Files.delete(path);
	        	        System.out.println("File deleted successfully.");
	        	       			        	    
	             	} catch (IOException e) {
	        	    System.out.println("Not work");
	        	      e.printStackTrace();
	             	}
	             	 
	       
		                        
	     //   	  Thread.sleep(2000); 
	     //   	  Robot robot = new Robot(); 	
	     //   	  robot.keyPress(KeyEvent.VK_ENTER);
	    //          robot.keyRelease(KeyEvent.VK_ENTER);
	   
				
				
			    
	        
	}
	        
	        
	}      
	        
	        
	private static void compressFile(File file) throws IOException, CompressorException {
        File compressedFile = new File(file.getAbsolutePath() + ".compressed");

        try (FileInputStream inputStream = new FileInputStream(file);
             FileOutputStream outputStream = new FileOutputStream(compressedFile);
             BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
             org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipOut =
                     new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream(outputStream)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedInput.read(buffer)) != -1) {
                gzipOut.write(buffer, 0, bytesRead);
           
                
            
            
            }

        }
	}     
	        
	        
	        
	        
/*
	private static void reduceFileSize(File file) throws IOException, CompressorException {
		
		
		File compressedFile = new File(file.getAbsolutePath() + ".compressed");
        try (FileInputStream inputStream = FileUtils.openInputStream(file);
             FileOutputStream outputStream = FileUtils.openOutputStream(compressedFile)) {

            CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
            compressorStreamFactory.createCompressorOutputStream("gzip", outputStream).write(FileUtils.readFileToByteArray(file));

        }

		
	}
	*/
	
}
