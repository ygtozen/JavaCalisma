public class Main {

    public static void main(String args[]){
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDal());

        //customerManager.icustomerDal = new OracleCustomerDal();

        customerManager.add();
    }
}
