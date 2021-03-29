package com.codegym.task.task27.task2712;

import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    private List<Tablet> tablets;
    private int internal;

    public RandomOrderGeneratorTask(List<Tablet> tablets, int internal) {
        this.tablets = tablets;
        this.internal = internal;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int k = (int) (Math.random() * tablets.size());
                Tablet expected = tablets.get(k);
                expected.createTestOrder();
                Thread.sleep(internal);
            }
        } catch (InterruptedException e) {
        }
    }
}
