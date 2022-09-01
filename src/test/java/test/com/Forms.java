package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/user/vijay/.....");
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice/");
		
		driver.findElement(By.id("firstname")).sendKeys("Anu");
		
		//driver.findElement(By.linkText("Click here to reload this page")).click();
		
		driver.findElement(By.name("language_python")).click();
		
	}

}
