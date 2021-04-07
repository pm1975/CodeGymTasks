package com.codegym.task.task27Restaurant.task2712Restaurant.statistics.event;

import java.util.Date;

public interface EventDataRow {
    EventType getType();
    Date getDate();
    int getTime();
}