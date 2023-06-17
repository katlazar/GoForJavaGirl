package SDA.enumeratedType;

public enum Continent {
    AFRYKA("Afryka",30.4),
    AMERYKA_POLUDNIOWA("Ameryka Południowa", 17.8),
    AMERYKA_POLNOCNA("Ameryka Północna", 24.2),
    ANTARKTYDA("Antarktyda", 13.2),
    AUSTRALIA("Australia", 7.7),
    EUROPA("Europa",10.2),
    AZJA("Azja", 44.6);

    private String name;
    private double area;

    Continent(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public static Continent largestContinent() {
        Continent maxContinent = values()[0];
        for (Continent continent : values()) {
            if (continent.area > maxContinent.area) {
                maxContinent = continent;
            }
        }
        return maxContinent;
    }

    public static Continent smallestContinent() {
        Continent minContinent = values()[0];
        for (Continent continent : values()) {
            if (continent.area < minContinent.area) {
                minContinent = continent;
            }
        }
        return minContinent;
    }
}
