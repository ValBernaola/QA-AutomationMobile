package com.nttdata.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProductoScreens extends PageObject {

    @AndroidFindBy(accessibility = "App logo and name")
    private WebElement title;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private WebElement productList;


    public ProductoScreens(AppiumDriver driver) {
        super(driver);
    }

    public boolean titleVisible(){
        waitFor(ExpectedConditions.visibilityOf(title));
        return title.isDisplayed();

    }

    public boolean validarCargaProductos() {
        waitFor(ExpectedConditions.visibilityOf(productList));
        return waitFor(productList).isDisplayed();
    }

    public void seleccionarProductoPorNombre(String producto) {

        waitFor(productList);
        WebElement productoElemento = productList.findElement(By.xpath(".//android.widget.ImageView[@content-desc='" + producto + "']"));
        waitFor(productoElemento).click();
    }



}
