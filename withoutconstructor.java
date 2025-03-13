class Car {
    String brand;
    int speed;

    void setDetails(String b, int s) {
        brand = b;
        speed = s;
    }
     void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "km/h");
     }
}

public class Main{
    public static void main(String[] args) {
       Car myCar = new Car();

       myCar.setDetails("Toyota", 120);
       myCar.display();
    }
}