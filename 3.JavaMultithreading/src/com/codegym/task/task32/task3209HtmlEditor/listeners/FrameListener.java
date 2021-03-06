package com.codegym.task.task32.task3209HtmlEditor.listeners;


import com.codegym.task.task32.task3209HtmlEditor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}
