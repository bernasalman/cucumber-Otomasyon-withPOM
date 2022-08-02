package stepDefinition;

import ObjectModels.ContactUsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ContactSteps {

    private WebDriver driver;
    ContactUsPage contactUsPage = new ContactUsPage();
    @Given("^siteye git$")
    public void siteye_git() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        //gidilecek sitenin adresi
        driver.get("http://automationpractice.com/index.php?controller=contact");
        //20sn beklemek için
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '50%'");



    }

    @Given("^contact us butonuna tıkla$")
    public void contact_us_butonuna_tıkla() throws Throwable {
    contactUsPage.clickContactUsButton();
    }

    @Given("^Subject Headingi seç$")
    public void subject_Headingi_seç() throws Throwable {
    contactUsPage.selectFromDropdown();

    }

    @Given("^Email gir$")
    public void email_gir() throws Throwable {
    contactUsPage.typeEmail();

    }

    @Given("^Order referans gir$")
    public void order_referans_gir() throws Throwable {
        contactUsPage.typeOrderReference();
    }

    @Given("^Mesaj gir$")
    public void mesaj_gir() throws Throwable {
        contactUsPage.typeMessage();
    }

    @When("^send butonuna tıklandığımda$")
    public void send_butonuna_tıklandığımda() throws Throwable {
    contactUsPage.clikSendButton();
    }

    @Then("^success mesajını ver$")
    public void success_mesajını_ver() throws Throwable {
        contactUsPage.assertMyMessage();
    }

}
