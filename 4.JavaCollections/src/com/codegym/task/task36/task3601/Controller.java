package com.codegym.task.task36.task3601;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model = new Model();
    public List<String> onShowDataList() {
        return model.getStringDataList();
    }
}
