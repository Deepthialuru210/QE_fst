package suiteExample;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;
    final int TIMEOUT = 10; // seconds

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.get("https://training-support.net/webelements/login-form");
    }
    
    @DataProvider(name = "Credentials")
    public Object[][] creds() { // Removed 'static'
        return new Object[][] { 
            { "admin1", "password1", "Invalid credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid credentials" }
        };
    }

    @Test(dataProvider = "Credentials")
    public void loginTest(String username, String password, String expectedMessage) {
        // Wait for elements to be present
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[text()='Submit']")));

        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Wait for message to appear/update
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading")));
        String loginMessage = message.getText();
        Assert.assertEquals(loginMessage, expectedMessage);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}