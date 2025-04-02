package com.example;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/ashokeen/Desktop/NRI3IN1FORM_2312981372.pd");
            System.out.println(fr.getEncoding());
        } catch (Exception e) {
//            System.out.println("File not found.");
            System.out.println(e.getMessage());
        }
    }
}
