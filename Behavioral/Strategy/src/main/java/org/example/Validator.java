package org.example;

public class Validator {
    private ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validateUser(User user) {
        return strategy.validate(user);
    }
}
