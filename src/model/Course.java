/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sanya
 */
public class Course {
    private int id;
    private String name;
    private int duration;
    private float fee;

    public Course() {
    }

    public Course(int id, String name, int duration, float fee) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }

    
    public Course(String name, int duration, float fee) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", duration=" + duration + ", fee=" + fee;
    }
    
    
    
}
