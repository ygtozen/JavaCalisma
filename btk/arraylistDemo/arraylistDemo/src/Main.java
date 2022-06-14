import java.util.ArrayList;

public class Main {

    public static void main(String args[]){
        ArrayList sayilar = new ArrayList();

        // ArrayList'e elaman ekleme
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println("Array Eleman Sayısı : " + sayilar.size());

        // İndekse göre eleman okuma - get()
        System.out.println(sayilar.get(2));

        // Elemanı değiştirmke - set() --> 0 indexi 100 yapar
        // sayilar.set(0,100);
        // System.out.println(sayilar.get(0));

        // Listeden eleman silmek - remove()
        // sayilar.remove(0);
        // System.out.println("0.index : " + sayilar.get(0));

        // Tüm elemanları silemek - clear()
        // sayilar.clear();
        // System.out.println(sayilar.get(0)); --> liste silindiği içiçn hata verdi

        for (Object sayi : sayilar){
            System.out.println(sayi);
        }


    }
}
