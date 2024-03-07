package fr.esgi.scem.veloconnecte.business;

public class BikeConfig
{
    /** Wheel radius in cm, floating-point. */
    private float wheelRadius;

    private int wheelRpm;

    public BikeConfig(float wheelRadius, int wheelRpm)
    {
        this.wheelRadius = wheelRadius;
        this.wheelRpm    = wheelRpm;
    }

    public float getWheelRadius() { return this.wheelRadius; }
    public float getWheelRpm() { return this.wheelRpm; }

    public void setWheelRadius(float wheelRadius) { this.wheelRadius = wheelRadius; }
    public void setWheelRpm(int wheelRpm) { this.wheelRpm = wheelRpm; }
}
