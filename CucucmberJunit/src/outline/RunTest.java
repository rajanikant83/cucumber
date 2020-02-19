package outline;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
@Cucumber.Options( plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class RunTest {

}
