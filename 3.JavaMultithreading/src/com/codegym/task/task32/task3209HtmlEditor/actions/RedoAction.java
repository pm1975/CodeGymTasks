package com.codegym.task.task32.task3209HtmlEditor.actions;

import com.codegym.task.task32.task3209HtmlEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}
