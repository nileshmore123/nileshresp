package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
String sourceCode=driver.getPageSource();
System.out.println("Application sourcecode:"+sourceCode);
System.out.println("Application source code:"+sourceCode.length());
System.out.println("Application title:"+driver.getTitle());
System.out.println("Application sourcecode:"+driver.getCurrentUrl());

	}

}
//1.launch the new chrome browser.
//2.open https://demo.actitime.com/
//3.get page title name and title length
//4.print page title and title length on the eclipse console.
//5.getpage url and verify if it is a correct page opened
//6.get page sourced (HTML Source Code )and page source length
//7. Close the Browser.






