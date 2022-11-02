import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzNzg2OTM0LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abcde");
		driver.findElement(By.id("pass")).sendKeys("tushar");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Log in to Facebook"))
		{
			System.out.println("is pass");
		}
		else {
			System.out.println("is fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

		
		
	
	}

}
