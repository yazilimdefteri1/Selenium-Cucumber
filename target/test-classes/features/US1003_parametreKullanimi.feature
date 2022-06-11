
Feature:US1003 Kullanici parametre kullanarak arama yapabilmeli

  @parametre @sirali @pr1
  Scenario: TC06 kullanici parametre ile amazonda yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    Then sayfayi kapatir