package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class Dollar extends Money {

    public Dollar(int i) {
        super(i);
        this.currency = "USD";
    }

    public Money time(int i) {
        return new Dollar(amount * i);
    }

}
