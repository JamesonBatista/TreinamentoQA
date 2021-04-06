package regressivo;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegressionTest {
}
