import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "/home/thaisnat/Downloads/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200,765));
		//driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		
		driver.quit();
	}}
