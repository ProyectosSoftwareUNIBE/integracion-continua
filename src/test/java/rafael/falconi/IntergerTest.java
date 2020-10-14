package rafael.falconi;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntergerTest {
    private Interger interger;
    @Test
    public void add() {
        this.interger= new Interger(1,99);
        assertEquals(100,this.interger.add());
    }
}