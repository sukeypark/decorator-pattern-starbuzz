package com.example.starbuzz;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        try (InputStream is = new LowerCaseInputStream(
                new BufferedInputStream(new FileInputStream("resource/test.txt")))) {
            int c;
            while ((c = is.read()) >= 0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
