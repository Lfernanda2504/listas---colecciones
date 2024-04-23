package com.aluracurso.referencias.models;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Lapiz", 1.50);
        Producto p2 = p1;
        p2.setPrecio(2.00);
        System.out.println(p1.getPrecio());
    }
}
