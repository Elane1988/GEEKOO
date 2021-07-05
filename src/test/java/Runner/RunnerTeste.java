package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/OnlineShoppping.feature",
		glue = {""},
		tags = "@DESAFIO_RSI",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		
		)
public class RunnerTeste {

}
