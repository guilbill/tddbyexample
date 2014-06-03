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
            return ((Money)sum);
        }
        Money leftOperand = evaluate(sum.leftOperand, currency);
        Money rightOperand = evaluate(sum.rightOperand, currency);

        return new Money(leftOperand.amount+rightOperand.amount,currency);
    }
}
