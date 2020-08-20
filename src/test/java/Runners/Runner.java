package Runners;

import cucumber.api.CucumberOptions;
//Teste
@CucumberOptions(
        plugin   = {"pretty"},
        features = {"src/test/resources"},
        glue     = {"Steps"}
)
public class Runner {

}
