package sdet_programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDateToFile {

    /*
    Logic:
    1. Use FileWriter class to create(if not created) and point to the file
    2. Use BufferedWriter class to write content to the above file
    3. Make sure to close BufferedWriter
     */

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some text to write to a file");
        String text = sc.next();
        writeData(text);

    }

    public static void writeData(String content) throws IOException {

        FileWriter fileWriter = new FileWriter("/Users/I846176/Downloads/writeData.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.close();

    }
}
