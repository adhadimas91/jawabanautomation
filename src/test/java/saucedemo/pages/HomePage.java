package saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By mainPopBanner =  By.id("mainPopBanner");
    private By btnClosePopBanner = By.className("closeBtnMainPromo");
    private By formSearch =  By.id("AKCKwd");
    private By btnSearch = By.className("btn-search");


    public void clickCloseModal(){
        WebElement element = driver.findElement(mainPopBanner);
        if (element.isDisplayed()){
            driver.findElement(btnClosePopBanner).click();
        }
    }

    public void fillSearch(String search){
        driver.findElement(formSearch).sendKeys(search);
    }
    public void clickBtnSearch(){
        driver.findElement(btnSearch).click();
    }
}