public class Class2 {
    /**2.	განსაზღვრეთ კლასი: მთელი ტიპის x ცვლადით. 2  კონსტრუქტორით,  1 მეთოდით.
     კონსტრუქტორი 1: ცარიელია;
     კონსტრუქტორი 2: ახდენს x ცვლადის ინიციალიზაციას;
     მეთოდი 1: ადგენს x-ის მნიშვნელობა მოთავსებულია თუ არა [5; 24] შუალედში;
     **/

    private int x;

    public Class2(){
        //empty
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public void Method1(){
        if (x>=5 && x<=24){
            System.out.println(x + " არის [5,24] შუალედში");
        }else {
            System.out.println(x + " არ არის [5,24] შუალედში");
        }
    }

}
