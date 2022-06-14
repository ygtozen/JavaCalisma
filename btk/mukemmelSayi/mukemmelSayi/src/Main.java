public class Main {

    public static void main(String args[]){
        // Kendisine bölünen sayıların toplamı kendine eşitse mükemmel sayıdır
        // 6 --> 1,2,3
        // 28 --> 1,2,4,7,14

        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total = total + i;
            }
        }

        if (number == total){
            System.out.println(number + " ,mükemmel sayıdır");
        }
        else{
            System.out.println(number + " ,mükemmel sayı değildir");
        }
    }
}
