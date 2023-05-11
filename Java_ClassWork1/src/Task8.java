public class Task8 {
    public static void main(String[] args) {
        /**9.	განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, \
         * დაბეჭდეთ მასივის ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.**/

        int[] array = {5,8,3,12,7,6,1,9};

        int max = array[0];
        int min = array[0];

        System.out.println("მასივის ელემენტები ");

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i] + " ");

            if (array[i]> max){
                max = array[i];
            }


            if (array[i]<min){
                min = array[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

    }
}
