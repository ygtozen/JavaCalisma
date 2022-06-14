public class Main {

    public static void main(String args[]) {
        AccountManager manager = new AccountManager();
        System.out.println("Bakiye : " + manager.getBalance());

        // para yatırma
        manager.deposit(100);
        System.out.println("Bakiye : " + manager.getBalance());

        try {
            // para çekme
            manager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Bakiye : " + manager.getBalance());

        try {
            // para çekme
            manager.withdraw(20);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Bakiye : " + manager.getBalance());
    }
}
