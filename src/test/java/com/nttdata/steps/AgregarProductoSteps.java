package com.nttdata.steps;

import com.nttdata.screens.AgregarProductoScreens;

public class AgregarProductoSteps {
    AgregarProductoScreens agregarProductoScreens;

    public void AgregarAlCarritoProducto(String producto, int unidades) {
        agregarProductoScreens.ajustarUnidades(unidades);
        agregarProductoScreens.agregarAlCarrito();
    }
}
