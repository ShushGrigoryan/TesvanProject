package StepDefinitions;

import org.junit.jupiter.api.Assertions;
// import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import PageObject.Contacts;

import io.cucumber.java.en.*;

public class ContactsSteps extends Contacts {

    public ContactsSteps(BaseClass base) {
        super(base);
    }


    // @And("I scrool down page")
    // public void scrool_down_page() {
    //     // super.ScroolDownPage();
    //     WebElement someElement = base.driver.findElement(By.xpath("//div/button[1]"));
    //     ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", someElement);

    // }

    @Then("I should see the succsessfuly message {string} on Contacts page")
    public void verify_successful_message(String responseSuccessMesage) {
        Assertions.assertTrue(super.ResponseMessageFromContacts(responseSuccessMesage));

    }

    @When("I check the I agree to checkbox From Contacts")
    public void check_checkbox() {
        super.checkboxFromContacts();
    }

    @Then("I should see the email input error {string}")
    public void verify_input_error(String expectedErrorMessage) {
        String actualErrorMessage = super.emailInputError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }



}
