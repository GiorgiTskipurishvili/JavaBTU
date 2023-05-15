public class Class3 {
    /**3.	განსაზღვრეთ კლასი: მთელი ტიპის a, b, x ცვლადით. 2  კონსტრუქტორით,  2 მეთოდით.
     კონსტრუქტორი 1: ცარიელია;
     კონსტრუქტორი 2: ახდენს a და b ცვლადის ინიციალიზაციას;
     მეთოდი 1: ადგენს [a; b] წარმოადგენს თუ არა შუალედს;
     მეთოდი 2: ადგენს x ცვლადი მდებარეობს თუ არა [a; b] შუალედში;
     **/
    private int a ;
    private int b;
    private int x;

    public Class3(){
        //empty
    }

    public Class3(int a, int b){
        this.a = a;
        this.b = b;
    }

    public boolean Method1(){
        return x >= a && x <= b;
    }


    public boolean Method2(){
        return a <= x && x <= b;
    }
}
