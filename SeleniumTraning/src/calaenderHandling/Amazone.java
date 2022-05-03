package calaenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Amazone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.setUp("chrome", "https://WWW.amazon.in");
List<WebElement> alloption=driver.findElements(By.cssSelector("#nav-xshop>a"));
System.out.println("tottal identified elements="+alloption.size());
for(int i=0;i<alloption.size();i++) {
	WebElement option=alloption.get(i);
	String name=option.getText();
	System.out.println("option nmae="+name);
	if(name.equals("Fashion")) {
		option.click();
		driver.navigate().back();
		break;
	
	}
	}
	//option.click();
	//driver.navigate().back();
	//break;
}

	}


