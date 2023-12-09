public class ProductExpression extends BinaryExpression {
    public ProductExpression(int value,ArithmeticExpression left, ArithmeticExpression right) {
        super(value,left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return String.format("%s * %s", left.toString(), right.toString());
    }
}
