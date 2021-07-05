package loginPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loginElement.LoginElement;

public class LoginPage extends LoginElement {

	WebDriver driver;

	String url = "http://advantageonlineshopping.com/#/ \r\n";

	public void navegadorLogin() {

		System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void loginDados() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(getReglogin()).click();
		Thread.sleep(1000);
		driver.findElement(getUsuario()).sendKeys("chimull@r.com");
		driver.findElement(getSenha()).sendKeys("T@e2e1010");
		driver.findElement(getLembreMe()).click();
		Thread.sleep(1000);
		driver.findElement(getSignin()).click();

	}
	
	public void loginSucesso(String foto) throws IOException {
		
		TakesScreenshot picture = ((TakesScreenshot)driver);
		File srcfile = picture.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./src/Evidencias/"+foto+".png");
		FileUtils.copyFile(srcfile, destfile);
		
	}
public void fechar() throws InterruptedException {
	Thread.sleep(1000);
	driver.quit();
}
}
