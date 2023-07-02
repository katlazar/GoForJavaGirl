package SDA.safe_bank;

public class Konto {
    private double saldo;

    public Konto(double kwota) {
        if (kwota < 0.0) {
            throw new LowBalanceException();
        } else {
            this.saldo = kwota;
        }
    }

    public void pobierzSrodki(double kwota) throws LowBalanceException{
        if (kwota > this.saldo) {
            throw new LowBalanceException();
        } else {
            this.saldo -= kwota;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
