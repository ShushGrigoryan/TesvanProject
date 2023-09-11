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
        Then I see that the page URL should be contain the "/company/careers"
        And I "scroolDown" the page
        When I click on the "More_Details" button
        Then I see that the page URL should be contain the "/company/careers/sales_specialist"
        When I "scrool_down" the page
        And I fill in "fullName_" field with "nameTest" value
        And I fill in "email_" field with "test@test.com" value
        And I fill in "phone_" field with "12345678910" value
        And I click on the "upload" button
        And I attach file
        And I check the I agree to checkbox from Careers
        And I click on the "Apply" button
        Then I should see the succses message "Success"

