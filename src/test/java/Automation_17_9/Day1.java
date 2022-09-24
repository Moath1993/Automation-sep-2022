package Automation_17_9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) {
		// lunch browser 
		//object
		// Class objectname=new Class();
	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.safaridriver().setup();
	ChromeDriver driver=new ChromeDriver();
// open navegate to url
		
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//click to Make Appointment
	//	driver.findElement(By.className("btn btn-dark btn-lg")).click();
	driver.findElement(By.id("btn-make-appointment")).click();
	
	//fill user name
		driver.findElement(By.name("username")).sendKeys("John Doe");
		
		//fill pass
	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	
	driver.findElement(By.id("btn-login")).click();
	
	//driver.navigate().forward();
	//driver.navigate().back();
	
	//driver.findElement(By.linkText("info@katalon.com")).click();
	
	
	//في حال موجود بالرابط ارقام باخذ جزء من النص الي فيه بس الاحرف

	//driver.findElement(By.partialLinkText("info")).click();\
	
	//في حال عدم وجود اي اتربيوت قدبم 
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	
		//FirefoxDriver driver1=new FirefoxDriver();
		//driver1.get("https://katalon-demo-cura.herokuapp.com/");
		
		//SafariDriver driver2=new SafariDriver();
		//driver2.navigate().to("https://katalon-demo-cura.herokuapp.com/");
	}

}
