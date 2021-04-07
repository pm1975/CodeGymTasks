package com.codegym.task.task36.task3608MVC;

import com.codegym.task.task36.task3608MVC.controller.Controller;
import com.codegym.task.task36.task3608MVC.model.MainModel;
import com.codegym.task.task36.task3608MVC.model.Model;
import com.codegym.task.task36.task3608MVC.view.EditUserView;
import com.codegym.task.task36.task3608MVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireShowAllUsersEvent();
        usersView.fireOpenUserEditFormEvent(126L);
        editUserView.fireUserDeletedEvent(124L);
        editUserView.fireUserDataChangedEvent("NewName", 126L, 73);
        usersView.fireShowDeletedUsersEvent();
    }
}