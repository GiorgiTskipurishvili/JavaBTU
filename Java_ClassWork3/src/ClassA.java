public class ClassA implements ClassInterfaceA{
    /**1)	განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a=10, b=29;
     მეთოდი 1:  ბეჭდავს “Hello OPP”;
     მეთოდი 2:  ბეჭდავს a ცვლადის მნიშვნელობას;
     მეთოდი 3:  ბეჭდავს b ცვლადის მნიშვნელობას;
     მეთოდი 4:  ბეჭდავს a და b ცვლადების ჯამს;
     მეთოდი 5:  აბრუნებს a და b ცვლადების ჯამს;
     მეთოდი 6:  აბრუნებს a და b ცვლადების ნამრავლს;

     **/
    int a = 10;
    int b = 29;

    @Override
    public void Method1(){
        System.out.println("Hello OOP");
    }

    @Override
    public void Method2(){
        System.out.println("a: " + a);
    }

    @Override
    public void Method3(){
        System.out.println("b: " + b);
    }

    @Override
    public void Method4(){
        int sum = a+b;
        System.out.println("ჯამი: " + sum);
    }

    @Override
    public int Method5(){
        return a+b;
    }

    @Override
    public int Method6(){
        return a*b;
    }



}
