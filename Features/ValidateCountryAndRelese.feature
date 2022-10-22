Feature: ValidateData

Scenario: Validate CountryName
    Given User Lunch Chrome Browser
    And User opens Url "https://www.imdb.com/title/tt9389998/"
    Then Country Name Should Be "India"
    And Close Browser
    
Scenario: Validate ReleaseDate
    Given User Lunch Chrome Browser
    And User opens Url "https://www.imdb.com/title/tt9389998/"
    Then Release Date Should Be "December 17, 2021 (United States)"
    And Close Browser    
  