package SDA.safe_bank;

public class Konto {
    private double saldo;

    public Konto(double kwota) throws LowBalanceException {
        if (kwota < 0.0) {
            throw new LowBalanceException();
        } else {
            this.saldo = kwota;
        }
    }

    public double pobierzSrodki(double kwota) throws LowBalanceException {
        if (kwota > this.saldo) {
            throw new LowBalanceException();
        } else {
            this.saldo -= kwota;
        }
        return kwota;
    }

    public double pobierzSrodkiBezpiecznie(double kwota) {
        try {
            return this.pobierzSrodki(kwota);
        } catch (LowBalanceException e) {
            System.out.println("Niedopuszczalny debet na koncie!");
            return 0.0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
