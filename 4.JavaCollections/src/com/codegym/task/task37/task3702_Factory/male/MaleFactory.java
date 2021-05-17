package com.codegym.task.task37.task3702_Factory.male;

import com.codegym.task.task37.task3702_Factory.AbstractFactory;
import com.codegym.task.task37.task3702_Factory.Human;

public class MaleFactory implements Human, AbstractFactory {
    public Human getPerson(int age) {
        if (age <= KidBoy.MAX_AGE) {
            return new KidBoy();
        } else if (age <= TeenBoy.MAX_AGE) {
            return new TeenBoy();
        } else {
            return new Man();
        }
    }
}
