package com.sophos.app.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "com.sophos.app.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {
}
