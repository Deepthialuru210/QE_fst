import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
       
      
        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver();
        
        // Open the URL
        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println("Page title: " + driver.getTitle());
        
        // Find and fill username field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("admin");
        
        // Find and fill password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password");
        
        // Find and click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        loginButton.click();
        
        WebElement welcomeMessage = driver.findElement(By.tagName("h2"));
        System.out.println("Confirmation Message: " + welcomeMessage.getText());
        
        // Close browser
        driver.quit();
    }
}