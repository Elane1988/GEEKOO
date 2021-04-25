package registroElement;

import org.openqa.selenium.By;

public class RegistroElement {
	
	// ELEMENTOS DA PAGINA
	
	private By reglogin = By.xpath("//*[@id=\"menuUser\"]");
	private By newuser = By.xpath("//a[text()=\"CREATE NEW ACCOUNT\"]");
	private By registrNome = By.xpath("//input[@name=\"usernameRegisterPage\"]");
	private By registroEmail = By.xpath("//input[@name=\"emailRegisterPage\"]");
	private By password = By.xpath("//input[@name=\"passwordRegisterPage\"]");
	private By confripass = By.xpath("//input[@name=\"confirm_passwordRegisterPage\"]");
	private By firstname = By.xpath("//input[@name=\"first_nameRegisterPage\"]");
	private By lastname = By.xpath("//input[@name=\"last_nameRegisterPage\"]");
	private By phone = By.xpath("//input[@name=\"phone_numberRegisterPage\"]");
	private By selectcountry = By.xpath("//select[@name=\"countryListboxRegisterPage\"]");
	private By cityName = By.xpath("//input[@name=\"cityRegisterPage\"]");
	private By address = By.xpath("//input[@name=\"addressRegisterPage\"]");
	private By estado = By.xpath("//input[@name=\"state_/_province_/_regionRegisterPage\"]");
	private By cepCodigo = By.xpath("//input[@name=\"postal_codeRegisterPage\"]");
	private By selectIgree = By.name("i_agree");
	private By btnRegister = By.xpath("//button[@id=\"register_btnundefined\"]");
	private By msgsucesso = By.linkText("rsppnet");
	
	
	
	// GETTER DOS ELEMENTOS
	public By getReglogin() {
		return reglogin;
	}
	public By getNewuser() {
		return newuser;
	}
	public By getRegistrNome() {
		return registrNome;
	}
	public By getRegistroEmail() {
		return registroEmail;
	}
	public By getPassword() {
		return password;
	}
	public By getConfripass() {
		return confripass;
	}
	public By getFirstname() {
		return firstname;
	}
	public By getLastname() {
		return lastname;
	}
	public By getPhone() {
		return phone;
	}
	public By getSelectcountry() {
		return selectcountry;
	}
	public By getCityName() {
		return cityName;
	}
	public By getAddress() {
		return address;
	}
	public By getEstado() {
		return estado;
	}
	public By getCepCodigo() {
		return cepCodigo;
	}
	public By getSelectIgree() {
		return selectIgree;
	}
	public By getBtnRegister() {
		return btnRegister;
	}
	public By getMsgsucesso() {
		return msgsucesso;
	}

}
