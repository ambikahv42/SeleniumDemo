package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String acttitle=driver.getTitle();
		int titlen=driver.getTitle().length();
		System.out.println( acttitle);
		System.out.println(titlen);
		
		String URL=driver.getCurrentUrl();
		System.out.println("correct page opened");
		
		String excpsource=driver.getPageSource();
		int sourcelen=driver.getPageSource().length();
		System.out.println(sourcelen);
		driver.close();
		
		
		
		

	}

}
