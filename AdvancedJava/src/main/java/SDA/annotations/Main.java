package SDA.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    @MojaAdnotacja(wartosc = "", value = "", wartoscZDomyslnym = 12354)
    public static void metoda() {
        System.out.println("metoda uruchomiona1");
    }

    @MojaAdnotacja("sama wartość")
    public static void metoda2() {
        System.out.println("metoda uruchomiona2");
    }

    public static void taMetodaNiepowinnaBycWypisana() {
        System.out.println("metoda uruchomiona3");
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Main.class;
        Method[] metody = clazz.getMethods();

        for (Method metoda : metody) {
            if (metoda.getAnnotation(MojaAdnotacja.class) != null) {
                MojaAdnotacja adnotacja = metoda.getAnnotation(MojaAdnotacja.class);
                System.out.println("Metoda która ma adnotacje " + metoda.getName() + " wartość pola value: " + adnotacja.value());

                metoda.invoke(null);
            }
        }
    }
}
