package Automation_17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
	driver.findElement(By.id("btn-make-appointment")).click();
	driver.findElement(By.name("username")).sendKeys("John Doe");
	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	driver.findElement(By.id("btn-login")).click();
	
	WebElement facility = driver.findElement(By.id("combo_facility"));
	Select ss=new Select(facility);
	
	//ss.selectByVisibleText("Seoul CURA Healthcare Center");
	ss.selectByIndex(2);
	


	}

}
