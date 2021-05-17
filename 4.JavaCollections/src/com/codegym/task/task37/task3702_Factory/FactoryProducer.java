package com.codegym.task.task37.task3702_Factory;

import com.codegym.task.task37.task3702_Factory.female.FemaleFactory;
import com.codegym.task.task37.task3702_Factory.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else {
            return new FemaleFactory();
        }
    }
}
