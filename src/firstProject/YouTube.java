package firstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Udaya\\Softwares\\Selenium_Software\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/channel/UCxmr5Gh1HPPMshSxeuViOPg/videos");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-text.size-default")).click();
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")))
		 * ; WebElement search = driver.findElement(By.id("container"));
		 * search.sendKeys("Little Honey Creationss");
		 */
	}

}
