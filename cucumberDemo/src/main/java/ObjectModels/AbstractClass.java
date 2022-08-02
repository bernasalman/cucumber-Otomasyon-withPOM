package ObjectModels;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.rmi.UnexpectedException;
import java.rmi.server.ExportException;

//clik, send case, bekleme, random eleman seçerken kodalrının yazıldığı yer
//select, listeden eleman seçme, for döngüsü gibi işlemleri bu sınıf içinde yaratıyor
//başka sınıflarda kulanırken burdan exdend ediyoruz
public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    //tıklama fonksiyonu
    public void clickFon(WebElement clickElement){
        //element tıklanabilecek duruma gelene kadar beklesin
        //wait.until(ExpectedConditions.elementToBeClickable(clickElement));


        //javascript tıklamayı engellediği için böyle yazdık
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", clickElement);
        //clickElement.click();
    }


    //mesajı yazdıran fonk
    public void sendKeysFon(WebElement sendKeysElemet, String value){
        //mesajın yazılacağı elementi bulana kadar beklesin
        //wait.until(ExpectedConditions.visibilityOf(sendKeysElemet));


        //bulunan elemente veriyi girsin
        sendKeysElemet.sendKeys(value);
    }

    //seçme fonk
    public void selectElementDropdown(WebElement dropdown, String element){
        Select select = new Select(dropdown);
        select.selectByVisibleText(element);
    }

    //sistem bize ne verecek(actual) ve bizim sistemden beklediğimiz(expected) ne testi için
    public void Assertion(WebElement actual, String expected){
        //sistemin bize vereceği değeri görene kadar bekle
        //wait.until(ExpectedConditions.visibilityOf(actual));



        Assert.assertEquals(actual.getText(), expected);
        System.out.println("My Message:"+actual.getText());
    }
}
