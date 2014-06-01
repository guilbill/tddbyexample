package fr.guilbill;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void multiplictionTest(){
        Dollar five = new Dollar(5);
        five.time(2);
        assertEquals(10,five.amount);
    }
}
