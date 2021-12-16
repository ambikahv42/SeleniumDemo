package seleniumprograms;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CheckLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select mth = new Select(month);
		mth.selectByIndex(7);
		List<WebElement> monthcount=mth.getOptions();
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++)
			
		{
			System.out.println(monthcount.get(i).getText());
			
		}
		
		mth.selectByIndex(7);
		
		
		 WebElement year=driver.findElement(By.xpath("//select[@placeholder= 'Year']"));
		 Select yr = new Select(year);
		  
		 List<WebElement>yearcount=yr.getOptions();
		 System.out.println(yearcount.size());
		 for(int i=0;i<yearcount.size();i++)
		 {
			 System.out.println(yearcount.get(i).getText());
		 }
		 
		yr.selectByValue("1999");
		
		WebElement day=driver.findElement(By.xpath("//select[@placeholder= 'Day']"));
		Select dy=new Select(day);
		
		List<WebElement>daycount=dy.getOptions();
		System.out.println(daycount.size());
		for (int i=0;i<daycount.size();i++)
				{
			System.out.println(daycount.get(i).getText());
				}
		dy.selectByVisibleText("24");
			
		
	}
	

	
	
	
	


	}


