package com.codegym.task.task31.task3110.command;

import com.codegym.task.task31.task3110.ConsoleHelper;
import com.codegym.task.task31.task3110.FileProperties;
import com.codegym.task.task31.task3110.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Viewing contents of the archive.");
        ZipFileManager fileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Archive contents:");
        List<FileProperties> fileList = fileManager.getFileList();
        for (FileProperties fileProperties : fileList) {
            ConsoleHelper.writeMessage(fileProperties.toString());
        }
        ConsoleHelper.writeMessage("Archive contents viewed.");
    }
}
