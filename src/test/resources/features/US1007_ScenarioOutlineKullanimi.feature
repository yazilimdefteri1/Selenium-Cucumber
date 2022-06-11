# amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratipher
  # sonuclarin arama yaptigimiz kelimeyiicerdigini test edelim

  Feature: US1007 kullanici amazonda istedigi kelimeleri aratipher

    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And url'in "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir


      Examples:
      |istenenKelime|
      |nutella      |
      |java|
      |elma|
      |armut|