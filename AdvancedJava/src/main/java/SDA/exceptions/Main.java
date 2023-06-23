package SDA.exceptions;

public class Main {
    public static void main(String[] args)
    {
        try {
            myException();
        }
        catch (TestException1 | TestException2 e) {   // można też  napisać   catch (Exception e) - dla wszystkich błędów
            System.out.println("Błąd złapano!");
        }
        catch (Exception e) {

        }
    }

    public static void myException() throws TestException1, TestException2, TestException3 {
        throw new TestException1();
    }
}
