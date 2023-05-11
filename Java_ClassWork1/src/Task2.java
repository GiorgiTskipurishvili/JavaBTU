import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /**2.	დავწეროთ კოდი რომელიც გამოიტანს შეტანილი ორი მთელი რიცხვის შემთხვევაში,
         *  პირველის მეორეზე გაყოფის შედეგად მიღებულ მთელ შედეგს და
         *  მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთს. (ფორმატის გათვალისწინებით).**/

        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ პირველი რიცხვი: ");
        int num1 = scanner.nextInt();

        System.out.println("შეიყვანეთ მეორე რიცხვი: ");
        int num2 = scanner.nextInt();

        //პირველი მეორეზე გაყოფის შედეგად მიღებულ მთელი შედეგი
        int result1 = num1/num2;

        //მეორის პირველზე გაყოფის შედეგად მიღებული ნაშთი
        int result2 = num2%num1;

        //ფორმატის გათვალისწინებით
        System.out.printf("%d/%d = %d\n", num1,num2,result1);
        System.out.printf("%d/%d = %d\n", num2,num1,result2);
    }
}
