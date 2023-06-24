package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BookingClassPage;
import starter.pages.HomePage;

public class Manage_Online_Class_BookingSteps {
    @Steps
    HomePage homePage;
    BookingClassPage bookingClassPage;

    @And("admin click menu class")
    public void adminClickMenuClass() {
        homePage.clickMaxMenu();
        homePage.clickClassMenu();
    }

    @And("admin click manage booking menu")
    public void adminClickManageBookingMenu() {
        homePage.clickManageBookingMenu();
    }

    @And("admin on manage booking page")
    public void adminOnManageBookingPage() {
        bookingClassPage.onManageClassBookingPage();
    }

    @When("admin click online menu")
    public void adminClickOnlineMenu() {
        bookingClassPage.clickOnlineMenu();
    }

    @Then("admin can see all online class booking")
    public void adminCanSeeAllOnlineClassBooking() {
        bookingClassPage.canSeeAllOnlineClassBooking();
    }

    @And("admin click point three")
    public void adminClickPointThree() {
        bookingClassPage.clickPointThree();
    }

    @And("admin click view detail button")
    public void adminClickViewDetailButton() {
        bookingClassPage.clickViewDetailButton();
    }

    @Then("admin can see detail online class booking")
    public void adminCanSeeDetailOnlineClassBooking() {
        bookingClassPage.canSeeDetailOnlineClassBooking();
    }
}
