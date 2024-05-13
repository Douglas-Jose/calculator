package br.com.calculator;

public class Division extends Numbers{

    public Division() {
        super();
    }

    public double displaydiv(){
        double divided = inputnum1() / inputnum2();
        System.out.println(divided);
        return divided;
    }
}
