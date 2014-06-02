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
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money)obj;
        boolean sameAmount = (this.amount == money.amount);
        boolean sameCurrency = (this.currency == money.currency());
        return sameAmount && sameCurrency;
    }

    public static Money dollar(int i) {
        return new Dollar(i, "USD");
    }

    public static Money franc(int i) {
        return new Franc(i, "CHF");
    }

    public String currency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    public Money time(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
