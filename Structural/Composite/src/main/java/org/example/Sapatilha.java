package org.example;

public class Sapatilha extends Produto{
    public Sapatilha(double valor,String brand) {
        super.setValor(valor);
        super.setBrand(brand);
    }

    @Override
    public Double getPrice() {
        return super.getValor();
    }
}
