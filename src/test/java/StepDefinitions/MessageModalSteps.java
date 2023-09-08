package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import BaseClass.BaseClass;
import PageObject.SendMessageModal;
import io.cucumber.java.en.*;

public class MessageModalSteps extends SendMessageModal {

    public MessageModalSteps(BaseClass base) {
        super(base);
    }

    @When("I fill in {string} field with {string} value")
    public void fill_field(String fieldName, String value) {
        super.fillField(fieldName, value);
    }

    // @Then("I see the {string} value is displayed in {string} field")
    // public void value_is_displayed(String value, String fieldName) {
    //     super.valueIsDisplayed(value, fieldName);
    // }

    @When("I check the I agree to checkbox")
    public void check_checkbox() {
        super.checkboxFromModal();
    }

    @When("I click on the {string} button")
    public void send_message(String elementName) {
        super.clickOnElement(elementName);
    }

    @Then("I should see the succsessfuly message {string}")
    public void verify_successful_message(String successMessage) {
        Assertions.assertTrue(super.Message(successMessage));

    }

    @Then("I should see the input error {string}")
    public void verify_input_error(String expectedErrorMessage) {
        String actualErrorMessage = super.inputError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("I should see the textarea error {string}")
    public void verify_textarea_error(String expectedErrorMessage) {
        String actualErrorMessage = super.textAreaError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("I should see the error {string}")
    public void verify_checkbox_error(String expectedErrorMessage) {
        String actualErrorMessage = super.checkboxError(expectedErrorMessage);
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("I click on the {string} link")
    public void i_click_on_social_media_link(String socialMedia) {
            switch (socialMedia.toLowerCase()) {
            case "upwork":
            case "linkedin":
            case "facebook":
                super.clickOnElement(socialMedia);
                break;
            default:
                Assertions.fail("Unsupported social media: " + socialMedia);
        }
    
    }

    @Then("I should be navigate on {string} page")
    public void i_should_be_on_social_media_profile_page(String expectedUrl) {
        Assertions.assertEquals(expectedUrl, super.verifyCurrentUrl());
    }

}
