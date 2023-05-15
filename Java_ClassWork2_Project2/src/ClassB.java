import java.util.Random;
import java.util.Scanner;

public class ClassB {
    /**2)	განსაზღვრეთ კლასი B: ნამდვილი ტიპის m[12] მასივით;  4 მეთოდით;
     მეთოდი 1:  ანიჭებს m მასივის ელემენტებს მნიშვნელობებს კლავიატურიდან.
     მეთოდი 2:  ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [0; 15] შუალედიდან.
     მეთოდი 3:  ბეჭდავს მასივის იმ ელემენტების მნიშვნელობებს შესაბამისი ინდექსებით, რომელთა მნიშვნელობებიც მეტია 7-ზე.
     მეთოდი 4:  გვიბრუნებს მასივის უდიდესი და უმცირესი ელემენტების სხვაობას(გაბნევის დიაპაზონს).
     **/

    double[] m = new double[12];

    public void Method1(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<m.length; i++){
            System.out.println("m["+i+"]");
            m[i] = scanner.nextDouble();
        }
    }

    public void Method2(){
        Random random = new Random();
        for (int i=0; i< m.length; i++){
            m[i] = random.nextDouble();
        }
    }

    public void Method3(){
        System.out.println("7-ზე მეტი ელემენტები: ");
        for (int i = 0 ; i<m.length; i++){
            System.out.println(m[i]+" ");

        }
        System.out.println();
    }

    public double Method4(){
        double max = m[0];
        double min = m[0];

        for (int i = 1 ; i <m.length; i++){
            if (m[i]>max){
                max = m[i];
            }

            if (m[i]<min){
                min = m[i];
            }
        }


        return max - min;
    }

}
