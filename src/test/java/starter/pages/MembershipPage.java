package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class MembershipPage extends PageObject {
    private By membershipMenu(){
        return By.xpath("//button[text()='Membership']");
    }

    private By membershipTitle(){
        return By.xpath("//p[text()='Membership']");
    }

    private By addMembershipPlanButton(){
        return By.id("addmembership");
    }

    private By titleField(){
        return By.id("titlemembership");
    }

    private By durationField(){
        return By.id("durationmembership");
    }

    private By priceField(){
        return By.id("pricemembership");
    }

    private By descriptionField(){
        return By.id("descriptionmembership");
    }

    private By buttonSubmit(){
        return By.id("submitEmail");
    }

    private By descriptionCard(){
        return By.xpath("(//p[text()='Unlimited Health tips'])[1]");
    }

    private By membershipPlanCard(){
        return By.xpath("(//*[@id=\"card-membership\"]/div)[1]");
    }

    private By editMembershipPlanIcon(){
        return By.xpath("(//*[@id=\"card-membership\"]/div/div[2]/div/div/div[1]/button/img)[1]");
    }

    @Step
    public void clickMembershipMenu(){
        $(membershipMenu()).click();
    }

    @Step
    public void onMembershipPage(){
        $(membershipTitle()).isDisplayed();
    }

    @Step
    public void clickAddMembershipPlanButton(){
        $(addMembershipPlanButton()).click();
    }

    @Step
    public void inputTitleField(String title){
        $(titleField()).click();
        $(titleField()).type(title);
    }

    @Step
    public void inputDurationField(String duration){
        $(durationField()).click();
        $(durationField()).type(duration);
    }

    @Step
    public void inputPriceField(String price){
        $(priceField()).click();
        $(priceField()).type(price);
    }

    @Step
    public void inputDescriptionField(String description){
        $(descriptionField()).click();
        $(descriptionField()).type(description);
    }

    @Step
    public void clickButtonSubmit(){
        $(buttonSubmit()).click();
    }

    @Step
    public void seeAlertSuccessfulAddMembershipPlan(){
        Switch.toAlert().andAccept();
    }

    @Step
    public void successfullyAddMembershipPlan(){
        $(descriptionCard()).isDisplayed();
    }

    @Step
    public void clickMembershipPlanCard(){
        $(membershipPlanCard()).click();
    }

    @Step
    public void clickEditMembershipPlanIcon(){
        $(editMembershipPlanIcon()).click();
    }

    @Step
    public void inputFieldToEditMembershipPlan(String editMembershipPlan){
        $(titleField()).click();
        $(titleField()).type(editMembershipPlan);
    }

    @Step
    public void seeAlertSuccessfulEditMembershipPlan(){
        Switch.toAlert().andAccept();
    }

    @Step
    public void successfullyEditMembershipPlan(){
        $(descriptionCard()).isDisplayed();
    }
}
