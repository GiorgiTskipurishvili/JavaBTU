public class MainCLassC {
    public static void main(String[] args) {
        ClassC cC = new ClassC();
        cC.Method1();
//        cC.Method2();
//        cC.Method3();
        System.out.println("ბოლო ციფრი: " + cC.Method2());
        System.out.println("პირველი ციფრი: "+ cC.Method3());
        System.out.println("ციფრთა ჯამი არის: "+ cC.Method4());
        cC.Method5();
        cC.Method6();
    }
}
