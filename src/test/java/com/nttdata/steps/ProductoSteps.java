package com.nttdata.steps;

import com.nttdata.screens.ProductoScreens;
import org.junit.Assert;

public class ProductoSteps {
    ProductoScreens productoScreens;

    public ProductoSteps(ProductoScreens productoScreens) {
        this.productoScreens = productoScreens;
    }


    public void validateTittleDisplay (){
      productoScreens.titleVisible();

    }
    public void validateProductLisDisplay (){
       productoScreens.validarCargaProductos();
    }

   public void validateSeleccionarProductoPorNombre(String producto){
        productoScreens.seleccionarProductoPorNombre( producto);
   }
}
