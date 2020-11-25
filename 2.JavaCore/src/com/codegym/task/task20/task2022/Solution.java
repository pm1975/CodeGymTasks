package com.codegym.task.task20.task2022;

import java.io.*;

/* 
Overriding serialization in a thread

*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("files/20/2022_2.txt");
             ObjectOutputStream outputOutputStream = new ObjectOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream("files/20/2022_2.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            Solution solution = new Solution("files/20/2020_1.txt");
            solution.writeObject("some text");

            outputOutputStream.writeObject(solution);
            outputOutputStream.flush();;

            //load object from file
            Solution loadedSolution = (Solution) objectInputStream.readObject();

            loadedSolution.writeObject("some text - 2");

        } catch (Exception skipped) {
        }
    }
}
