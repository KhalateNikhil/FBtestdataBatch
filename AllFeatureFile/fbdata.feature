Feature: Test the Facebook Application

  Scenario: Test fb register page functionality
    Given user is on rgister page
    When user enter firstname, lastname, and email
      | Nikhil | Khalate | nik@123 |
      | Sonali | Khalate | ssk@123 |
      | rushi  | Khalate | rsk@123 |
