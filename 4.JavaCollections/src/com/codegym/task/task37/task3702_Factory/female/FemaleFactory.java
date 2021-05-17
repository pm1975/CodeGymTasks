package com.codegym.task.task37.task3702_Factory.female;

import com.codegym.task.task37.task3702_Factory.AbstractFactory;
import com.codegym.task.task37.task3702_Factory.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE) {
            return new KidGirl();
        } else if (age <= TeenGirl.MAX_AGE) {
            return new TeenGirl();
        } else {
            return new Woman();
        }
    }
}
