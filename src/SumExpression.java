public class SumExpression extends BinaryExpression {
    public SumExpression(int value, ArithmeticExpression left, ArithmeticExpression right) {
        super(value, left, right);
    }


    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

}
