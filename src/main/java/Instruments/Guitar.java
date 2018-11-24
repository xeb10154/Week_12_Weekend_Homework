package Instruments;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(String type, String brand, double buyPrice, double sellPrice, int strings) {
        super(type, brand, buyPrice, sellPrice);
        this.strings = strings;
    }

    public String sound(Instrument instrument) {
        return "Ping";
    }

    public int getStrings() {
        return strings;
    }
}