package com.pluralsight.files;

import java.io.*;


public class MainWithResources {
    public static void main(String[] args) {


        // try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("myfile.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                bufferedWriter.write(input);
            }

        }
        catch (IOException e){
            System.out.println("Problem reading or writing file");
        }
        // Streams and files are closed automatically

    }
}