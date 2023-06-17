package SDA.enumeratedType;

public class Main {
    public static void main(String[] args)
    {
        for (Continent kontynent : Continent.values()) {
            System.out.printf("Powierzchnia kontynentu %s wynosi %4.1f mln km2 %n", kontynent.getName(), kontynent.getArea());
        }

        System.out.println("Najmniejszy kontynent: " + Continent.smallestContinent().getName());
        System.out.println("Największy kontynent: " + Continent.largestContinent().getName());
    }
}
