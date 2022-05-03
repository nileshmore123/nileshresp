package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://WWW.facebook.com/");
driver.findElement(By.id("email")).sendKeys("8806003182");
driver.findElement(By.id("pass")).sendKeys("nileshm7644");
driver.findElement(By.name("login")).click();
String sourceCode=driver.getPageSource();
System.out.println("application sourcecode:"+sourceCode);
System.out.println("application sourceCode length"+sourceCode.length());
System.out.println("application page title:"+driver.getTitle());
System.out.println("Application current url:"+driver.getCurrentUrl());

//driver.close();
	}

}

//1.launch the new chrome browser.
//2.open https://WWW.facebook.com/
//3.get page title name and title length
//4.print page title and title length on the eclipse console.
//5.getpage url and verify if it is a correct page opened
//6.get page sourced (HTML Source Code )and page source length
//7. Close the Browser.
