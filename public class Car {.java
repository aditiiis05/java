public class Car {
    String model;
    int year;
    public Car() {
        model ="Unknown";
        year = 0;

        //model ="Toyota Innova";
        //year = 2024;
    }
    public static void main (String [] args) {
        Car myCar = new Car();
        System.out.println("Car Model:" + myCar.model);
        System.out.println("Manufacturing Year:" + myCar.year);
    }
}