import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//Select class with object named dropdown
	Select dropdown = new Select(Staticdropdown);
dropdown.selectByIndex(3); //select INR
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("AED");	
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("USD");	
System.out.println(dropdown.getFirstSelectedOption().getText());
	}
	
}