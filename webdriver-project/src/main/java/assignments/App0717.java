package assignments;

import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App0717 {

	public static void main(String[] args) {
		new Properties().setProperties();
		try {
			new Realtor().runTest(new ChromeDriver());
			new Realtor().runTest(new FirefoxDriver());
//			new SauceDemo().runTest(new ChromeDriver());
//			new SauceDemo().runTest(new FirefoxDriver());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
