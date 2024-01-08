Feature: Validate the search functionality

  Scenario Outline: Verify able search the product using short name
    Given User is on Home Page
    When User search the product with shortname <Name> and extracted actual name of the product
    Then User searched for same <Name> shortname on deals page if the product exist
    And Validate product name in deals page matches with Home page

    Examples: 
      | Name |
      | Tom  |
      | Beet |
