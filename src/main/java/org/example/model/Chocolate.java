package org.example.model;

public class Chocolate extends  ProductForSale{
    private int cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }
    public int getCocoaPercentage(){
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {


    }
}
