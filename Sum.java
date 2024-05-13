package br.com.calculator;

public class Sum extends Numbers {


    public Sum() {
        super();
    }


    public double displaysum() {
       double added = inputnum1() + inputnum2();
        System.out.println(added);
       return added;


    }

}
