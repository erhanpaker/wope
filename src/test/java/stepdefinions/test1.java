package stepdefinions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WopePage;
import utilities.ConfigReader;
import utilities.Driver;


public class test1 {

    WopePage wopePage = new WopePage();

    @Given("kullanıcı wope gider")
    public void kullanıcı_wope_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Then("login butonuna tıklar")
    public void login_butonuna_tıklar() {
        wopePage.loginButonu.click();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("mail adresinin girer")
    public void mail_adresinin_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("parolasını girer")
    public void parolasını_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
