package firstProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.*;

public class SeleniumInsta {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Udaya\\Softwares\\Selenium_Software\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("SeleniumInsta@gmail.com");
		driver.findElement(By.name("password")).sendKeys("SeleniumInsta");
		driver.findElement(By.cssSelector("button.sqdOP.L3NKy.y3zKF")).submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.aOOlW.HoLwm")).click();
		driver.findElement(By.cssSelector("input.XTCLo.x3qfX")).sendKeys("virat.kohli");
		driver.findElement(By.cssSelector("div.z556c")).click();
		driver.findElement(By.xpath("//div[@class='Nnq7C weEfm'][1]/div[1]")).click();
		String time = driver.findElement(By.cssSelector("time._1o9PC.Nzb55")).getText();
		System.out.println(time);
		String[] OnlyTime=time.split(" ");
		System.out.println(OnlyTime[0]);
		System.out.println(OnlyTime[1]);
		if((Integer.parseInt(OnlyTime[0]) < 60 && OnlyTime[1].equals("MINUTES")) || (Integer.parseInt(OnlyTime[0]) < 24 && OnlyTime[1].equals("HOURS"))) {
			String hashText=driver.findElement(By.xpath("//div[@class='C4VMK']/span")).getText();
			System.out.println(hashText);
			//Actions a=new Actions(driver);
			 Robot robot = new Robot();
			 // press Ctrl+S the Robot's way
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_S);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_S);
			 // press Enter
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			//Runtime.getRuntime().exec("C:\\Udaya\\Selenium\\autoit\\Need_to_save.exe");
			 String name = MavenTest.class.getCanonicalName();
			 System.out.println(name);
				/* ImagePath.add(name + "/Images"); */
			Screen s=new Screen();
			Pattern Save = new Pattern("C:\\Udaya\\Selenium\\Save.PNG");
			s.click(Save);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			/*
			 * robot.keyPress(KeyEvent.VK_ESCAPE); robot.keyRelease(KeyEvent.VK_ESCAPE);
			 */
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.ESCAPE).build().perform();
			//driver.findElement(By.xpath("//div{@class='Fifk5']/div[1]")).click();
			//robot.keyPress(KeyEvent.VK_F);
			robot.keyPress(KeyEvent.VK_F12);
			//robot.keyRelease(KeyEvent.VK_F);
			robot.keyRelease(KeyEvent.VK_F12);
			//Screen s1=new Screen();
			Pattern Save1 = new Pattern("C:\\Udaya\\Selenium\\mobile.PNG");
			s.click(Save1);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().refresh();
			//driver.navigate().refresh();
			s.click(Save1);
			driver.findElement(By.cssSelector("div.q02Nz._0TPg")).click();
			Pattern download = new Pattern("C:\\Udaya\\Selenium\\download.PNG");
			s.click(download);
			Pattern doubleclick=new Pattern("C:\\Udaya\\Selenium\\virat.PNG");
			s.doubleClick(doubleclick);
			Pattern image=new Pattern("C:\\Udaya\\Selenium\\image.PNG");
			s.click(image);
			Pattern open=new Pattern("C:\\Udaya\\Selenium\\open.PNG");
			s.click(open);
			driver.findElement(By.cssSelector("button.UP43G")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement textbox = driver.findElement(By.cssSelector("textarea._472V_"));
			textbox.click();
			textbox.sendKeys("virat");
			driver.findElement(By.cssSelector("button.UP43G")).click();
			driver.findElement(By.xpath("//div[@class='mt3GC']/button[2]")).click();
			driver.getTitle();
	}else {
		System.out.println("no updates from last 24 hours");
	}

	}
}
