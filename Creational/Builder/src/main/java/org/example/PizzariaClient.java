package org.example;

public class PizzariaClient {

    private final Builder builder;

    public PizzariaClient(Builder builder) {
        this.builder = builder;
    }

    public void askPizza() {
        builder.setSize(PizzaSize.FAMILY);
        builder.setCheese();
        builder.setPepperoni();
    }
}
