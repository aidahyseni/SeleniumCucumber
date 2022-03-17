Feature: OpenWeatherMapAPI feature
  Scenario: Weather in different cities
    Given I set GET weather service api for London
    When I set request HEADER
    Then I recieve valid HTTP response
    Then I set Get weather api for Pristina
    Then I set Get weather api for Oslo
    Then I set Get weather api for Sydney

