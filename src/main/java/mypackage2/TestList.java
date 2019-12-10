package mypackage2;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        int[] array = new int[3];


        List<Integer> list = new ArrayList<Integer>() {};

        list.add(5);//add - добавляем
        list.add(10);
        list.add(9);

        /*int a = list.get(2);

        System.out.println(list.get(1)); //get - получаем
        System.out.println(a);

        list.set(2, 100);//установить новое значение

        System.out.println(list.get(2));
        System.out.println();
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println();
        System.out.println(list.size());
        list.add(9);
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());*/

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
//        list.clear();
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(9));
        System.out.println(list.contains(987));

        list.addAll(list2);
        System.out.println();
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));











    }
}
