package mypackage2;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {//сет - это коллекция, которая хранит уникальные объекты, индексов нет, метода get нет

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        System.out.println(set.size());
        System.out.println();

        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        //       for (int i : set) { //с помощью оператора FOR мы выводим цикл - все значения в сете
        //           System.out.println(i);

//        set.clear();
        System.out.println(set.size());

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));


    }

}