package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.OfflineClassesPage;

public class Manage_Offline_ClassesSteps {
    @Steps
    LoginPage loginPage;
    HomePage homePage;
    OfflineClassesPage offlineClassesPage;

    @Given("admin is login")
    public void adminIsLogin() {
        loginPage.open();
        loginPage.onLoginPage();
        loginPage.inputValidEmail("developer@dev.com");
        loginPage.inputValidPassword("dev12345");
        loginPage.clickLoginButton();
        homePage.onHomePage();
    }

    @And("admin click class menu")
    public void adminClickClassMenu() {
        homePage.clickMaxMenu();
        homePage.clickClassMenu();
        homePage.clickManageClassMenu();
    }

    @And("admin click offline classes menu")
    public void adminClickOfflineClassesMenu() {
        offlineClassesPage.clickOfflineClassMenu();
    }

    @When("admin on offline classes page")
    public void adminOnOfflineClassesPage() {
        offlineClassesPage.onOfflineClassesPage();
    }

    @And("admin click submit button")
    public void adminClickSubmitButton() {
        offlineClassesPage.clickSubmitButton();
    }

    @When("admin click location button")
    public void adminClickLocationButton() {
        offlineClassesPage.clickLocationButton();
    }

    @And("admin on location page")
    public void adminOnLocationPage() {
        offlineClassesPage.onLocationPage();
    }

    @And("admin click edit location icon")
    public void adminClickEditLocationIcon() {
        offlineClassesPage.clickEditLocationIcon();
    }

    @And("admin input field to edit location")
    public void adminInputFieldToEditLocation() {
        offlineClassesPage.inputFieldToEdit("Jl. Zaenal Arifin");
    }

    @Then("admin can see location edited")
    public void adminCanSeeLocationEdited() {
        offlineClassesPage.seeAlertSuccess();
    }

    @And("admin click delete location icon")
    public void adminClickDeleteLocationIcon() {
        offlineClassesPage.clickDeleteIcon();
    }

    @Then("admin successfully delete location")
    public void adminSuccessfullyDeleteLocation() {
        offlineClassesPage.seeAlertSuccess();
    }

    @And("admin click add location button")
    public void adminClickAddLocationButton() {
        offlineClassesPage.clickAddLocationButton();
    }

    @And("admin input name field")
    public void adminInputNameField() {
        offlineClassesPage.inputNameField("GoFit Sidoarjo");
    }

    @And("admin input city field")
    public void adminInputCityField() {
        offlineClassesPage.inputCityField("Kabupaten Sidoarjo");
    }

    @And("admin input address field")
    public void adminInputAddressField() {
        offlineClassesPage.inputAddressField("Jl. Gedangan");
    }

    @And("admin input latitude field")
    public void adminInputLatitudeField() {
        offlineClassesPage.inputLatitudeField("12345678");
    }

    @And("admin input longitude field")
    public void adminInputLongitudeField() {
        offlineClassesPage.inputLongitudeField("-0.1235578");
    }

    @Then("admin successfully add new location")
    public void adminSuccessfullyAddNewLocation() {
        offlineClassesPage.successfullyAddNewLocation();
    }

    @When("admin click package button")
    public void adminClickPackageButton() {
        offlineClassesPage.clickPackageButton();
    }

    @And("admin on class package page")
    public void adminOnClassPackagePage() {
        offlineClassesPage.onClassPackagePage();
    }

    @And("admin click edit class package icon")
    public void adminClickEditClassPackageIcon() {
        offlineClassesPage.clickEditClassPackageIcon();
    }

    @And("admin input field to edit class package")
    public void adminInputFieldToEditClassPackage() {
        offlineClassesPage.inputFieldToEditClassPackage("79000");
    }

    @And("admin click package submit button")
    public void adminClickPackageSubmitButton() {
        offlineClassesPage.clickPackageSubmitButton();
    }

    @Then("admin can see class package edited")
    public void adminCanSeeClassPackageEdited() {
        offlineClassesPage.canSeeClassPackageEdited();
    }

    @And("admin click delete class package icon")
    public void adminClickDeleteClassPackageIcon() {
        offlineClassesPage.clickDeleteClassPackageIcon();
    }

    @Then("admin successfully delete class package")
    public void adminSuccessfullyDeleteClassPackage() {
        offlineClassesPage.successfullyDeleteClassPackage();
    }

    @When("admin click delete class icon")
    public void adminClickDeleteClassIcon() {
        offlineClassesPage.clickDeleteClassIcon();
    }

    @Then("admin successfully delete class")
    public void adminSuccessfullyDeleteClass() {
        offlineClassesPage.successfullyDeleteClass();
    }

    @When("admin click edit class icon")
    public void adminClickEditClassIcon() {
        offlineClassesPage.clickEditClassIcon();
    }

    @And("admin input field to edit class")
    public void adminInputFieldToEditClass() {
        offlineClassesPage.inputFieldToEditClass("Pilates");
    }

    @And("admin click class submit button")
    public void adminClickClassSubmitButton() {
        offlineClassesPage.clickClassSubmitButton();
    }

    @Then("admin can see class edited")
    public void adminCanSeeClassEdited() {
        offlineClassesPage.canSeeClassEdited();
    }

    @And("admin click add package button")
    public void adminClickAddPackageButton() {
        offlineClassesPage.clickAddPackageButton();
    }

    @And("admin select class")
    public void adminSelectClass() {
        offlineClassesPage.selectClass();
        offlineClassesPage.zumbaClass();
    }

    @And("admin select period")
    public void adminSelectPeriod() {
        offlineClassesPage.selectPeriod();
        offlineClassesPage.dailyPeriodSelect();
    }

    @And("admin input price")
    public void adminInputPrice() {
        offlineClassesPage.inputPricePackageField("10000");
    }

    @And("admin click class package submit button")
    public void adminClickClassPackageSubmitButton() {
        offlineClassesPage.clickClassPackageSubmitButton();
    }

    @Then("admin successfully add new class package")
    public void adminSuccessfullyAddNewClassPackage() {
        offlineClassesPage.successfullyAddNewClassPackage();
    }

    @When("admin click search box")
    public void adminClickSearchBox() {
        offlineClassesPage.clickSearchBox();
    }

    @And("admin input valid keyword")
    public void adminInputValidKeyword() {
        offlineClassesPage.inputValidKeyword("Zumba");
    }

    @Then("admin can see offline class according to keyword")
    public void adminCanSeeOfflineClassAccordingToKeyword() {
        offlineClassesPage.canSeeOfflineClassAccordingToKeyword();
    }

    @And("admin input invalid keyword")
    public void adminInputInvalidKeyword() {
        offlineClassesPage.inputInvalidKeyword("Burger");
    }

    @Then("admin see {string} message")
    public void adminSeeMessage(String arg0) {
        offlineClassesPage.seeNoDataAvailableMessage();
    }

    @When("admin click add class button")
    public void adminClickAddClassButton() {
        offlineClassesPage.clickAddClassButton();
    }

    @And("admin input class name")
    public void adminInputClassName() {
        offlineClassesPage.inputClassName("Yoga");
    }

    @And("admin select location")
    public void adminSelectLocation() {
        offlineClassesPage.selectLocation();
        offlineClassesPage.clickGoFitMedanLocation();
    }

    @And("admin input started at")
    public void adminInputStartedAt() {
        offlineClassesPage.inputStartedAt();
    }

    @And("admin input class description")
    public void adminInputClassDescription() {
        offlineClassesPage.inputClassDescription("This is yoga class");
    }

    @And("admin click add class submit button")
    public void adminClickAddClassSubmitButton() {
        offlineClassesPage.clickAddClassSubmitButton();
    }

    @Then("admin successfully add new offline class")
    public void adminSuccessfullyAddNewOfflineClass() {
        offlineClassesPage.successfullyAddNewOfflineClass();
    }

    @And("admin input page")
    public void adminInputPage() {
        offlineClassesPage.inputPage("1");
    }
}
