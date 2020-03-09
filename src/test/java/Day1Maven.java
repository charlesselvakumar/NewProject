
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Maven {

	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charles\\Automation\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
	}
		
	@AfterClass
	
	public static void afterclass() {
		
		driver.close();
		
		
	}
	
	
	@Test
	
	public void test1() {
		
		driver.findElement(By.id("email")).sendKeys("john");
		driver.findElement(By.id("pass")).sendKeys("666666");
		
	}
	
	@Before
	public  void before() {
		System.out.println("start time");
		Date d=new Date();
		System.out.println(d);
		

	}

		@After
		public  void after() {
			System.out.println("end time");
			Date d=new Date();
			System.out.println(d);
		}
		

	}


