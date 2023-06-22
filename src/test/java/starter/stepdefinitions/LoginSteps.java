package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    HomePage homePage;

    @Given("user on login page")
    public void userOnLoginPage() {
        loginPage.open();
        loginPage.onLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginPage.inputValidEmail("developer@dev.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginPage.inputValidPassword("dev12345");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user on home page successfully")
    public void userOnHomePageSuccessfully() {
        homePage.onHomePage();
    }

    @When("user input empty email")
    public void userInputEmptyEmail() {
        loginPage.inputEmptyEmail("");
    }

    @Then("user see alert error message")
    public void userSeeAlertErrorMessage() {
        loginPage.seeAlertErrorMessage();
    }

    @When("user input invalid email")
    public void userInputInvalidEmail() {
        loginPage.inputInvalidEmail("developer#dev.com");
    }

    @And("user input empty password")
    public void userInputEmptyPassword() {
        loginPage.inputEmptyPassword("");
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginPage.inputInvalidPassword("developer12345");
    }
}
