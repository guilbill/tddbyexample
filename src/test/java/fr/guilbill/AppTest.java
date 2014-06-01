package fr.guilbill;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void equalityTest(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
