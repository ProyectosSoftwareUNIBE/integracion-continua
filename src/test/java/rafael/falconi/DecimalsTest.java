package rafael.falconi;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalsTest {

    private Decimals decimals;

    @Test
    public void transformDecilmalsToUnitrsTest() {
        this.decimals = new Decimals(0.1, 0.05);
        assertEquals(15, this.decimals.transformDecilmalsToUnitrs(), 0.01);
    }

    @Test
    public void substractTest() {
        this.decimals = new Decimals(0.1, 0.05);
        assertEquals(0.05, this.decimals.subtract(), 0.01);
    }
}