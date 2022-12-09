package org.example;

import java.time.LocalDate;

public class PortugueseHelloWorld extends HelloWorldTemplate{
    @Override
    public void sayHelloWorld() {
        System.out.println("Olá mundo!");
    }

    @Override
    public void sayDate() {
        System.out.println("A data de hoje é " + LocalDate.now());
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Xau! Tenha um bom dia!");
    }
}
