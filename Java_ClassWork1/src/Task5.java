import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /**5.	შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.**/

        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიტანეთ ოთხნიშნა მთელი რიცხვი: ");
        int num = scanner.nextInt();


        int sum = 0;
        while (num!=0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }

        System.out.println("ციფრთა ჯამი არის: " + sum);

    }
}
