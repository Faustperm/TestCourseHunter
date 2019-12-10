package mypackage2;

public class TestString {

    public static void main(String[] args) {

        String s = "Hello World"; //стринг это целый класс

        System.out.println(s.equals("Hello World"));//тут строки равны
        System.out.println(s.equals("Hello!"));//а тут нет

        String s2 = "hello";

        System.out.println(s.equals(s2));
        System.out.println();

        s = "text";
        s2 = "TEXT";

        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));//сравнение будет производиться без учета регистра

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));//указываем индекс буквы в строке, начиная с 0
        System.out.println(s.indexOf("Xt"));//здесь указываем нужны фрагмент и получаем индекс

        s = "Hello World!";
        System.out.println(s.contains("Hello"));//этот кусок содержится и значит тру
        System.out.println(s.contains("text"));//этого куска нет в строчке, значит фолс
        System.out.println();
        System.out.println(s.length());//узнаем длину строки

        System.out.println();
        System.out.println(s.startsWith("He"));//начинается строка
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));//заканчивается строка
        System.out.println(s.endsWith("!"));

        s = "hello,world";
        System.out.println();
        String[] array = s.split(",");//используем разделитель
        System.out.println(array[0] + "!" + array [1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s! I'm %d years old!";
        int age  = 30;
        String name = "Ivan";

        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Vasya", 10));
        System.out.println();

        String age2 = "30";
        int a = Integer.parseInt(age2);//делаем из строки число инт путем парсинга

        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println(s.substring(1, 5));//обрезаем строку с 1 символа по 5ый и выводим
        System.out.println(s.substring(7));//обрезали с 7ого индекса и до самого конца строки

        System.out.println(s.substring(7, s.length() - 2));//тут мы совместили методы и обрезали и вывели общую длину и отняли от нее

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;//слияние трех строк
        System.out.println(res);

        res = s1.concat(s2.concat(s3));//тоже слияние, но лучше
        System.out.println(res);


    }
}
