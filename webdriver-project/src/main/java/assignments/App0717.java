package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App0717 {

	public static void main(String[] args) {
		new Properties().setProperties();
//		Realtor.com now suspects my bot
//		new Realtor().runTest(new ChromeDriver());
//		new Realtor().runTest(new FirefoxDriver());
		new SauceDemo().runTest(new ChromeDriver());
		new SauceDemo().runTest(new FirefoxDriver());
	}

}
