package SDA.lotto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lotto losowanie = new Lotto();
        Scanner s = new Scanner(System.in);
        List<Integer> numeryGracza = List.of(1, 4, 15, 31, 47, 49);

        System.out.println("Twoje numery: " + numeryGracza);
        do {
            System.out.printf("Trafiłeś %d liczb. %n", losowanie.ileTrafien(numeryGracza));
            System.out.println("Wylosowane numery: " + losowanie.getLastResults());
        } while (s.nextLine().equals(""));
        System.out.println("Liczba trafionych \"szóstek\": " + losowanie.getWinners());
    }
}
