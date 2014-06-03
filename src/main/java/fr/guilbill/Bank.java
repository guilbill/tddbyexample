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

    public Money evaluate(Expression sum, String toCurrency) {
        if (sum.getClass().equals(Money.class)) {
            Money money = (Money) sum;
            String fromCurrency = money.currency;
            money.convertToCurrency(fromCurrency, toCurrency, this);
            return money;
        }
        Money leftOperand = evaluate(sum.leftOperand, toCurrency);
        Money rightOperand = evaluate(sum.rightOperand, toCurrency);

        return new Money(leftOperand.amount + rightOperand.amount, toCurrency);
    }

    public double rate(String fromCurrency, String toCurrency) {
        return rates.get(fromCurrency + " => " + toCurrency);
    }
}
