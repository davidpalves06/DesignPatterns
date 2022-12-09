package org.example;

public class ATM {
    public static void main(String[] args) {
        Euro50Dispenser euro50Dispenser = new Euro50Dispenser();
        Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
        Euro10Dispenser euro10Dispenser = new Euro10Dispenser();

        euro20Dispenser.setNextDispenser(euro10Dispenser);
        euro50Dispenser.setNextDispenser(euro20Dispenser);

        int amountToDispense = 130;

        ATMCashDispenser cashDispenser = new ATMCashDispenser();
        cashDispenser.setNextDispenser(euro50Dispenser);

        cashDispenser.dispense(new Currency(amountToDispense));
    }
}