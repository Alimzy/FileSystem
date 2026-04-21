package org.example.files.create.output.writer;

import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileDataWriterTest {

    @Test
    public void testCanWriteTextToFile(){
        try{
            String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
            Path path = Paths.get(fileLocation);
            String text = """
                    10,100,10000""";
            FileDataWriter.writeDataToFile(text,path);
            String dataReadFromFile = Files.readString(path);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void textCanReadFile(){
        String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
        Path path = Paths.get(fileLocation);

        String read = FileDataWriter.readData(path);

        assertEquals("10,100,10000",  read);

}

 @Test
    public void textICanDeleteData(){
     String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
     Path path = Paths.get(fileLocation);
     FileDataWriter.deleteData(path);

     assertFalse(Files.exists(path));


 }

 @Test
    public void textICanUpdate(){

         String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
         Path path = Paths.get(fileLocation);
         String text = """
                    ,10,100,10000""";
        String actual = FileDataWriter.UpdateData(text,path);

     assertEquals("10,100,10000,10,100,10000",  actual);


 }

 @Test
    public void textICanCountWords(){
     String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
     Path path = Paths.get(fileLocation);

     int actual = FileDataWriter.countWords(path);

     assertEquals(3 ,  actual);
 }

    @Test
    public void textICanCountCharactersLength(){
        String fileLocation = "/home/semicolon/IdeaProjects/FilePaths/src/main/java/org/example/files/create/output/writer/FileData.txt";
        Path path = Paths.get(fileLocation);

        int actual = FileDataWriter.countData(path);

        assertEquals(12 ,  actual);
    }

}