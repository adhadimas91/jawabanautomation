package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetail {

    public WebDriver driver;

    public ProductDetail(WebDriver driver) {
        this.driver = driver;
    }

    private By qtyField =  By.id("optionStock0");

    private By btnTambahKeranjang = By.cssSelector(".btnStyle.btnFlat.btnL.btnOrangeW");

    public void fillQty(String q){
        WebDriverWait w = new WebDriverWait(driver,3);
        w.until(ExpectedConditions.presenceOfElementLocated(qtyField));
       driver.findElement(qtyField).clear();
       driver.findElement(qtyField).sendKeys(q);
    }
    public void clickTambahKeranjang(){
        driver.findElement(btnTambahKeranjang).click();
    }

}
