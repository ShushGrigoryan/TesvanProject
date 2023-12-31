

Feature: As A user I want to send message and navigate to social media pages

    Background:
        Given Home page is open
        Given The modal is closed


    Scenario Outline: Verify Social Media Navigation from Contact

        When I click on the "Contacts" button
        And I "ScroolDown" the page
        And I click on the "<social_media>" button
        Then I should be navigate on "<expected_url>" page

        Examples:
            | social_media | expected_url                            |
            | Upwork       | https://www.upwork.com/ag/tesvan/       |
            | Linkedin     | https://www.linkedin.com/company/tesvan |
            | Facebook     | https://www.facebook.com/tesvanllc      |



    Scenario: Send a message with valid data

        When I click on the "Contacts" button
        And I "ScroolDown" the page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "email@test.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "testingtestingtestingtesting" value
        And I check the I agree to checkbox From Contacts
        And I click on the "Send_Message" button
        Then I should see the succsessfuly message "Your message has been sent successfully." on Contacts page



    Scenario: Send a message with invalid email format data

        And I click on the "Contacts" button
        And I "ScroolDown" the page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "email.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "testingtestingtestingtesting" value
        When I check the I agree to checkbox From Contacts
        And I click on the "Send_Message" button
        Then I should see the email input error "Email is invalid"



    Scenario: Send a message with invalid description less than 20 characters

        And I click on the "Contacts" button
        And I "ScroolDown" the page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "emailtest.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "test" value
        And I check the I agree to checkbox From Contacts
        And I click on the "Send_Message" button
        Then I should see the text area error "Description should contain minimum 20 characters"


    Scenario: Send a message without checking the "I Agree" checkbox and receive an error

        And I click on the "Contacts" button
        And I "ScroolDown" the page
        And I fill in "Full_Name" field with "nameTest" value
        And I fill in "Email" field with "email@test.com" value
        And I fill in "Phone" field with "123456789" value
        And I fill in "Company" field with "testCompany" value
        And I fill in "Description" field with "testingtestingtestingtesting" value
        And I click on the "Send_Message" button
        Then I should see the checking error "Please check and accept our Privacy Policy"
