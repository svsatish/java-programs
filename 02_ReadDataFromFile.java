package sdet_programs;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromFile {

    /*
    Logic:
    1. Use FileReader class to point to the file
    2. Use BufferedReader class to read content from the above file
    3. Make sure to use loops to read all lines
    4. Close BufferedReader
     */

    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {

        FileReader reader = new FileReader("/Users/I846176/Downloads/writeData.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while(bufferedReader.readLine()!= null) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}

