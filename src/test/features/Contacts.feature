

Feature: As A user I want to send message

    Background:
        Given Home page is open
        Given The modal is closed




    
    Scenario: Send a message with valid data

        When I click on the "Contacts" button
        When I scrool down page
        When I fill in "Full_Name" field with "nameTest" value
        When I fill in "Email" field with "email@test.com" value
        When I fill in "Phone" field with "123456789" value
        When I fill in "Company" field with "testCompany" value
        When I fill in "Description" field with "testingtestingtestingtesting" value
        When I check the I agree to checkbox
        When I click on the "Send_Message" button
        Then I should see the succsessfuly message "Your message has been sent successfully." on Contacts page



    Scenario: Send a message with invalid email format data

        And I click on the "Contacts" button
        And I scrool down page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "emailtest.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "testingtestingtestingtesting" value
        And I click on the I agree to "Checkbox"
        And I click on the "Send_Message" button
        Then I should see the input error "Email is invalid"



    Scenario: Send a message with invalid description less than 20 characters

        And I click on the "Contacts" button
        And I scrool down page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "emailtest.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "test" value
        And I click on the I agree to "Checkbox"
        And I click on the "Send_Message" button
        Then I should see the textarea error "Description should contain minimum 20 characters"



    Scenario: Send a message without checking the "I Agree" checkbox and receive an error

        And I click on the "Contacts" button
        And I scrool down page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "email@test.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "testingtestingtestingtesting" value
        And I click on the "Send_Message" button
        Then I should see the error "Please check and accept our Privacy Policy"



    Scenario Outline: Verify Social Media Navigation from Contact

        And I click on the "Contacts" button
        And I scrool down page
        When I click on the "<social_media>" link
        Then I should be navigate on "<expected_url>" page

        Examples:
            | social_media | expected_url                            |
            | upwork       | https://www.upwork.com/ag/tesvan/       |
            | linkedin     | https://www.linkedin.com/company/tesvan |
            | facebook     | https://www.facebook.com/tesvanllc      |