import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
	driver.get("https://login.salesforce.com/?locale=in");
	//driver.findElement(By.id("username")).sendKeys("hello");
	driver.findElement(By.cssSelector("#username")).sendKeys("hello");
	driver.findElement(By.id("password")).sendKeys("123456");
	//driver.findElement(By.id("Login")).click();
	//driver.findElement(By.xpath("//*[@id='Login']")).click();
	driver.findElement(By.cssSelector("#Login")).click();
	System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}