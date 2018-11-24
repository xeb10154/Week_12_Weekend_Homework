import Accessories.SheetMusic;
import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> collection;

    public Shop() {
        this.collection = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getCollectionArrayList(){
        return this.collection;
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public void add(ISell sellable) {
        this.collection.add(sellable);
    }

    public void remove(ISell sellable) {
        this.collection.remove(sellable);
    }
}
