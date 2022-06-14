public class Main {

    public static void main(String args[]){
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En Büyük = " + enBuyuk);

        /*
        if ((sayi1 > sayi2) && (sayi1 > sayi3)){
            System.out.println("En büyük : " + sayi1);
        }
        else if ((sayi2 > sayi1) && (sayi2 > sayi3)){
            System.out.println("En büyük : " + sayi2);
        }
        else {
            System.out.println("En büyük : " + sayi3);
        }
         */
    }
}
