import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clearmytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000L);
		WebElement Adult = driver.findElement(By.id("Adults"));
		Select adultcount = new Select(Adult);
		adultcount.selectByValue("2");

		WebElement child = driver.findElement(By.id("Childrens"));
		Select childcount = new Select(child);
		childcount.selectByValue("3");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000L);
		WebElement travelclass = driver.findElement(By.id("Class"));
		Select type = new Select(travelclass);
		type.selectByValue("Business");
		Thread.sleep(2000L);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		Thread.sleep(2000L);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}