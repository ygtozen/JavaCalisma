public class MySqlCustomerDal extends OracleCustomerDal implements IcustomerDal, IRepository{
    // Bu class ICustomerDal'dan implementasyon aldığı için Add() fonksiyonunu kullanmak zorunda

    @Override
    public void Add() {
        System.out.println("MySql eklendi");
    }
}
