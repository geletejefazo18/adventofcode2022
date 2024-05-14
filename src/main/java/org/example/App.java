package org.example;

import challenge.Day1;
import challenge.Day2;
import reader.InputReader;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        List<String> lines = InputReader.getInput();
        new Day2().printResult2(lines);
    }
}
