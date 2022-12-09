package org.example;

public class Pizza {
    private PizzaSize size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean tomato;
    private boolean mushrooms;

    public Pizza() {
        this.size = PizzaSize.INDIVIDUAL;
        this.cheese = false;
        this.pepperoni = false;
        this.tomato = false;
        this.mushrooms = false;
    }

    public PizzaSize getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", tomato=" + tomato +
                ", mushrooms=" + mushrooms +
                '}';
    }
}
