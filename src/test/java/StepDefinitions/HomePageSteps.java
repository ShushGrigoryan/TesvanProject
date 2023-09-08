package StepDefinitions;

import BaseClass.BaseClass;
import PageObject.HomePage;
import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;

public class HomePageSteps extends HomePage {

    public HomePageSteps(BaseClass base) {
        super(base);
    }

    @Given("Home page is open")
    public void home_page_is_open() {
        super.homePage();
        Assertions.assertTrue(super.homePageOpens());
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    };

    @When("I click on the close button from modal")
    public void click_close_button() {
        super.closeButton();
    }

    @Then("I see that modal is closed")
    public void verify_modal_is_closed() {
        Assertions.assertTrue(super.isModalClosed());
    }

    @Given("The modal is closed")
    public void modal_is_closed() {
        super.closeButton();
        super.isModalClosed();
    }

}
