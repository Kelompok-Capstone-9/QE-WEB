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
        offlineClassesPage.seeLocationEdited();
    }

    @And("admin click delete location icon")
    public void adminClickDeleteLocationIcon() {
        offlineClassesPage.clickDeleteIcon();
    }

    @Then("admin successfully delete location")
    public void adminSuccessfullyDeleteLocation() {
        offlineClassesPage.successfullyDeleteLocation();
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
}
