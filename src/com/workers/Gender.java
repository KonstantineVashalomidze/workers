package com.workers;

public enum Gender{

    MALE("მამრობითი"),
    FEMALE("მდედრობითი");

    private String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

}