package vtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class ActiTime {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".addNewButton")).click();
		driver.findElement(By.cssSelector("div.dropdownContainer >div.createNewCustomer")).click();
		driver.findElement(By.cssSelector("div.customerNameDiv>.inputFieldWithPlaceholder ")).sendKeys("NileshMore");
		//driver.findElement(By.cssSelector("div.components_resizableInput >div.di>.textarea")).sendKeys("my business");
		//driver.findElement(By.cssSelector(".customerImportDiv")).click();
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder")).click();
	}

}
