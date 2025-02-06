package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AgregarProductoSteps;
import com.nttdata.steps.CarritoSteps;
import com.nttdata.steps.ProductoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductoStepsDefs {

    @Steps
    ProductoSteps productoSteps;
    AgregarProductoSteps agregarProductoSteps;
    CarritoSteps carritoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {
       productoSteps.validateTittleDisplay();

    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria(String producto) {
        productoSteps.validateProductLisDisplay();
        productoSteps.validateSeleccionarProductoPorNombre(producto);
    }

    @When("agrego {int} unidades del siguiente producto {string}")
    public void agregarProductoAlCarrito(int unidades, String producto) {
        agregarProductoSteps.AgregarAlCarritoProducto(producto, unidades);
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        carritoSteps.validarCarritoConProductos();
    }


}
