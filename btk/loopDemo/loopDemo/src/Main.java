public class Main {

    public static void main(String args[]){
        // For Döngüsü
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsi Bitti");

        /*for (int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }*/

        // While Döngüsü
        int sayac = 1;
        while(sayac < 10){
            System.out.println(sayac);
            sayac = sayac + 1; // i++;
        }
        System.out.println("While Döngüsü Bitti");

        // Do-While Döngüsü
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        }while (j < 10);
        System.out.println("Do-While Döngüsü Bittti");
    }
}
