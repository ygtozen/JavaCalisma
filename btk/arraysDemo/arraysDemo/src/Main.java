import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Yiğit";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("--------------------");

        String [] ogrenciler = new String[5];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Yiğit";
        ogrenciler[4] = "Ali";

        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------");

        // foreach döngüsü
        for (String ogrenci : ogrenciler){ // ogrenciler dizisindeki her bir elamanı gez ogrenci içine ata
            System.out.println(ogrenci); // ogrencileri yaz
        }

        System.out.println("**************");

        Scanner scanner = new Scanner(System.in);
        int [] sayilar = new int[5];

        for (int i = 0; i < sayilar.length; i++){
            System.out.println((i+1) + ". sayıyı giriniz");
            int sayi = scanner.nextInt();
            sayilar[i] = sayi;
        }

        for (int s : sayilar){
            System.out.println(s);
        }
    }
}
