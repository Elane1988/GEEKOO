package loginElement;

import org.openqa.selenium.By;

public class LoginElement {
	
	private By reglogin = By.xpath("//*[@id=\"menuUser\"]");
	private By usuario = By.xpath("//input[@name=\"username\"]");
	private By senha = By.xpath("//input[@name=\"password\"]");
	private By lembreMe = By.xpath("//input[@name=\"remember_me\"]");
	private By signin = By.xpath("//button[@id=\"sign_in_btnundefined\"]");
	
	
	public By getUsuario() {
		return usuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getLembreMe() {
		return lembreMe;
	}
	public By getSignin() {
		return signin;
	}
	public By getReglogin() {
		return reglogin;
	}

}
