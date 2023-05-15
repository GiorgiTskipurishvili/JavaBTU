public class Class1 {
    /**1.	განსაზღვრეთ კლასი: მთელი ტიპის x ცვლადით. კონსტრუქტორით,  1 მეთოდით.
     კონსტრუქტორი 1: ბეჭდავს „hello My Class“;
     მეთოდი 1: ადგენს x ლუწია თუ კენტი;
     **/

    private int x;

    public Class1(){
        System.out.println("hello My Class");
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x =x;
    }

    public void Method1(){
        if (this.x%2 == 0){
            System.out.println(this.x + " არის ლუწი");
        }else {
            System.out.println(this.x +" არის კენტი");
        }
    }

}
