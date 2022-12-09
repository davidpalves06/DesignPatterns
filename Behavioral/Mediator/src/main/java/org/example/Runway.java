package org.example;

public class Runway implements Command{
    private Mediator mediator;

    public Runway(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.setLandingStatus(true);
    }

    @Override
    public void land()
    {
        System.out.println("Landing permission granted.");
        mediator.setLandingStatus(true);
    }
}
