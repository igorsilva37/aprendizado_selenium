import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Igor\\Desktop\\geckodriver-v0.29.0-win64.zip");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());	
		driver.close();
		
	}
}