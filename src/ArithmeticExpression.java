public abstract class ArithmeticExpression {
    private int value;

    public ArithmeticExpression(int value) {
        this.value = value;
    }

    abstract public int evaluate();

    public int getValue() {
        return value;
    }

}
