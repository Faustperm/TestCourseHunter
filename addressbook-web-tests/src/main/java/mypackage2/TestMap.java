package mypackage2;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {//мап это коллекция и она хранит два значения парой

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();//ключ интеджер и значение стринг
        map.put(1, "Black"); //ключ всегда уникальный, значения могут повторяться
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());

        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Gray"));
        System.out.println();
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));

        }

        System.out.println();

        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println();
        System.out.println(map2.get("Petya"));



    }
}
