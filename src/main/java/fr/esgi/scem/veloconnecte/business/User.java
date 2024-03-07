package fr.esgi.scem.veloconnecte.business;

import fr.esgi.scem.veloconnecte.enums.Gender;

public class User
{
    private int    id;
    private int    birthYear;
    private double weight;
    private double height;
    private String phoneNumber;
    private String name;
    private String email;
    private Gender gender;

    public User(int id, int birthYear, double weight, double height, String phoneNumber, String name, String email, Gender gender)
    {
        this.id          = id;
        this.birthYear   = birthYear;
        this.weight      = weight;
        this.height      = height;
        this.phoneNumber = phoneNumber;
        this.name        = name;
        this.email       = email;
        this.gender      = gender;
    }

    public int    getID()          { return this.id; }
    public int    getBirthYear()   { return this.birthYear; }
    public double getWeight()      { return this.weight; }
    public double getHeight()      { return this.height; }
    public String getPhoneNumber() { return this.phoneNumber; }
    public String getName()        { return this.name; }
    public String getEmail()       { return this.email; }
    public Gender getGender()      { return this.gender; }

    public void setID(int id)                      { this.id = id; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setBirthYear(int birthYear)        { this.birthYear = birthYear; }
    public void setWeight(float height)            { this.height = height; }
    public void setHeight(float weight)            { this.weight = weight; }
    public void setName(String name)               { this.name = name; }
    public void setEmail(String email)             { this.email = email; }
    public void setGender(Gender gender)           { this.gender = gender; }
}
