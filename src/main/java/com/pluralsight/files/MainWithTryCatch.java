package com.pluralsight.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainWithTryCatch {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("myfile.txt"));

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

        }
        catch (IOException e){
            System.out.println("Problem reading file");
        }
        finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            }
            catch (Exception ignored){}  // Catch and release
        }
    }
}