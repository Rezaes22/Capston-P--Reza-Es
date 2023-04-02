package tek.sdet.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Dep",
        features = ("classpath:features"),
        glue="tek.sdet.framework",  //path to feature file
        dryRun = false
        ,  //genrate the feature file and cheack if any step remain and print it in console
//        	plugin	 // for reportion       
        plugin = { 
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",  // email this report
                "json:target/jsonReports/cucumber.json" 	     // JSON file which is use by cucumber JVM report to genrate the charts and granphs
        },
        snippets = CAMELCASE,      //we define Camelcase or under score
        monochrome = true)         // if it be true the console will be readable if not it's not readable
public class TestRunner {

}