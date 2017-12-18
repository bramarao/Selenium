import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IrctcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver/geckodriver.exe");

	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.irctc.co.in/");
	 driver.findElement(By.id("usernameId")).sendKeys("huramarao");
	 driver.findElement(By.className("loginPassword")).sendKeys("hariom@12");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Captcha");
     String captcha = sc.nextLine();
     driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
     driver.findElement(By.id("loginbutton")).click();
     String url = driver.getCurrentUrl();
     if(url.equals("https://www.irctc.co.in/eticketing/home")){
     System.out.println("LogIn Successfull - Passed");
     }
    	 else
    	 {
    		 System.out.println("LogIn Failed - Failed");
    	 }
     }
	}


