public class DatabaseLogger extends BaseLogger { // Veritabanına log'layan bir class
// hangi veritabanı ise o kodlar yazılır
    public void log(String message){
        System.out.println("Log to database : " + message);
    }
}
