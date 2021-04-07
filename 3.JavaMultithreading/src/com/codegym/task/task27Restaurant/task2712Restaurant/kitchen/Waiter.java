package com.codegym.task.task27Restaurant.task2712Restaurant.kitchen;

import com.codegym.task.task27Restaurant.task2712Restaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " was prepared by " + cook);
    }
}
