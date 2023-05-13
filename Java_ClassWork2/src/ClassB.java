import java.util.Scanner;

public class ClassB {
    /**2)	განსაზღვრეთ კლასი B: სამი  მთელი ტიპის ცვლადით a, b, c;  3 მეთოდით;
     მეთოდი 1:  ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან.
     მეთოდი 2: ბეჭდავს ცვლადებს შორის მაქსიმალურს.
     მეთოდი 3: გვიბრუნებს ცვლადებს შორის მინიმალურს.
     **/

    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    int c;

    public void Method1(){
        System.out.println("შეიყვანეთ a რიცხვი: ");
        a = scanner.nextInt();
        System.out.println("შეიყვანეთ b რიცხვი: ");
        b = scanner.nextInt();
        System.out.println("შეიყვანეთ c რიცხვი: ");
        c = scanner.nextInt();
    }

    public void Method2(){
        int max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("მაქსიმალური რიცხვი არის: " + max);
    }


    public void Method3(){
        int min=a;
        if (b<min){
            min=b;
        }
        if (c<min){
            min=c;
        }
        System.out.println("მინიმალური რიცხვი არის: " + min);
    }
}
