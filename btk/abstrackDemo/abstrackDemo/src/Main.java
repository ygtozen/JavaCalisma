public class Main {

    public static void main(String args[]){
        // Bir müşterinin veritabanına kayıt etmesi örneğini uygulayacağız

        CustomerManager customerManager = new CustomerManager();
        //customerManager.databaseManager = new OracleDatabaseManager();
        //customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
