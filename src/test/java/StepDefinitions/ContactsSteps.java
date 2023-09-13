package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import BaseClass.BaseClass;
import PageObject.Contacts;
import io.cucumber.java.en.*;

public class ContactsSteps extends Contacts {

    public ContactsSteps(BaseClass base) {
        super(base);
    }


    @Then("I should see the succsessfuly message {string} on Contacts page")
    public void verify_successful_message(String responseSuccessMesage) {
        Assertions.assertTrue(super.ResponseMessageFromContacts(responseSuccessMesage));

    }

    @And("I check the I agree to checkbox From Contacts")
    public void check_checkbox() {
        super.checkboxFromContacts();
    }

    @Then("I should see the email input error {string}")
    public void verify_input_error(String expectedErrorMessage) {
        String actualErrorMessage = super.emailInputError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


    @Then("I should see the text area error {string}")
    public void verify_textarea_error(String expectedErrorMessage) {
        String actualErrorMessage = super.textAreaError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("I should see the checking error {string}")
    public void verify_checkbox_error(String expectedErrorMessage) {
        String actualErrorMessage = super.checkboxError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    
}
