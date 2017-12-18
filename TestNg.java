import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {
  @Test
public void verifyTitle(){
	  System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver/geckodriver.exe");

		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com");
		  Assert.assertEquals("Google", driver.getTitle());
		  driver.close();
		  }
		  
  }

