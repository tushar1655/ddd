import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		Thread.sleep(2000);
		driver1.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		if(title.equals(""))
		{System.out.println("is pass");
			
		}
		else {
			System.out.println("is fail");
		}
	String url = driver.getCurrentUrl();
	driver.close();
	}

}
