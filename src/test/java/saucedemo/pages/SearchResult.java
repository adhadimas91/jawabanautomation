package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResult {

    public WebDriver driver;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }
    private By sortProdukTerlaris =  By.cssSelector("[code=SS]");

    public void clickProductTerlaris() {
        driver.findElement(sortProdukTerlaris).click();
    }

}
