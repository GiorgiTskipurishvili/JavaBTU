public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Human obj = new Human();
        obj.setAge(20);
        obj.setName("John Doe");
        System.out.println(obj.getName()+ " " + obj.getAge());

    }
}