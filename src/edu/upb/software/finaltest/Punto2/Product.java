package edu.upb.software.finaltest.Punto2;

public class Product {
    private String producto;
    private int stock;
    private int precio;
    private String categoria;

    public Product(String producto, int stock, int precio, String categoria) {
        this.producto = producto;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double valor(){
        return stock*precio;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producto='" + producto + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
