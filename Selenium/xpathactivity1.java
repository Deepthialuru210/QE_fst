import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathactivity1 {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");

    // Perform testing and assertions
   System.out.println(driver.getTitle());
   
   driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click(); 
   System.out.println("New Page Title: " + driver.getTitle());
    
    driver.quit();
  }
}