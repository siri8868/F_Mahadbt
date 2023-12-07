package Excel_Data;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
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
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;





class size256kb {

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
/*
        // Input image file path
        File input = new File("C:\\Users\\Shravani\\Downloads\\Forstu_News.jpg");
        BufferedImage image = ImageIO.read(input);

        // Output compressed image file path
        File compressedImageFile = new File("C:\\Users\\Shravani\\Downloads\\compress.jpg");
        OutputStream os = new FileOutputStream(compressedImageFile);

        // Rest of the code remains the same
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
        ImageWriter writer = (ImageWriter) writers.next();

        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);
  
        ImageWriteParam param = writer.getDefaultWriteParam();

        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.05f);
        writer.write(null, new IIOImage(image, null, null), param);

        os.close();
        ios.close();
        writer.dispose();
        
        */
    	
    	
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
         WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
   
         
        
        
   
        File src = new File("C:\\Users\\Shravani\\Documents\\Forstu Project\\Forstu_Automation\\Excel_data\\Ex.xlsx");
        FileInputStream fis = new FileInputStream(src);
        
        XSSFWorkbook xsf = new XSSFWorkbook(fis);
        XSSFSheet sheet = xsf.getSheetAt(0);
        Workbook workbook = new XSSFWorkbook();   
        
        
        
         for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            XSSFRow row = sheet.getRow(rowNum);
            
    	
    	
            String Login  = row.getCell(0).getStringCellValue();
            String Password = row.getCell(1).getStringCellValue(); 	 
            String  s3Url = row.getCell(13).getStringCellValue(); 
            String localFilePath  = row.getCell(14).getStringCellValue();
            
            
            
                   driver.get("https://mahadbt.maharashtra.gov.in/Login/Login");
           	//Login :
           			       driver.findElement(By.id("UserName")).sendKeys(String.valueOf(Login));
           			    //    driver.findElement(By.id("UserName")).sendKeys(String.valueOf(Login));
           			 //       driver.findElement(By.id("UserName")).sendKeys(Login);
           			             
           			       
           		            
           			          			             
           			             
           	//Password :
           			            driver.findElement(By.id("Password")).sendKeys(Password);
           			        
           			             Thread.sleep(13000);
           		        
           	//Click On Login button : 
           						driver.findElement(By.id("btnLogin")).click();
           					            
           	//Click On the Profile Button :
           					    driver.findElement(By.xpath("//*[@id=\"global-wrapper\"]/section/div/div/div[1]/div[1]/ul/ul/li[3]/a")).click();
           			    
            
            driver.findElement(By.xpath("//*[@id=\"CasteDiv\"]/div[2]/div/label[2]/span")).click();
            
    	
    		
    	
    	/*try {
    		Thread.sleep(2000);
    	    WebElement fileInput = driver.findElement(By.id("FileNameCastcert")); 
            Thread.sleep(2000);
    	    // Encode the S3 URL
    	//    String encodedS3Url = URLEncoder.encode(s3Url, "UTF-8");
    	    String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3Url).build().toUriString();  
    	    // Download the file from S3 to your local machine
    	   
    	    FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePath));
    	    
    	    HttpURLConnection connection = (HttpURLConnection) new URL(s3Url).openConnection();
            connection.setRequestMethod("HEAD");
            int fileSize = connection.getContentLength();
            if (fileSize > 256 * 1024) { 
         	   
            	
          
            	 ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
                 ImageWriteParam param = writer.getDefaultWriteParam();

                 // Set compression parameters
                 param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                 param.setCompressionQuality(0.05f);

                 // You need to provide the image object to compress
                 BufferedImage image = ImageIO.read(new File(localFilePath));

                 // Compress the image
                 writer.write(null, new IIOImage(image, null, null), param);

                 // Close the writer
                 writer.dispose();

                
            
            }
    	    fileInput.sendKeys(localFilePath);
    	         Thread.sleep(2000);
    	        Path path = Paths.get(localFilePath); 
    	        Files.delete(path);
    	        System.out.println("File deleted successfully.");
    	   			        	    
         	} catch (IOException e) {
    	    System.out.println("Not work");
    	    e.printStackTrace();
        	} 
   
                           
    	  Thread.sleep(2000); 
    	  Robot robot = new Robot(); 	
    	  robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
*/
        
            
              try {
                Thread.sleep(2000);
                WebElement fileInput = driver.findElement(By.id("FileNameCastcert"));
                Thread.sleep(2000);

                // Encode the S3 URL
                String encodedS3Url = UriComponentsBuilder.fromHttpUrl(s3Url).build().toUriString();

                // Download the file from S3 to your local machine
                FileUtils.copyURLToFile(new URL(encodedS3Url), new File(localFilePath));

                HttpURLConnection connection = (HttpURLConnection) new URL(s3Url).openConnection();   
                int fileSize = connection.getContentLength();

                if (fileSize > 256 * 1024) {
                   
                	/*  File input = new File(localFilePath);
                      BufferedImage image = ImageIO.read(input);

                      // Output compressed image file path
                      File compressedImageFile = new File(localFilePath);
                      OutputStream os = new FileOutputStream(compressedImageFile);
                       Thread.sleep(2000);                     
                      // Rest of the code remains the same
                       Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("pdf");  
             //       Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
                      ImageWriter writer = (ImageWriter) writers.next();

                      ImageOutputStream ios = ImageIO.createImageOutputStream(os);
                      writer.setOutput(ios);
                
                      ImageWriteParam param = writer.getDefaultWriteParam();

                      param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                      param.setCompressionQuality(0.05f);
                      writer.write(null, new IIOImage(image, null, null), param);

                      os.close();
                      ios.close();
                      writer.dispose();
                    */
                	
                	  String localFilePath1 = "C:\\Users\\Shravani\\Downloads\\mahh.jpg"; 

                      File input = new File(localFilePath1);
                      BufferedImage image = ImageIO.read(input);

                      // Output compressed PDF file path
                      File compressedPdfFile = new File("C:\\Users\\Shravani\\Downloads\\compressed.pdf"); // Replace with the desired PDF file path
                      OutputStream os = new FileOutputStream(compressedPdfFile);

                      // Simulate compression delay (optional)
                      Thread.sleep(2000);

                      PDDocument document = new PDDocument();
                      PDPage page = new PDPage();
                      document.addPage(page);

                      PDPageContentStream contentStream = new PDPageContentStream(document, page);

                      // Compress the image (you can modify this part based on your requirements)
                      // For example, you can use the code you provided for JPEG compression here

                      // Convert BufferedImage to PDImageXObject :
                      PDImageXObject pdImage = LosslessFactory.createFromImage(document, image);

                      // Add the image to the PDF page
                      contentStream.drawImage(pdImage, 20, 20);

                      contentStream.close();

                      document.save(os);
                      document.close();

                	
                	
                	
                	
                	
                	
                	
                    	
                    } else {
                    	
                        System.out.println("Failed to read the image. Compression skipped.");
                    }
                
                    
                fileInput.sendKeys(localFilePath);
                Thread.sleep(2000);

                Path path = Paths.get(localFilePath);
                Files.delete(path);
                System.out.println("File deleted successfully.");
            } catch (IOException | InterruptedException e) {
                System.out.println("An error occurred while processing the file.");
                e.printStackTrace();
            }

            Thread.sleep(2000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(5000);
    
            
            
            
            
            
         }
    }
}


