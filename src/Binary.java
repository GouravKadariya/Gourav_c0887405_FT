abstract class Binary extends ArithmeticOperation{
    public ArithmeticOperation left;
    public ArithmeticOperation right;
    public Binary(ArithmeticOperation left, ArithmeticOperation right){
        this.left = left;
        this.right = right;
    }

}


class Product extends Binary{
    public Product(ArithmeticOperation left, ArithmeticOperation right){
        super(left, right);
    }
    @Override
    int evaluate() {
        return left.evaluate() * right.evaluate();

}



class Sum extends Binary {
    public Sum(ArithmeticOperation left, ArithmeticOperation right) {
        super(left, right);
    }

    @Override
    int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
