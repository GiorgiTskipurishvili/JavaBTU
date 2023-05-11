import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        /**11.	განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.**/


        int[] array = new int[8];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }



        System.out.println(Arrays.toString(array));

    }
}
