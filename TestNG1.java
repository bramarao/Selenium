import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG1 {
  @Test 
  public void Testcase() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Test Case 1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is Test Case 2");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Test Case 3");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is Test Case 4");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Test Case 5");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is Test Case 6");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is Test Case 7");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is Test Case 8");

  }

}
