public class ProductValidator { // Bir ürünü kayıt ederken, güncellerken ürününün kurallara uygun olup olmadığını
    // bulmak için kullanırız

    static {
        System.out.println("static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        // Bizim ürünümüzün veritbanaına kayıt edilmesi için fiyatı 0'dan büyük ve isim verilmiş olması gerek
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void bisey(){

    }

    // inner class
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }

}
