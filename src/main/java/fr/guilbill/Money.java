package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public class Money implements Expression {
    protected double amount;
    protected String currency;

    public Money(double amount, String currency) {
        super();
        this.amount = amount;
        this.currency = currency;

    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        boolean sameAmount = (this.amount == money.amount);
        boolean sameCurrency = (this.currency.equals(money.currency()));
        return sameAmount && sameCurrency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
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

    public Sum plus(Money moneyToAdd) {
        return new Sum(moneyToAdd, this);
    }

    public Money evaluate(String toCurrency, Bank bank) {
        double rate = 1;
        if (!(this.currency.equals(toCurrency))) {
            rate = bank.rate(this.currency, toCurrency);
        }
        amount = amount / rate;
        currency = toCurrency;
        return this;
    }
}
