package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By titleHomePage(){
        return By.xpath("//h1[text()='HOME']");
    }

    @Step
    public void onHomePage(){
        $(titleHomePage()).isDisplayed();
    }
}
