package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithquitmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElements("https://selenium143.blogspot.com/");
		
		driver.quit();
	}

}
