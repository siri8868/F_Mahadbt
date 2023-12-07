package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class edge_Driver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://forms.gle/VbMvW7oZQTNwhN1P7");
	}

}
