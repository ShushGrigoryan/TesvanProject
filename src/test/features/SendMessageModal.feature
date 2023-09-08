@test

Feature: As A user I want to send message

    Background:
        Given Home page is open


    Scenario: Send a message with valid data

        When I fill in "fullName" field with "nameTest" value
        And I fill in "email" field with "email@test.com" value
        And I fill in "phone" field with "123456789" value
        And I fill in "company" field with "testCompany" value
        And I fill in "description" field with "testingtestingtestingtesting" value
        And I check the I agree to checkbox
        And I click on the "send_message" button
        Then I should see the succsessfuly message "Your message has been sent successfully."



    Scenario: Send a message with invalid email format data

        When I fill in "fullName" field with "nameTest" value
        And I fill in "email" field with "emailtest.com" value
        And I fill in "phone" field with "123456789" value
        And I fill in "company" field with "testCompany" value
        And I fill in "description" field with "testingtestingtestingtesting" value
        And I check the I agree to checkbox
        And I click on the "send_message" button
        Then I should see the input error "Email is invalid"



    Scenario: Send a message with invalid description less than 20 characters

        When I fill in "fullName" field with "nameTest" value
        And I fill in "email" field with "email@test.com" value
        And I fill in "phone" field with "123456789" value
        And I fill in "company" field with "testCompany" value
        And I fill in "description" field with "test" value
        And I check the I agree to checkbox
        And I click on the "send_message" button
        Then I should see the textarea error "Description should contain minimum 20 characters"



    Scenario: Send a message without checking the "I Agree" checkbox and receive an error

        When I fill in "fullName" field with "nameTest" value
        And I fill in "email" field with "email@test.com" value
        And I fill in "phone" field with "123456789" value
        And I fill in "company" field with "testCompany" value
        And I fill in "description" field with "test" value
        And I click on the "send_message" button
        Then I should see the error "Please check and accept our Privacy Policy"



    Scenario Outline: Verify Social Media Navigation from Contact Information

        When I click on the "<social_media>" link
        Then I should be navigate on "<expected_url>" page

        Examples:
            | social_media | expected_url                            |
            | upwork       | https://www.upwork.com/ag/tesvan/       |
            | linkedin     | https://www.linkedin.com/company/tesvan |
            | facebook     | https://www.facebook.com/tesvanllc      |