package saucedemo.tests;

import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import saucedemo.data.UserData;
import saucedemo.pages.*;
import saucedemo.webdriverinit.WebDriverInit;

public class BuyProductTests extends WebDriverInit {

    @Test
    @Description(value = "User melakukan pencarian komputer lalu user membeli produk pertama yang di temukan")
    public void buyProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCloseModal();
        homePage.fillSearch("Komputer");
        homePage.clickBtnSearch();

        SearchResult searchResult = new SearchResult(driver);
        searchResult.clickProductTerlaris();

        ListProduct listProduct = new ListProduct(driver);
        boolean pp = driver.findElement(listProduct.firstProduct).isDisplayed();
        Assert.assertTrue(pp);
        ListProduct listProduct2 = new ListProduct(driver);
        listProduct2.clickProdukPertama();

        ProductDetail productDetail = new ProductDetail(driver);
        productDetail.fillQty("3");
        productDetail.clickTambahKeranjang();

        ModalConfirmation modalConfirmation = new ModalConfirmation(driver);
        modalConfirmation.clickYes();

        Cart cart = new Cart(driver);
        cart.clickUbahKurir();

        driver.switchTo().frame("ifrLayer");
        ModalConfirmation modalConfirmation2 = new ModalConfirmation(driver);
        modalConfirmation2.clickBatal();

        driver.switchTo().defaultContent();

        cart.clickHapusCart();

        ModalConfirmation modalConfirmation3 = new ModalConfirmation(driver);
        modalConfirmation3.clickOK();


        Cart cart2 = new Cart(driver);
        String empty_text = driver.findElement(cart2.textEmptyCart).getText();
        Assert.assertEquals("Tidak ada produk di Shopping Cart.",empty_text);
    }

}