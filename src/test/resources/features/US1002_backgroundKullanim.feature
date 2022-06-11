@wip
Feature:US1002 Kullanici ortak adimlari Background ile calistirir

   Background: ortak adim
     Given kullanici amazon anasayfasinda

  Scenario: TC04 kullanici amazonda Nutella aratir
    And kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
@pr2
  Scenario: TC05 kullanici amazonda Java aratir
    And kullanici Java icin arama yapar
    Then sonuclarin Java icerdigini test eder
    And sayfayi kapatir