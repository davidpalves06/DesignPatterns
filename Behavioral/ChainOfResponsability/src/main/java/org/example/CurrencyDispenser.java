package org.example;

public abstract class CurrencyDispenser {
    private CurrencyDispenser nextDispenser;

    public CurrencyDispenser() {
        nextDispenser = null;
    }

    public CurrencyDispenser getNextDispenser() {
        return nextDispenser;
    }

    public void setNextDispenser(CurrencyDispenser dispenser) {
        nextDispenser = dispenser;
    }

    public void dispense(Currency currency) {
        if (nextDispenser != null) {
            nextDispenser.dispense(currency);
        }
    }
}
