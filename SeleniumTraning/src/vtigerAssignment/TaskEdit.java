package vtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class TaskEdit {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		WebElement Usernamefield=driver.findElement(By.id("username"));
		//Usernamefield.clear();
		Usernamefield.sendKeys(Keys.TAB);
		WebElement Psswordfield=driver.findElement(By.cssSelector("input#password"));
		//Psswordfield.clear();
		Psswordfield.sendKeys(Keys.TAB);
		
		WebElement LoginBtn=driver.findElement(By.className("button"));
		LoginBtn.sendKeys(Keys.ENTER);
	 WebDriverWait wait=new WebDriverWait(driver,20);

		driver.findElement(By.cssSelector(".app-menu")).click();
		

	}

}
