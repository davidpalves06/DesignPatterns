package org.example;

public class DefaultValidationStrategy implements ValidationStrategy{
    @Override
    public boolean validate(User user) {
        return true;
    }
}
