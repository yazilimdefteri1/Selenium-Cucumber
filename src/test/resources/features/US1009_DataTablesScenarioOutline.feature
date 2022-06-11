
  Feature: US1009 Datatables sitesine 5 farkli giris yapalim

    @datatable
    Scenario Outline:  TC13 5 farkli kayit girisi yapabilmeli

      When kullanici "datatablesURL" anasayfasinda
      Then new butonuna basar
      And isim bolumune "<firstname>" yazar
      And kullanici 1 sn bekler
      And soyisim bolumune "<lastname>" yazar
      And kullanici 1 sn bekler
      And position bolumune "<position>" yazar
      And kullanici 1 sn bekler
      And officen bolumune "<office>" yazar
      And kullanici 1 sn bekler
      And extension bolumune "<extension>" yazar
      And kullanici 1 sn bekler
      And startDate bolumune "<startDate>" yazar
      And kullanici 1 sn bekler
      And salary bolumune "<salary>" yazar
      And kullanici 1 sn bekler
      And Create tusuna basar
      When kullanici "<firstname>" ile arama yapar
      Then isim bolumunde "<firstname>" oldugunu dogrular
      And sayfayi kapatir

      Examples:
      |firstname|lastname|position|office|extension|startDate|salary|
      |Alim     |Alim    |QA      |ankara|selenium |2019-10-29|10000|
      |Berk     |Can     |tester  |ankara|api      |2022-05-25|11000|
      |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-01-11|40000|
      |Fatih    |Sahin   |PO      |berlin|-        |2020-03-12|45000|
      |Ahmet    |Kaya    |Tester  |ankara|database |2021-06-06|11000|