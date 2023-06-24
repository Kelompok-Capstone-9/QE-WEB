package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.MembershipPage;
import starter.pages.OfflineClassesPage;

public class Manage_MembershipSteps {
    @Steps
    HomePage homePage;
    MembershipPage membershipPage;

    @And("admin click membership menu")
    public void adminClickMembershipMenu() {
        homePage.clickMaxMenu();
        membershipPage.clickMembershipMenu();
    }

    @And("admin on membership page")
    public void adminOnMembershipPage() {
        membershipPage.onMembershipPage();
    }

    @When("admin click add membership plan button")
    public void adminClickAddMembershipPlanButton() {
        membershipPage.clickAddMembershipPlanButton();
    }

    @And("admin input title field")
    public void adminInputTitleField() {
        membershipPage.inputTitleField("Advance Daily");
    }

    @And("admin input duration field")
    public void adminInputDurationField() {
        membershipPage.inputDurationField("1");
    }

    @And("admin input price field")
    public void adminInputPriceField() {
        membershipPage.inputPriceField("15000");
    }

    @And("admin input description field")
    public void adminInputDescriptionField() {
        membershipPage.inputDescriptionField("Health Tips in Daily");
    }

    @And("admin click button submit")
    public void adminClickButtonSubmit() {
        membershipPage.clickButtonSubmit();
    }

    @Then("admin successfully add membership plan")
    public void adminSuccessfullyAddMembershipPlan() {
        membershipPage.seeAlertSuccessfulAddMembershipPlan();
        membershipPage.successfullyAddMembershipPlan();
    }

    @When("admin click edit membership plan icon")
    public void adminClickEditMembershipPlanIcon() {
        membershipPage.clickMembershipPlanCard();
        membershipPage.clickEditMembershipPlanIcon();
    }

    @And("admin input field to edit membership plan")
    public void adminInputFieldToEditMembershipPlan() {
        membershipPage.inputFieldToEditMembershipPlan("Beginner Yearly");
    }

    @Then("admin successfully edit membership plan")
    public void adminSuccessfullyEditMembershipPlan() {
        membershipPage.seeAlertSuccessfulEditMembershipPlan();
        membershipPage.successfullyEditMembershipPlan();
    }

    @When("admin click delete membership plan icon")
    public void adminClickDeleteMembershipPlanIcon() {
        membershipPage.clickDeleteMembershipPlanIcon();
    }

    @Then("admin successfully delete membership plan")
    public void adminSuccessfullyDeleteMembershipPlan() {
        membershipPage.successfullyDeleteMembershipPlan();
    }
}
