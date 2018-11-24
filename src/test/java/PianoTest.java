import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Classical", "Yamaha", 1200.00, 2500.00, 88);
    }

    @Test
    public void getPrices(){
        assertEquals(1200, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void calculateMarkup(){
        assertEquals(1300, piano.calculateMarkup(), 0.01);
    }

//    @Test
//    public void
}
