package org.fasttrrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrrack.pages.AdminPage;

public class AdminSteps extends ScenarioSteps {
    private AdminPage adminPage;
    @Step
    public void loginAdmin(){
        adminPage.completeUserAdmin();
        adminPage.completePasswordAdmin();
        adminPage.clickLoginAdmin();
    }
}
