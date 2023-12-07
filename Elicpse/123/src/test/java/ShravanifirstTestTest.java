import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ShravanifirstTestTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void shravanifirstTest() {
 driver.get("https://www.vidyasaarathi.co.in/Vidyasaarathi/stusers/studentDashboard");
 driver.manage().window().setSize(new Dimension(1280, 672));
 driver.findElement(By.linkText("Close")).click();
 driver.findElement(By.linkText("Profile")).click();
 driver.findElement(By.cssSelector("#collapseOne > .card-body")).click();
 {
   WebElement element = driver.findElement(By.id("dateOfBirth"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).clickAndHold().perform();
 }
 {
   WebElement element = driver.findElement(By.cssSelector(".picker__holder"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).release().perform();
 }
 driver.findElement(By.cssSelector("#collapseOne .row:nth-child(5) .md-form")).click();
 driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(4) > .picker__day")).click();
 driver.findElement(By.cssSelector(".px-3:nth-child(2)")).click();
 driver.findElement(By.id("category")).click();
 {
   WebElement dropdown = driver.findElement(By.id("category"));
   dropdown.findElement(By.xpath("//option[. = 'OBC']")).click();
 }
 driver.findElement(By.id("title")).click();
 driver.findElement(By.id("firstName")).click();
 driver.findElement(By.id("middleName")).click();
 driver.findElement(By.id("middleName")).sendKeys("Vinayak ");
 driver.findElement(By.id("lastName")).click();
 driver.findElement(By.id("relationshipWithStudent")).click();
 {
   WebElement element = driver.findElement(By.id("occupation"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).clickAndHold().perform();
 }
 {
   WebElement element = driver.findElement(By.id("occupation"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.id("occupation"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).release().perform();
 }
 driver.findElement(By.id("occupation")).click();
 {
   WebElement dropdown = driver.findElement(By.id("occupation"));
   dropdown.findElement(By.xpath("//option[. = 'Retired']")).click();
 }
 driver.findElement(By.id("parentsMobileNo")).click();
 driver.findElement(By.id("parentsMobileNo")).sendKeys("9876543210");
 driver.findElement(By.id("familyIncome")).click();
 driver.findElement(By.id("familyIncome")).sendKeys("60000");
 driver.findElement(By.cssSelector("#studentForm > .row:nth-child(14)")).click();
 driver.findElement(By.id("address")).sendKeys("A/p Pimple");
 driver.findElement(By.id("pincode")).click();
 driver.findElement(By.cssSelector(".autocomplete-selected")).click();
 driver.findElement(By.cssSelector(".row:nth-child(31) > .col-sm-12")).click();
 driver.findElement(By.cssSelector("#collapseOne > .card-body")).click();
 driver.findElement(By.id("bankAccNo")).sendKeys("76567898765");
 {
   WebElement element = driver.findElement(By.id("reEnterBankAccNo"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).clickAndHold().perform();
 }
 {
   WebElement element = driver.findElement(By.id("reEnterBankAccNo"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.id("reEnterBankAccNo"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).release().perform();
 }
 driver.findElement(By.id("reEnterBankAccNo")).click();
 driver.findElement(By.cssSelector(".confirm")).click();
 driver.findElement(By.id("reEnterBankAccNo")).sendKeys("76567898765");
 driver.findElement(By.cssSelector(".row:nth-child(33) .md-form")).click();
 driver.findElement(By.id("ifscCode")).sendKeys("HDFC002");
 driver.findElement(By.cssSelector(".confirm")).click();
 driver.findElement(By.id("ifscCode")).sendKeys("HDFC0002872");
 driver.findElement(By.cssSelector(".autocomplete-selected")).click();
 driver.findElement(By.cssSelector(".row > .mx-auto")).click();
 driver.findElement(By.cssSelector(".row:nth-child(37) .md-form")).click();
 {
   WebElement element = driver.findElement(By.id("saveProfile"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 driver.findElement(By.id("saveProfile")).click();
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
}
}

