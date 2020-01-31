package mypackage2;

public class Testclass {

    public static void main(String[] args) {

        byte a = 5; // -128 127 это байт
        short b = -100; // -32768 32767 это шорт
        int c;
        c = 1000000;
        long d = -122335544;

        // test
        /*
        sout +tab = System.out.println
         */

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " +double1);
        // double - вещественные числа
        float float1 = 150.32f;
// к float надо подставлять f
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
// boolean имеет только два значения правда или ложь
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " +str2;
        System.out.println();
        System.out.println(str3);
        // здесь мы сложили две переменных стринг, добавив между ними пустой пробел в кавычках
        char char1 = 'q';
        System.out.println(char1);
        //в чар только 1 символ

    }
}
