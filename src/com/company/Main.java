package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
	    var name = new ArrayList<String>();
        var number = new ArrayList<Integer>();
        var price = new ArrayList<Float>();
        var filename = "Products.txt";
        var filePath = Paths.get(filename);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines){
            var splitLine = line.split(",");
            var splitLine2 = line.split(",");
            name.add(splitLine[0]);
            number.add(Integer.parseInt(splitLine[2]));
            price.add(Float.parseFloat(splitLine[1]));

            System.out.println(name);
            System.out.println(number);
            System.out.println(price);
            var userInput = ;
            while(userInput != "end"){

            }
        }
    }
}
