package org.example;

import java.time.LocalDate;

public class EnglishHelloWorld extends HelloWorldTemplate{
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    @Override
    public void sayDate() {
        System.out.println("Today's date is " + LocalDate.now());
    }
}
