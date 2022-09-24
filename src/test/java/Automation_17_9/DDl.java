package Automation_17_9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	//large screen maximize 
	driver.manage().window().maximize();
	//single select
	// لازم عشان اعرف وين يروح
	WebElement animal = driver.findElement(By.id("animals"));
	Select dd=new Select(animal);
//dd.selectByIndex(3);
//dd.selectByValue("big baby cat");
dd.selectByVisibleText("Baby Cat");

//multi value dropdown 
//WebElement food = driver.findElement(By.id("second"));
WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
Select dd1=new Select(food);
dd1.selectByIndex(0);
dd1.selectByIndex(2);
dd1.selectByIndex(3);
//انا ما اخترتو
dd1.deselectByIndex(3);
dd1.deselectAll();





	}

}
