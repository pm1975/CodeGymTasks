package pl.codegym.task.task20.task2009;

/* 
W jaki sposób serializuje się pola statyczne?
*/

import java.io.Serializable;

public class Solution {

    public static class ClassWithStatic implements Serializable {
        public static String staticString = "To jest statyczny ciąg testowy";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
