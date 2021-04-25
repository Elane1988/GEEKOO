package loginsteps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginPage.LoginPage;

public class LoginSteps {
	LoginPage log =  new LoginPage();
	@Given("que eu esteja na pagina de login")
	public void que_eu_esteja_na_pagina_de_login() {
	log.navegadorLogin();
	}

	@When("preencho os dados")
	public void preencho_os_dados() throws InterruptedException {
	 log.loginDados();
	}

	@Then("vejo mensagem de sucesso")
	public void vejo_mensagem_de_sucesso() throws IOException, InterruptedException {
	 log.loginSucesso("loginOK");
	 log.fechar();

}
}