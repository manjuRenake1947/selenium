package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetcurrenturl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	String url	= driver.getCurrentUrl();
	
	if (url.equals("https://www.amazon.in/")) {
		
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is failed");
		
	}
		
	}
	}

