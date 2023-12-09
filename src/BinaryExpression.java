public abstract class BinaryExpression extends ArithmeticExpression {
    private int value;
    protected ArithmeticExpression left;
    protected ArithmeticExpression right;

    public BinaryExpression(int value, ArithmeticExpression left, ArithmeticExpression right) {
        super(value);
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
