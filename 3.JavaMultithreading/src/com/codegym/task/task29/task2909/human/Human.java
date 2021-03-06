package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {

    public class Size {
        public int height;
        public int weight;
    }

    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;

    private List<Human> children = new ArrayList<>();

    protected Size size;

    private BloodType bloodType;

    public void setBloodType(BloodType code) {
        bloodType = code;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void live() {
    }

    public int getId() {
        return id;
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void removeChild(Human child) {
        children.remove(child);
    }

    public void printSize() {
        System.out.println("Height: " + size.height + " Weight: " + size.weight);
    }

    public String getPosition() {
        return "Person";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }
}