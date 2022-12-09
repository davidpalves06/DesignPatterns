package org.example;

public class Main {
    public static void main(String[] args) {
        String mensagem = "Mensagem";

        Printer printer = new Printer();
        printer.writeMessage(mensagem);

        MessageWriter helloUpperWriter = new UppercaseDecorator(new HelloWorldDecorator(new Printer()));
        helloUpperWriter.writeMessage(mensagem);

        MessageWriter upperHelloWriter = new HelloWorldDecorator(new UppercaseDecorator(new FileWriter()));
        upperHelloWriter.writeMessage(mensagem);

    }
}