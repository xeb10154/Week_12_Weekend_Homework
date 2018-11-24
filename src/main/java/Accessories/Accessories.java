package Accessories;

import Behaviours.ISell;

public abstract class Accessories implements ISell {

    private String type;
    private double buyPrice;
    private double sellPrice;

    public Accessories(String type, double buyPrice, double sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
