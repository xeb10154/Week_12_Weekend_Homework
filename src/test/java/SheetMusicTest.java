import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Classical", 5, 12.5);
    }

    @Test
    public void getBuyPrice(){
        assertEquals(5, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void calculateMarkup(){
        assertEquals(7.5, sheetMusic.calculateMarkup(), 0.01);
    }

}
