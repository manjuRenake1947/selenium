package webDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.findElement(By.name("username")).sendKeys("manjunathrenake97@gmail.com");
driver.findElement(By.name("password")).sendKeys("manju@123");
driver.findElement(By.className("_acan")).click();
	}

}
