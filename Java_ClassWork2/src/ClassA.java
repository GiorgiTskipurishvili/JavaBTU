import java.util.Scanner;

public class ClassA {
    /**1)	განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a, b;  3 მეთოდით;
     მეთოდი 1:  ანიჭებს a და b ცვლადებს მნიშვნელობებს კლავიატურიდან.
     მეთოდი 2:  დაბეჭდოს ცვლადების ჯამი.
     მეთოდი 3:  დაგვიბრუნოს ცვლადების ნამრავლი.
     **/

    Scanner scanner = new Scanner(System.in);

    int a;
    int b;

    public void Method1(){
        System.out.println("შეიყვანეთ a რიცხვი: ");
        a = scanner.nextInt();
        System.out.println("შეიყვანეთ b რიცხვი: ");
        b = scanner.nextInt();
    }

    public void Methodi2(){
        int sum = a+b;
        System.out.println("ჯამი: " + sum);
    }


    public int Method3(){
        return a*b;
    }

}
