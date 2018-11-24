package Instruments;

public class Piano extends Instrument {

    private int keys;

    public Piano(String type, String brand, double buyPrice, double sellPrice, int keys) {
        super(type, brand, buyPrice, sellPrice);
        this.keys = keys;
    }

    public String sound(Instrument instrument) {
        return "Ding";
    }

}
