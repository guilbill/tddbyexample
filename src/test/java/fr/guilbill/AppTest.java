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
    public void equalityTest() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition() {
        Expression sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Bank.evaluate(sum, "USD"), Money.dollar(10));
        sum = Money.franc(6).plus(Money.franc(6));
        assertEquals(Bank.evaluate(sum, "CHF"), Money.franc(12));
    }

    @Test
    public void plusExpressionWellFormed() {
        Expression sum = Money.dollar(5).plus(Money.dollar(6));
        assertEquals(Money.dollar(5), sum.leftOperand);
        assertEquals(Money.dollar(6), sum.rightOperand);
        assertEquals("SUM", sum.operator);
    }

    @Test
    public void evalDifferentCurrencies(){
        Expression sum = Money.franc(2);
        assertEquals(Money.dollar(1), Bank.evaluate(sum,"USD"));
    }
}
