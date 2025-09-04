package br.com.mariojp.solid.ocp;

public class DiscountCalculator {
   private politica politica;

   public DiscountCalculator(politica politica){
    this.politica = politica;
   }
   public double apply (double amount, CustomerType regular) {
    return politica.apply(amount);
   }
}
