package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingClaender {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://WWW.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("li[data-cy='account']")).click();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.className("li[data-cy='account']")).click();

		driver.findElement(By.cssSelector(
				"div.Daypicker-Months>*:last-child>.Daypicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
	}

}
