package org.example;

public class Main {
    public static void main(String[] args) {
        Builder builder = new PizzaBuilder();
        PizzariaClient diretor = new PizzariaClient(builder);
        diretor.askPizza();
        Pizza pizza = builder.makePizza();
        System.out.println(pizza);
    }
}