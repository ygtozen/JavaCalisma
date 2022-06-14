public class Main {

    public static void main(String args[]) {
        double[] myList = new double[4];
        double[] myList1 = {1.2, 6.3, 4.3, 5.6};

        double total = 0;

        double max = myList1[0];
        double min = myList1[0];

        for (double number : myList1) {
            if (max < number) {
                max = number;
            }

            if (min > number) {
                min = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam : " + total);
        System.out.println("En Büyk Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
