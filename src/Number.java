public class Number extends ArithmeticOperation{
    public  int value;
    public Number(int value){
        this.value = value;
    }
    @Override
    int evaluate() {
        return this.value;
    }
}
