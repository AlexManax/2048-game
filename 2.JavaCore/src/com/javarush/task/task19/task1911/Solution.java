package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(ba);
        System.setOut(stream);
        testString.printSomething();
        String res = ba.toString();
        System.setOut(console);
        StringBuilder sB = new StringBuilder(res.toUpperCase());
        System.out.println(sB);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
