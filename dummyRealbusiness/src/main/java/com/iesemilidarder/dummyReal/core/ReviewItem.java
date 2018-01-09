package com.iesemilidarder.dummyReal.core;

public class ReviewItem extends DBObject {
    private int id;
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {

        return id;
    }


    protected void beforeSave() {
        doLog("todo!");

    }
}
