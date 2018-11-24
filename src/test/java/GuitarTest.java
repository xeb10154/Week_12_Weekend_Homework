import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar("Acoustic", "Yamaha", 100.00, 250.00, 6);
    }

    @Test
    public void getPrices() {
        assertEquals(100, guitar.getBuyPrice(), 0.01);
    }


    @Test
    public void testCalculateMarkup(){
        assertEquals(150, guitar.calculateMarkup(), 0.01);
    }


}
