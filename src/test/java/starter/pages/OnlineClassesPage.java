package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OnlineClassesPage extends PageObject {
    private By onlineClassMenu(){
        return By.xpath("//button[text()='Online']");
    }

    private By manageOnlineClassTitle(){
        return By.xpath("//p[text()='Manage Online Class']");
    }

    private By addOnlineClassButton(){
        return By.id("addOnline");
    }

    private By linkZoomField(){
        return By.id("linkClass");
    }

    private By deleteOnlineClassIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div[2]/div/div[2]/img[2]");
    }

    private By editOnlineClassIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div[2]/div/div[2]/img[1]");
    }

    private By editOnlineClassSubmitButton(){
        return By.id("submitEmail");
    }

    private By zumbaClassTitle(){
        return By.xpath("//p[text()='Zumba Class']");
    }

    private By onlineClassPackageTitle(){
        return By.xpath("//li[text()='Class Packages']");
    }

    @Step
    public void clickOnlineClassMenu(){
        $(onlineClassMenu()).click();
    }

    @Step
    public void onOnlineClassesPage(){
        $(manageOnlineClassTitle()).isDisplayed();
    }

    @Step
    public void clickAddOnlineClassButton(){
        $(addOnlineClassButton()).click();
    }

    @Step
    public void inputLinkZoom(String link){
        $(linkZoomField()).type(link);
    }

    @Step
    public void successfullyAddNewOnlineClass(){
        $(manageOnlineClassTitle()).isDisplayed();
    }

    @Step
    public void clickDeleteOnlineClassIcon(){
        $(deleteOnlineClassIcon()).click();
    }

    @Step
    public void successfullyDeleteOnlineClass(){
        $(manageOnlineClassTitle()).isDisplayed();
    }

    @Step
    public void clickEditOnlineClassIcon(){
        $(editOnlineClassIcon()).click();
    }

    @Step
    public void clickEditClassSubmitIcon(){
        $(editOnlineClassSubmitButton()).click();
    }

    @Step
    public void successfullyEditOnlineClass(){
        $(manageOnlineClassTitle()).isDisplayed();
    }

    @Step
    public void canSeeOnlineClassAccordingToKeyword(){
        $(zumbaClassTitle()).isDisplayed();
    }

    @Step
    public void successfullyDeleteOnlineClassPackage(){
        $(onlineClassPackageTitle()).isDisplayed();
    }

    @Step
    public void successfullyEditOnlineClassPackage(){
        $(onlineClassPackageTitle()).isDisplayed();
    }
}
