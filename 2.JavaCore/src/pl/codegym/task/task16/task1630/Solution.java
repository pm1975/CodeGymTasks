package pl.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //tutaj wpisz swój kod
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine(); //"plik.txt";
            secondFileName = reader.readLine(); //"testFile.txt";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //tutaj wpisz swój kod
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //tutaj wpisz swój kod
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fullFileName;
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            StringBuilder builder = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));
                while (reader.ready() ) {
                    String line = reader.readLine();
                    builder.append(line);
                    builder.append(" ");
                }
                System.out.println(builder.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public void start() {

        }

        @Override
        public void run() {

        }
    }
}
