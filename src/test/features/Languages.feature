
Feature: As a user I want to change Language on Home Page

    Background:
        Given Home page is open
        Given The modal is closed


    Scenario: Changing the language on the page

       
        When I click on the language icon
        And I select a "different" language
        Then I see that the page content should be displayed in the selected language