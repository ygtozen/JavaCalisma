public class Product {
    // Attribute or Field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stokAmount;
    private String renk;
    private String kod;

    public Product(){

    }

    public Product(int id, String name, String description, double price, int stokAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stokAmount = stokAmount;
        this.renk = renk;
    }

    // getter
    public int getId() { // id'yi okuyabilir
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        // Kod'a kullanıcının yazmasını istemiyorsak setter'ı sileriz, böylece kullanıcı yazamaz- readonly
        // name'in ilk harfi ve id'yi kod olarak ekler
        return this.name.substring(0,1) + id;
    }

}
