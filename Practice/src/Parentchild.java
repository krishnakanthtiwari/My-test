import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	//parent child traversing for gmail
	//driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div/a")).click();
	driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click(); //for images
	}

}