package com.example;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("SmartPhone", "iPhone XS", "Apple", 25, 100, 600.0);
        Product product2 = new Product("Portátil", "xj42", "Asus", 12, 26, 800.0);
        Product product3 = new Product("Cafetera", "Essenza", "Nespresso", 5, 31, 430.0);
        Product product4 = new Product("Aspiradora", "J7", "Roomba", 1, 50, 575.0);
        Product product5 = new Product("Hi-Fi", "202-D", "Yamaha", 78, 16, 449.0);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
    }
}
