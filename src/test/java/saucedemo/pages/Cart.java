package saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart {

    public WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    private By btnChangeKurir = By.xpath("//a[text()='Ubah Kurir']");
    private By btnHapusCart = By.xpath("//td/a[text()='Hapus']");

    public By textEmptyCart = By.xpath("//*[text()='Tidak ada produk di Shopping Cart.']");

    public void clickUbahKurir(){
        driver.findElement(btnChangeKurir).click();
    }
    public void clickHapusCart(){
        driver.findElement(btnHapusCart).click();
    }
}