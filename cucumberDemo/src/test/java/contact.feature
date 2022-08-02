@SmokeTest
Feature: Contact Test

  Scenario:Contact us websitesine git ve test et

    Given siteye git
    And contact us butonuna tıkla
    And Subject Headingi seç
    And Email gir
    And Order referans gir
    And Mesaj gir
    When send butonuna tıklandığımda
    Then success mesajını ver