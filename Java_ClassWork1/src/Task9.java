public class Task9 {
    public static void main(String[] args) {
        /**9.	განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ
         *  მასივის ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.**/

        int[] nums = {5,46,11,54,35,2,66};

        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]+" ");
        }


        //უდიდესი და უმცირესი
        int max = nums[0];
        int min = nums[0];

        for (int i=0; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            }

            if (nums[i]<min){
                min = nums[i];
            }
        }

        System.out.println("უდიდესი ელემენტი " + max);
        System.out.println("უმცირესი ელემენტი " + min);

    }
}
