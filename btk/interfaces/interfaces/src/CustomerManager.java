public class CustomerManager {

    private IcustomerDal customerDal;

    public CustomerManager(IcustomerDal icustomerDal){
        this.customerDal = icustomerDal;
    }

    public void add(){
        // İş kodları yazılır

        customerDal.Add();
    }
}
