Feature: Furniture Advertisement

Scenario: Advertise a new piece of furniture
    Given the user wants to advertise furniture
    When the user provides the following details name<"Wooden Chair"> and Description <"Comfortable wooden chair"> and price <50.0> :
    Then the furniture should be advertised successfully