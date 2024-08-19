package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("milk", 10.0, "milk chocolate" ),
                new Coke("cola", 20, "cola"),
                new Bread("baguette", 10, "baguette bread")
        };

        listProducts(products);

        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i =0; i< products.length; i++) {
            products[i].showDetails();
        }

    }
}