import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Updatecodde {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            FileInputStream file = new FileInputStream(new File("C:\\path\\to\\input.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("DataExcel");
            int totalRows = sheet.getLastRowNum();
            Row headerRow = sheet.getRow(0);

            for (int i = 1; i <= totalRows; i++) {
                Row dataRow = sheet.getRow(i);

                Cell fullNameCell = dataRow.getCell(0, MissingCellPolicy.RETURN_BLANK_AS_NULL);
                String fullName = (fullNameCell != null && fullNameCell.getCellType() == CellType.STRING)
                        ? fullNameCell.getStringCellValue()
                        : "";

                Cell familyBackgroundCell = dataRow.getCell(1, MissingCellPolicy.RETURN_BLANK_AS_NULL);
                String familyBackground = (familyBackgroundCell != null && familyBackgroundCell.getCellType() == CellType.STRING)
                        ? familyBackgroundCell.getStringCellValue()
                        : "";

                Cell genderCell = dataRow.getCell(2, MissingCellPolicy.RETURN_BLANK_AS_NULL);
                String gender = (genderCell != null && genderCell.getCellType() == CellType.STRING)
                        ? genderCell.getStringCellValue()
                        : "";

                Cell hobbiesCell = dataRow.getCell(3, MissingCellPolicy.RETURN_BLANK_AS_NULL);
                String hobbies = (hobbiesCell != null && hobbiesCell.getCellType() == CellType.STRING)
                        ? hobbiesCell.getStringCellValue()
                        : "";

                driver.get("https://forms.gle/xDJTUZgigVEVENjKA");
                Thread.sleep(2000);

                WebElement fullNameField = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
                fullNameField.sendKeys(fullName);
                Thread.sleep(2000);

                WebElement familyBackgroundField = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/textarea"));
                familyBackgroundField.sendKeys(familyBackground);
                Thread.sleep(2000);

                if (gender.equalsIgnoreCase("male")) {
                    WebElement maleRadioButton = driver.findElement(By.xpath("//*[@id=\"i13\"]/div[3]/div"));
                    maleRadioButton.click();
                } else if (gender.equalsIgnoreCase("female")) {
                    WebElement femaleRadioButton = driver.findElement(By.xpath("//*[@id=\"i16\"]/div[3]"));
                    femaleRadioButton.click();
                }

                Thread.sleep(2000);

                List<String> hobbiesList = getHobbiesList(hobbies);
                for (String hobby : hobbiesList) {
                    WebElement checkbox = getHobbyCheckbox(driver, hobby);
                    if (checkbox != null) {
                        checkbox.click();
                    } else {
                        System.out.println("Checkbox not found for hobby: " + hobby);
                    }
                }

                // Submit the form
                WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span"));
                submitButton.click();

                // Handle alert popup (if present)
                try {
                    driver.switchTo().alert().accept();
                } catch (Exception e) {
                    // Alert not present, continue with the next iteration
                }

                // Wait for submission confirmation or other desired actions
                // ...

                // Clear the form fields for the next iteration (optional)
                fullNameField.clear();
                familyBackgroundField.clear();
            }

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    private static List<String> getHobbiesList(String hobbies) {
        return Arrays.asList(hobbies.split(","));
    }

    private static WebElement getHobbyCheckbox(WebDriver driver, String hobby) {
        String trimmedHobby = hobby.trim().toLowerCase();
        if (trimmedHobby.equals("cricket")) {
            return driver.findElement(By.xpath("//span[text()='Cricket']/preceding-sibling::div[@role='checkbox']"));
        } else if (trimmedHobby.equals("cooking")) {
            return driver.findElement(By.xpath("//span[text()='Cooking']/preceding-sibling::div[@role='checkbox']"));
        } else if (trimmedHobby.equals("singing")) {
            return driver.findElement(By.xpath("//span[text()='Singing']/preceding-sibling::div[@role='checkbox']"));
        } else if (trimmedHobby.equals("football")) {
            return driver.findElement(By.xpath("//span[text()='Football']/preceding-sibling::div[@role='checkbox']"));
        } else {
            return null;
        }
    }
}
