package com.careerdevs.airplanefactory;

public class Airplane {
    // passengers (int)
    // maxSpeed (float)
    // idCharacter (char)
    // airLineName (String)

    // fields
    public int passengers;
    public float maxSpeed;
    public char idCharacter;
    public String airLineName;

    //constructor/s
    public Airplane(int passengers, float maxSpeed, char idCharacter, String airLineName) {
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
        this.idCharacter = idCharacter;
        this.airLineName = airLineName;
    }
    // Getters/Setters

}
