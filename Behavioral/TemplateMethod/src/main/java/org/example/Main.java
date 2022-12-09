package org.example;

public class Main {
    public static void main(String[] args) {
        HelloWorldTemplate englishHelloWorldTemplate = new EnglishHelloWorld();
        HelloWorldTemplate portugueseHelloWorldTemplate = new PortugueseHelloWorld();

        englishHelloWorldTemplate.helloWorld();
        portugueseHelloWorldTemplate.helloWorld();
    }
}