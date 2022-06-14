import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo extends JFrame {
    private JPanel panel1;
    private JTable table1;

    DefaultTableModel model;

    public Demo() {
        initComponents();
        model = (DefaultTableModel) tblCityies.getModel();
        try {
            ArrayList<City> cities = getCities();
            for(City city : cities){
                Object[] row = {city.getId(), city.getName(), city.getCountryCode(), city.getPopulation()};
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<City> getCities() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null; // veritabanına sorgu göndericez
        ResultSet resultSet;

        ArrayList<City> cities = null;

        try{
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from city");
            cities = new ArrayList<>();
            while (resultSet.next()){
                cities.add(new City(
                        resultSet.getInt("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("Population")));
            }

        } catch(SQLException exception){
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            statement.close();
        }

        return cities;
    }
}
