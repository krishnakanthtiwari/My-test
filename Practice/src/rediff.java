import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://rediff.com");
	
	/*driver.findElement(By.cssSelector("input[id='email']")).sendKeys("eNTER CSS");
	//driver.findElement(By.cssSelector("input#pass")).sendKeys("12345678"); //syntax tagname#id
	driver.findElement(By.cssSelector("#pass")).sendKeys("12345678"); //syntax #id
	driver.findElement(By.cssSelector("button[name='login']")).click();
	*/
	driver.findElement(By.cssSelector("a[class*='sign']")).click(); //syntax tagname[attribute*='value']
	//driver.findElement(By.xpath("//input[contains(@name,'log')]")).sendKeys("namaste"); //syntax //tagname[contains(@attribute,'value')]
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("namaste");
	driver.findElement(By.cssSelector("input#password")).sendKeys("12345678"); //syntax tagname#id
	driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); //syntax //tagname[contains(@attribute,'value')]
	}
}