package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps  {
    @Given("^Amazon sitesine git$")
    public void amazon_sitesine_git() throws Throwable {
        System.out.println("amazon  sitesine gidildi");
    }

    @Given("^login butonuna tıkla$")
    public void login_butonuna_tıkla() throws Throwable {
        System.out.println("login butonuna tıklandı");

    }

    @Given("^isim gir$")
    public void isim_gir() throws Throwable {
        System.out.println("isim girildi");

    }

    @Given("^şifre gir$")
    public void şifre_gir() throws Throwable {
        System.out.println("şifre girildi");
    }

    @When("^submit butonuna tıkladığımda$")
    public void submit_butonuna_tıkladığımda() throws Throwable {
        System.out.println("submit butonuna tıklandı");
    }

    @Then("^success mesajını göster$")
    public void success_mesajını_göster() throws Throwable {
        System.out.println("login işlemi başarıyla tamamlandı");
    }

}
