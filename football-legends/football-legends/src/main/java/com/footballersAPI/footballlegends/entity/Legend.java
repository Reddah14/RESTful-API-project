package com.footballersAPI.footballlegends.entity;

import java.util.List;

public class Legend {
    private int id;
    private String name;
    private String Nationality;
    private int yearOfBirth;
    private List awards;

    public Legend(int id, String name, String nationality, int yearOfBirth) {
        this.id = id;
        this.name = name;
        Nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        //this.awards = awards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List getAwards() {
        return awards;
    }

    public void setAwards(List awards) {
        this.awards = awards;
    }
}
