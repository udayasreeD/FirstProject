package firstProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frames {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "C:\\Udaya\\Softwares\\Selenium_Software\\gecko\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		List<WebElement> frame=driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
		for(WebElement frames:frame) {
			System.out.println(frames.getAttribute("name"));
		}
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		System.out.println("waited");
		driver.close();
		System.exit(0);
	}
}
