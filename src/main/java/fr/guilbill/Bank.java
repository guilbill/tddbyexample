package fr.guilbill;

import java.util.HashMap;
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

    public Money evaluate(Expression sum, String toCurrency) {
        if (sum.getClass().equals(Money.class)) {
            String fromCurrency = ((Money) sum).currency;
            convertToCurrency((Money) sum, fromCurrency, toCurrency);

            return ((Money) sum);
        }
        Money leftOperand = evaluate(sum.leftOperand, toCurrency);
        Money rightOperand = evaluate(sum.rightOperand, toCurrency);

        return new Money(leftOperand.amount + rightOperand.amount, toCurrency);
    }

    private void convertToCurrency(Money sum, String fromCurrency, String toCurrency) {
        double rate = 1;
        if (!(fromCurrency.equals(toCurrency))){
            rate = rates.get(fromCurrency + " => " + toCurrency);
        }
        sum.amount = sum.amount / rate;
        sum.currency = toCurrency;
    }
}
