package org.example;

public class Euro10Dispenser extends CurrencyDispenser{
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10€ note");
            if(remainder !=0) this.getNextDispenser().dispense(new Currency(remainder));
        }else{
            this.getNextDispenser().dispense(currency);
        }
    }
}
