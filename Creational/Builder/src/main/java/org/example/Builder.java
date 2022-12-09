package org.example;

public interface Builder {
    void setSize(PizzaSize size);
    void setCheese();
    void setPepperoni();
    void setTomato();
    void setMushrooms();

    Pizza makePizza();
}
