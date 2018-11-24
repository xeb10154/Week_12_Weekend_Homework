package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String type;
    private String brand;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String brand, double buyPrice, double sellPrice) {
        this.type = type;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}
