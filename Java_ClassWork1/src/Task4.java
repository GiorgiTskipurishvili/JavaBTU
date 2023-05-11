import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**4.	შეიტანეთ სამნიშნა მთელი რიცხვი, დაბეჭდეთ  რიცხვის ციფრები ცალ-ცალკე ხაზზე.**/

        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიტანეთ სამნიშნა მთელი რიცხვი: ");
        int num = scanner.nextInt();

        String numString = Integer.toString(num);
        for (int i=0; i<numString.length(); i++){
            System.out.println(numString.charAt(i));
        }


    }
}
