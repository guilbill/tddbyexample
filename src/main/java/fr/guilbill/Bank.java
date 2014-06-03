package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 09:54
 * To change this template use File | Settings | File Templates.
 */
public class Bank {

    private static String chfCurrency = "CHF";
    private static String usdCurrency = "USD";

    public static Money evaluate(Expression sum, String toCurrency) {
        if (sum.getClass().equals(Money.class)) {
            String fromCurrency = ((Money) sum).currency;
            convertToCurrency((Money) sum, fromCurrency, toCurrency);

            return ((Money) sum);
        }
        Money leftOperand = evaluate(sum.leftOperand, toCurrency);
        Money rightOperand = evaluate(sum.rightOperand, toCurrency);

        return new Money(leftOperand.amount + rightOperand.amount, toCurrency);
    }

    private static void convertToCurrency(Money sum, String fromCurrency, String toCurrency) {
        double rate;
        if (fromCurrency.equals(chfCurrency) && toCurrency.equals(usdCurrency)) {
            rate = 2;
            sum.amount = sum.amount / rate;
            sum.currency = toCurrency;
        }
        if (fromCurrency.equals(usdCurrency) && toCurrency.equals(chfCurrency)) {
            rate = 0.5;
            sum.amount = sum.amount / rate;
            sum.currency = toCurrency;
        }
    }
}
