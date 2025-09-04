package br.com.mariojp.solid.ocp;

public class Partner implements politica{

    @Override
    public double apply(double amount) {
       return amount * 0.88;
    }
    
}
