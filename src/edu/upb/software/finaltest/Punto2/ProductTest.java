package edu.upb.software.finaltest.Punto2;

import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product producto=new Product("Rexona",56,20000,"Higiene");


    @org.junit.jupiter.api.Test
    void valor() {
        assertEquals(1120000.0,producto.valor());
    }
}