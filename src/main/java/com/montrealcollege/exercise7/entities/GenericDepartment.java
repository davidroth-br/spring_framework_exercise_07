package com.montrealcollege.exercise7.entities;

public class GenericDepartment implements Department{
    private String name;

    public GenericDepartment(String nm) {
        this.name = nm;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public String toString() {
        return "GenericDepartment{" +
                "name='" + name + '\'' +
                '}';
    }
}
