package registroPage;

import org.openqa.selenium.By;

public class CreateAccount extends Metodos {
	Metodos metodo = new Metodos();
	By user = By.id("menuUserLink");

	By createAccount = By.xpath("//a[contains(text(),\"CREATE NEW ACCOUNT\")]");

	By userName = By.name("usernameRegisterPage");
	By email = By.name("emailRegisterPage");
	By password = By.name("passwordRegisterPage");
	By confPassword = By.name("confirm_passwordRegisterPage");
	By firstName = By.name("first_nameRegisterPage");
	By lastName = By.name("last_nameRegisterPage");
	By phone = By.name("phone_numberRegisterPage");
	By country = By.name("countryListboxRegisterPage");
	By city = By.name("cityRegisterPage");
	By address = By.name("addressRegisterPage");
	By province = By.name("state_/_province_/_regionRegisterPage");
	By postalCode = By.name("postal_codeRegisterPage");

	By promocoes = By.name("nanallowOffersPromotion");
	By concordo = By.name("i_agree");
	By register = By.id("register_btnundefined");

	String usuario;
public void menuUser() {
	metodo.esperarElemento(this.user, "esperando o bot�o user ficar acess�vel");
	metodo.esperarElemento(createAccount, "clicar em criar novo usuario");
	metodo.pausa(1000, "pausar o teste 1 segundo");
	metodo.esperarElemento(createAccount, "clicar no elemento criar conta");
}
	public void criarConta(String username, String email, String password, String confirmPassword, String firstName,
			String lastName, String phoneNumber, String country, String city, String adress, String province,
			String postalCode) {
		// preencher o formulario de abertura de conta
		metodo.esperarElemento(userName, "esperar user");
		metodo.escrever(this.userName, username, "escrever nome de usuario");
		metodo.escrever(this.email, email, "");
		metodo.escrever(this.password, password, "");
		metodo.escrever(this.confPassword, confirmPassword, "");
		metodo.escrever(this.firstName, firstName, "");
		metodo.escrever(this.lastName, lastName, "");
		metodo.escrever(this.country, country, "");
		metodo.escrever(this.city, city, "");
		metodo.escrever(this.address, adress, "");
		metodo.escrever(this.province, province, "");
		metodo.escrever(this.postalCode, postalCode, "");
		metodo.clicar(concordo, "");
		metodo.clicar(register, "");
		metodo.pausa(1000, "esperr 1 segundo para fechar o teste");

	}
}
