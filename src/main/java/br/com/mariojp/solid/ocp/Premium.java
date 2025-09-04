package br.com.mariojp.solid.ocp;

public class Premium  implements politica{

    @Override
    public double apply(double amount) {
       return amount * 0.90;
    }
    
}
