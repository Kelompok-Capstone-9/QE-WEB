package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BookingClassPage;
import starter.pages.HomePage;

public class Manage_Offline_Class_BookingSteps {
    @Steps
    BookingClassPage bookingClassPage;
    @When("admin click Offline menu")
    public void adminClickOfflineMenu() {
        bookingClassPage.clickOfflineMenu();
    }

    @Then("admin can see all offline class booking")
    public void adminCanSeeAllOfflineClassBooking() {
        bookingClassPage.canSeeAllOfflineClassBooking();

    }

    @And("admin click point three oflline")
    public void adminClickPointThreeOflline() {
        bookingClassPage.clickPointThreeOffline();
    }

    @And("admin click view detail button oflline")
    public void adminClickViewDetailButtonOflline() {
        bookingClassPage.clickViewDetailButton();
    }

    @Then("admin can see detail offline class booking")
    public void adminCanSeeDetailOfflineClassBooking() {
        bookingClassPage.canSeeAllOfflineClassBooking();
    }
}
