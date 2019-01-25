package com.example.punotes;

public class Student {
    private String name;
    private int logoID;

    public Student(String name, int logoID) {
        this.name = name;
        this.logoID = logoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogoID() {
        return logoID;
    }

    public void setLogoID(int logoID) {
        this.logoID = logoID;
    }
}
