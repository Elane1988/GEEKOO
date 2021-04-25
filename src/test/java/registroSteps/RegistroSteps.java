package registroSteps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import registroPage.RegistroPage;

public class RegistroSteps{
RegistroPage page = new RegistroPage();
	
	
	@Given("que eu esteja no formulario de abertura de conta")
	public void que_eu_esteja_no_formulario_de_abertura_de_conta() {
	    page.navegador();
	}

	@When("preencher os dados obrigatorios")
	public void preencher_os_dados_obrigatorios() throws InterruptedException {
	   page.preencherDados();
	}

	@Then("a conta sera gerada")
	public void a_conta_sera_gerada() throws IOException {
	   page.evdenciaScreen("RegistroOk");
	   page.fechar();
	}
}
