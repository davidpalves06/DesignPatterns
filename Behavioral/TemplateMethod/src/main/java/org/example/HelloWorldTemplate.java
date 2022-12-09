package org.example;

public abstract class HelloWorldTemplate {
    //Template method
    public void helloWorld() {
        sayHelloWorld();
        sayDate();
        sayGoodbye();
    }

    // Template methods steps
    public abstract void sayHelloWorld();
    public abstract void sayDate();
    public void sayGoodbye() {
        //Optional hook for subclasses to override
    }
}
