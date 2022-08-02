package ObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends AbstractClass{
    WebDriver driver;
    public ContactUsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    //"contact us butonuna tıkla" adımı için
    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        clickFon(contactUsButton);
    }

    //"Subject Headingi seç" adımı için
    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown(){
        //ikinci değişkende belirtilen şeyi seçen
        selectElementDropdown(subjectHeadingDropdown, "Webmaster");
    }

    //"Email gir" adımı için
    @FindBy(id = "email")
    private WebElement emailText;

    public void typeEmail(){
        //ikinci değişkendeki veriyi yazar
        sendKeysFon(emailText,"bernasalman@gmail.com");
    }


    //"Order referans gir" adımı için
    @FindBy(id="id_order")
    private WebElement order;
    public void typeOrderReference(){
        sendKeysFon(order,"order123");
    }

    //"Mesaj gir" adımı için
    @FindBy(id = "message")
    private WebElement messageBox;
    public void typeMessage(){
        sendKeysFon(messageBox, "Ürün kırık geldi");
    }


    //"send butonuna tıklandığımda" adımı için
    @FindBy(id = "submitMessage")
    private WebElement sendButton;
    public void clikSendButton(){
        clickFon(sendButton);
    }

    //"success mesajını ver" adımı için
    @FindBy(css = "p.alert-success")
    private WebElement successMessage;
    public void assertMyMessage(){
        Assertion(successMessage, "Your message has been successfully sent to our team.");
    }
}
