package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//input[@value='F']"));
	driver.findElement(By.id("FirstName")).sendKeys("Ambika");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ammu");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hvambika@30.gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ambikahv1");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("ambikahv1");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	
	

	}

}
