import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        // Start Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the test page
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Set up explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Find the Toggle Checkbox button
        WebElement toggleButton = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));

        // First click: Remove the checkbox
        toggleButton.click();
        System.out.println("Clicked to remove checkbox.");

        // ✅ WAIT for the checkbox to DISAPPEAR
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        System.out.println("Checkbox is now gone.");

        // Second click: Add the checkbox back
        toggleButton.click();
        System.out.println("Clicked to add checkbox back.");

        // ✅ WAIT for the checkbox to APPEAR again
        WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        System.out.println("Checkbox is now visible.");

        // ✅ SELECT the checkbox
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        // Close browser
        driver.quit();
    }
}
