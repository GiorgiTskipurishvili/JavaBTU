import java.util.Scanner;

public class ClassC {
    /**3)	განსაზღვრეთ კლასი C: სამი მთელი ტიპის  ცვლადით a, b, c;  6 მეთოდით;
     მეთოდი 1:  ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან.
     მეთოდი 2: აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს.
     მეთოდი 3: აბრუნებს b-ს მნიშვნელობის  პირველ ციფრს.
     მეთოდი 4: აბრუნებს  c-ს მნიშვნელობის  ციფრთა ჯამს.
     მეთოდი 5: ბეჭდავს მეთოდი 1-ის მნიშნველობისა და მეთოდი 2-ის მნიშ¬ვნე-ლობის ნამრავლს.
     მეთოდი 6: ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის მნიშ¬ვნე-ლობის ჯამს.
     **/

    int a,b,c;
    Scanner scanner = new Scanner(System.in);

    public void Method1(){
        System.out.println("შეიყვანეთ a რიცხვი: ");
        a = scanner.nextInt();
        System.out.println("შეიყვანეთ b რიცხვი: ");
        b = scanner.nextInt();
        System.out.println("შეიყვანეთ c რიცხვი: ");
        c = scanner.nextInt();
    }

    public int Method2(){
        return a % 10;
    }

    public int Method3(){
        int firstDigit = b;
        while (firstDigit>=10){
            firstDigit /= 10;
        }
        return firstDigit;
    }


    public int Method4(){
        int sum = 0;
        int num = c;

        while (num!=0){
            sum += num % 10;
            num /=10;
        }
        return sum;
    }


    public void Method5(){
        int p = Method2() * Method3();
        System.out.println("მეორე და მესამე მეთოდების ნამრავლი: " +  p );
    }


    public void Method6(){
        int s = Method4() + (Method2()*Method3());
        System.out.println("მეოთხე და მეხუთე მეთოდების ჯამი: " + s);
    }

}
