package SDA.safe_bank;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1020.00);
        double zbytDuzaKwota = 2000.00;

        // bezpieczne wyciągniecie środków
        pobierzSrodkiBezpiecznie(konto, zbytDuzaKwota);

        konto.pobierzSrodki(500.00);
        System.out.println(konto.getSaldo());

        // wyciągnięcie środków bez obsługi błędu
        konto.pobierzSrodki(zbytDuzaKwota);
    }

    private static boolean pobierzSrodkiBezpiecznie(Konto konto, double kwota) {
        try {
            konto.pobierzSrodki(kwota);
        }
        catch (LowBalanceException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
