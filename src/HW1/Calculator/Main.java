package HW1.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator myCalc = Calculator.instance.get();
        int a = myCalc.plus.apply(1, 2);
        myCalc.println.accept(a);
        int b = myCalc.minus.apply(1, 1);
        myCalc.println.accept(b);
        int c = myCalc.devide.apply(a, b);
        myCalc.println.accept(c);

        int d = myCalc.abs.apply(-7);
        myCalc.println.accept(d);

    }

}
