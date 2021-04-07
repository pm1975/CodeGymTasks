package com.codegym.task.task36.task3608MVC.view;

import com.codegym.task.task36.task3608MVC.bean.User;
import com.codegym.task.task36.task3608MVC.controller.Controller;
import com.codegym.task.task36.task3608MVC.model.DataModel;

public class UsersView implements View {

    private Controller controller;

    @Override
    public void refresh(DataModel dataModel) {
        System.out.println("All " + (dataModel.isDisplayDeletedUserList() ? "deleted " : "") + "users:");
        for(User user : dataModel.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireShowAllUsersEvent() {
        controller.onShowAllUsers();
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }

    public void fireOpenUserEditFormEvent(long id) {
        controller.onOpenUserEditForm(id);
    }
}