package a1_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a8_Set {
    public static void main(String[] args) {
        // Коллекции, Set - уникальные значения
        // нет  метода .get(), остальные методы как в List
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(11);
        set.add(10);
        set.add(12);

        System.out.println(set.size()); //3

        set.remove(12);// здесь значчение, а не индекс

        //ITERATOR
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i : set) {
            System.out.println(i);
        }
    }
}
