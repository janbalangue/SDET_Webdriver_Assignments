package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App0716 {

	public static void main(String[] args) {
		new Properties().setProperties();
		new AngularPractice().runTest(new ChromeDriver());
		new AngularPractice().runTest(new FirefoxDriver());
		new PhpTravels().runTest(new ChromeDriver());
		new PhpTravels().runTest(new FirefoxDriver());
	}
	
}
