package org.example;

public class Chinelo extends Produto{
    public Chinelo(double valor,String brand) {
        super.setValor(valor);
        super.setBrand(brand);
    }

    @Override
    public Double getPrice() {
        return super.getValor();
    }
}
