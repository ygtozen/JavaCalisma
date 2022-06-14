public class Main {

    public static void main(String args[]){
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStokAmount(3);

        // Parametreli constuructor
        Product product2 = new
                Product(2,"Laptop","Asus Laptop",3000,2,"Siyah");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

        //System.out.println(product.name);
    }
}
