package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an  alert box:')]")).click();
		 Alert altr=driver.switchTo().alert();
		 String alertmessage=driver.switchTo().alert().getText();
		 System.out.println(alertmessage);
		 
		 altr.accept();
		 
		  driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		 driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box')]")).click();
		 Alert alt1=driver.switchTo().alert();
		 String altmessage=driver.switchTo().alert().getText();
		 System.out.println(altmessage);
		 
		 alt1.accept();
		 
		 driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		 driver.findElement(By.xpath("//button[contains(text(), 'click the button to display a confirm box :')]")).click();
		 Alert alt2=driver.switchTo().alert();
		 String altrmessage=driver.switchTo().alert().getText();
		 System.out.println(altrmessage);
		 
		 alt2.accept();
		 
		 driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		 driver.findElement(By.xpath("//button[contains(text(), 'click the button to demonstrate the prompt box  :')]")).click();
		 Alert alt3=driver.switchTo().alert();
		 String altrmessage1=driver.switchTo().alert().getText();
		 System.out.println(altrmessage1);
		 
		 alt3.accept();
	}
}
