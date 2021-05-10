package com.codegym.task.lessons;

import java.io.File;

public class RecursionDirectoryList {
    public static void main(String[] args) {
        printAllFiles(new File("/Users/piotr/Programowanie/java/CodeGymTasks/4.JavaCollections/src/com/codegym/task"));
    }

    private static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory())
                printAllFiles(file);
            else
                System.out.println(file.getAbsoluteFile());
        }
    }
}
