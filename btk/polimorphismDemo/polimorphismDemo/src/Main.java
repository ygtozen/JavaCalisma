public class Main {

    public static void main(String args[]){
        // BaseLogger türünde bir dizi oluşturduk
        // Dizini içerisine File,Email,Databaselogger türünde değerler koyabildik, çünkü bunlar aynı zamanda
        // birer baselogger'dır

        /*BaseLogger [] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),
        new ConsoleLogger()};

        for (BaseLogger logger : loggers){
            logger.Log("Log mesajı");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
