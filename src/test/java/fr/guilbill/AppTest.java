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
    public void dollarMultiplictionTest() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.time(2));
        assertEquals(new Dollar(15), five.time(3));
    }

    @Test
    public void francMultiplictionTest() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.time(2));
        assertEquals(new Franc(15), five.time(3));
    }

    @Test
    public void equalityTest(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}
