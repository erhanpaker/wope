package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class wopePage {

    public wopePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "twotabsearchtextbox")
    public WebElement aramaKutusu;




}
