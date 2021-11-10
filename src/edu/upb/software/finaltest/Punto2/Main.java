package edu.upb.software.finaltest.Punto2;

public class Main {
    public static void main(String[] args) {
        Product producto;

        producto=new Product("Rexona",56,20000,"Higiene");
        System.out.println(producto);

        // producto.setPrecio(50000);

        System.out.println(producto);
        System.out.println(producto.valor());
    }
}
