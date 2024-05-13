package br.com.calculator;

public class Multiplication extends Numbers {

    public Multiplication() {
        super();
    }
    public double displaymult(){
        double multiplied = inputnum1() * inputnum2();
        System.out.println(multiplied);
        return multiplied;
    }
}
