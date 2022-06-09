package org.fasttrrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrrack.steps.serenity.SearchSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    public WebDriver webDriver;
    @Steps
    public SearchSteps searchSteps;

    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }

}
