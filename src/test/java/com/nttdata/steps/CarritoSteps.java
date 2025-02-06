package com.nttdata.steps;

import com.nttdata.screens.CarritoScreens;

public class CarritoSteps {

    CarritoScreens carritoScreens;


    public void validarCarritoConProductos() {
        boolean carritoConProductos = carritoScreens.carritoTieneProductos();
        if (!carritoConProductos) {
            throw new AssertionError("El carrito está vacío");
        }
    }



}
