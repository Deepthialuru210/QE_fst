import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

	     // Open the page
	     driver.get("https://training-support.net/webelements/dynamic-controls");
	     // Print the title of the page
	     System.out.println("Page title: " + driver.getTitle());
	     
	     WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
	     System.out.println("text field enabled before the click " + inputField.isEnabled());
	     driver.findElement(By.xpath("//button[text()='Enable Input']")).click();
	     System.out.println("check box enabled after the click " + inputField.isEnabled());
	     driver.quit();

	}

}
