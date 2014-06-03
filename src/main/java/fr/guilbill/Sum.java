package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class Sum implements Expression{

    public Expression leftOperand;
    public Expression rightOperand;

    public Sum(Expression rightOperand, Expression leftOperand) {
        this.rightOperand = rightOperand;
        this.leftOperand = leftOperand;
    }

    public Expression evaluate(String toCurrency, Bank bank) {
        Money leftOperand = (Money)this.leftOperand.evaluate(toCurrency, bank);
        Money rightOperand = (Money) this.rightOperand.evaluate(toCurrency, bank);

        return new Money(leftOperand.amount + rightOperand.amount, toCurrency);
    }
}
