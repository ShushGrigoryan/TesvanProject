package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import BaseClass.BaseClass;
import PageObject.Careers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareersSteps extends Careers {

    public CareersSteps(BaseClass base) {
        super(base);
    }

    @When("I hover over the {string} section in the menu bar")
    public void hover_over(String section) {
        super.hoverOver(section);
    }

    @And("I click on the {string} button from dropdown")
    public void click_from_dropdown(String subsection) {
        super.clickFromDropdown(subsection);
    }

    @And("I {string} the page")
    public void scrool_down_page(String elementName) {
        super.ScroolDownPage(elementName);
    }

    @And("I attach file")
    public void attach_the_file() {
        super.attachFile();
    }

    @And("I check the I agree to checkbox from Careers")
    public void check_checkbox() {
        super.checkboxFromCareers();
    }

    @Then("I should see the succses message {string}")
    public void verify_successful_message(String Success) {
        Assertions.assertTrue(super.successMessage(Success));

    }

}
