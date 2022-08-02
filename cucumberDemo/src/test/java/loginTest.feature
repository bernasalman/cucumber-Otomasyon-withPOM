Feature: Login Test

  Scenario: amazon websitesine git ve login ekranını test et

    Given Amazon sitesine git
    And login butonuna tıkla
    And isim gir
    And şifre gir
    When submit butonuna tıkladığımda
    Then success mesajını göster