package fr.esgi.scem.veloconnecte.business;

import java.util.Random;

public class BikeConfig
{
    // Don't worry bro, it's a POC 👌
    private Random random = new Random();

    /** Wheel radius in cm, floating-point. */
    private float wheelRadius;

    private int wheelRpm;

    public BikeConfig(float wheelRadius, int wheelRpm)
    {
        this.wheelRadius = wheelRadius;
    }

    public float getWheelRadius() { return this.wheelRadius; }

    public float getWheelRpm()
    {
        return this.random.nextInt(300);
    }

    public void setWheelRadius(float wheelRadius) { this.wheelRadius = wheelRadius; }
    public void setWheelRpm(int wheelRpm) { this.wheelRpm = wheelRpm; }
}
