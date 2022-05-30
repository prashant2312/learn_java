package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH111_CH16_FileHandling {
    public static void main(String[] args) {
//        Code to create anew file
        /*
        File myFile = new File("CWH111files.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */


//        Code to write to a file
        /*
        try {
            FileWriter myFileWriter=new FileWriter("CWH111files.txt");
            myFileWriter.write("This is a first file from this java course \n Ok now bye");
            myFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

//        Reading a file
        /*
    File file=new File("CWH111files.txt");
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/



//        Delete a file
        File file =new File("CWH111files.txt");
        if(file.delete()){
            System.out.println("I have deleted "+file.getName());
        }else{
            System.out.println("Some error occured while deleting a file");
        }
    }
}
