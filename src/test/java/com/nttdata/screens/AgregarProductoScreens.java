package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AgregarProductoScreens extends PageObject {

    @AndroidFindBy(accessibility = "Increase item quantity")
    private WebElement quantityInBtn;
    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement addToCartBtn;



    public void ajustarUnidades(int unidades) {
        for (int i = 0; i < unidades - 1; i++) {
            waitFor(quantityInBtn).click();
        }
    }
    public void agregarAlCarrito() {

        waitFor(addToCartBtn).click();
    }


}
