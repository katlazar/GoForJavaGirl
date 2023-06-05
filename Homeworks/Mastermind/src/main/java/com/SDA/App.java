package com.SDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    // Mastermind: zaimplementuj grę Mastermind, której zasady są następujące: komputer losuje 3 cyfry (od 0 do 9).
    // Użytkownik ma za zadanie je odgadnąć, wpisując je w jednej linii, po spacji, np 1 2 3. Następnie użytkownik
    // dostaje informację zwrotną od komputera w formie trzech wyrazów. HOT oznacza, że użytkownik trafił w cyfrę
    // w odpowiednim miejscu, WARM oznacza, że podana cyfra znajduje się w kombinacji, ale w innym miejscu, a COLD
    // oznacza, że cyfry nie ma w kombinacji. Czyli, jeżeli komputer wymyśli kombinację 1 2 3, a użytkownik podał 1 3 4,
    // to komunikat powinien być HOT WARM COLD. Gra się toczy aż użytkownik odgadnie dokładnie kombinację, czyli dostanie
    // komunikat HOT HOT HOT. Po zaimplementowaniu głównej mechaniki gry, dodatkowym zadaniem jest zaimplementowanie
    // poziomów trudności (łatwy - 3 cyfry do odgadnięcia, średni - 4 cyfry, trudny - 5 cyfer) oraz ilości "żyć" - jeżeli
    // użytkownik nie odgadnie kombinacji np w 5 próbach, przegrywa.

    public static void main( String[] args ) {
        mastermindGame();
    }

    public static void mastermindGame() {
        int level = chooseLevel();
        int attempts = getAttemptsNumber();
        int counter = attempts;
        List<Integer> randomDigits = getRandomDigits(level, 0, 9);
        System.out.printf("Write %d digits separated by a space: %n", level);

        while (counter > 0) {
            int[] userDigits = getUserDigits(level);
            String result = checkResult(randomDigits, userDigits, level);
            System.out.println(result + "  (HOT - right position, WARM - correct digit, wrong position, COLD - wrong digit)");
            if (result.equals(guessString(level))) {
                break;
            }
            if (counter > 1) {
                System.out.printf("Try again, write %d digits: %n", level);
            }
            counter--;
        }
        if (counter > 0) {
            System.out.printf("Bravo, you guessed in %d attempts!", attempts - counter + 1);
        } else {
            System.out.println("I'm sorry, you don't have any more attempts 😢");
            System.out.println("Next time you will be better!");
            System.out.println("Proper digits: " + randomDigits);
        }
    }

    private static int chooseLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a difficulty level: easy (3 digits), medium (4 digits), hard (5 digits)");
        int level = scanner.nextInt();
        while (level < 3 || level > 5) {
            System.out.println("Wrong difficulty level, try again (3 - 5):");
            level = scanner.nextInt();
        }
        return level;
    }

    private static int getAttemptsNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many attempts (maximal) do you need (1 - 15):");
        int attempt = scanner.nextInt();
        while (attempt < 1 || attempt > 15) {
            System.out.println("Wrong number, try again (1 - 15):");
            attempt = scanner.nextInt();
        }
        return attempt;
    }

    public static List<Integer> getRandomDigits(int level, int min, int max) {
        List<Integer> listOfDigits = new ArrayList<>();
        int counter = 0;
        while (counter < level) {
            int digit = getRandomDigit(min, max);
            if (!listOfDigits.contains(digit)) {
                listOfDigits.add(digit);
                counter++;
            }
        }
        return listOfDigits;
    }

    public static int getRandomDigit(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[] getUserDigits(int level) {
        Scanner scanner = new Scanner(System.in);
        int[] userDigits = new int[level];
        for (int i = 0; i < level; i++) {
            userDigits[i] = scanner.nextInt();
        }
        return userDigits;
    }

    public static String checkResult(List<Integer> randomDigits, int[] userDigits, int level) {
        String result = "";
        for (int i = 0; i < level; i++) {
            if (userDigits[i] == randomDigits.get(i)) {
                result = result.concat("H ");
            } else if (randomDigits.contains(userDigits[i])) {
                result = result.concat("W ");
            } else {
                result = result.concat("C ");
            }
        }
        return result;
    }

    public static String guessString(int level) {
        String result = "";
        for (int i = 0; i < level; i++) {
            result = result.concat("H ");
        }
        return result;
    }
}
