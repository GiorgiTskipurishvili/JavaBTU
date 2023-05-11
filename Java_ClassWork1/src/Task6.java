import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /**6.	შეიტანეთ ნებისმიერი მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.**/
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიტანეთ ნებისმიერი მთელი რიცხვი: ");
        int num = scanner.nextInt();

        int sum = 0;
        while (num!=0){
            int digit = num%10;
            sum +=digit;
            num /=10;
        }

        System.out.println("ციფრთა ჯამი არის: " + sum);
    }
}
