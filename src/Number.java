public class Number extends ArithmeticOperation{
    public  int value;
    public Number(int value){
        this.value = value;
    }
    @Override
    void evaluate() {
        System.out.println(this.value);
    }
}
