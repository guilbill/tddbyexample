package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
public class Franc {
    private int amount;

    public Franc(int i) {
        amount = i;
    }

    public Franc time(int i) {
        return new Franc(amount * i);
    }

    @Override
    public boolean equals(Object obj) {
        return amount == ((Franc) obj).amount;
    }
}
