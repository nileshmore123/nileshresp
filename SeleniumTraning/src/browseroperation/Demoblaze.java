package browseroperation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://WWW.demoblaze.com/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
List<WebElement> catagerised=driver.findElements(By.cssSelector(".list-group>a"));
System.out.println("option count is"+catagerised.size());
List<String> l1=new ArrayList<String>();
l1.add("CATEGORIES");
l1.add("Phones");
l1.add("Laptops");
l1.add("Monitors");
for(int i=0;i<catagerised.size();i++) {
	WebElement cat =catagerised.get(1);
	System.out.println("*****Element of list is:"+cat.getText()+"*******");
	System.out.println(cat.isDisplayed());
	System.out.println(cat.isEnabled());
	System.out.println(cat.getText().equals(l1.get(1)));
}


	}

}
