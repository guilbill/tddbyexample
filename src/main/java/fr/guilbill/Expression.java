package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
public interface Expression {
    public Expression evaluate(String toCurrency, Bank bank);
}
