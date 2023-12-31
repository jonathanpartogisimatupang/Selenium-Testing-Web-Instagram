// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginvalidTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginvalid() {
    // Test name: login valid
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 1012x728 | 
    driver.manage().window().setSize(new Dimension(1012, 728));
    // 3 | type | name=username | jonathan_partogi
    driver.findElement(By.name("username")).sendKeys("jonathan_partogi");
    // 4 | type | name=password | 19062018
    driver.findElement(By.name("password")).sendKeys("19062018");
    // 5 | type | name=username | jonathansiburian__
    driver.findElement(By.name("username")).sendKeys("jonathansiburian__");
    // 6 | type | name=password | Jonathan123456
    driver.findElement(By.name("password")).sendKeys("Dirahasiakan");
    // 7 | click | css=#loginForm > .x78zum5 | 
    driver.findElement(By.cssSelector("#loginForm > .x78zum5")).click();
    // 8 | click | css=.\_acan > .x9f619 | 
    driver.findElement(By.cssSelector(".\\_acan > .x9f619")).click();
    // 9 | mouseOver | css=.\_acan > .x9f619 | 
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_acan > .x9f619"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 10 | mouseOut | css=.\_acan > .x9f619 | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
