package browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");
 String expectedTitle="actiTIME";
 String actualTitle=driver.getTitle();
 if(actualTitle.equals(expectedTitle)) {
	 System.out.println("login page successfully.....");
	 
 }else {
	 System.out.println("login page unsuccefull...");
	 
 }
 driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.id("loginButton")).click();
	}

}
