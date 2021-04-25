package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/OnlineShoppping.feature",
		glue = {""},
		tags = "@Login",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","json:target/cucumber-report.json"}
		
		
		)
public class RunnerTeste {

}
