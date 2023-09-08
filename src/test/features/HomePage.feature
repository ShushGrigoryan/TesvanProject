
Feature: As a user I want to check Home Page functionality

    Background:
        Given Home page is open
     

    Scenario: Verify, that modal is closed

        Given Home page is open
        When I click on the close button from modal
        Then I see that modal is closed


