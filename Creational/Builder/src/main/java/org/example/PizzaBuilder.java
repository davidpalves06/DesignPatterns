package org.example;

public class PizzaBuilder implements Builder{

    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void setSize(PizzaSize size) {
        pizza.setSize(size);
    }

    @Override
    public void setCheese() {
        pizza.setCheese(true);
    }

    @Override
    public void setPepperoni() {
        pizza.setPepperoni(true);
    }

    @Override
    public void setTomato() {
        pizza.setTomato(true);
    }

    @Override
    public void setMushrooms() {
        pizza.setMushrooms(true);
    }

    @Override
    public Pizza makePizza() {
        return pizza;
    }
}
