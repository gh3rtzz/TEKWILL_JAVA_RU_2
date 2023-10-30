package lecture_nr_17;

import java.io.*;

public class IOMain {

    public static void main(String[] args) throws IOException {
        File firstFile = new File("src/main/java/lecture_nr_17/fileDirectory/testFile00.txt");
        FileReader fr = null;

        fr = new FileReader(firstFile);

        int buff = fr.read();
        while (buff != -1) {
            System.out.print((char) buff);
            buff = fr.read();
        }

        fr.close();

        System.out.println("\n-------------------------------");

        FileReader fr1 = new FileReader(firstFile);

        char[] readArray = new char[(int) firstFile.length()];

        fr1.read(readArray);

        for (char element :
                readArray) {
            System.out.print(element);
        }

        fr1.close();
        //Writing to file

        FileWriter fw1 = new FileWriter(firstFile);

        fw1.write("\nAdding a string from java!\n");
        fw1.write("Hooray! It's not me typing, it's java!\n");

        fw1.close();


        // Buffered reading and writing

        System.out.println("\n --------- BUFFERED READING -------------");
        FileReader fr2 = new FileReader(firstFile);
        BufferedReader br1 = new BufferedReader(fr2);

        String bufferString = "";

        while(bufferString != null){
            bufferString = br1.readLine();
            System.out.println(bufferString);
        }

        br1.close();
        fr2.close();
    }
}
