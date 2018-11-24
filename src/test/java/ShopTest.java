import Accessories.SheetMusic;
import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ShopTest {

    Shop shop;
    SheetMusic sheetMusic;
    Guitar guitar;
    Piano piano;

    @Before
    public void setUp() {
        shop = new Shop();
        sheetMusic = new SheetMusic("Classical", 3, 10.5);
        piano = new Piano("Classical", "Yamaha", 1200.00, 2500.00, 88);
        guitar = new Guitar("Acoustic", "Yamaha", 100.00, 250.00, 6);
    }

    @Test
    public void getCollection() {
        assertEquals(0, shop.getCollectionSize());
    }

    @Test
    public void addToCollection(){
        shop.add(sheetMusic);
        assertEquals(1, shop.getCollectionSize());
    }

    @Test
    public void getInstanceOfAccessories(){
        assert(sheetMusic instanceof ISell);
    }

    @Test
    public void getInstanceOfInstrument(){
        assert(guitar instanceof ISell);
    }

    @Test
    public void removeItems(){
        shop.add(sheetMusic);
        shop.add(guitar);
        shop.remove(sheetMusic);

        ArrayList<ISell> collectionList = shop.getCollectionArrayList();

        assertEquals(1, shop.getCollectionSize());
        assertSame(collectionList.get(0), guitar);
    }

    // Extension

    @Test
    public void calculatePotentialStockProfit(){
        shop.add(sheetMusic);
        shop.add(guitar);
        shop.add(piano);

        ArrayList<ISell> stock = shop.getCollectionArrayList();

        double totalProfit = 0;
        for(ISell item:stock){
            totalProfit += item.calculateMarkup();
        }

        assertEquals(1457.5, totalProfit, 0.01);
    }
}
