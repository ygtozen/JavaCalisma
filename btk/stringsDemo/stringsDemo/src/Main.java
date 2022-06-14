public class Main {

    public static void main(String args[]){
        String mesaj = "   Bugün hava çok güzel.    ";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b")); // B ile başlıyormu
        System.out.println(mesaj.endsWith("."));

        char [] karakterler = new char[5];
        // 0'dan itibaren 4'e kadar karakterler dizisine ata 0.indexten itibaren
        mesaj.getChars(0,5, karakterler, 0); // Karakterleri al
        System.out.println(karakterler);

        // İstenilen karakterin mesajın içinde kaçıncı eleman olduğunu bulur
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.indexOf("av"));

        // Sondan arama yapar
        System.out.println(mesaj.lastIndexOf("a"));*/

        // replace --> Harf Değiştirme
        String yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        //System.out.println(mesaj.replace(" ","-");

        // SubString --> Bir metnin içerisinden parça almak
        System.out.println(mesaj.substring(2)); // mesajın 2.indekisnen itibaren parçala
        System.out.println(mesaj.substring(2,4)); // 2.indexten 4.indexe kadar keser

        // Split --> Bir metni parçalamaya yarar, dizi olarak verir
        for (String kelime : mesaj.split(" ")){ // boşluğa göre ayır, kelime kelime ayırdı
            System.out.println(kelime);
        }

        // tolowercase --> mesajı küçük harfe çeviri
        System.out.println(mesaj.toLowerCase());

        // touppercase --> mesajı büyük harfe çevir
        // Özellikle veritabanlarına arama gönderdiğimizde kullanabiliriz.
        System.out.println(mesaj.toUpperCase());

        // Baştaki ve sondaki boşlukları atar
        System.out.println(mesaj.trim());
    }
}
