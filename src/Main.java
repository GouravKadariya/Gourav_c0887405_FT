public class Main {

    public static void main(String[] args) {

        // sample of sum expression
        ArithmeticExpression sumExpression = new SumExpression(0, new Number(5), new ProductExpression(0, new Number(4), new Number(9)));
        System.out.println(sumExpression + " = " + sumExpression.evaluate());

        ArithmeticExpression moduloExpression = new ModuloExpression(0, new Number(10), new Number(3));
        System.out.println(moduloExpression + " = " + moduloExpression.evaluate());
    }
}
