import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {
        // Start Chrome browser
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/keyboard-events");

        // Print page title
        System.out.println("Page title: " + driver.getTitle());

        // Type a message using keyboard actions
        WebElement body = driver.findElement(By.tagName("body"));
        String message = "This is a test from Selenium!";
        new Actions(driver).sendKeys(body, message).perform();

        // Print the typed message
        System.out.println("Typed message: " + message);

        // Close the browser
        driver.quit();
    }
}
