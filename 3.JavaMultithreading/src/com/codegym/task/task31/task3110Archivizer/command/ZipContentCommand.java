package com.codegym.task.task31.task3110Archivizer.command;

import com.codegym.task.task31.task3110Archivizer.ConsoleHelper;
import com.codegym.task.task31.task3110Archivizer.FileProperties;
import com.codegym.task.task31.task3110Archivizer.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Viewing contents of the archive.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Archive contents:");

        List<FileProperties> files = zipFileManager.getFileList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Archive contents viewed.");
    }
}
