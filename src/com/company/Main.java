package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    var name = new ArrayList<String>();
        var number = new ArrayList<Integer>();
        var price = new ArrayList<Float>();
        var reader= new Scanner(System.in);
        var filename = "Products.txt";
        var filePath = Paths.get(filename);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines) {
            var splitLine = line.split(",");
            name.add(splitLine[0]);
            number.add(Integer.parseInt(splitLine[2]));
            price.add(Float.parseFloat(splitLine[1]));
        }
            var userInput = "" ;
            while(!userInput.equals("end")){
                System.out.print("Enter item or 'end' when done:");
                userInput=reader.nextLine();
                if(userInput.equals("end")){
                   break;

                }
                for(int i = 0; i< name.size(); i++){
                    if(userInput.equals(name.get(i)))
                    System.out.println(name.get(i)+" is "+price.get(i)+" and there are "+number.get(i)+" left");
                }
            }

        }
    }