package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main{
    public static void main(String[] args){
        String fileLocation = "a";
        Path path = Paths.get(fileLocation);

        System.out.println(path.getFileSystem());

    }

}
