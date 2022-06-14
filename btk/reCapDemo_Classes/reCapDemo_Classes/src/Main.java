public class Main {

    public static void main(String args[]){
        DortIslem dortIslem = new DortIslem();
        int toplama = dortIslem.Topla(3,4);
        System.out.println("Toplama : " + toplama);
        int cikarma = dortIslem.Cikar(10,5);
        System.out.println("Çıkarma : " + cikarma);
        int carpma = dortIslem.Carp(49,10);
        System.out.println("Çarpma : " + carpma);
        int bolme = dortIslem.Bolme(10,2);
        System.out.println("Bölme : " + bolme);
    }
}
