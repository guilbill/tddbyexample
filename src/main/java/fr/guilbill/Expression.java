package fr.guilbill;

/**
 * Created with IntelliJ IDEA.
 * User: guillaume
 * Date: 03/06/14
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
public class Expression {
    public Expression leftOperand;
    public Expression rightOperand;
    public String operator;

    public Expression(){

    }

    public Expression(Expression leftOperand, Expression rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }
}
