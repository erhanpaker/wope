package stepdefinions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class start {

    @Given("kullanıcı wope gider")
    public void kullanıcı_wope_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        @Then("login butonuna tıklar")
        public void login_butonuna_tıklar() {


        }
        @Then("mail adresinin girer")
        public void mail_adresinin_girer() {

        }
        @Then("parolasını girer")
        public void parolasını_girer() {

        }






    }



}
