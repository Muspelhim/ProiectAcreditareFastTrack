package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.HomePage;

public class SearchSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void searchFromTop(String keyword){
        homePage.open();
        homePage.searchFromTop(keyword);
        homePage.clickOnSearchFromTop();

    }
}
