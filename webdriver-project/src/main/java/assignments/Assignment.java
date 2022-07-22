package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.WebDriver;

public interface Assignment {
	public void runTest(WebDriver driver) throws FileNotFoundException;
	public List<String> linkList(File file) throws FileNotFoundException;
}
