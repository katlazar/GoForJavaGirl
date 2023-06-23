package SDA.collections;

public class MyException extends RuntimeException{
    public void alert() {
        System.out.println("Nie udało się przekonwertować wartości!");
    }
}
