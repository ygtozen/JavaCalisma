import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String args[]) throws SQLException {


        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // sql cümleciğimizle ilgili işlemleri yapacak
        ResultSet resultSet; // Sonuçlar topluluğu, sorgu sonunda gelen bilgiler buraya geliyor

        try {
            connection = helper.getConnection();
            String sql = "delete from city where id = ?";

            // Sorguyu oluştur
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081); // id'ye göre silme yaptık

            // sorguyu çalıştır
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close(); // statement bağlantısını kapatır
            connection.close(); // veritabanı bağlantısını kapatır
        }

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null; // sql cümleciğimizle ilgili işlemleri yapacak
        ResultSet resultSet; // Sonuçlar topluluğu, sorgu sonunda gelen bilgiler buraya geliyor

        try {
            connection = helper.getConnection();
            //System.out.println("Bağlantı oluştu");

            statement = connection.createStatement(); // gönderilecek sorgu bu bağlantıya gidecek
            // bu sorguyu çalıştır ve onu resultset'e aktar
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries = new ArrayList<Country>();
            // resultset içindeki data'yı ekrana yazdıralım
            while (resultSet.next()){ // resultSet.next()-> tek tek gez
                //System.out.println(resultSet.getString("Name"));
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close(); // bağlantıyı kapatır
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // sql cümleciğimizle ilgili işlemleri yapacak
        ResultSet resultSet; // Sonuçlar topluluğu, sorgu sonunda gelen bilgiler buraya geliyor

        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";

            // Sorguyu oluştur
            statement = connection.prepareStatement(sql);

            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);

            // sorguyu çalıştır
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close(); // bağlantıyı kapatır
        }
    }

    public void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; // sql cümleciğimizle ilgili işlemleri yapacak
        ResultSet resultSet; // Sonuçlar topluluğu, sorgu sonunda gelen bilgiler buraya geliyor

        try {
            connection = helper.getConnection();
            String sql = "update city set population = 100000, district = 'Turkey' where id = ?";

            // Sorguyu oluştur
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081); // id'ye göre güncelleme yaptık

            // sorguyu çalıştır
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close(); // statement bağlantısını kapatır
            connection.close(); // veritabanı bağlantısını kapatır
        }
    }
}
