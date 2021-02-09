import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendersleect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	Thread.sleep(5000L);
	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000L);
	//driver.findElement(By.xpath("(//a[@value='IXL'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXL']")).click();
	
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); //.classname, replace space with dots in b/w
	//check the attribute of return date for one way trip
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//select round trip
	Thread.sleep(2000L);
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))//make it .5 to fail
	{
		System.out.println("It is enabled");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("It is still disabled");
		Assert.assertTrue(false);
	}
	}
	
	}
		
	
	