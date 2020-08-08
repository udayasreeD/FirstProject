package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeFirefox {

	public static void main(String[] args) {
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "C:\\Udaya\\Softwares\\Selenium_Software\\gecko\\geckodriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.youtube.com/channel/UCxmr5Gh1HPPMshSxeuViOPg/videos");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-text.size-default")).click();
			
	}

}
