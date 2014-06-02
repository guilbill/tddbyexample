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
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sameAmount = (amount == ((Money) obj).amount);
        boolean sameCurrency = getClass().equals(obj.getClass());
        return sameAmount && sameCurrency;
    }

    public static Money dollar(int i) {
        return new Dollar(i, "USD");
    }

    public static Money franc(int i) {
        return new Franc(i, "CHF");
    }

    public abstract Money time(int i);

    public String currency() {
        return currency;
    }
}
