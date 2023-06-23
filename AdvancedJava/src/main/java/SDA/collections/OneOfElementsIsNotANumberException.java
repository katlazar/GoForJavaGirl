package SDA.collections;

public class OneOfElementsIsNotANumberException extends RuntimeException {

    public OneOfElementsIsNotANumberException() {
        super("Nie udało się przekonwertować wartości!");
    }
}