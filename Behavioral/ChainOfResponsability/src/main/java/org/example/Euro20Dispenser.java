package org.example;

public class Euro20Dispenser extends CurrencyDispenser{
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20){
            int num = currency.getAmount()/20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20€ note");
            if(remainder != 0) this.getNextDispenser().dispense(new Currency(remainder));
        }else{
            this.getNextDispenser().dispense(currency);
        }
    }
}
