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
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.time(2));
        assertEquals(Money.dollar(15), five.time(3));
    }

    @Test
    public void francMultiplictionTest() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.time(2));
        assertEquals(Money.franc(15), five.time(3));
    }

    @Test
    public void equalityTest(){
        assertTrue(Money.dollar(5).equals(new Dollar(5)));
        assertFalse(Money.dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
