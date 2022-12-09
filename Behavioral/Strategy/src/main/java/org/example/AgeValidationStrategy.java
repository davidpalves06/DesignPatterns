package org.example;

public class AgeValidationStrategy implements ValidationStrategy{
    @Override
    public boolean validate(User user) {
        return (user.getAge() >= 18);
    }
}
