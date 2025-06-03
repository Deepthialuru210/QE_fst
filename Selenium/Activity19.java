import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19{
    public static void main(String[] args) {
    	WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        // Step 4: Click the PROMPT alert button
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt text: " + promptAlert.getText());

        
        promptAlert.sendKeys("Awesome!");
        promptAlert.accept();
        driver.quit();
    }
}
