public class FileLogger extends BaseLogger{ // Dosyaya log'lama
// hangi dosya yazılacağı girilir
    public void log(String message){
        System.out.println("Log to file : " + message);
    }
}
