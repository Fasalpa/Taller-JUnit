package com.generation;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void precioProductoTest() {
        Producto precio = new Producto("Empanada", 2.500, 15);
        assertEquals(2.500, precio.getPrecio());
    }

    @Test
    void stockDisponible() {
        Producto stock = new Producto("Empanada", 2.500, 15);
        assertTrue(stock.estaDisponible());
    }

    @Test
    void stockNodisponible() {
        Producto stock = new Producto("Empanada", 2.500, 0);
        assertFalse(stock.estaDisponible());
    }

    @Test
    void disminucion() {
        Producto stock = new Producto("Empanada", 2.500, 10);
        stock.reducirStock(3);
        assertEquals(7, stock.getStock());

    }


    @Test
    void disminucionError() {
        Producto stock = new Producto("Empanada", 2.500, 4);
        assertThrows(IllegalArgumentException.class, () -> stock.reducirStock(10));
//Este aún no lo comprendo del todo
    }

    @Test
    void crearProductoError() {
        assertThrows(IllegalArgumentException.class, () -> new Producto("Empanada", -2.500, 10));
        //Este tampoco
    }


}
