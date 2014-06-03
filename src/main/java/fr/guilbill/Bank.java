package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 09:54
 * To change this template use File | Settings | File Templates.
 */
public class Bank {
    public static Money evaluate(Expression sum, String currency) {
        if (sum.getClass().equals(Money.class)){
            if (((Money)sum).currency.equals("CHF") && currency.equals("USD")){
                ((Money)sum).amount = ((Money)sum).amount/2;
                ((Money)sum).currency = "USD";
            }
            if (((Money)sum).currency.equals("USD") && currency.equals("CHF")){
                ((Money)sum).amount = ((Money)sum).amount*2;
                ((Money)sum).currency = "CHF";
            }

            return ((Money)sum);
        }
        Money leftOperand = evaluate(sum.leftOperand, currency);
        Money rightOperand = evaluate(sum.rightOperand, currency);

        return new Money(leftOperand.amount+rightOperand.amount,currency);
    }
}
