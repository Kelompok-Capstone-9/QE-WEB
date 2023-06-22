package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OfflineClassesPage extends PageObject {
    private By offlineClassMenu(){
        return By.xpath("//button[text()='Offline']");
    }

    private By manageOfflineClassesTitle(){
        return By.xpath("//p[text()='Manage Offline Class']");
    }

    private By submitButton(){
        return By.id("submitEmail");
    }

    private By locationButton(){
        return By.xpath("//button[text()='Location']");
    }

    private By locationsTitle(){
        return By.xpath("//li[text()='Locations']");
    }

    private By addLocationButton(){
        return By.id("addLocation");
    }

    private By nameField(){
        return By.id("name");
    }

    private By cityField(){
        return By.id("city");
    }

    private By latitudeField(){
        return By.id("latitude");
    }

    private By longitudeField(){
        return By.id("longitude");
    }

    private By editLocationIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[2]/div[1]/div/div[2]/img[1]");
    }

    private By addressField(){
        return By.id("address");
    }

    private By locationEdited(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[2]/div[1]/div");
    }

    private By deleteLocationIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div[2]/img[2]");
    }

    @Step
    public void clickOfflineClassMenu(){
        $(offlineClassMenu()).click();
    }

    @Step
    public void onOfflineClassesPage(){
        $(manageOfflineClassesTitle()).isDisplayed();
    }

    @Step
    public void clickSubmitButton(){
        $(submitButton()).click();
    }

    @Step
    public void clickLocationButton(){
        $(locationButton()).click();
    }

    @Step
    public void onLocationPage(){
        $(locationsTitle()).isDisplayed();
    }

    @Step
    public void clickAddLocationButton(){
        $(addLocationButton()).click();
    }

    @Step
    public void inputNameField(String name){
        $(nameField()).click();
        $(nameField()).type(name);
    }

    @Step
    public void inputCityField(String city){
        $(cityField()).click();
        $(cityField()).type(city);
    }

    @Step
    public void inputAddressField(String address){
        $(addressField()).click();
        $(addressField()).type(address);
    }

    @Step
    public void inputLatitudeField(String latitude){
        $(latitudeField()).click();
        $(latitudeField()).type(latitude);
    }

    @Step
    public void inputLongitudeField(String longitude){
        $(longitudeField()).click();
        $(longitudeField()).type(longitude);
    }

    @Step
    public void successfullyAddNewLocation(){
        $(locationsTitle()).isDisplayed();
    }

    @Step
    public void clickEditLocationIcon(){
        $(editLocationIcon()).click();
    }

    @Step
    public void inputFieldToEdit(String address){
        $(addressField()).click();
        $(addressField()).type(address);
    }

    @Step
    public void seeLocationEdited(){
        $(locationEdited()).isDisplayed();
    }

    @Step
    public void clickDeleteIcon(){
        $(deleteLocationIcon()).click();
    }

    @Step
    public void successfullyDeleteLocation(){
        $(locationEdited()).isDisplayed();
    }
}
