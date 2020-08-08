package firstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Udaya\\Softwares\\Selenium_Software\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:www.facebook.com");
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		if(driver.getTitle().contentEquals("Facebook – log in or sign up")){
			System.out.println(driver.getTitle());
		}
		Select option=new Select(driver.findElement(By.name("birthday_year")));
		option.selectByVisibleText("1990");
		System.out.println(option.getFirstSelectedOption().getText());
		WebElement username = driver.findElement(By.name("firstname"));
		Actions a=new Actions(driver).moveToElement(username).keyDown(username,Keys.SHIFT);
		a.sendKeys("udayasreekonakanchi");
		a.keyUp(username,Keys.SHIFT);
		a.build().perform();
		System.out.println(username.getText());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.close();

	}
}

