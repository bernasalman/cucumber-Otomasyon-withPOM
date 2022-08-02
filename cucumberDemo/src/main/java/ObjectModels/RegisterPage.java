package ObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends AbstractClass {
    WebDriver driver;

    public RegisterPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;
    public void clickSignInButton(){
        clickFon(signInButton);
    }

    @FindBy(name = "email_create")
    private WebElement emailTextBox;
    public void typeEmail(String email){
        sendKeysFon(emailTextBox,email);
    }

    @FindBy(id= "SubmitCreate")
    private WebElement submitButton;
    public void clickSubmitInButton(){
        clickFon(submitButton);
    }

    @FindBy(id= "id_gender1")
    private WebElement gender;
    public void clickGender(){
        clickFon(gender);
    }

    @FindBy(name = "customer_firstname")
    private WebElement firstname;
    @FindBy(name = "customer_lastname")
    private WebElement lastname;
    public void typeFirstnameAndLastname(String firstName, String lastName){
        sendKeysFon(firstname, firstName);
        sendKeysFon(lastname, lastName);
    }

    @FindBy(name = "passwd")
    private WebElement password;
    public void typePassword(String password1){
        sendKeysFon(password, password1);
    }

    @FindBy(id= "company")
    private WebElement company;
    public void typeCompany(String compony1 ){
        sendKeysFon(company, compony1);
    }

    @FindBy(name= "address1")
    private WebElement address;
    public void typeAddress(String adress ){
        sendKeysFon(address, adress);
    }
}
