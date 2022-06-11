@tumu
Feature:US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella  @ikisi @sirali

  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java  @ikisi
  Scenario: TC02 kullanici amazonda Java aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @iphone @pr1
  Scenario: TC03 kullanici amazonda iphone aratir

    Given kullanici amazon anasayfasinda
    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir