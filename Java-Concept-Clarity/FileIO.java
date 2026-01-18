package com.practiceSet;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileIO {

    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("C:\\Users\\rupes\\Downloads\\vitumauli banner.png");
//
//        int i;
//        while ((i = fis.read()) != -1) {
//            System.out.print(i + " "); // prints byte values
//        }
//
//        fis.close();
        
        FileOutputStream fos = new FileOutputStream("src/com/practiceSet/demo.txt" );
//        fw.write("Rupesh Sawant \n");
//        fw.write("Vinita Sawant \n");
//        System.out.println("Data Successfully saved");
//        fw.close();
        
//        BufferedWriter bw = new BufferedWriter(fw);
//        String line = "i love you";
//        for(int i = 1;i<=2000;i++) {
//        	
//        	bw.write(line);
//        	bw.write("\n");
//        }
//        
//        System.out.println("Data saved successfully");
//         
//         bw.close();
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(65);
        String line = " rupesh sawant";
        bos.write(line.getBytes());
        bos.close();
         
        
        
        
        
        
        
        
        
        
    }
}
