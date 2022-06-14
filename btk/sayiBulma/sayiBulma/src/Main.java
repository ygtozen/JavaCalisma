public class Main {

    public static void main(String args[]){
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak  = 5;
        boolean sonuc = false;

        for (int sayi : sayilar){
            if (aranacak == sayi){
                sonuc = true;
                break;
            }
        }
        if (sonuc == true){
            System.out.println("Sayı var");
        }
        else {
            System.out.println("Sayı yok");
        }
    }
}
