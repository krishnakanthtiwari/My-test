import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Enter xpath");
	driver.findElement(By.cssSelector("#pass")).sendKeys("12345678"); //syntax #id
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	}

}