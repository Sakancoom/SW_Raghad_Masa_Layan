package book.saa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
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
public class AppTest 
{
	
	public AppTest() { 
		
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
