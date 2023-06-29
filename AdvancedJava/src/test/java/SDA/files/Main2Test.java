package SDA.files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    @Test
    public void ShouldRemoveWordsFromFileText() throws IOException {
        // given
        String pathDir = "C:\\Users\\KatarzynaŁazar\\source\\repos\\GoForJavaGirl\\AdvancedJava\\src\\main\\resources\\";
        String fileName = "testowy.txt";
        Path filePath = Path.of(pathDir + fileName);
        String text = "W naszej zagrodzie mieszka dużo zwierząt. M.in. koza i owca. Po podwórku biega pies, a na ławce przed domem w słońcu wygrzewa się kot.";
        String listOfWords = "małpa|koza|pies|kot";
        String textWithoutWordsFromList = "W naszej zagrodzie mieszka dużo zwierząt. M.in.  i owca. Po podwórku biega , a na ławce przed domem w słońcu wygrzewa się .";

        if (!Files.exists(filePath)) Files.createFile(filePath);
        Files.writeString(filePath, text, StandardOpenOption.TRUNCATE_EXISTING);

        // when
        Main2.removeWordsFromFile(listOfWords, filePath);
        String textFromFileAfterRemoving = Files.readString(filePath);

        // then
        assertThat(textFromFileAfterRemoving).isEqualTo(textWithoutWordsFromList);
    }
}