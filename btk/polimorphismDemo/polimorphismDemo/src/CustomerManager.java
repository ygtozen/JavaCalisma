public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    // Veritabanına müşteri kayıt edeceğiz
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
    }
}
