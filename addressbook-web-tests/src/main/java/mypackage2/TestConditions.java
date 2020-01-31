package mypackage2;

public class TestConditions {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Start of program");

        if (i > 10) { // с ИФ начинается условие в круглых скобках делаем условие, а в фигурных то, что выполняется
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5){
            System.out.println("1 < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }
        System.out.println("End of progress");
        System.out.println();

        i = 95;

        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            } else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
            }
        System.out.println();

        i = 10;

        switch (i){
            case 1:
                System.out.println("Then number is 1");
                break;
            case 2:
                System.out.println("Then number is 2");
                break;
            case 3:
                System.out.println("Then number is 3");
                break;
            default:
                System.out.println("I don't know the number!");


        }

        }

    }

