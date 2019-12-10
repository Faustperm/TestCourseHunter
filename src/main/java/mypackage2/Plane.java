package mypackage2;

public class Plane implements Transport {

    @Override
    public void go() {
        System.out.println("We are flying on a plane!");

    }

    @Override
    public void stop(){
        System.out.println("We are landing!");
    }

    public void setSpeed(int speed){
        System.out.println("Out speed is: " + speed);
    }
}
