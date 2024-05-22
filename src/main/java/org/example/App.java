package org.example;

import challenge.Day1;
import challenge.Day2;
import challenge.Day3;
import challenge.Day4;
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
        new Day4().printResult2(lines);
    }
}
