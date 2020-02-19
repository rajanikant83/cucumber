package cucumber.commom.glue;


import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},
					features = "features",
					glue = {"cucumber.commom.glue"},
					dryRun = false
) 

public class runTest {

}
