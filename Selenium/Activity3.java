import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://training-support.net/webelements/target-practice");
		 
		  String title = driver.getTitle();
	      System.out.println("Page title: " + title);
	      
	       WebElement thirdHeader = driver.findElement(By.xpath("(//h3)"));
	       System.out.println("Third header text: " + thirdHeader.getText());

	        // 4. Find the 5th header and print its color
	        WebElement fifthHeader = driver.findElement(By.xpath("(//h5)"));
	        String color = fifthHeader.getCssValue("color");
	        System.out.println("Fifth header color: " + color);

	        WebElement purpleButton = driver.findElement(By.xpath("//button[contains(@class, 'purple')]"));
	        String purpleClasses = purpleButton.getDomAttribute("class"); // getAttribute is usually more reliable
	        System.out.println("Purple Button Classes: " + purpleClasses);

	        WebElement slateButton = driver.findElement(By.xpath("//button[text()='Slate']"));
	        String slateText = slateButton.getText();
	        System.out.println("Slate Button Text: " + slateText);

	        driver.quit();
	}

}
