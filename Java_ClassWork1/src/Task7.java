import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /**7.	იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და
         * უმცირესი საერთო ჯერადი.(ევკლიდეს ალგორითმი).**/
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ პირველი რიცხვი: ");
        int num1 = scanner.nextInt();
        System.out.println("შეიყვანეთ მეორე რიცხვი: ");
        int num2 = scanner.nextInt();

        int gcd = findGcd(num1, num2);
        int lmc = findLcm(num1,num2,gcd);

        System.out.println("უდიდესი საერთო გამყოფი არის " + num1 + " და " + num2 + " = " + gcd);
        System.out.println("უმცირესი საერთო გამყოფი არის " + num1 + " და " + num2 + " = " + lmc );


    }

    public static int findGcd(int num1, int num2){
        if (num2==0){
            return num1;
        }
        return findGcd(num2,num1%num2);
    }

    public static int findLcm(int num1, int num2, int gcd){
        return (num1*num2) / gcd;
    }
}
