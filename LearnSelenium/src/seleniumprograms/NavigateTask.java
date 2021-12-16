package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.navigate().refresh();
		
		

	}

}
