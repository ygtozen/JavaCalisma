import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        // createFile(); -> dosya oluşturma
        // getFileInfo(); -> dosyadan bilgi alma
        readFile(); // dosya okuma

        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("D:\\java\\btk\\files\\students.txt");

        try {
            // yeni bir dosya oluştur
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(); // hatayı metin olarak yazar
        }
    }

    // Dosya ile ilgili bilgileri alacağız
    public static void getFileInfo(){
        File file = new File("D:\\java\\btk\\files\\students.txt");
        if (file.exists()){ // file.exist()-> eğer böyle bir dosya varsa
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu (byte): " + file.length());
        }
    }

    // Dosya okuma
    public static void readFile(){
        File file = new File("D:\\java\\btk\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine(); // satır satır okuma
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) { // FileNotFoundException-> bu dosya yoksa
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\java\\btk\\files\\students.txt",true));
            writer.newLine(); // yeni satır oluştur
            writer.write("Engin");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }


}
