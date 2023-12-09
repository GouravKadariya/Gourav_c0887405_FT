abstract class Binary extends ArithmeticOperation{
    abstract void evaluate();
}


class Product extends Binary{
    @Override
    void evaluate() {
        System.out.println("test");
    }

}



class Sum extends Binary{
    @Override
    void evaluate() {
        System.out.println("test");
    }
}
