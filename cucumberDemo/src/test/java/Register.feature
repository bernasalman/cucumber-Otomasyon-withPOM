@SmokeTest
Feature: Register Test

  Scenario Outline: Hesap Yaratma
    Given Websitesine git
    And Sign butonuna tıkla
    And  "<Email>" email gir
    And Create an Account butonuna tıkla
    And title seç
    And isim "<firstname>" ve soyad "<lastname>" gir
    And şifre "<password>" gir
    And şirket "<Company>" gir
    And adres "<address>" gir
    Examples:
      | Email | firstname | lastname | password | Company | address |

      | bernasalman@gmail.com | Berna | Salman | berna123 | study | İstanbul |
      | ahmet123456@gmail.com | Ahmet | Salman | asdf123 | Beko | Belçika |