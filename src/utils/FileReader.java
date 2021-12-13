/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utsav
 */
public class FileReader {

    public static ArrayList<String[]> read(String filePath) throws FileNotFoundException {
        String next;
        ArrayList<String[]> file_contents = new ArrayList<>();
        Scanner file = new Scanner(new File(filePath));
        file.useDelimiter(", ");
        while (file.hasNextLine()) {
            next = file.nextLine();
            String[] data = next.split(", ");
            file_contents.add(data);
        }
        return file_contents;
    }

    public static void main(String[] args) {
        try {
            ArrayList<String[]> contents = read("G:\\Repositories\\HamroCinema\\src\\resources\\kathmandu.csv");
            for (String[] data : contents) {
                System.out.println(data.length);
                for (String datum : data) {
                    System.out.println(datum);
                }
            }
            System.out.println(contents.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }
}
