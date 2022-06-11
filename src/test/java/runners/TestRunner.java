package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@read",
        dryRun=true

)

public class TestRunner {
    /*
    Bir framework te bir tek runner class'i yeterli olabilir
    Runner Class'inda class içerisinde hiçbir şey olmaz

    Runner class'imii onemli yapan 2 adet annotaion vardir
    @RunWith(Cucumbe.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde Junit kullanmayi tercih ediyoruz

    features : Runer dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosylarini nerde bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

     dryRun: iki secenek var
     birinci secenek dryRun=true yazdigimizda,
     testimizi calistirmadan sadece eksik adimlari bize verir
     ikinici secenek dryRun=false default ayaridir. testlerimizi calistirir

     */
}
