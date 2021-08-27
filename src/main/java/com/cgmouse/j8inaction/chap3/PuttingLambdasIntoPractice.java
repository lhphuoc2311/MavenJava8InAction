package com.cgmouse.j8inaction.chap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PuttingLambdasIntoPractice {

    public static void main(String[] args) throws IOException {

        System.out.println(processFile());

        String str = processFile( br -> br.readLine());
        System.out.println(str);

        String twoLines = processFile(br -> br.readLine() + br.readLine());
        System.out.println(twoLines);
        
    }

    //using execute-around pattern
    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
           
            return br.readLine();

        }
    }

    //using lambda expression
    //1. Create processFile() method for parametering behavior
    public static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
           
            return bufferedReaderProcessor.process(br);

        }
    }

}
