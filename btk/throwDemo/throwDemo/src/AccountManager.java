public class AccountManager {
    private double balance;         // balance -> bakiye

    public void deposit(double amount){     // deposit -> para yatırma, amount -> miktar
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {     // hesaptan para çekme
        if (balance >= amount){
            balance = getBalance() - amount;
        }
        else {
            //System.out.println("Hesaptan para çekilemedi. Bakiye yetersiz.");

            // throw new Exception("Bakiye yetersiz. Para çekme işlemi başarısız.");

            // Kendi Excepiton'umuzu yazmak için
            throw new BalanceInsufficentException("Bakiye yetersiz. Para çekme başarısız. Para yok");
        }
    }


    public double getBalance() {
        return balance;
    }
}
