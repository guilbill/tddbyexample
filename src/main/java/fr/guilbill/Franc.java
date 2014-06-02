package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    public Money time(int multiplier) {
        return new Franc(amount * multiplier, "CHF");
    }

}
