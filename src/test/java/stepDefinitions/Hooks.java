package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber da step definitions package icerisinde
    @before @after gibi bir notasyon varsa
    extends testbase dememize gerek kalmadan
    her senaryo'dan once ve/veya sonra bu method'lar calisacaktir
    Bu da bizim isteyecegimiz bir durum degildir

    Cucumber'da @before @after kullanma ihtiyacimiz olursa
    bunu step definitions altinda olusturacagimiz Hooks class'ina koyariz

    biz her senaryodan sonra test sonucunu kontrol edip
    failed olan scenario'lar icin
    screenshoot almasi amaciyla @After method'u kullanacagiz
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }

}
