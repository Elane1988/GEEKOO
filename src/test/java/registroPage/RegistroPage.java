package registroPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import registroElement.RegistroElement;

public class RegistroPage extends RegistroElement{

	WebDriver driver;
	String url = "http://advantageonlineshopping.com/#/ \r\n";
			

	public void navegador() {
		
		System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

public void preencherDados() throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(getReglogin()).click();
	Thread.sleep(2000);
	driver.findElement(getNewuser()).click();
	Thread.sleep(2000);
	driver.findElement(getRegistrNome()).sendKeys("rsppnet");
	driver.findElement(getRegistroEmail()).sendKeys("rsppnet@hotmail.com");
	driver.findElement(getPassword()).sendKeys("Jnrp98796584");
	driver.findElement(getConfripass()).sendKeys("Jnrp98796584");
	driver.findElement(getFirstname()).sendKeys("Roque");
	driver.findElement(getLastname()).sendKeys("Alves");
	driver.findElement(getPhone()).sendKeys("11998796584");
	Thread.sleep(2000);
	WebElement seletor =driver.findElement(getSelectcountry());
	Thread.sleep(2000);
	Select pais = new Select(seletor);
	pais.selectByVisibleText("Brazil");
	driver.findElement(getCityName()).sendKeys("Cotia");
	driver.findElement(getEstado()).sendKeys("são Paulo");
	driver.findElement(getCepCodigo()).sendKeys("06720-000");
	driver.findElement(getSelectIgree()).click();
	driver.findElement(getBtnRegister()).click();
	
	

}
public void evdenciaScreen(String foto) throws IOException {
	
	TakesScreenshot picture = ((TakesScreenshot)driver);
	File scrfile = picture.getScreenshotAs(OutputType.FILE);
	File destfile = new File("./src/Evidencias/"+foto+ ".png");
	FileUtils.copyFile(scrfile, destfile);

}
public void fechar() {
	driver.quit();
}
}
