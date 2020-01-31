package mypackage2;

public class TestClassObjects {

    static int var = 10;
    static void method(){
        System.out.println("Static method.");
    }



   /* public TestClassObjects(){
        System.out.println("New car created!");
                ]

    }

    public TestClassObjects(String color, int height, int width, int length){
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;

        System.out.println("New car created!");
    }*/


    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("New weight: " + this.weight);

    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We are driving!");

        } else {
            System.out.println("Cannot drive");
        }
    }
}
