import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000L);
	driver.findElement(By.name("enter-name")).sendKeys("Thathu");
	Thread.sleep(2000L);
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(2000L);
    driver.switchTo().alert().accept();
    //driver.switchTo().alert().dismiss();
    
	}
	
}