package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Switch;
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
        return By.xpath("(//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div[2]/img[1])[1]");
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
    public void seeAlertSuccess(){
        Switch.toAlert().andAccept();
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


    private By packageButton(){
        return By.xpath("//button[text()='Packages']");
    }

    private By packageTitle(){
        return By.xpath("//li[text()='Class Packages']");
    }

    private By editClassPackageIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div[2]/img[1]");
    }

    private By priceField(){
        return By.id("price");
    }

    private By packageSubmitButton(){
        return By.id("submitPackages");
    }

    private By deleteClassPackageIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[2]/div[3]/div/div[2]/img[2]");
    }

    private By deleteClassIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div[5]/div/div[2]/img[2]");
    }

    private By editClassIcon(){
        return By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div[2]/div/div[2]/img[1]");
    }

    private By classSubmitButton(){
        return By.id("submitEmail");
    }

    private By addPackageButton(){
        return By.xpath("//button[text()='Add Package']");
    }

    private By classSelect(){
        return By.id("classTitle");
    }

    private By zumbaClassSelect(){
        return By.xpath("//option[text()='Zumba']");
    }

    private By periodSelect(){
        return By.id("period");
    }

    private By dailyPeriod(){
        return By.xpath("//option[text()='Daily']");
    }

    private By classPackageSubmitButton(){
        return By.id("submitPackages");
    }

    private By searchBox(){
        return By.id("searchClass");
    }

    private By zumbaCard(){
        return By.xpath("//p[text()='Zumba']");
    }

    private By noDataMessage(){
        return By.xpath("//p[text()='No data available']");
    }

    @Step
    public void clickPackageButton(){
        $(packageButton()).click();
    }

    @Step
    public void onClassPackagePage(){
        $(packageTitle()).isDisplayed();
    }

    @Step
    public void clickEditClassPackageIcon(){
        $(editClassPackageIcon()).click();
    }

    @Step
    public void inputFieldToEditClassPackage(String editPrice){
        $(priceField()).type(editPrice);
    }

    @Step
    public void clickPackageSubmitButton(){
        $(packageSubmitButton()).click();
    }

    @Step
    public void canSeeClassPackageEdited(){
        $(packageTitle()).isDisplayed();
    }

    @Step
    public void clickDeleteClassPackageIcon(){
        $(deleteClassPackageIcon()).click();
    }

    @Step
    public void successfullyDeleteClassPackage(){
        $(packageTitle()).isDisplayed();
    }

    @Step
    public void clickDeleteClassIcon(){
        $(deleteClassIcon()).click();
    }

    @Step
    public void successfullyDeleteClass(){
        $(manageOfflineClassesTitle()).isDisplayed();
    }

    @Step
    public void clickEditClassIcon(){
        $(editClassIcon()).click();
    }

    @Step
    public void inputFieldToEditClass(String editClass){
        $(nameField()).type(editClass);
    }

    @Step
    public void clickClassSubmitButton(){
        $(classSubmitButton()).click();
    }

    @Step
    public void canSeeClassEdited(){
        $(manageOfflineClassesTitle()).isDisplayed();
    }

    @Step
    public void clickAddPackageButton(){
        $(addPackageButton()).click();
    }

    @Step
    public void selectClass(){
        $(classSelect()).click();
    }

    @Step
    public void zumbaClass(){
        $(zumbaClassSelect()).click();
    }

    @Step
    public void selectPeriod(){
        $(periodSelect()).click();
    }

    @Step
    public void dailyPeriodSelect(){
        $(dailyPeriod()).click();
    }

    @Step
    public void inputPricePackageField(String price){
        $(priceField()).type(price);
    }

    @Step
    public void clickClassPackageSubmitButton(){
        $(classPackageSubmitButton()).click();
    }

    @Step
    public void successfullyAddNewClassPackage(){
        $(packageTitle()).isDisplayed();
    }

    @Step
    public void clickSearchBox(){
        $(searchBox()).click();
    }

    @Step
    public void inputValidKeyword(String validKeyword){
        $(searchBox()).type(validKeyword);
    }

    @Step
    public void canSeeOfflineClassAccordingToKeyword(){
        $(zumbaCard()).isDisplayed();
    }

    @Step
    public void inputInvalidKeyword(String invalidKeyword){
        $(searchBox()).type(invalidKeyword);
    }

    @Step
    public void seeNoDataAvailableMessage(){
        $(noDataMessage()).isDisplayed();
    }

    private By addClassButton(){
        return By.id("addOffline");
    }

    private By classNameField(){
        return By.id("name");
    }

    private By location(){
        return By.id("location");
    }

    private By goFitMedan(){
        return By.xpath("//option[text()='GoFit Medan']");
    }

    private By startedAt(){
        return By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/div/div/input");
    }

    private By classDescriptionField(){
        return By.id("description");
    }

    private By addClassSubmitButton(){
        return By.id("submitEmail");
    }

    @Step
    public void clickAddClassButton(){
        $(addClassButton()).click();
    }

    @Step
    public void inputClassName(String className){
        $(classNameField()).type(className);
    }

    @Step
    public void selectLocation(){
        $(location()).click();
    }

    @Step
    public void clickGoFitMedanLocation(){
        $(goFitMedan()).click();
    }

    @Step
    public void inputStartedAt(){
        $(startedAt()).click();
    }

    @Step
    public void inputClassDescription(String classDescription){
        $(classDescriptionField()).type(classDescription);
    }

    @Step
    public void clickAddClassSubmitButton(){
        $(addClassSubmitButton()).click();
    }

    @Step
    public void successfullyAddNewOfflineClass(){
        $(manageOfflineClassesTitle()).isDisplayed();
    }

    private By pageField(){
        return By.id("pages");
    }

    @Step
    public void inputPage(String page){
        $(pageField()).type(page);
    }
}
