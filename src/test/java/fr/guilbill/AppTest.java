package fr.guilbill;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void multiplictionTest() {
        Dollar five = new Dollar(5);
        Dollar result = five.time(2);
        assertEquals(10, result.amount);
        result = five.time(3);
        assertEquals(15, result.amount);
    }
}
