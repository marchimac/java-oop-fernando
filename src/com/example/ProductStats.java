package com.example;

public class ProductStats {

    public double sumPrices(Product[] products) {

        double sumPrice = 0d;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getUnitCost() != null)
                sumPrice += products[i].getUnitCost();
        }
        return sumPrice;
    }

    public int count(Product[] products) {

        int count = 0;

        for (Product product : products) {
            if (product.getUnitCost() != null)
                count++;
        }
        return count;
    }

}
