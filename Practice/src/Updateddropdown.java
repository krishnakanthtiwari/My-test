import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
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