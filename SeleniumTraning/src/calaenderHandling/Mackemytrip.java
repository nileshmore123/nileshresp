package calaenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Mackemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.setUp("chrome", "https://WWW.makemytrip.com/");
driver.findElement(By.cssSelector("li[data-cy='account']")).click();
driver.findElement(By.cssSelector("label[for='departure']")).click();
driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div")).click();
driver.findElement(By.cssSelector("input[data-cy='fromCity']")).click();
driver.findElement(By.cssSelector("input[data-cy='fromCity']")).sendKeys(Keys.TAB);
List<WebElement> cred=driver.findElements(By.cssSelector("div.chHeaderContainer >span"));
System.out.println(cred.size());

	}

}
