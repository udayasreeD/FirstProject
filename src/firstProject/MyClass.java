package firstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\gecko\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		String baseURL="http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle="";
		driver.get(baseURL);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
			System.out.println(actualTitle);
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
		System.exit(0);
	}

}