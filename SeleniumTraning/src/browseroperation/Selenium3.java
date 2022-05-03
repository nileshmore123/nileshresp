package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://WWW.saucedemo.com/");



driver.findElement(By.id("usre-name")).sendKeys("standard_user");
driver.findElement(By.id("passowrd")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();



	}

}
