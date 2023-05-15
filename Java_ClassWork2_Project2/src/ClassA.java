import java.util.Random;
import java.util.Scanner;

public class ClassA {
    /**1)	განსაზღვრეთ კლასი A: მთელი ტიპის m[10] მასივით;  4 მეთოდით;
     მეთოდი 1:  ანიჭებს m მასივის ელემენტებს მნიშვნელობებს კლავიატურიდან.
     მეთოდი 2:   ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [0; 15] შუალედუდან.
     მეთოდი 3:  გვიბრუნებს იმ ელემენტების მნიშვნელობათა ჯამს, რომლის მნი¬შვნელობა თავის ინდექსზე ნაკლებია.
     მეთოდი 4:  გვიბრუნებს იმ ელემენტების ინდექსების ნამრავლს, რომლის მნი¬შვნელობა თავის ინდექსზე მეტია.
     **/

    private int[] m = new int[10];

    public void Method1(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<m.length; i++){
            System.out.println("m["+i+"]");
            m[i] = scanner.nextInt();
        }
    }

    public void Method2(){
        Random random = new Random();
        for (int i=0; i<m.length; i++){
            m[i] = random.nextInt(16);
        }
    }

    public int Method3(){
        int sum =0;
        for (int i = 0; i<m.length; i++){
            if (m[i]<i){
                sum += m[i];
            }
        }
        return sum;
    }


    public int Method4(){
        int p = 0;
        for (int i=0; i<m.length; i++){
            if(m[i]>i){
                p *= m[i];
            }
        }
        return p;
    }
}
