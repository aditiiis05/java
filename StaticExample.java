public class StaticExample {

    static int staticVariable = 10;

    static {
        System.out.println("Static Block Executed.");
        staticVariable = 20;

        System.out.println("Static variable initialized in static block:" + staticVariable);

    }
    static void staticMethod() {
      System.out.println("Static Method Executed.");
      System.out.println("Value of static variable:" + staticVariable);
    }
    public static void main(String[]args){
        System.out.println("Main Method Executed.");

        System.out.println("Static Variable:" + staticVariable);

        staticMethod();
    }
}