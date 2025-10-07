package com.pluralsight.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MainWithResources {
    public static void main(String[] args) {


        // try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("myfile.txt"))) {

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

        }
        catch (IOException e){
            System.out.println("Problem reading file");
        }
        // Streams and files are closed automatically
    }
}