package JSonfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonDataUpload {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Browser Extention\\chromedriver.exe");

        // Initialize the ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Load the JSON file
        JSONParser parser = new JSONParser();
        try {
            JSONArray data = (JSONArray) parser.parse(new FileReader("C:\\Users\\Shravani\\OneDrive\\Pictures\\Auto\\Forstu_Automation\\Elicpse\\123\\src\\main\\java\\JSonfiles\\JSonForstu.json"));

            // Iterate over the JSON array
            for (Object obj : data) {
                JSONObject entry = (JSONObject) obj;

                // Extract the data from the JSON object
                String fullName = (String) entry.get("fullName");
                String familyBackground = (String) entry.get("familyBackground");
                String gender = (String) entry.get("gender");
                String hobby = (String) entry.get("hobby");

                // Navigate to the Google Form URL
                driver.get("https://forms.gle/xDJTUZgigVEVENjKA");

                // Fill in the Google Form fields
                WebElement fullNameField = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
                fullNameField.sendKeys(fullName);

                WebElement familyBackgroundField = driver.findElement(By.xpath("//textarea[@name='entry.987654321']"));
                familyBackgroundField.sendKeys(familyBackground);

                // Handle the gender radio buttons
                if (gender.equalsIgnoreCase("male")) {
                    WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name='entry.555555555' and @value='Male']"));
                    maleRadioButton.click();
                } else if (gender.equalsIgnoreCase("female")) {
                    WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='entry.555555555' and @value='Female']"));
                    femaleRadioButton.click();
                }

                // Handle the hobby checkboxes
                String[] hobbies = hobby.split(",");
                for (String hobbyOption : hobbies) {
                    WebElement hobbyCheckbox = driver.findElement(By.xpath("//input[@name='entry.888888888' and @value='" + hobbyOption.trim() + "']"));
                    hobbyCheckbox.click();
                }

                // Submit the form
                WebElement submitButton = driver.findElement(By.xpath("//button[@id='mG61Hd']"));
                submitButton.click();

                // Wait for submission confirmation or other desired actions
                // ...

                // Clear the form fields for the next iteration (optional)
                fullNameField.clear();
                familyBackgroundField.clear();
            }

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
