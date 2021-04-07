package com.codegym.task.task36.task3608MVC.view;

import com.codegym.task.task36.task3608MVC.controller.Controller;
import com.codegym.task.task36.task3608MVC.model.DataModel;

public interface View {
    void refresh(DataModel dataModel);

    void setController(Controller controller);
}