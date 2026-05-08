package org.example.files.create.output.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter {

    public static void writeDataToFile(String text, Path filePath) {
        try {
            Files.write(filePath,text.getBytes());
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static String readData(Path filePath ){
        try {
            return Files.readString(filePath);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        return "";
    }

    public static void deleteData(Path filePath){
        try{
             Files.deleteIfExists(filePath);
        }catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        }

    public static String UpdateData(String text, Path filePath){
            String myText = FileDataWriter.readData(filePath);
            myText = myText + text;

            return myText;

    }

    public static int countWords(Path path) {
        String[] words = FileDataWriter.readData(path).split("[^a-zA-Z0-9]");
        return words.length;
    }

    public static int countData(Path path) {
        String myText = FileDataWriter.readData(path);
        return myText.length();
    }
    public static void writeDataToFile(String text,String fileLocation) {
    try (FileOutputStream outputStream = new FileOutputStream(fileLocation)){

    }catch (IOException e){
        e.printStackTrace();

    }

}
}
