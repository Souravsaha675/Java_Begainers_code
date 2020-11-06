package com.Composition;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall12;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall12, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall12 = wall12;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    /*public void getLamp(){
        lamp.turnOn();
    }*/

    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
