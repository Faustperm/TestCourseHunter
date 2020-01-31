package mypackage2;

public class TestMassive {

    public static void main(String[] args) {
        //psvm - и будет как наверху

        String[] names; //вот так создается массив Стринг с названием names
        names = new String[3]; //выделили область памяти для хранения массива в кол-ве 3 ячеек


        String[] name = new String[3];
        int[] arr = new int[10]; //здесь 10 элементов типа инт в массиве арр

        name[0] = "Vasya";
        name[1] = "Petya";
        name[2] = "Vanya";
        //нумерация начинается с ноля
        System.out.println(name[0]);
        System.out.println(name[2]);

        arr[3] = 15;
        arr[3] = 10;
        System.out.println(arr[3]);

        int[] array = {15, 10, 100, 9, 44};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            //здесь цикл выводит на экран все пять элементов, потому что i не должно быть более 5
        }
        int[] arr2 = new int[15];

        System.out.println();

        for (int j = 0; j < 15; j++) {
            arr2[j] = j * 10;
            System.out.println(arr2[j]); //мы заполнили массив и вывели каждый элемент на экран с помощью цикла
        }
        System.out.println();
        System.out.println(arr2.length);
        System.out.println("выводим последний элемент массива, для этого вычитаем единицу из общего количества");
        System.out.println(arr2[arr2.length - 1]);


    }
}
