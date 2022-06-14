import java.util.HashMap;

public class Main {

    public static void main(String args[]){
        HashMap<String, String> sozluk = new HashMap<String, String>();

        // Hasmap eleman ekleme - put()
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        System.out.println(sozluk);

        System.out.println(sozluk.get("table"));

        for (String item : sozluk.keySet()){
            System.out.println("Eleman - " + item + " Değer : " + sozluk.get(item));
        }

        for (String item : sozluk.values()){
            System.out.println(item);
        }

        // silme işlemi -> remove
        /* sozluk.remove("table");
        System.out.println(sozluk.get("table"));
        System.out.println(sozluk); */

        /* sozluk.clear();
        System.out.println(sozluk);
        System.out.println(sozluk.size()); */

    }
}
