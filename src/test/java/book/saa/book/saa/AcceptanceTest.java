//package najah.edu.acceptance_tests;
//package najah.edu.acceptance_tests;
package book.saa;

import org.junit.runner.RunWith;
import org.junit.Test;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",
plugin = {"html:target/cucumber/wíkipedia.html"},
monochrome = true,
snippets = SnippetType.CAMELCASE,
glue = ("book.saa")
)
public class AcceptanceTest {
	public  AcceptanceTest() {
		
	}
}