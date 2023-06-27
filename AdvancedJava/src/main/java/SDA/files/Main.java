package SDA.files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathDir = "C:\\Users\\KatarzynaŁazar\\source\\repos\\GoForJavaGirl\\AdvancedJava\\src\\main\\resources\\";
        String input = new Scanner(System.in).nextLine();

        convertCharToFile(input, pathDir);
    }

    private static void convertCharToFile(String word, String path) throws IOException {
        if (!word.matches("^\\w+$")) throw new IllegalArgumentException();

        for (String element : word.split("")) {
            Path filePath = Path.of(path + element + ".txt");

            //if (!Files.exists(filePath)) Files.createFile(filePath);
            try {
                Files.createFile(filePath);
            }
            catch (FileAlreadyExistsException e) {}
            Files.writeString(filePath, word, StandardOpenOption.WRITE);
        }
    }
}
