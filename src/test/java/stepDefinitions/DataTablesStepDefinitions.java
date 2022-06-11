package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage=new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonuna.click();

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }
    @Then("officen bolumune {string} yazar")
    public void officen_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablesPage.aramasonucIlkElement.getText().contains(firstName));

    }
}