import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /** 3.	შეიტანეთ სამი მთელი რიცხვი, გამოიტანეთ მათი ჯამი და ნამრავლი. **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ სამი მთელი რიცხვი: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        //ჯამი
        int sum = num1 + num2 + num3;

        //ნამრავლი
        int multiples = num1*num2*num3;

        System.out.println("ჯამი " + sum);
        System.out.println("ნამრავლი " + multiples);


    }
}
