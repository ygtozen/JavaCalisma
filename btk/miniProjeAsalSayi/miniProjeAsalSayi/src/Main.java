public class Main {

    public static void main(String args[]) {
        int number = 2;
        int remainder = number % 2; // remainder -> kalan
        System.out.println(remainder);

        int sayac = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sayac += 1;
            }
        }

        if (sayac > 0) {
            System.out.println("Asal sayı değildir");
        } else if (number == 1) {
            System.out.println("Asal sayı değildir");
        } else {
            System.out.println("Asal sayı");
        }

        // 2.yol
        boolean isPrime = true; // prime --> asal

        if (number == 1){
            System.out.println("Sayı asal sayı değidir");
            return;
        }

        if (number < 1){
            System.out.println("Geçersiz sayı");
        }
        for (int i = 2; i < number; i ++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime == true){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }



    }
}
