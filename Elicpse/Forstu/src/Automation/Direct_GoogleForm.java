package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Direct_GoogleForm {
	
	
	WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		 Thread.sleep(2000); 
		 driver.manage().window().maximize(); 
		 
		//URL
		 
	 	 driver.get("https://forms.gle/VbMvW7oZQTNwhN1P7");
	 	 Thread.sleep(2000);
		
	 	 // Radio Button 
	 	driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
	 	Thread.sleep(2000);
		
		//Name
	 	driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Shravani Dhumal");
	 	Thread.sleep(2000);
          //
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span")).click();
		Thread.sleep(2000);
		
	 	//1 DropDow
		 	Select s = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]")));
			//step 2:Select option
			s.selectByVisibleText("state");
			Thread.sleep(2000);
		
	}

}
