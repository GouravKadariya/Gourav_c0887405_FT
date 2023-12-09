public class ModuloExpression extends BinaryExpression {
    public ModuloExpression(int value, ArithmeticExpression left, ArithmeticExpression right) {
        super(value, left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() % right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + "%" + right.toString();
    }
}
