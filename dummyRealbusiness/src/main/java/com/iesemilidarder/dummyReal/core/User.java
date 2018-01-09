package com.iesemilidarder.dummyReal.core;

public class User extends DBObject {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void beforeSave() {
        doLog(String.format("Saving %s", this.getClass()));

    }



}
