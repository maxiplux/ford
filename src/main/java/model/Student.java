package model;

import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

public class Student {

    private  String name;
    private  Integer roomNumber;

    public Student(String name, Integer roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}