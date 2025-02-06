package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoScreens extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartBtn;
    @AndroidFindBy(xpath = "///androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays list of selected products\"]")
    private WebElement CartItems;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement nombreProductoCarrito;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement cantidadProductoCarrito;


    public void openCart() {
        waitFor(cartBtn).click();
    }
    public boolean carritoTieneProductos() {
        try {

            waitFor(ExpectedConditions.visibilityOf(CartItems));

            // Verifica si hay más de un producto dentro de la lista
            int cantidadDeProductos = CartItems.findElements(By.xpath(".//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/noTV']")).size();
            return cantidadDeProductos > 0;
        } catch (Exception e) {
            return false;
        }
    }



}
