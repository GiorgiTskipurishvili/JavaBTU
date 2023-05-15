import java.util.Scanner;

public class ClassC implements ClassInterfaceC{
    /**3)	განსაზღვრეთ კლასი C:  ორი მთელი ტიპის ცვლადით a=10, b=9, ორი სიმბოლური ტიპის ცვლადით s=’#’, h=’@’;
     მეთოდი 1:  ბეჭდავს მთელი ტიპის ცვლადების მნიშვნელობებს;
     მეთოდი 2:  ბეჭდავს სიმბოლური ტიპის ცვლადების მნიშ¬ვნე¬ლო¬ბებს;
     მეთოდი 3:  ბეჭდავს a და b ცვლადების ჯამს, ნამრავლს, სხვაობას, ნაშთიან გაყოფას ცალ-ცალკე სტრიქონზე;
     მეთოდი 4:  ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
     მეთოდი 5:  ანიჭებს b ცვლადს მნიშვნელობას კლავიატურიდან;
     მეთოდი 6:  ანიჭებს სიმბოლური ტიპის ცვლადებს მნიშვნელობებს კლავიატურიდან;
     **/
    int a = 10;
    int b = 9;
    char s = '#';
    char h = '@';

    @Override
    public void Method1(){
        System.out.println("a: " + a );
        System.out.println("b: " + b );
    }

    @Override
    public void Method2(){
        System.out.println("s: " + s);
        System.out.println("h: " + h);
    }

    @Override
    public void Method3(){
        System.out.println("ჯამი: " + (a+b));
        System.out.println("ნამრავლი: " + (a*b));
        System.out.println("სხვაობა: " + (a-b));
        System.out.println("ნაშთი: " + (a%b));
    }

    @Override
    public void Method4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შიყვანეთ ახალი ცვლადი კლავიატურიდან a: ");
        a = scanner.nextInt();
        System.out.println("new a: "+a);
    }

    @Override
    public void Method5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შიყვანეთ ახალი ცვლადი კლავიატურიდან b: ");
        b = scanner.nextInt();
        System.out.println("new b: " + b);
    }

    @Override
    public void Method6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სიმბოლო კლავიატურიდან: ");
        char s= scanner.next().charAt(0);
        System.out.println(s);
    }

}
