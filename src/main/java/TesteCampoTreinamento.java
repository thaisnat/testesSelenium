import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {
		
		System.setProperty("webdriver.gecko.driver", "/home/thaisnat/Downloads/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200,765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		// escrever no campo desejado || buscar id pelo selenium IDE
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de escrita");
        //verificar se o texto está de acordo com o esperado
        Assert.assertEquals("Teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        
      //driver.quit();
	}
	
	@Test
	public void deveInteragirComTextArea() {
		
		System.setProperty("webdriver.gecko.driver", "/home/thaisnat/Downloads/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200,765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		// busca pelo "inspecionar elemento" do browser
		//para simular um texto com muitas linhas basta utilizar o \n
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste\nfheorrhtejeewgo\n owefhoiwe\n utima linha");
		Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	
		//driver.quit();
	}

}
