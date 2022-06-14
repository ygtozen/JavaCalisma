public class Main {

    public static void main(String args[]){

        try {
            // Buradaki kodları dene, çalıştır
            int [] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (StringIndexOutOfBoundsException exception){ // Böyle bir hata olursa böyle yap
            //System.out.println("Hata oluştu");
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){ // Böyle bir hata olursa böyle yap
            System.out.println(exception);
        }catch (Exception exception){ // Bunların dışında bir hata olursa yap
            System.out.println("Loglandı : " + exception);
        }
        finally { // En son çalışacak blok - ister try çalışsın ister catch çalışsın final her türlü çalışır
            System.out.println("Ben her türlü çalışırım");
        }

    }
}
