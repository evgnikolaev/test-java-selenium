package a1_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a9_Map {

    public static void main(String[] args) {

        // Map - немного другая коллекция, хранит ключ-значение (ключи уникальные)
        // в List, Set - мы хранили значения, для доступа был индекс
        Map<Integer, String> map = new HashMap<>();

        //Добавить, или изменить существующий
        map.put(1, "Black");
        map.put(2, "White");
        map.put(10, "Yellow");
        map.put(2, "Yellow2");

        //map.clear(); //очистить
        System.out.println(map.get(1)); //дай значение по ключу
        System.out.println(map.size()); //размер
        System.out.println(map.containsKey(90));//есть ключ
        System.out.println(map.containsValue("White"));//есть значение


        //Итератор
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }



        Map<String,String> map2 = new HashMap<>();
        map2.put("Vasya", "Black");
        map2.put("Petya", "White");
        System.out.println(map2.get("Vasya"));
    }
}
