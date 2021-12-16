package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("hvambika50@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ambikahv");
         driver.findElement(By.xpath("//*[@value='Log in']")).click();
         driver.findElement(By.linkText("Computers")).click();
         Thread.sleep(3000);
         driver.findElement(By.linkText("Desktops")).click();
         driver.findElement(By.linkText("Build your own cheap computer")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='add-to-cart-button-72']")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Shopping cart")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("termsofservice")).click();
         Thread.sleep(4000);
         driver.findElement(By.id("checkout")).click();
       
         WebElement address=driver.findElement(By.xpath("//select[@id='billing-address-select']"));
          Select ad=new Select(address);
          ad.selectByValue("  1068145");
          driver.findElement(By.xpath("//*[@title='Continue' and @onclick='Billing.save()']")).click();
          Thread.sleep(3000);
         
        WebElement adres=driver.findElement(By.xpath("//select[@id='shipping-address-select']"));
        Select ads=new Select(adres);
        ads.selectByValue(" 1068145");
        driver.findElement(By.xpath("//*[@title='Continue' and @onclick='Shipping.save()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='ShippingMethod.save()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Log out")).click();
        Thread.sleep(3000);
        driver.close();
         
		

	}

}
