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
public class LikeTest {
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
  public void like() {
    // Test name: like
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 1012x728 | 
    driver.manage().window().setSize(new Dimension(1012, 728));
    // 3 | runScript | window.scrollTo(0,349) | 
    js.executeScript("window.scrollTo(0,349)");
    // 4 | click | css=.xp7jhwk .x6s0dn4 > .x1lliihq | 
    driver.findElement(By.cssSelector(".xp7jhwk .x6s0dn4 > .x1lliihq")).click();
    // 5 | close |  | 
    driver.close();
  }
}
