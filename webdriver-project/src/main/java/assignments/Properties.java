package assignments;

public class Properties {

	public void setProperties() {
		
		// to run, replace the filepaths with local values
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/opt/homebrew/Cellar/geckodriver/0.31.0/bin/geckodriver");
	}
}
