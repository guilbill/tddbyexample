package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class Money {
    protected int amount;

    public Money(int i) {
        amount = i;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sameAmount = (amount == ((Money) obj).amount);
        boolean sameCurrency = getClass().equals(obj.getClass());
        return sameAmount && sameCurrency;
    }

    public static Money dollar(int i) {
        return new Dollar(i);
    }

    public static Money franc(int i) {
        return new Franc(i);
    }

    public abstract Money time(int i);
}
