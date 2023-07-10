package testing_package;

import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="use_cases",
		plugin={"summary","html:target/cucumber/wikipedia.html"},
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue="testing_package"//save on this package
		)
public class First {

}
