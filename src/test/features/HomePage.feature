


Feature: As a user I want to check Home Page functionality

    Background:
        Given Home page is open
        Given The modal is closed


@test
    Scenario Outline: Verify Language Selection Functionality

        When I click on the "<language>" button
        And I select a "<selected_language>" language
        Then I see that the page URL should be contain the "<expected_URL>"

        Examples:
            | language | selected_language | expected_URL |
            | ENG      | Arm               | /am          |
            | ENG      | Ru                | /ru          |


    Scenario Outline: User selects some language and switches back

        When I click on the "<language>" button
        And I select a "<selected_language>" language
        Then I see that the page URL should be contain the "<expected_URL>"
        And I decides to switch back to the original language
        Then I see that the page URL should be contain the "<original_URL>"

        Examples:
            | language | selected_language | expected_URL | original_URL |
            | ENG       | Arm               | /am          | /en          |
            | ENG       | Ru                | /ru          | /en          |