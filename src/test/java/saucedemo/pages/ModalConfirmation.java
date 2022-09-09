package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalConfirmation {

    public WebDriver driver;

    public ModalConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    private By btnYes = By.xpath("//a[text()='Ya']");

    private By btnBatal = By.xpath("//a[text()='Batal']");

    private By btnOK = By.xpath("//div[@id='alertPopUpLayer4']//a[text()='OK']");

    public void clickYes(){
        driver.findElement(btnYes).click();
    }

    public void clickBatal(){
        driver.findElement(btnBatal).click();
    }

    public void clickOK(){
        driver.findElement(btnOK).click();
    }
}
