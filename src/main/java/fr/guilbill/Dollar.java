package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 01/06/14
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class Dollar {
    public int amount;

    public Dollar(int i) {
        amount = i;
    }

    public void time(int i) {
        amount=amount*i;
    }
}
