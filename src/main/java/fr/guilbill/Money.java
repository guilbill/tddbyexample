package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public class Money {
    protected int amount;

    public Money(int i) {
        amount = i;
    }

    @Override
    public boolean equals(Object obj) {
        return amount == ((Money) obj).amount;
    }
}
