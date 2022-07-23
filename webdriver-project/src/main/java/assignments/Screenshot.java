package assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void takeScreenshot(WebDriver driver, String filename, AtomicLong atomicLong) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./" + filename + "-" + driver.getClass().getSimpleName() + "-"
				+ atomicLong.incrementAndGet() + ".png");
		try {
			FileUtils.copyFile(screenshot, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
