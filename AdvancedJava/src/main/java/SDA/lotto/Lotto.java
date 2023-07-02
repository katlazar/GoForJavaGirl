package SDA.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
    private List<Integer> lastResults;
    private int winners;

    private void losujNumery() {
        List<Integer> numery = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int numer = random.nextInt(49) + 1;
            while (numery.contains(numer)) numer = random.nextInt(49) + 1;
            numery.add(numer);
        }
        this.lastResults = numery.stream().sorted().toList();
    }

    public int ileTrafien(List<Integer> numeryGracza) {
        int sum = 0;
        losujNumery();

        for (int numer : numeryGracza) {
            if (lastResults.contains(numer)) sum++;
        }
        if (sum == 6) winners++;
        return sum;
    }

    public List<Integer> getLastResults() {
        return List.of( lastResults.get(0),
                        lastResults.get(1),
                        lastResults.get(2),
                        lastResults.get(3),
                        lastResults.get(4),
                        lastResults.get(5));
    }

    public int getWinners() {
        return winners;
    }
}
