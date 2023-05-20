package com.workers;

public enum Profession{
    PROGRAMMER(600.00),
    SINGER(1000.00),
    ACTOR(300.0),
    SPORTSMAN(2000.0);

    private double averageSalary;


    Profession(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public double getAverageSalary(){
        return this.averageSalary;
    }
}
