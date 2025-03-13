// Define an interface 
interface vehicle
{
    void start (); //Abstaract method
}
 //Class implementing the interface
class Car implements vehicle {
    public void start() {
        System.out.println("Car is starting with key ignition.");
    }
}

//Test class
class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}