package webDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithclassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Phoebe Buffay",Keys.ENTER);
		driver.findElement(By.className("1NPNe")).click();
		
	}
	

}
