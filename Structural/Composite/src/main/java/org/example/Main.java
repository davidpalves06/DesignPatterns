package org.example;

public class Main {
    public static void main(String[] args) {
        Box encomenda = new Box();
        Box subcaixa = new Box();
        Chinelo havaiana = new Chinelo(9.99,"Havaiana");
        Sapatilha nike = new Sapatilha(30d,"Nike");
        Sapatilha adidas = new Sapatilha(20d,"Adidas");

        encomenda.add(havaiana);
        subcaixa.add(nike);
        subcaixa.add(adidas);
        encomenda.add(subcaixa);

        System.out.println("O preço total da encomenda é " + encomenda.getPrice());
    }
}