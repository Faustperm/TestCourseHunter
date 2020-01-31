package mypackage2;

public class NewTest {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");

        try {
            devide(10, 2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


    public static void devide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot devide by zero!");
        } else {
            System.out.println("Result is: " + a / b);
        }


    }
        TestClassObjects car1 = new TestClassObjects();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        TestClassObjects car2 = new TestClassObjects();
        car2.color = "White";
        TestClassObjects car3 = new TestClassObjects();
        car2.color = "Red";

        car2.drive(100);
        car3.drive(150);

        TestClassObjects car4 = new TestClassObjects("Black");

        System.out.println("Car color is: " + car4.color);

        TestClassObjects car5 = new TestClassObjects("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);*/

        TestClassObjects car1 = new TestClassObjects();
        TestClassObjects car11 = car1;
        car11.color = "Black";
        car11.length = 5000;
        car11.height = 2000;
        car11.width = 2000;

        car11.addWeight(50);
        car11.drive(120);

        car11.addWeight(700);
        car11.drive(100);

        TestClassObjects car2 = new TestClassObjects();
        car2.color = "White";
        TestClassObjects car3 = new TestClassObjects();
        car2.color = "Red";

        car2.drive(100);
        car3.drive(150);

        /*TestClassObjects car4 = new TestClassObjects("Black");

        System.out.println("Car color is: " + car4.color);

        TestClassObjects car5 = new TestClassObjects("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);*/
        System.out.println();


        System.out.println(TestClassObjects.var);

        TestClassObjects.var = 100;

        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);

        TestClassObjects.method();



    }


}


// это моя первая программа
