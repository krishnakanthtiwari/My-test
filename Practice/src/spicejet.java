import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.spicejet.com/");
	Thread.sleep(2000l);
	//one way trip
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		//senior citizen
	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
    System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	//source
    Thread.sleep(5000L);
    //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
    driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='BLR']")).click();
    Thread.sleep(2000L);
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXL']")).click();
    Thread.sleep(2000L);
    //calendar 	   
 	 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
 	//1 adult
 	//driver.findElement(By.id("divpaxinfo")).click();
 	//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
 	Thread.sleep(2000l);
 	driver.findElement(By.className("paxinfo")).click();
 	Thread.sleep(2000l);
 	WebElement passenger = driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
 	//Select class with object named dropdown
 	passenger.click();
 	Thread.sleep(2000l);
 	Select count = new Select(passenger); // object name count
 	count.selectByValue("3");
 	Thread.sleep(2000l);
 	 WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
  //Select class with object named dropdown
  	Select dropdown = new Select(Staticdropdown);
  dropdown.selectByIndex(3); //select INR
Thread.sleep(2000);	
  driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}
}