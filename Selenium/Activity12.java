import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Activity12 {
    public static void main(String[] args) {
        // Start Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the website
        driver.get("https://training-support.net/webelements/tables");

        // Wait for any table to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

        // Get the title and print it
        System.out.println("Page Title: " + driver.getTitle());

        // Get all rows and columns of the first table
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));

        System.out.println("Number of Rows: " + rows.size());
        System.out.println("Number of Columns: " + columns.size());

        // Print all cell values in the third row
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        System.out.print("Third Row Cell Values: ");
        for (WebElement cell : thirdRow) {
            System.out.print(cell.getText() + " ");
        }
        System.out.println();

        // Print cell value at second row, second column
        WebElement cell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Cell Value at (2,2): " + cell.getText());

        // Close the browser
        driver.quit();
    }
}

