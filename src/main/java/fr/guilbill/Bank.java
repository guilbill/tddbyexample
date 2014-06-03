package fr.guilbill;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 09:54
 * To change this template use File | Settings | File Templates.
 */
public class Bank {

    private Hashtable<String, Double> rates;

    {
        rates = new Hashtable<String, Double>() {{
            put("CHF => USD", 2.0);
            put("USD => CHF", 0.5);
        }};
    }

    public double rate(String fromCurrency, String toCurrency) {
        return rates.get(fromCurrency + " => " + toCurrency);
    }
}
