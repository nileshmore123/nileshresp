package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		//WebElement passwordInputField=driver.findElement(By.id("password"));
	//	passwordInputField.sendKeys("password");
		//passwordInputField.clear();
		//passwordInputField.sendKeys("password");
		WebElement signupButton=driver.findElement(By.className("button"));
		signupButton.click();
		
		
	}

}
