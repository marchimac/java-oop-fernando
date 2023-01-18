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

        for (Product product : products) {  // for each
            if (product.getUnitCost() != null)
                count++;
        }
        return count;
    }

    public double avgPrices (Product[] products) {
        double totalPrice = this.sumPrices(products);
        int count = this.count(products);

        if (count <= 0)
            return 0d;

        return totalPrice / count;
    }

    public double maxPrice (Product[] products) {
        double maxPrice = 0d;

        for (Product product : products){

            if (product.getUnitCost() != null && product.getUnitCost() > maxPrice)
                maxPrice = product.getUnitCost();
        }

        return maxPrice;
    }

    public double minPrice (Product[] products) {
        double minPrice = this.maxPrice(products);

        for (Product product : products){

            if (product.getUnitCost() == null)
                continue;

            minPrice = Math.min(minPrice, product.getUnitCost());

        }

        return minPrice;}

}
