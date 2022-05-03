package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://WWW.techlistic.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*WebElement clickjavaTutorial = driver.findElement(By.className("overflowable-item"));
		clickjavaTutorial.click();
		String ActualTitle = clickjavaTutorial.getText();
		System.out.println("page title validate:" + ActualTitle.equals("java Tutorial"));
		Thread.sleep(2000);
		driver.navigate().back();
		*/
		
		WebElement clickSeleniumTutorial = driver.findElement(By.className("dropbtn"));
		clickSeleniumTutorial.click();
		WebElement clickSeleniumblog = driver.findElement(By.className("overview-item"));
		clickSeleniumblog.click();
		String Title = clickSeleniumTutorial.getText();
		System.out.println("selenium paga title validation:" + clickSeleniumTutorial.equals("Selenium Tutorial"));
		/*Thread.sleep(2000);
		driver.navigate().back();
		WebElement clickSeleniumBlogs = driver.findElement(By.linkText("seleniumBlog"));
		clickSeleniumBlogs.click();
		String SeleniumTitle = clickSeleniumBlogs.getText();
		System.out.println("SeleniumBlog page title validation:" + clickSeleniumBlogs.equals("Selenium Blogs"));
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement clickTesNGBlogs = driver.findElement(By.linkText("TestNG Blog"));
		clickTesNGBlogs.click();
		Thread.sleep(2000);
		driver.navigate().back();
*/
	}

}
