package StepDefinitions;

import org.junit.jupiter.api.Assertions;

import BaseClass.BaseClass;
import PageObject.Languages;
import io.cucumber.java.en.*;


public class LanguagesSteps extends Languages{


    public LanguagesSteps(BaseClass base) {
        super(base);
    }

    

    @When("I click on the language icon")
    public void iClickOnLanguageIcon() {
        super.clickLanguageIcon();
    }

    @When("I select a {string} language")
    public void iSelectLanguage(String language) {
        super.selectLanguage(language);
    }

    @Then("I see that the page content should be displayed in the selected language")
    public void pageContentShouldBeDisplayedInSelectedLanguage() {
        Assertions.assertTrue(super.isPageContentInSelectedLanguage());
    }
}
    
