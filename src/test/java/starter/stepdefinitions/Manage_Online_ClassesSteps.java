package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.OfflineClassesPage;
import starter.pages.OnlineClassesPage;

public class Manage_Online_ClassesSteps {
    @Steps
    OnlineClassesPage onlineClassesPage;
    OfflineClassesPage offlineClassesPage;

    @And("admin click online class menu")
    public void adminClickOnlineClassMenu() {
        onlineClassesPage.clickOnlineClassMenu();
    }

    @And("admin on online classes page")
    public void adminOnOnlineClassesPage() {
        onlineClassesPage.onOnlineClassesPage();
    }

    @When("admin click add online class button")
    public void adminClickAddOnlineClassButton() {
        onlineClassesPage.clickAddOnlineClassButton();
    }

    @And("admin input link zoom")
    public void adminInputLinkZoom() {
        onlineClassesPage.inputLinkZoom("https://zoom.us/yoga-class");
    }

    @Then("admin successfully add new online class")
    public void adminSuccessfullyAddNewOnlineClass() {
        onlineClassesPage.successfullyAddNewOnlineClass();
    }

    @When("admin click delete online class button")
    public void adminClickDeleteOnlineClassButton() {
        onlineClassesPage.clickDeleteOnlineClassIcon();
    }

    @Then("admin successfully delete online class")
    public void adminSuccessfullyDeleteOnlineClass() {
        onlineClassesPage.successfullyDeleteOnlineClass();
    }

    @When("admin click edit online class icon")
    public void adminClickEditOnlineClassIcon() {
        onlineClassesPage.clickEditOnlineClassIcon();
    }

    @And("admin input online class field to edit")
    public void adminInputOnlineClassFieldToEdit() {
        offlineClassesPage.inputClassName("Zumba Class");
    }

    @And("admin click edit class submit button")
    public void adminClickEditClassSubmitButton() {
        onlineClassesPage.clickEditClassSubmitIcon();
    }

    @Then("admin successfully edit new online class")
    public void adminSuccessfullyEditNewOnlineClass() {
        onlineClassesPage.successfullyEditOnlineClass();
    }

    @Then("admin can see online class according to keyword")
    public void adminCanSeeOnlineClassAccordingToKeyword() {
        onlineClassesPage.canSeeOnlineClassAccordingToKeyword();
    }

    @Then("admin successfully delete online class package")
    public void adminSuccessfullyDeleteOnlineClassPackage() {
        onlineClassesPage.successfullyDeleteOnlineClassPackage();
    }

    @Then("admin can see online class package edited")
    public void adminCanSeeOnlineClassPackageEdited() {
        onlineClassesPage.successfullyEditOnlineClassPackage();
    }

    @And("admin input package page")
    public void adminInputPackagePage() {
        onlineClassesPage.inputPackagePage("1");
    }

    @And("admin select online class")
    public void adminSelectOnlineClass() {
        onlineClassesPage.selectOnlineClass();
        onlineClassesPage.selectPilatesClass();
    }

    @Then("admin successfully add new online class package")
    public void adminSuccessfullyAddNewOnlineClassPackage() {
        onlineClassesPage.successfullyAddNewOnlineClassPackage();
    }
}
