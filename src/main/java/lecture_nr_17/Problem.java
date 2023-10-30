package lecture_nr_17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem {

    //Need to create a lot of files and fill them with random strings line by line
    //After that need to find the file that contains the longest string of all files

    private static final Integer nrOfFiles = 100;
    private static final Integer nrOfStringsPerFile = 150;
    private static final Integer maxLengthOfStrings = 200;

    public static void main(String[] args) throws IOException {
//        createAllFiles();
        findTheBiggestStringInDirectory();
    }

    public static void findTheBiggestStringInDirectory() throws IOException {

        Path directoryPath = Paths.get("src/main/java/lecture_nr_17/MassiveDirectory");

        Stream<Path> streamedPath = Files.list(directoryPath);

        String maxString = "";

        List<Path> pathList = streamedPath.collect(Collectors.toList());

        for (Path element:
             pathList) {
            String buffer = Files.readString(element);
            String[] splittedFile = buffer.split("\n");

            for (String anotherElement :
                    splittedFile) {
                if(anotherElement.length() > maxString.length())
                    maxString = anotherElement;
            }
        }

        System.out.println("The biggest string is: " + maxString);


    }

    public static void createAllFiles() throws IOException {
        Path massiveDirectoryPath = Paths.get("src/main/java/lecture_nr_17/MassiveDirectory");

        if(!Files.exists(massiveDirectoryPath))
            return;

        for(int index = 0; index != nrOfFiles; index++){
            List<String> stringList = new ArrayList<>();
            for(int secondIndex = 0; secondIndex != nrOfStringsPerFile; secondIndex++){
                stringList.add(generateRandomString(new Random().nextInt(1, maxLengthOfStrings)));
            }

            Files.createFile(Path.of(massiveDirectoryPath + "/file" + index + ".txt"));
            for (String element :
                    stringList) {
                Files.writeString(Path.of(massiveDirectoryPath + "/file" + index + ".txt"), element + "\n", StandardOpenOption.APPEND);
            }
        }
    }

    public static String generateRandomString(int length){
        final int start = '0';
        final int end = 'z';
        final Random random = new Random();
        final String generated = random.ints(start, end + 1)
                .filter(i -> Character.isLetter(i) || Character.isDigit(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generated;
    }
}
