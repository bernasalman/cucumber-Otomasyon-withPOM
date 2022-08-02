package stepDefinition;

import ObjectModels.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
    private WebDriver driver;

    @Given("^Websitesine git$")
    public void websitesineGit() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        //gidilecek sitenin adresi
        driver.get("http://automationpractice.com/index.php");

        //20sn beklemek için
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '50%'");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("^Sign butonuna tıkla$")
    public void signButonunaTıkla() {
        registerPage.clickSignInButton();

    }

    @And("^\"([^\"]*)\" email gir$")
    public void gir(String email) throws Throwable {
        registerPage.typeEmail(email);
    }

    @And("^Create an Account butonuna tıkla$")
    public void createAnAccountButonunaTıkla() {
        registerPage.clickSubmitInButton();
    }

    @And("^title seç$")
    public void titleSeç() {
        registerPage.clickGender();
    }

    @And("^isim \"([^\"]*)\" ve soyad \"([^\"]*)\" gir$")
    public void isimVeSoyadGir(String firstname, String lastname) throws Throwable {
    registerPage.typeFirstnameAndLastname(firstname, lastname);
    }

    @And("^şifre \"([^\"]*)\" gir$")
    public void şifreGir(String pessword) throws Throwable {
        registerPage.typePassword(pessword);
    }

    @And("^şirket \"([^\"]*)\" gir$")
    public void şirketGir(String company) throws Throwable {
       registerPage.typeCompany(company);
    }

    @And("^adres \"([^\"]*)\" gir$")
    public void adresGir(String address) throws Throwable {
        registerPage.typeAddress(address);
    }

/*
    //en sonda ekranda verileri 5 sn görelin sonra driver kapansın
    @After
    public void quitDriver() throws InterruptedException{
        Thread.sleep(5000);

        Driver.closeDriver();
    }
*/

}
