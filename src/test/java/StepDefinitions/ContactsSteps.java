package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import PageObject.Contacts;
import io.cucumber.java.en.*;

public class ContactsSteps extends Contacts {

    public ContactsSteps(BaseClass base) {
        super(base);
    }

    @And("I scrool down page")
    public void scrool_down_page() {
        // super.ScroolDownPage();
        WebElement someElement = base.driver.findElement(By.xpath("//div[8]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", someElement);

    }

    @Then("I should see the succsessfuly message {string} on Contacts page")
    public void verify_successful_message(String responseSuccessMesage) {
        Assertions.assertTrue(super.ResponseMessageFromContacts(responseSuccessMesage));

    }

}
