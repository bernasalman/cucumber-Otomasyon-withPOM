@SmokeTest
Feature: Register BackGround Test

  Background:
    Given Websitesine git
    And Sign butonuna tıkla
    And  "bernasalman@gmail.com" email gir
    And Create an Account butonuna tıkla

    Scenario: Kişi 1
      And isim "berna" ve soyad "salman" gir
      And şifre "password123" gir

      Scenario: Kişi 2
        And şirket "tets" gir
        And adres "edirne" gir

        Scenario Outline: Kişi3
          And title seç
          And isim "<firstname>" ve soyad "<lastname>" gir
          And şifre "<password>" gir
          And şirket "<Company>" gir
          And adres "<address>" gir
          Examples:
           | firstname | lastname | password | Company | address |

            | Başak | Salman | başak123 | study | İstanbul |
           | Ali| Salman | ali123 | altus | Ankara |
