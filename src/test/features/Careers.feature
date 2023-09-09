Feature: Careers page functionality


    Background:
        Given Home page is open
        Given The modal is closed


    Scenario:  Verify accessing the Careers page

        When I hover over the "Company" section in the menu bar
        And I click on the "Careers" button from dropdown
        Then I see that the page URL should be contain the "/company/careers"

    Scenario: Verify Applying for the Sales Specialist Position

      When I hover over the "Company" section in the menu bar
        And I click on the "Careers" button from dropdown
        Then I should see "Sales_Specialist" open position
        When I click on the "More_Details" button
        Then I see that the page URL should be contain the "/company/careers/sales_specialist"
        When I click on the "ScroolDown" button
        And I fill in "full_name" field with "nameTest" value
        And I fill in "e_mail" field with "test@test.com" value
        And I fill in "phone" field with "12345678910" value
        And I check the I agree to checkbox
        And I click on the "Apply" button
        Then I should see the succsessfuly message "."

