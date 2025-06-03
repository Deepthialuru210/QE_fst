import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activty15 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://training-support.net/webelements/selects");

        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.cssSelector("select.bg-purple-200"));

        Select select = new Select(dropdown);
        select.selectByVisibleText("Two");
        select.selectByIndex(2);
        select.selectByValue("three");
        
        List<WebElement> allOptions = select.getOptions();
        System.out.println("All dropdown options:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
      driver.quit();
    }
}
