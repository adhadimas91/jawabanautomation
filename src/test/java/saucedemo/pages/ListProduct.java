package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListProduct {

    public WebDriver driver;

    public ListProduct(WebDriver driver) {
        this.driver = driver;
    }

    public By firstProduct = By.cssSelector("li#prod_28911164");

    public void clickProdukPertama(){
        driver.findElement(firstProduct).click();
    }
}
