import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) {

        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(
                    new FileReader("D:\\java\\btk\\readingFileDemo\\readingFileDemo\\src\\sayilar.txt"));

            String line = null;
            while ((line = reader.readLine()) != null){
                total += Integer.valueOf(line); // değeri int'e çeviri
            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            //e.printStackTrace();
            System.out.println("Sayılarda hata var");
        }
        finally {
            try{
                reader.close();
            }catch (Exception exception){

            }

        }
    }
}
