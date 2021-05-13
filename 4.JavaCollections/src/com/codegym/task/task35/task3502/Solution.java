package com.codegym.task.task35.task3502;

/* 
Introducing generics

*/

import java.util.List;

public class Solution<T extends List<Solution.SomeClass>> {
    public static class SomeClass<K extends Number> {
    }

    public static void main(String[] args) {

    }
}
