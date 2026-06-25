Feature: Checkout flow

  @web
  Scenario: User checkout product
    Given user login ke saucedemo
    When user melakukan checkout produk
    Then checkout berhasil