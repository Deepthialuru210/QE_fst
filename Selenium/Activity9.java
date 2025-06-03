import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {

        // Setup WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Locate elements using XPath
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement drop1 = driver.findElement(By.id("dropzone1"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Drag and drop to Dropzone 1
        actions.dragAndDrop(ball, drop1).perform();

        
        // Drag and drop to Dropzone 2
        actions.dragAndDrop(ball, drop2).perform();
       

        // Close browser
        driver.quit();
    }
}
