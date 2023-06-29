package SDA.files;

import java.io.IOException;
import java.nio.file.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String pathDir = "C:\\Users\\KatarzynaŁazar\\source\\repos\\GoForJavaGirl\\AdvancedJava\\src\\main\\resources\\";
        String fileName = "testowy.txt";
        Path filePath = Path.of(pathDir + fileName);
        String text = "W naszej zagrodzie mieszka dużo zwierząt. M.in. koza i owca. Po podwórku biega pies, a na ławce przed domem w słońcu wygrzewa się kot.";
        String regex = "małpa|koza|pies|kot";

        createFileAndWriteText(filePath, text);
        removeWordsFromFile(regex, filePath);
    }

    public static  void createFileAndWriteText(Path path, String text) throws IOException {
        try {
            Files.createFile(path);
        }
        catch (FileAlreadyExistsException e) {}
        Files.writeString(path, text, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static void removeWordsFromFile(String words, Path path) {
        try {
            Files.writeString(path, Files.readString(path).replaceAll(words, ""), StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (IOException e) {
            System.out.println("Plik o podanej nazwie nie istnieje!");
        }
    }
}
