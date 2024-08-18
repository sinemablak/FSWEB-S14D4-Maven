package org.example.model;

public class Coke extends ProductForSale{
    private int volumeInMl;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    public int getVolumeInMl(){
        return volumeInMl;
    }

    @Override
    public void showDetails() {
        System.out.println("Volume: " + volumeInMl + "ml");
    }
}
