import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	/*driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Enter xpath");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//button[@name='login']")).click();*/
	
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("eNTER CSS");
	//driver.findElement(By.cssSelector("input#pass")).sendKeys("12345678"); //syntax tagname#id
	driver.findElement(By.cssSelector("#pass")).sendKeys("12345678"); //syntax #id
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	}

}