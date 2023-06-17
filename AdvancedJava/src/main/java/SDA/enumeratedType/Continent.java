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
        double max = 0;
        Continent maxContinent = null;
        for (Continent continent : values()) {
            if (continent.area > max) {
                max = continent.area;
                maxContinent = continent;
            }
        }
        return maxContinent;
    }

    public static Continent smallestContinent() {
        double min = Double.MAX_VALUE;
        Continent minContinent = null;
        for (Continent continent : values()) {
            if (continent.area < min) {
                min = continent.area;
                minContinent = continent;
            }
        }
        return minContinent;
    }
}
