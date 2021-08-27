package com.cgmouse.j8inaction.chap2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PuttingLambdasIntoPractice {

    public static void main(String[] args) throws IOException {

        System.out.println(processFile());
        
    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
           
            return br.readLine();

        }
    }

}
