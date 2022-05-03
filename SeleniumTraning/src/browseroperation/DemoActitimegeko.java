package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoActitimegeko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://demo.actitime.com/");
	String SourcCode=driver.getTitle();
	System.out.println("Application current URL :"+driver.getCurrentUrl());
	System.out.println("Application title:"+driver.getTitle());
	System.out.println("Application title length:"+SourcCode.length());
	//if(driver.getTitle().equlas) {
		
	//}
	
	
	
	
	driver.close();
	}

}

//1.launch the new gecko browser.
//2.open https://demo.actitime.com/
//3.get page title name and title length
//4.print page title and title length on the eclipse console.
//5.getpage url and verify if it is a correct page opened
//6.get page sourced (HTML Source Code )and page source length
//7. Close the Browser.

