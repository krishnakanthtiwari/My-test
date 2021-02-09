import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	//count the number of checkboxes
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000L);
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1;i<5;i++)
	{
		
		driver.findElement(By.id("hrefIncAdt")).click();	
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
}
}