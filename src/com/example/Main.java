package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("SmartPhone", "iPhone XS", "Apple", 25, 100, 900.0d);
        Product product2 = new Product("Portátil", "xj42", "Asus", 12, 26, 800.0d);
        Product product3 = new Product("Cafetera", "Essenza", "Nespresso", 5, 31, 430.0d);
        Product product4 = new Product("Aspiradora", "J7", "Roomba", 1, 50, 575.0d);
        Product product5 = new Product("Hi-Fi", "202-D", "Yamaha", 78, 16, 449.0d);

        // Array de product
        Product[] products = {product1, product2, product3, product4, product5};

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        System.out.println(Arrays.toString(products));

        // Calcular precio total
        double sumPrice = 0d;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getUnitCost() != null)
                sumPrice += products[i].getUnitCost();
        }

        // Calcular el precio medio del array
        double avgPrice = sumPrice / products.length;

        // Calcular precio máximo
        double maxPrice = 0d;
        for (Product product : products){
                    if (product.getUnitCost() != null && product.getUnitCost() > maxPrice)
                        maxPrice = product.getUnitCost();
        };

        // Imprimir estadísticas
        System.out.println("Precio total de los productos (€): " + sumPrice + "€");
        System.out.println("Precio medio de los productos (€): " + avgPrice + "€");
        System.out.println("Precio medio de los productos (€): " + maxPrice + "€");
    }
}
