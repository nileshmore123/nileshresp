package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//maximize browser
		driver.manage().window().maximize();

		// enter url
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("current page title is:" + driver.getTitle());
		System.out.println("current page url is:" + driver.getCurrentUrl());
		// click on forget your password
		WebElement forgetPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgetPassword.click();
		// navigate in browser
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
//jump from current page to another page or url
		driver.navigate().to("https://WWW.amazon.in/");

	}

}
