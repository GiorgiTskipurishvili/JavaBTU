import java.util.Scanner;

public class ClassB implements ClassInterfacceB{
    /**2)	განსაზღვრეთ კლასი B:  მთელი ტიპის ცვლადით a=33, ნამდვილი ტიპის ცვლადით b=9.7, სიმბოლური ტიპის ცვლადით s=’#’;
     მეთოდი 1:  ბეჭდავს s ცვლადის მნიშვნელობას;
     მეთოდი 2:  ბეჭდავს a ცვლადის მნიშვნელობას;
     მეთოდი 3:  ბეჭდავს b ცვლადის მნიშვნელობას;
     მეთოდი 4:  ბეჭდავს a და b ცვლადების სხვაობას;
     მეთოდი 5:  აბრუნებს a და b ცვლადების განაყოფს;
     მეთოდი 6:  ანიჭებს ცვლადებს სხვა ნებისმიერ შესაბამისი ტიპის მნიშ¬ვნე¬ლობას;
     მეთოდი 7:  ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
     მეთოდი 8:  ბეჭდავს b ცვლადზე 10-ით მეტ რიცხვს.
     **/
    int a = 33;
    double b = 9.7;
    char s = '#';

    @Override
    public void Method1(){
        System.out.println("s: " + s);
    }

    @Override
    public void Method2(){
        System.out.println("a: " + a);
    }

    @Override
    public void Method3(){
        System.out.println("b: "+b);
    }

    @Override
    public void Method4(){
        System.out.println("სხვაობა ");
        System.out.println(a-b);
    }

    @Override
    public double Method5(){
        return a/b;
    }

    @Override
    public void Method7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ ნებისმმიერი რიცხვი: ");
        double a = scanner.nextDouble();
    }

    @Override
    public void Method8(){
        System.out.println("b ცვლადზე მეტი რიცხვი (b+10)");
        System.out.println(b+10);
    }

}
