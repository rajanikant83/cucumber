package cucumber.commom.glue;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, features = "features", glue = {
				"cucumber.commom.glue" }, dryRun = false, monochrome = true)

public class runTest {

	@AfterClass
	public static void writeExtentReport() throws IOException {
		try {
			FileReaderManager frm = new FileReaderManager();
			Reporter.loadXMLConfig(frm.getReportConfigPath());
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}
}
