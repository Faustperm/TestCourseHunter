package mypackage2;

public class TestOperations {

    public static void main(String[] args) {

        //операция присваивание
        int a;

        a = 10; //мы присвоили переменной а значение 10
        a = 20; //перезаписали
        //выводим на экран значение последнее
        System.out.println(a);

        int b = a; //мы присволиил значение переменной b значение переменной a
        System.out.println(b);
        int c, d;

        c = d = b;

        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println();
        System.out.println(a + b);//здесь сложили и получилось 18
        System.out.println(a - b);//здесь вычли и получилось 8
        System.out.println(a * b);//здесь умножили и получилось 65
        System.out.println(a / b);//здесь поделили числа типа int поэтому только целое число
        double e = 15;
        double f = 7;
        System.out.println(e / f);//получили дробное
        System.out.println(a % b);//получение с помощью знака процента остатка от деления

        a = b + c * d;

        System.out.println(a);

        a = (b + c) * d;
        System.out.println(a);

        a = 15;
        b = 10;

        System.out.println();
        System.out.println(a > b); //сравнили и получили, сравнение имеет только два значения
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a + 10 <= b + 15);
        //сейчас будет результат отрицания
        System.out.println(!(a + 10 <= b + 15));
        System.out.println(!(false)); //просто выведем отрицание
        System.out.println();

        int i = 0;
        i++; //i = i + 1;
        System.out.println(i); //это операция инкремента, т.е. прибавление единицы
        i--; // i = i - 1;
        System.out.println(i); //это операция декремента, вычитание единицы

        i = 5;
        System.out.println();
        System.out.println(i++);//здесь вывелось число 5 потому что сначала вывели, а потом суммировали
        System.out.println(i);
        System.out.println();

        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);

        a = 10;
        b = 20;

        System.out.println();
        System.out.println(a > b || a < b);//операция сравнение и операция булиновского типа "или"
        System.out.println(a > b || b > 30);
        System.out.println(a > b && a < b);//не оба выражения дают true, значит получаем false
        System.out.println(a > 9 && b == 20);//оба верны и получаем true

        System.out.println();
        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b));//сначала приоритет имеет арифметические операции, затем
        //сравнятеся с 15 и будет результат, получится true, далее из b вычтется 5 и сравнится с числом 10 и получим true
        ///затем а сравнится с b и будет труе и затем операция "и" что даст true, потом свяжутся оба выражения через или
        //и получим true, но со знаком отрицания получим false
        System.out.println(!((a + 10 > 15 || b - 5 > 10) && a < b));//добавили скобки что дало приоритет первой части

        a = 9;
        System.out.println();
        System.out.println(Math.sqrt(a));//вычислили корень из девяти
        System.out.println(Math.pow(a, 3));//возведем a в 3 степень

        a = 10;
        a = a + 5;
        System.out.println();
        System.out.println(a);

        a = 10;
        a += 5; //идентична выше
        System.out.println();
        System.out.println(a);
        a -= 5;// a = a - 5
        System.out.println(a);
        a *= 2;// a = a * 2
        System.out.println(a);
        a /= 2;// a = a / 2
        System.out.println(a);

        a %= 3; // a = a % 3 остаток от деления
        System.out.println(a);





    }
}
