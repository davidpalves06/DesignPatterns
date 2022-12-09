package org.example;

public class CountryValidationStrategy implements ValidationStrategy{
    @Override
    public boolean validate(User user) {
        return (user.getCountry().compareTo("Portugal") == 0);
    }
}
