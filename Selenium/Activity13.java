import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // 1. Open the website
        driver.get("https://training-support.net/webelements/tables");

        // 2. Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // 3. Find number of rows (all <tr> inside <tbody>)
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        // 4. Find number of columns (all <td> inside the first <tr>)
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + cols.size());

        // 5. Find and print Book Name in the 5th row (2nd <td> in that row)
        WebElement bookNameBeforeSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book in 5th row before sort: " + bookNameBeforeSort.getText());

        // 6. Click the header of the "Price" column (assumed to be 5th column)
        WebElement priceHeader = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        priceHeader.click();

        // 7. Wait briefly for sort to reflect (you can use Thread.sleep or WebDriverWait for better handling)
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 8. Find and print Book Name in 5th row again after sorting
        WebElement bookNameAfterSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book in 5th row after sort: " + bookNameAfterSort.getText());

        // 9. Close the browser
        driver.quit();
    }
}