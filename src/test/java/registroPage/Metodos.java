package registroPage;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import registroElement.RegistroElement;


public class Metodos extends RegistroElement{

	public static WebDriver driver;
	
			

	/**
	 * @param site
	 * @param navegador
	 * @param descricao
	 */
	public void navegador(String site,String navegador, String descricao) {
		
		System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
	}
public void clicar(By elemento, String descricao) {
	try {
	driver.findElement(elemento).click();
	
	}catch (Exception e) {
		System.out.println("******error no passo"+descricao+""+e);
	}
}
/**
 * 
 * @param elemento
 * @param texto
 * @param descricao
 */	
public void escrever(By elemento,String texto , String descricao) {
	
	try {
		driver.findElement(elemento).sendKeys(texto);
		
		}catch (Exception e) {
			
			System.out.println("******error no passo" +descricao+ "" +e);
		}
}
/**
 * @param tempo
 * @param descricao
 */
public void pausa(int tempo, String descricao) {
	try {
		Thread.sleep(tempo);
	} catch (InterruptedException e) {
		System.out.println("******error no passo"+descricao+""+e);
	}
	
	
}
/**
 * @param elemento
 * @param descricao
 */
public void esperarElemento(By elemento, String descricao) {
	try {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	@SuppressWarnings("unused")
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	driver.findElement(elemento).click();
	}catch (Exception e) {
		System.out.println("******error no passo"+descricao+""+e);
	}
}

private static Random rand = new Random();
private static char[] letras = "abcdefghijlmnopqrstuvxz".toCharArray();

/**
 * @return
 */
public  String getNome() {
	
	StringBuffer generatedString = new StringBuffer();
    for (int i = 0; i < 5; i++) {
        int ch = rand.nextInt (letras.length);
        generatedString.append (letras [ch]);
    }    
    return generatedString.toString();    

}


/**
 * @param foto
 * @throws IOException
 */
public void evdenciaScreen(String foto) throws IOException {
	
	TakesScreenshot picture = ((TakesScreenshot)driver);
	File scrfile = picture.getScreenshotAs(OutputType.FILE);
	File destfile = new File("./src/Evidencias/"+foto+ ".png");
	FileUtils.copyFile(scrfile, destfile);

}
/**
 * @param descricao
 */
public void fechar(String descricao) {
	try {
	driver.quit();
}catch (Exception e) {
	System.out.println("******error no passo"+descricao+""+e);
}

}
}