package org.example;

public class Euro50Dispenser extends CurrencyDispenser{
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50€ note");
            if(remainder !=0) this.getNextDispenser().dispense(new Currency(remainder));
        }else{
            this.getNextDispenser().dispense(currency);
        }
    }
}
