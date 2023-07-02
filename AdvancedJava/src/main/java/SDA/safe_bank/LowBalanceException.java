package SDA.safe_bank;

public class LowBalanceException extends RuntimeException{
    public LowBalanceException() {
        super("Niedopuszczalny debet na koncie!");
    }
}
