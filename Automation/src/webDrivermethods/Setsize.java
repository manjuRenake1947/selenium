package webDrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	 Dimension d = new Dimension(100, 100);
	 driver.manage().window().setSize(d);
   }
}
