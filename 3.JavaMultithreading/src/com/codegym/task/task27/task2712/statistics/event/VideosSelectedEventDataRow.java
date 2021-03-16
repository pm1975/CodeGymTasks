package com.codegym.task.task27.task2712.statistics.event;

import java.util.Date;
import java.util.List;

public class VideosSelectedEventDataRow implements EventDataRow {
    private List optimalVideoSet;
    private long amount;
    private int totalDuration;
    private Date currentDate;

    public VideosSelectedEventDataRow(List optimalVideoSet, long amount, int totalDuration) {
        this.optimalVideoSet = optimalVideoSet;
        this.amount = amount;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }
}
