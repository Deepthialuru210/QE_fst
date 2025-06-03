import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();

	       
	        driver.get("https://training-support.net/webelements/alerts");
	         System.out.println("Page title: " + driver.getTitle());
	        String title = driver.getTitle();
	        driver.findElement(By.id("simple")).click();

	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert text: " + alert.getText());

	        alert.accept();

	        driver.quit();
	}

}
