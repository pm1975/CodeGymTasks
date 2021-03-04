package com.codegym.task.task31.task3110Archivizer.command;

import com.codegym.task.task31.task3110Archivizer.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Bye!");
    }
}
