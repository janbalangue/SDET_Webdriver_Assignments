package assignments;

import java.util.concurrent.atomic.AtomicLong;

import org.openqa.selenium.WebDriver;

public interface Assignment {
	public AtomicLong atomicLong = new AtomicLong(0L);

	public void runTest(WebDriver driver);
}
