package SDA.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Zaplanuj zadanie, które co sekundę sprawdzi zawartość jakiegoś pliku i czy jest ona równa "xyz". Bonus, jeśli jest
// równa xyz Thread (ExecutorService) powinien się zamknąć.
public class Main {
    public static ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        service.scheduleAtFixedRate(Main::checkTextFromFile, 1, 1, TimeUnit.SECONDS);
    }

    private static void checkTextFromFile() {
        String pathDir = "C:\\Users\\KatarzynaŁazar\\source\\repos\\GoForJavaGirl\\AdvancedJava\\src\\main\\resources\\";
        String fileName = "testowy.txt";
        Path filePath = Path.of(pathDir + fileName);
        try {
            if (Files.readString(filePath).equals("xyz")) {
                System.out.println("found");
                service.shutdown();
            } else {
                System.out.println("not found");
            };
        }
        catch (IOException e) {}
    }
}
