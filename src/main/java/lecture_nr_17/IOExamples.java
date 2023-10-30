package lecture_nr_17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class IOExamples {

    public static void main(String[] args) throws IOException {
        File file1 = new File("src/main/java/lecture_nr_17/secondFileDirectory");

        System.out.println("Is this a directory?: " + file1.isDirectory());

        //Get a list of all files in the directory
        Arrays.stream(file1.listFiles())
                .map(e -> e.getName())
                .forEach(e -> System.out.println(e));

        //Get a list of csv files in the directory
        System.out.println("Print all csv files in the directory:");
        Arrays.stream(file1.listFiles())
                .map(e -> e.getName())
                .filter(e -> {
                    String[] splittedString = e.split("\\.");
                    if(splittedString[splittedString.length - 1].equals("csv"))
                        return true;
                    return false;
                })
                .forEach(e -> System.out.println(e));

        //Print out if a file or directory exists
        File file2 = new File("/src/main/java/lecture_nr_17/secondFileDirectory/testtest.txt");
        System.out.println("Does this file exist?: " + file2.exists() + " path: " + file2.getPath());
        File file3 = new File("/src/main/java/lecture_nr_17/secondFileDirectory/test");
        System.out.println("Does this directory exist? " + file3.exists() + " path: " + file3.getPath());
        File file4 = new File("src/main/java/lecture_nr_17/secondFileDirectory/testFile00.txt");
        System.out.println("Does this file exist? " + file4.exists() + " path: " + file4.getPath());

        //Verify various file objects to them being a directory or a file?

        File file5 = new File("src/main/java/lecture_nr_17/secondFileDirectory/testFile01.txt");
        System.out.println("Is this a file? " + file5.isFile());
        File file6 = new File("src/main/java/lecture_nr_17/secondFileDirectory");
        System.out.println("Is this a directory? " + file6.isDirectory());

        //Verify that it's possible to write in a specific file or directory

        File file7 = new File("src/main/java/lecture_nr_17/secondFileDirectory/testFile05.txt");
        System.out.println("Can I write to this file? " + file7.canWrite());
        System.out.println("Can I read from this file? " + file7.canRead());

        //Read from console and write it directly to a file

//        Scanner scanner = new Scanner(System.in);
        File file8 = new File("src/main/java/lecture_nr_17/secondFileDirectory/testFile08.txt");
        FileWriter fr = new FileWriter(file8);
        BufferedWriter bfr = new BufferedWriter(fr);

        String tempString = "";

//        while(!tempString.equals("F")){
//            tempString = scanner.nextLine();
//            bfr.write(tempString + "\n");
//        }

        bfr.close();
        fr.close();

        //Need to copy all contents of testFile10.txt to testFile09.txt
        BufferedReader bfr2 = new BufferedReader(new FileReader("src/main/java/lecture_nr_17/secondFileDirectory/testFile10.txt"));
        BufferedWriter bwr2 = new BufferedWriter(new FileWriter("src/main/java/lecture_nr_17/secondFileDirectory/testFile09.txt"));

        for(String temp = bfr2.readLine(); temp != null; temp = bfr2.readLine()){
            bwr2.write(temp + "\n");
        }

        bfr2.close();
        bwr2.close();

        //----------------------------- JAVA NIO ------------------------------------
        // Path
        // Files

        //Need to create a directory named thirdFileDirectory

        Path path = Paths.get("src/main/java/lecture_nr_17/thirdDirectory");

        if(!Files.exists(path)){
            Files.createDirectory(path);
        } else
            System.out.println("Directory already exists!");

        //Copying a file in the same directory

        Path pathFrom = Paths.get("src/main/java/lecture_nr_17/thirdDirectory/testFile10.txt");
        Path pathTo = Paths.get("src/main/java/lecture_nr_17/thirdDirectory/copiedFile.txt");


        if(Files.exists(pathFrom) && !Files.exists(pathTo)){
            Files.copy(pathFrom, pathTo);
        }

        Files.deleteIfExists(pathTo);

    }
}
