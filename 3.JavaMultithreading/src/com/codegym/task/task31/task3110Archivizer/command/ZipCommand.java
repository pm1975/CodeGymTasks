package com.codegym.task.task31.task3110Archivizer.command;

import com.codegym.task.task31.task3110Archivizer.ConsoleHelper;
import com.codegym.task.task31.task3110Archivizer.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Enter the full path to the archive file:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}