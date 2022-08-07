#Luis Alejandro Aguirre Sossa

  Feature: Payment in Store
    As a user
    I want to do open tools qa store
    For make a payment inside page


  @payment
  Scenario: Payment
    Given User is on the home page
    When User check the the product "black lux graphic t-shirt"
    Then Payment should be succesful