import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        /**10.	განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი ზრდადობით, დაბეჭდეთ მასივი.**/

        int[] array = new int[8];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }


        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
