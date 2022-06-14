import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws SQLException {
        // getConnection(); // Veritabanı bağlantısı
        // getSelectDemo(); // Listeleme işlemi
        // insertData(); // Ekleme işlemi
        // updateData(); // Güncelleme işlemi
        // deleteData(); // Silme işlemi
    }

    // Veritabanı bağlantısı
    public static void getConnection() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();

        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı başarılı");
        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    // Select (Listeleme işlemleri)
    public static void getSelectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null; // sql sorgusu ile ilgili işlemler yapılacak
        ResultSet resultSet; // Sonuçlar topluluğu, toplanan bilgiler buraya aktarılacak

        try{
            connection = helper.getConnection();

            statement = connection.createStatement(); // gönderilecek sorgu bu bağlantıya gidecek

            // Bu sorguyu çalıştır ve onu resultSet içine aktar
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){ // tek tek gez
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close(); // veritabanı bağlantısını kapatır
        }
    }

    // Insert (Ekleme) işlemi
    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;

        try{
            connection = helper.getConnection();

            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";

            preparedStatement  = connection.prepareStatement(sql); // sql sorgusu yazılır

            preparedStatement.setString(1,"Düzce 3");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"Turkey");
            preparedStatement.setInt(4,70000);

            // Sorguyu çalıştır
            preparedStatement.executeUpdate();
            System.out.println("Kayıt eklendi");

        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }

    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;

        try{
            connection = helper.getConnection();

            String sql = "update city set population = 80000, district = 'Düz' where id = ?";
            String sql2 = "update city set population = 110000, district = 'Düz' where id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql2);

            preparedStatement.setInt(1,4082);
            preparedStatement.setInt(1,4083);

            // sorguyu çalıştır
            preparedStatement.executeUpdate();
            System.out.println("Kayıt Güncellendi");
        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }

    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preparedStatement = null;

        try {
            connection = helper.getConnection();

            String sql = "delete from city where id = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,4084); // id'ye göre silme işlemi yapar

            // Sorguyu çalıştır
            preparedStatement.executeUpdate();
            System.out.println("Kayıt silindi");
        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }
}
