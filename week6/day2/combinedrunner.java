package week6day2;

import base_feature.baseclass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/week6day2/file.feature", glue ="week6day2", tags="@createcontract or @editlead", dryRun = false, snippets = SnippetType.CAMELCASE )
public class combinedrunner extends baseclass {
	

}
