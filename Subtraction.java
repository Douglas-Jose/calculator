package br.com.calculator;

public class Subtraction extends Numbers{

    public Subtraction() {
        super();
    }

    public double displaysub(){
        double subtracted = inputnum1() - inputnum2();
        System.out.println(subtracted);
        return subtracted;
    }
}


