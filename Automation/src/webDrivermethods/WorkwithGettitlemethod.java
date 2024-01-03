package webDrivermethods;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithGettitlemethod {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.zomato.com/india/");
		 
		 String actual_title = driver.getTitle();
		// System.out.println("current webpage"+actual_title);
		 if (actual_title.equals("online food order title")) {
			 System.out.println("Test case is pass");
		 }
		 else {
			System.out.println("The test case is faild");
		}
			
		}
	}


