package SDA.safe_bank;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1020.00);
        double malaKwota = 10.00;
        double zbytDuzaKwota = 2000.00;

        // bezpieczne wyciągniecie środków
        System.out.printf("Pobrane środki: %5.2f %n", konto.pobierzSrodkiBezpiecznie(malaKwota));
        System.out.printf("Pobrane środki: %5.2f %n", konto.pobierzSrodkiBezpiecznie(zbytDuzaKwota));

        // wyciągnięcie środków bez obsługi błędu
        System.out.printf("Pobrane środki: %5.2f %n", konto.pobierzSrodki(malaKwota));
        System.out.printf("Pobrane środki: %5.2f %n", konto.pobierzSrodki(zbytDuzaKwota));
    }
}
