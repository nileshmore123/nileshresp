package calaenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Gsmarena {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://WWW.Gsmarena.com/");
List<WebElement> alloption=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']"));
System.out.println("total option"+alloption.size());
for(int i=0;i<alloption.size();i++) {
	WebElement option=alloption.get(i);
	String name=option.getText();
	System.out.println("option name--->"+name);
	if(name.equals("SAMSUNG")) {
		option.click();
		//driver.navigate().back();
		break;
	}
}

	}

}
