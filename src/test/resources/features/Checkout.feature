Feature: Book Checkout
  Scenario: Checkout a book from the library
    Given When I want to checkout a book
    When I checkout the book
    Then the book should be marked as checked out by me
    And not be available for checkout by anyone else