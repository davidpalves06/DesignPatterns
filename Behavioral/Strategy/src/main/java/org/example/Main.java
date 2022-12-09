package org.example;

public class Main {
    public static void main(String[] args) {
        ValidationStrategy defaultStrategy = new DefaultValidationStrategy();
        ValidationStrategy ageStrategy = new AgeValidationStrategy();
        ValidationStrategy countryStrategy = new CountryValidationStrategy();

        Validator defaultValidator = new Validator(defaultStrategy);
        Validator ageValidator = new Validator(ageStrategy);
        Validator countryValidator = new Validator(countryStrategy);

        User david = new User("David",21,"USA");
        User tone = new User("Tone",15,"Portugal");

        System.out.println("Validating user david...");
        System.out.println("Default Validator -> " + defaultValidator.validateUser(david));
        System.out.println("Age Validator -> " + ageValidator.validateUser(david));
        System.out.println("Country Validator -> " + countryValidator.validateUser(david));

        System.out.println("Validating user tone...");
        System.out.println("Default Validator -> " + defaultValidator.validateUser(tone));
        System.out.println("Age Validator -> " + ageValidator.validateUser(tone));
        System.out.println("Country Validator -> " + countryValidator.validateUser(tone));
    }
}