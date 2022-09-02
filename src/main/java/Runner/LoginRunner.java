package api.cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\User\\Downloads\\automation-task 3\\automation-task 3\\src\\main\\java\\Runner"},
        glue = {"api.cucumber.steps", "api.cucumber.hooks"},
//plugin ={"pretty","junit:target/report.xml"},tags={@SmokeTest})
        //plugin = {"pretty","json:target/report.json"})
        plugin = {"pretty","junit:target/report.xml"})

        public class LoginRunner{}
