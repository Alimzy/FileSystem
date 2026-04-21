package org.example.files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {

    public static void main(String[] args){
        try {
            String directory = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output";

            Path path = Path.of(directory, "2","numberTne.txt");
            System.out.println("filePath:: "+path);


            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
