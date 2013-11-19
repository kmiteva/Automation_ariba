Feature: Bueyer

       Scenario: The buyer navigates to home tab
    Given The bueyer goes to the ws
    When The bueyer tries to log in
    And he goes to inbox
    Then all invoices are displayed
  
  
  
  Scenario: The buyer is unsuccessfully login
    Given The bueyer goes to the ws
    When The bueyer tries to log in with incorrect credentials
    Then He is not successfully login
    
    
  Scenario: The buyer is successfully login
    Given The bueyer goes to the ws
    When The bueyer tries to log in
    Then He is successfully login
    


