import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        /**12.	განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი,
         *  ჩაწერეთ მასში შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით,
         *  დაბეჭდეთ მასივი.**/

//        int[] nums = {4,12,45,7,55,77,34,68};
//
//        for (int i = 0; i <nums.length; i++){
//            System.out.println(nums[i]);
//        }

        int[] array = new int[8];
        Random random = new Random();


        for (int i =0; i <array.length; i++){
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
