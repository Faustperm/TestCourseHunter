package mypackage2;

public class TestAbstract {

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();

        dog.walk("Park");
        dog.saySmth();

        cat.walk("Backyard");
        cat.eat();

    }
}
