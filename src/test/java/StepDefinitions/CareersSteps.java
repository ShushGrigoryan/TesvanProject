package StepDefinitions;

import BaseClass.BaseClass;
import PageObject.Careers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CareersSteps extends Careers {

  public CareersSteps(BaseClass base) {
        super(base);
    }




    @When("I hover over the {string} section in the menu bar")
    public void hover_over(String section){
        super.hoverOver(section);
    }

    @And("I click on the {string} button from dropdown")
    public void click_from_dropdown(String subsection){
        super.clickFromDropdown(subsection);



    }



}
