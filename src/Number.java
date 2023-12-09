public class Number extends ArithmeticExpression {
    public Number(int value) {
        super(value);
    }


    @Override
    public String toString() {
        return "" + getValue();
    }

    @Override
    public int evaluate() {
        return getValue();
    }

}
