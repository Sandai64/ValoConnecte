package fr.esgi.scem.veloconnecte.business;

import java.util.Random;

public class BikeConfig
{
    // Needed for POC and time constraints
    private Random random = new Random();

    /** Wheel radius in cm, floating-point. */
    private float wheelRadius;

    public BikeConfig(float wheelRadius)
    {
        this.wheelRadius = wheelRadius;
    }

    public float getWheelRadius() { return this.wheelRadius; }

    public int getWheelRpm()
    {
        return this.random.nextInt(300);
    }

    public void setWheelRadius(float wheelRadius) { this.wheelRadius = wheelRadius; }
}
