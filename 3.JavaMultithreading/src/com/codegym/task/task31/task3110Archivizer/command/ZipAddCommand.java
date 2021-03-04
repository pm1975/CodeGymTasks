package com.codegym.task.task31.task3110Archivizer.command;

import com.codegym.task.task31.task3110Archivizer.ConsoleHelper;
import com.codegym.task.task31.task3110Archivizer.ZipFileManager;
import com.codegym.task.task31.task3110Archivizer.exception.PathNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Adding a new file to an archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the full name of the file to be added:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());

            zipFileManager.addFile(sourcePath);

            ConsoleHelper.writeMessage("File added to archive.");

        } catch (PathNotFoundException e) {
            ConsoleHelper.writeMessage("File not found.");
        }
    }
}